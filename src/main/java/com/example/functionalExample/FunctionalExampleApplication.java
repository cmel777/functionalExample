package com.example.functionalExample;

import org.springframework.batch.item.xml.stax.UnclosedElementCollectingEventWriter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//@SpringBootApplication
public class FunctionalExampleApplication {

	public static void main(String[] args) {
		//SpringApplication.run(FunctionalExampleApplication.class, args);
		Test test = new Test();
		System.out.println( "ADDITION :"+test.operate(1,2,Addition::addition));
		System.out.println( "SUBTRACTION :"+test.operate(2,1,Subtraction::subtraction));



	}



}
