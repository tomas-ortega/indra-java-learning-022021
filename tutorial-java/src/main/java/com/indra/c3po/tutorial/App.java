package com.indra.c3po.tutorial;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.MathContext;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
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
		// myApp.learnCasting();
		// myApp.learnIteratorsFor();
		//myApp.learnIteratorsStream();
		myApp.stringTokenizerAndSplitted();
	}
	
	
	private void stringTokenizerAndSplitted() {
		/*Datos del cliente:
		 * codgio_cliente=1,nombre_cliente=pako,apellido_cliente=jarls#codgio_cliente=2,nombre_cliente=juanito,apellido_cliente=jarls
		 * */
		
		String inputData = "codigo_cliente=1,nombre_cliente=pako,apellido_cliente=jarls#codigo_cliente=2,nombre_cliente=juanito,apellido_cliente=jarls";
		
		StringTokenizer tokenizer = new StringTokenizer(inputData,"#");
		
		while(tokenizer.hasMoreElements()) {
			System.out.println("CLIENT: "+tokenizer.nextElement());
			String s1 = tokenizer.nextToken();
			System.out.println("");
			StringTokenizer tokenizer2 = new StringTokenizer(s1,",");
			while(tokenizer2.hasMoreElements()) {
				
				System.out.println("CLIENT: "+tokenizer2.nextElement());
				
			}

		}
		System.out.println("");

		
	}
		
	
	
	private void stringVsStringBuilder() {
		String sayHello = "hello indra";
		sayHello += "from sevilla";
		
		System.out.println("STRING; "+ sayHello);
		
		StringBuilder sayHelloBuilder = new StringBuilder();
		sayHelloBuilder.append("hello indra");
		sayHelloBuilder.append("from sevilla");
		
		System.out.println("STRINGBUILDER; "+ sayHelloBuilder);
		
	}
	

	private void learnEqualsWithOperator() {
		int number1 = 0;
		int number2 = 0;
		System.out.println(number1 == number2);
	}

	private void learnEqualsWithObject() {
		Integer number1 = 0;
		Integer number2 = 0;

		System.out.println((number1).equals(number2));
	}

	private void learnCasting() {
		Integer number1 = 0;
		Long number1Long = 0L;
		BigInteger number1BigInteger = new BigInteger(number1.toString());

		Double number2 = 2.54;
		Float number3 = 1.29F;
		BigDecimal number3BigDecimal = new BigDecimal(number2.toString());
		BigDecimal number4BigDecimal = new BigDecimal(number2, MathContext.DECIMAL128);

		String stringNumber4 = "42";
		stringNumber4 = new String("21");

		// number1=new Integer("2");
		number1 = 0;

		System.out.println("CASTING DE INTEGER A STRING: " + number1);
		System.out.println("CASTING DE INTEGER A STRING: " + number1.toString());
		System.out.println("CASTING DE STRING A INTEGER: " + Integer.valueOf(stringNumber4));
		System.out.println("CASTING DE STRING A DOUBLE: " + Double.valueOf(stringNumber4));
		System.out.println("CASTING DE STRING A FLOAT: " + Float.valueOf(stringNumber4));
		System.out.println("CASTING DE FLOAT A STRING: " + number3);
		System.out.println("BIG INTEGER VALUE: " + number1BigInteger);
		System.out.println("BIG INTEGER VALUE: " + number3BigDecimal);

		double numberDoubleToCasting = 1.74;
		System.out.println((int) numberDoubleToCasting);
		System.out.println(String.valueOf(numberDoubleToCasting));

	}

	public void learnIteratorsStream() {
		List<Integer> myNumberList = new ArrayList<>();

		myNumberList.add(1);

		System.out.println("LIST SIZE: " + myNumberList.size());

		myNumberList.remove(0);
		System.out.println("LIST SIZE: " + myNumberList.size());

		myNumberList.contains(2);
		myNumberList.add(5);
		myNumberList.add(7);
		myNumberList.add(2);

		
		
		//java8
		myNumberList.forEach(pako -> {

			System.out.println("Dato: " + pako);
		});
		

		
		
		//java <8
		for (Integer currentNumber: myNumberList) {
			System.out.println("DATO BUCLE FOR: "+currentNumber);
		}
		
		//Iterators
		Iterator<Integer> iteratorList = myNumberList.iterator();
		
		while(iteratorList.hasNext()) {
			System.out.println("DATO ITERATOR: "+iteratorList.next());
		}

	}
	
	
	private Integer askJumpers() {
		//zona declarativa
		Integer number1 = 0;
		Integer evaluationResult = 0;
		//Zona de procesamiento
		if(number1>1) {
			evaluationResult= 1;
		}else {
			evaluationResult= 0;
		}
		//1 unico punto de salida
		return evaluationResult;
	}
	
	private void askSwitch() {
		Integer numberToCheck = 0;
		
		switch ("a") {
		case "B":
			
			break;

		default:
			break;
		}
	}
	
	private void askFor() {
		List<Integer> myNumberList = new ArrayList<>();
		
		myNumberList.add(5);
		myNumberList.add(8);
		myNumberList.add(2);
		
		myNumberList.contains(8);
		
		Integer[] myNumberListLegacy = new Integer[5];
		boolean itemFound = false;
		
		for (int i = 0; i < myNumberListLegacy.length && itemFound; i++) {
			if(myNumberListLegacy[i].equals(8)) {
				//break;
				itemFound = true;
			}
			
		}
	}
	

	public void learnIteratorsFor() {
		Integer[] myNumberList = new Integer[5];
		// 1º rellenar todos los datos en todas las posiciones
		// 2º quiero ver en pantalla todos los datos (orden ascendente)
		// 3º quiero ver en pantalla todos los datos (orden descendente)
		// myNumberList[0]=0;
		// myNumberList[1]=1;
		// myNumberList[2]=2;
		// myNumberList[3]=3;
		// myNumberList[4]=4;

		/*
		 * Integer myNumber=0; myNumber++;
		 * 
		 * System.out.println("Number: "+ myNumber);
		 */

		int numb = 0;
		System.out.println(numb++);
		System.out.println(numb);
		System.out.println(++numb);
		System.out.println(numb);

		System.out.println("");

		// RELLENO
		for (int i = 0; i < myNumberList.length; i++) {
			myNumberList[i] = (int) (Math.random() * 100);
		}

		// NORMAL
		for (int i = 0; i < myNumberList.length; i++) {
			System.out.println("POSITION: " + i + " VALUE: " + myNumberList[i]);
		}
		System.out.println("");
		// ASCENDENTE
		Arrays.sort(myNumberList);

		for (int i = 0; i < myNumberList.length; i++) {
			System.out.println("POSITION: " + i + " VALUE: " + myNumberList[i]);
		}
		System.out.println("");

		// DESCENDENTE
		Arrays.sort(myNumberList, Collections.reverseOrder());
		for (int i = 0; i < myNumberList.length; i++) {
			System.out.println("POSITION: " + i + " VALUE: " + myNumberList[i]);
		}

	}

}