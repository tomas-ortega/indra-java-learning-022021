package com.indra.c3po.tutorial;

import java.math.*;
import java.util.*;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        App myApp = new App();
        //myApp.learnEqualsWithOperator();
        //myApp.learnEqualsWithObject();
        //myApp.learnCasting();
        //myApp.learnIterators();
        //myApp.learnIteratorsStream();
        //myApp.stringVsStringBuilder();
        myApp.stringTokenizerAndSplitted();
    }
    
    private void stringTokenizerAndSplitted() {
    	/* Datos del cliente
    	 * codigo_cliente=1,nombre_cliente=pako,apellido_cliente=jarls#codigo_cliente=2,nombre_cliente=juanito,apellido_cliente=jarls
    	 */
    	
    	String inputData = "codigo_cliente=1,nombre_cliente=pako,apellido_cliente=jarls#codigo_cliente=2,nombre_cliente=juanito,apellido_cliente=jarls";
    	
    	StringTokenizer tokenizer = new StringTokenizer(inputData, "#");
    	
    	while(tokenizer.hasMoreElements()) {
    		
    		StringTokenizer tokenizer2 = new StringTokenizer(String.valueOf(tokenizer.nextElement()), ",");
    		
    		while(tokenizer2.hasMoreElements()) {
    			
    			StringTokenizer tokenizer3 = new StringTokenizer(String.valueOf(tokenizer2.nextElement()), "=");
    			
    			while(tokenizer3.hasMoreElements()) {
    				
    				System.out.println((String.valueOf(tokenizer3.nextElement()).toUpperCase()).replace('_', ' ') + ": " + tokenizer3.nextElement());
    				
    			}
    			
    		}
    		System.out.println();
    	}
    }
    
    private void stringVsStringBuilder() {
    	//En este caso se consume más memoria al estar descartando y reescribiendo la misma variable
    	String sayHello = "Hello Indra";
    	sayHello += " From Málaga";
    	
    	System.out.println("STRING: " +  sayHello);
    	
    	//El stringBuilder se usa para no ocupar tanta memoria al reescribir variables, de esa forma sólo se va añadiendo contenido al mimso puntero de memoria
    	StringBuilder sayHelloBuilder = new StringBuilder();
    	sayHelloBuilder.append("Hello Indra");
    	sayHelloBuilder.append(" From Málaga");
    	
    	System.out.println("STRINGBUILDER: " +  sayHelloBuilder);
    }
    
    private Integer askJumpers() {
    	//zona declarativa
    	Integer number1 = 0;
    	Integer evaluationResult = 0;
    	
    	//zona de procesamiento
    	if(number1 > 1)
    	{
    		evaluationResult = 1;
    	}
    	else
    	{
    		evaluationResult = 0;
    	}
    	
    	//un único punto de salida
    	return evaluationResult;
    }
    
    private Integer askSwitch() {
    	Integer numberToCheck = 0;
    	switch (numberToCheck) {
		case 0:
			
			break;

		default:
			break;
		}
    	
    	return numberToCheck;
    }
    
    private void askFor() {
    	List <Integer> myNumberList = new ArrayList<Integer>(); 
    	
    	myNumberList.add(5);
    	myNumberList.add(8);
    	myNumberList.add(2);
    	
    	myNumberList.contains(8);
    	
    	Integer[] myNumberListLegacy = new Integer[5];
    	boolean itemFound = false;
    	
    	for (int i = 0; i < myNumberListLegacy.length && itemFound; i++) {
			if (myNumberListLegacy[i].equals(8))
			{
				//break;
				itemFound = true;
			}
		}
    }
    
    private void learnEqualsWithOperator() {
    	int number1 = 0;
    	int number2 = 0;
    	
    	System.out.println(number1 == number2);
    }
    
    private void learnEqualsWithObject() {
    	Integer number1 = 0;
    	Integer number2 = 0;
    	
    	System.out.println(number1.equals(number2));
    }
    
    private void learnCasting() {
    	Integer number1 = 0;
    	Long number1Long = 0L;
    	BigInteger number1BigInteger = new BigInteger(String.valueOf(number1));
    	
    	Double number2 = 2.54;
    	float number3 = 1.20f;
    	BigDecimal number3BigDecimal = new BigDecimal(number2);
    	BigDecimal number4BigDecimal = new BigDecimal(number3, MathContext.DECIMAL32);
    	
    	String stringNumber4 = "42";
    	stringNumber4 = new String("21");
    	
    	number1 = new Integer("2");
    	
    	System.out.println("CASTING DE INTEGER A STRING: "+number1);
    	System.out.println("CASTING DE INTEGER A STRING: "+number1.toString());
    	System.out.println("CASTING DE STRING A INTEGER: "+Integer.valueOf(stringNumber4));
       	System.out.println("CASTING DE STRING A DOUBLE: " + Double.valueOf(stringNumber4));
       	System.out.println("CASTING DE STRING A FLOAT: "+ Float.valueOf(stringNumber4));
       	System.out.println("CASTING DE FLOAT A STRING: "+number3);
       	System.out.println("BIG INTEGER VALUE: "+number1BigInteger);
       	System.out.println("BIG DECIMAL VALUE: "+number3BigDecimal);
       	System.out.println("LEGACY CASTING ");
       	
       	double numberDoubleToCasting = 1.74;
       	System.out.println((int)numberDoubleToCasting);//solo con tipos primitivos, no Object
       	System.out.println(String.valueOf(numberDoubleToCasting));
       	//System.out.println(numberDoubleToCasting);
    	
    }
    
    private void learnIterators() {
    	Integer[] myNumberList = new Integer[5];
    	
    	for (int i=0; i<myNumberList.length; i++) {
    		myNumberList[i]=i;
    	}
    	
    	System.out.println("LISTA DESCENDENTE");
    	for (int i=myNumberList.length-1; i>=0; i--)
    	{
    		System.out.println("POSITION: " + i + " VALUE: " + myNumberList[i]);
    	}
    	
    	System.out.println("LISTA ASCENDENTE");
    	for (int i=0; i<myNumberList.length; i++) {
    		System.out.println("POSITION: " + i + " VALUE: " + myNumberList[i]);
    	}
    	
    	/*
    	 OTRA FORMA DE RELLENAR, Y VISUALIZAR TANTO ASCENDENTE COMO DESCENDENTE 
    	 
    	myNumberList[i]=(int)(Math.random()*100);
    	Arrays.parallelSort(myNumberList);
    	Arrays.sort(myNumberList, Collections.reverseOrder());
    	
    	*/
    }
    
    public void learnIteratorsStream() {
    	List <Integer> myNumberList = new ArrayList<Integer>(); 
    	
    	myNumberList.add(1);
    	System.out.println("LIST SIZE: " + myNumberList.size());
    	
    	myNumberList.remove(0);
    	System.out.println("LIST SIZE: " + myNumberList.size());
    	
    	myNumberList.contains(2);
    	
    	myNumberList.add(5);
    	myNumberList.add(7);
    	myNumberList.add(2);
    	
    	myNumberList.forEach(pako -> System.out.println("DATO: " + pako));//expresión lambda en un foreach
    	
    	/*myNumberList.forEach(pako -> {
    		System.out.println("DATO: " + pako);
    	});Otra forma para poder ver que sería como una función sin nombre*/
    	
    	for (Integer currentNumber : myNumberList) {
    		System.out.println("DATO en bucle for: " + currentNumber);
    	}
    	
    	Iterator<Integer> iteratorList = myNumberList.iterator();
    	
    	while(iteratorList.hasNext()) {
    		System.out.println("DATO en iterator " + iteratorList.next());
    	}
    }
    
}
