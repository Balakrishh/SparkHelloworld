package com.bala;

import spark.Request;
import spark.Response;
import spark.Route;
import spark.Spark;


public class HelloWorld {
	public static void main(String[] args ){
<<<<<<< HEAD
	Spark.get( new Route("/"){
		@Override
	public Object handle(final Request arg0,final Response arg1) {
/*this is my helloworld*/
		return "Hello Worlds from spark";
		}
	});
=======
      get("/hello", (request, response) -> {
         return "Hello World!";
      });
>>>>>>> 568e24a6dabad2b137ac1313f29dc1ec8da17d08
	}
}
