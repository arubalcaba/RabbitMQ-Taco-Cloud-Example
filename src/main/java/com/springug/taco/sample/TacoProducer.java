package com.springug.taco.sample;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TacoProducer {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		new AnnotationConfigApplicationContext(TacoProducerConfiguration.class);

	}

}
