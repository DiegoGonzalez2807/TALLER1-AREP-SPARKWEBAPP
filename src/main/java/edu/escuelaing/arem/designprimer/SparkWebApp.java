package edu.escuelaing.arem.designprimer;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author clases
 */
import static spark.Spark.*;
public class SparkWebApp {

 public static void main(String[] args) {
    port(getPort());
    get("/hello", (req, res) -> "Hello Heroku");
 }
 static int getPort() {
        if (System.getenv("PORT") != null) {
        return Integer.parseInt(System.getenv("PORT"));
    }
    return 4567;
 }
}
