package org.example;


import static spark.Spark.get;
import static spark.Spark.port;

public class Main {
    public static void main(String[] args) {
        PainelGrafico pg = new PainelGrafico();
        Calculadora calc = new Calculadora();

        port(8080);

        get("/param1", (req, res) -> {
            String op1 = req.queryParams("p");
            pg.inputField1.setText(op1);
            return "Parâmetro 1: " + op1;
        });
        get("/param2", (req, res) -> {
            String op2 = req.queryParams("p");
            pg.inputField2.setText(op2);
            return "Parâmetro 2: " + op2;
        });

        get("/soma", (req, res) -> {
            double soma;
            Double n1 = Double.parseDouble(pg.inputField1.getText());
            Double n2 = Double.parseDouble(pg.inputField2.getText());
            soma = calc.somar(n1, n2);
            pg.outputField.setText(Double.toString(soma));
            return "Soma: " + soma;
        });

        get("/subtracao", (req, res) -> {
            double sub;
            Double n1 = Double.parseDouble(pg.inputField1.getText());
            Double n2 = Double.parseDouble(pg.inputField2.getText());
            sub = calc.subtrair(n1, n2);
            pg.outputField.setText(Double.toString(sub));
            return "Subtracao: " + sub;
        });

        get("/multiplicacao", (req, res) -> {
            double mult;
            Double n1 = Double.parseDouble(pg.inputField1.getText());
            Double n2 = Double.parseDouble(pg.inputField2.getText());
            mult = calc.multiplicar(n1, n2);
            pg.outputField.setText(Double.toString(mult));
            return "Multiplicacao: " + mult;
        });

        get("/divisao", (req, res) -> {
            double div;
            Double n1 = Double.parseDouble(pg.inputField1.getText());
            Double n2 = Double.parseDouble(pg.inputField2.getText());
            try {
                div = calc.dividir(n1, n2);
            } catch (Exception e) {
                return "Erro, não foi possivel realizar divisão!";
            }
            pg.outputField.setText(Double.toString(div));
            return "Divisao: " + div;
        });

        get("/json", (req, res) -> {
            double soma, sub, mult, div;
            Double n1 = Double.parseDouble(pg.inputField1.getText());
            Double n2 = Double.parseDouble(pg.inputField2.getText());
            soma = calc.somar(n1, n2);
            sub = calc.subtrair(n1, n2);
            mult = calc.multiplicar(n1, n2);
            div = calc.dividir(n1, n2);
            String content = "{ \"param1\": \" " + n1 +
                    "\", \"param2\": \"" + n2 +
                    "\", \"Soma\": \"" + soma +
                    "\", \"Subtracao\": \"" + sub +
                    "\", \"Multiplicacao\": \"" + mult +
                    "\", \"Divisao\": \"" + div + " \"}";
            return content;
        });
        // Fazer a rota xml
        get("/xml", (req, res) -> {
            double soma, sub, mult, div;
            Double n1 = Double.parseDouble(pg.inputField1.getText());
            Double n2 = Double.parseDouble(pg.inputField2.getText());
            soma = calc.somar(n1, n2);
            sub = calc.subtrair(n1, n2);
            mult = calc.multiplicar(n1, n2);
            div = calc.dividir(n1, n2);
            String content = "<res>\n" +
                    "    <param1>" + n1 + "</param1>\n" +
                    "    <param2>" + n2 + "</param2>\n" +
                    "    <Soma>" + soma + "</Soma>\n" +
                    "    <Subtracao>" + sub + "</Subtracao>\n" +
                    "    <Multiplicacao>" + mult + "</Multiplicacao>\n" +
                    "    <Divisao>" + div + "</Divisao>\n" +
                    "</res>";
            return content;
        });
    }
}