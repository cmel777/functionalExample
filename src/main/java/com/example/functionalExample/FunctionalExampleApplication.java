package com.example.functionalExample;

//@SpringBootApplication
public class FunctionalExampleApplication {

	public static void main(String[] args) {
		//SpringApplication.run(FunctionalExampleApplication.class, args);
		Operation operation = new Operation();
		System.out.println( "ADDITION :"+ operation.operate(1,2,Addition::addition));
		System.out.println( "SUBTRACTION :"+ operation.operate(2,1,Subtraction::subtraction));



	}



}
