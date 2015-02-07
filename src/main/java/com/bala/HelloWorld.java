package com.bala;

import spark.Request;
import spark.Response;
import spark.Route;
import spark.Spark;


public class HelloWorld {
	public static void main(String[] args ){
	Spark.get(new Route("/"){
		@Override
	public Object handle(final Request arg0,final Response arg1) {
		// TODO Auto-generated method stub
		return "Hello Worlds from spark";
		}
	});
	}
}