package com.springug.taco.sample;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TacoConsumer {
	
	public static void main(String[] args) {
		new AnnotationConfigApplicationContext(TacoConsumerConfiguration.class);
	}

}
