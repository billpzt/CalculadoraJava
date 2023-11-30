//package org.example;
//
//import static spark.Spark.get;
//import static spark.Spark.port;
//
//public class RequestsSpark {
//    port(8080);
//
//    get("/soma", (req, res) -> {
//        String n1 = req.queryParams("n1");
//        String n2 = req.queryParams("n2");
//        int intN1 = Integer.parseInt(n1);
//        int intN2 = Integer.parseInt(n2);
//        int resultado = intN1 + intN2;
//        System.out.println("Soma: " + resultado);
//        return "Soma: " + resultado;
//    });
//
//    get("/subtracao", (req, res) -> {
//        String n1 = req.queryParams("n1");
//        String n2 = req.queryParams("n2");
//        int intN1 = Integer.parseInt(n1);
//        int intN2 = Integer.parseInt(n2);
//        int resultado = intN1 - intN2;
//        System.out.println("Soma: " + resultado);
//        return "Subtracao: " + resultado;
//    });
//
//    get("/multiplicacao", (req, res) -> {
//        String n1 = req.queryParams("n1");
//        String n2 = req.queryParams("n2");
//        int intN1 = Integer.parseInt(n1);
//        int intN2 = Integer.parseInt(n2);
//        int resultado = intN1 * intN2;
//        System.out.println("Soma: " + resultado);
//        return "Multiplicacao: " + resultado;
//    });
//
//    get("/divisao", (req, res) -> {
//        String n1 = req.queryParams("n1");
//        String n2 = req.queryParams("n2");
//        int intN1 = Integer.parseInt(n1);
//        int intN2 = Integer.parseInt(n2);
//        int resultado = intN1 / intN2;
//        System.out.println("Soma: " + resultado);
//        return "Divisao: " + resultado;
//    });
//}
//}
