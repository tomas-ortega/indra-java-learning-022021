package com.indra.c3po.tutorial.tutorial_java;

import java.awt.List;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.MathContext;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.StringTokenizer;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		App app = new App();
		// app.learnEqualsWithOperator();
		// app.learnEqualsWithObjects();
		// app.learnIterators();
		//app.learnIteratorsStream();
		//app.stringVsStringBuilder();
		app.stringTokenizerAndSplitter();
	}
	
	private Integer askJumpers() {
		Integer number1 = 0;
		Integer evaluationResult = 0;
		
		if (number1 >1) {
			evaluationResult = 1;
		}else {
			evaluationResult = 0;
		}
		//1 único punto de salida
		return evaluationResult;
	}
	
	private void askSwitch() {
		Integer numberToCheck = 0;
		
		switch ("a") {
		case "b":	
			break;
		case "a":
			break;
		case "c":
			break;
		default:
			break;
		}
	}
	
	private void askFor() {
		ArrayList<Integer> myNumberList = new ArrayList<>();
		Integer[] myNumberListLegacy = new Integer[5];
		boolean itemFound = false;
		
		myNumberList.add(1);
		myNumberList.add(7);
		myNumberList.add(2);
		
		myNumberList.contains(0);
		
		//LEGACY
		for (int i = 0; i < myNumberListLegacy.length && !itemFound; i++) {
			if (myNumberListLegacy[i].equals(8)) {
				itemFound= true;
			}
		}
	}
	
	private void stringTokenizerAndSplitter() {
		/* Datos del cliente
		 * codigo_cliente=1,nombre_cliente=pako,apellido_cliente=jarls#codigo_cliente=2,nombre_cliente=juanito,apellido_cliente=jarls
		 * 
		 **/
		String inputData = "codigo_cliente=1,nombre_cliente=pako,apellido_cliente=jarls#codigo_cliente=2,nombre_cliente=juanito,apellido_cliente=jarls";
		
		StringTokenizer tokenizer= new StringTokenizer(inputData, "#");
		while(tokenizer.hasMoreTokens()) {
			String strToken = tokenizer.nextToken();
			System.out.println("CLIENT: " + strToken);
			
			StringTokenizer tokenizer_interno= new StringTokenizer(strToken.replace("=",":"), ",");
			System.out.println("CLIENT:");
			while (tokenizer_interno.hasMoreElements()) {
				System.out.println(tokenizer_interno.nextElement());
				
			}
		}
	}
	
	private void stringVsStringBuilder() {
		//No es muy eficiente.
		String sayHello = "Hello Indra";
		sayHello += " from Seville!";
		
		System.out.println("STRING: " + sayHello);
		
		//MANERA EFICIENTE, SOLO UN PUNTERO DE MEMORIA
		//SI ESTA CADENA VA A SER MODIFICADA MUCHAS VECES(EJ:SQL)
		StringBuilder sayHelloBuilder = new StringBuilder();
		sayHelloBuilder.append("Hello Indra ");
		sayHelloBuilder.append("from Seville");
		System.out.println("STRINGBUILDER: " + sayHelloBuilder);
		
	}

	private void learnEqualsWithOperator() {
		int number1 = 0;
		int number2 = 0;

		System.out.println(number1 == number2);
	}

	private void learnEqualsWithObjects() {
		Integer number1 = 0;
		Integer number2 = 0;
		System.out.println(number1.equals(number2));
	}

	private void learnCasting() {
		Integer number1 = 0;
		Long number1Long = 0L;
		BigInteger number1BigInteger = new BigInteger(String.valueOf(number1));

		Double number2 = 0.25;
		Float number3 = 0.29F;
		BigDecimal number3BigDecimal = new BigDecimal(number3);
		// BigDecimal b = new BigDecimal(number3, MathContext.DECIMAL32);
		String stringNumber = "42";
		stringNumber = new String("21");

		String number1Casting = String.valueOf(number1);
		System.out.println("CASTING DE INTEGER A STRING " + number1Casting);
		Integer strCasting = Integer.valueOf(stringNumber);
		System.out.println("CASATING DE STRING A INTEGER " + strCasting);
		Double doubleCasting = Double.valueOf(stringNumber);
		System.out.println("CASATING DE STRING A DOUBLE " + doubleCasting);
		Float floatCasting = Float.valueOf(stringNumber);
		System.out.println("CASATING DE STRING A FLOAT " + floatCasting);
		String strCastingFloat = String.valueOf(stringNumber);
		System.out.println("CASATING DE FLOAT A STRING " + strCastingFloat);
		System.out.println("BIG INTEGER VALUE " + number1BigInteger);
		System.out.println("BIG DECIMAL VALUE " + number3BigDecimal);
	}

	public void learnIteratorsStream() {
		ArrayList<Integer> myNumberList = new ArrayList<>();
		myNumberList.add(1);

		System.out.println("LIST SIZE: " + myNumberList.size());

		myNumberList.remove(0);
		System.out.println("LIST SIZE: " + myNumberList.size());

		myNumberList.add(7);
		myNumberList.add(2);
		myNumberList.add(3);
		System.out.println(myNumberList.contains(2));
		
		//LAMBDA ForEach Java > 1.8
		myNumberList.forEach(num -> {
			System.out.println("DATO LAMBDA: " + num);
		});
		
		//SIN LAMBDA ForEach Java < 1.8
		for (Integer currentNumber : myNumberList) {
			System.out.println("DATO BUCLE FOR: " + currentNumber);
		}
		
		//ITERATORS
		Iterator<Integer> iteratorList = myNumberList.iterator();
		
		while(iteratorList.hasNext()) {
			System.out.println("DATO ITERATOR: " + iteratorList.next());
		}
	}

	public void learnIteratorsFor() {
		Integer[] myNumberList = new Integer[5];
		// RELLENAR TODOS LOS DATOS EN TODAS LAS POSICIONES
		// VER EN PANTALLA TODOS LOS DATOS ORDEN ASCENDENTE
		// VER EN PANTALLA ORDEN DESCENDENTE

		// RELLENO
		for (int i = 0; i < myNumberList.length; i++) {
			myNumberList[i] = (int) (Math.random() * 100);
		}

		// NORMAL
		for (int i = 0; i < myNumberList.length; i++) {
			System.out.println("POSITION: " + i + " VALUE: " + myNumberList[i]);
		}

		System.out.println();

		// ASCENDENTE
		Arrays.sort(myNumberList);
		for (int i = 0; i < myNumberList.length; i++) {
			System.out.println("POSITION: " + i + " VALUE: " + myNumberList[i]);
		}

		System.out.println();

		// DESCENDENTE
		Arrays.sort(myNumberList, Collections.reverseOrder());
		for (int i = 0; i < myNumberList.length; i++) {
			System.out.println("POSITION: " + i + " VALUE: " + myNumberList[i]);
		}

	}
}
