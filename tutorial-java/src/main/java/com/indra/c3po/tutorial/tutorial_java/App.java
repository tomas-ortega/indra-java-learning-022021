package com.indra.c3po.tutorial.tutorial_java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		App myApp = new App();
		// myApp.learnEqualsWithOperator();
		// myApp.learnEqualsWithObject();
		// myApp.learnIterators();
		// myApp.learnTokenizer();
		myApp.learnTokenizer();
	}

	private void learnEqualsWithOperator() {
		int number1 = 0;
		int number2 = 0;

		System.out.println(number1 == number2);
	}

	private void learnEqualsWithObject() {
		Integer number1 = 0;
		Integer number2 = 0;

		System.out.println(number1 == number2);
	}

	private void learnCasting() {
		Integer number1 = new Integer("2");

		System.out.println("CASTING -> " + number1);
	}

	private void learnIterators() {
		Integer[] numberList = new Integer[5];
		for (int i = 0; i < numberList.length; i++) {
			numberList[i] = i + 1;
			System.out.println(numberList[i]);
		}

	}

	private String learnTokenizer() {

		String inputData = "codigo_cliente=1,nombre_cliente=pako,apellido_cliente=jarls#codigo_cliente=2,nombre_cliente=juanito,apellido_cliente=jarls";

		StringTokenizer tokenizer = new StringTokenizer(inputData, "#");

		while (tokenizer.hasMoreElements()) {
			
			String datos = (String) tokenizer.nextElement();
			ArrayList<String> datosList = new ArrayList<>(Arrays.asList(datos.split(",")));
			System.out.println(datosList.get(0));
			System.out.println(datosList.get(1));
			System.out.println(datosList.get(2));
		}
		return inputData;

	}

}