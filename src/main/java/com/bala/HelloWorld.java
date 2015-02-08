package com.bala;

import spark.Request;
import spark.Response;
import spark.Route;
import spark.Spark;


public class HelloWorld {
	public static void main(String[] args ){
      get("/hello", (request, response) -> {
         return "Hello World!";
      });
	}
}
