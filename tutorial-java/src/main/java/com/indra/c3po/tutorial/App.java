package com.indra.c3po.tutorial;


import java.math.BigDecimal;
import java.math.BigInteger;
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
public class App 
{
    public static void main( String[] args )
    {
        App myApp = new App();
        //myApp.learnEqualsWithOperator();
        //myApp.learnEqualsWithObject();
        //myApp.learnCasting();
        //myApp.learnIteratorsFor();
        //myApp.learnIteratorsStream();
        //myApp.stringVsStringBuilder();
        myApp.stringTokenizerAndSplitted();
    }
    
    private void stringTokenizerAndSplitted() {
    	String inputData = "codigo_cliente=1,nombre_cliente=pako,apellido_cliente=jarls#codigo_cliente=2,nombre_cliente=juanito,apellido_cliente=jarls";
    	
    	StringTokenizer tokenizer = new StringTokenizer(inputData, "#");
    	
    	//tokenizer tiene un iterador
    	while (tokenizer.hasMoreElements()) {
    		String str = tokenizer.nextToken();
    		StringTokenizer cod_client = new StringTokenizer(str,"codigo_cliente");
    		
    		System.out.println("CODIGO_CLIENTE: " + cod_client);
    		//System.out.println("CLIENT: " + tokenizer.nextElement());
    		
    		
    		
    	}
        	
    }
    
    
    private void stringVsStringBuilder() {
    	String sayHello = "Hello Indra!";
    	sayHello = sayHello + "From Barcelona!";
    	
    	System.out.println("STRING: " + sayHello);
    	
    	StringBuilder sayHelloBuilder = new StringBuilder();
    	sayHelloBuilder.append("Hello Indra!");
    	sayHelloBuilder.append("From Barcelona!");
    	
    	System.out.println("STRINGBUILDER: " + sayHelloBuilder);
    	
    }
    
    
    private Integer askJumpers() {
    	Integer number1 = 0;
    	Integer evaluationResult = 0;
    	
    	if(number1 > 1) {
    		evaluationResult = 1;
    	}else {
    		evaluationResult = 0;
    	}
    	
    	//1 único punto de salida
    	return evaluationResult;
      	
    }
    
    private void askSwitch() {
    	Integer numberToCheck = 0;
    	
    	switch (numberToCheck) {
		case 1:
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
    	
    	for(int i=0; i< myNumberListLegacy.length && !itemFound;i++) {
    		if(myNumberListLegacy[i].equals(8)) {
    			//break;
    			itemFound=true;
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
    	
    	System.out.println(number1.equals(0));
    	
    }
    
    private void learnCasting() {
    	Integer number1 = 0;
    	Long number1Long = 0L;
    	BigInteger number1BigInteger = new BigInteger(number1.toString());
    	
    	Double number2 = 2.54;
    	Float number3 = 1.29F;
    	BigDecimal number3BigDecimal = new BigDecimal(number2.toString());
    	
    	String stringNumber4 = "42";
    	stringNumber4 = new String("21");
    	
    	//number1 = new Integer("2");
    	number1 = 8;
    	
    	System.out.println("CASTING DE INTEGER A STRING " + number1);
    	System.out.println("CASTING DE INTEGER A STRING " + number1.toString());
    	System.out.println("CASTING DE STRING A INTEGER " + Integer.valueOf(stringNumber4));
    	System.out.println("CASTING DE STRING A DOUBLE " + Double.valueOf(stringNumber4));
    	System.out.println("CASTING DE STRING A FLOAT " + Float.valueOf(stringNumber4));
    	System.out.println("CASTING DE FLOAT A STRING " + number3);
    	System.out.println("BIG INTEGER VALUE: " + number1BigInteger);
    	System.out.println("BIG DECIMAL VALUE: " + number3BigDecimal);
    	
    	
    	double numberDoubleToCasting = 1.74;
    	System.out.println((int) numberDoubleToCasting);
    	System.out.println(String.valueOf(numberDoubleToCasting));
    }
    
    public void learnIteratorsStream() {
    	List <Integer> myNumberList = new ArrayList<>();  	
    	
    	myNumberList.add(1);
    	
    	System.out.println("LIST SIZE: " + myNumberList.size());
    	
    	myNumberList.remove(0);
    	System.out.println("LIST SIZE: " + myNumberList.size());
    	
    	myNumberList.contains(2);
    	
    	myNumberList.add(5);
    	myNumberList.add(7);
    	myNumberList.add(2);
    	
    	//FORMA 1 DE RECORRER POSICIONES DE ARRAY Y PRINTAR SU VALOR
    	myNumberList.forEach(num -> {
    	System.out.println("DATO: " + num);
    	});
    	
    	//FORMA 2 DE RECORRER POSICIONES DE ARRAY Y PRINTAR SU VALOR
    	for (Integer currentNumber: myNumberList) {
    		
    		System.out.println("DATO BUCLE FOR: " + currentNumber);
    		
    	}
    	
    	//Iteradores 
    	Iterator<Integer> iteratorList = myNumberList.iterator();
    	
    	while(iteratorList.hasNext()) {
    		System.out.println("DATO ITERATOR: " + iteratorList.next());
    	}
    	
    }
    
    
    public void learnIteratorsFor() {
    	Integer[] myNumberList = new Integer[5];
    	myNumberList[0]= 1;
    	
    	//Integer myNumber = 0;
    	//++myNumber; //myNumber++ o ++myNumber devuelve lo mismo
    	
    	//System.out.println("NUMBER: " + myNumber);
    	
    	int numb = 0;
    	System.out.println(numb++); //primero muestra luego incrementa
    	System.out.println(numb);
    	System.out.println(++numb); //primero incrementa, luego muestra la variable
    	System.out.println(numb);
    	
    	
    	//RELLENO DEL ARRAY Y PRINTADO   	
    	for(int i=0;i<myNumberList.length;i++) {
    		myNumberList[i]=(int) (Math.random()*100);
    		System.out.println("POSITION: " + i + "VALUE: " + myNumberList[i]);
    		    		
    	}
    	
    	System.out.println("-----------------------");
    	
    	//PRINTAR ASCENDENTE   	
    	Arrays.sort(myNumberList);
    	for(int i=0;i<myNumberList.length;i++) {
    		System.out.println("POSITION: " + i + "VALUE: " + myNumberList[i]);
       	}
    	
    	System.out.println("-----------------------");
    	
    	//PRINTAR DESCENDENTE   	
    	Arrays.sort(myNumberList, Collections.reverseOrder());
    	for(int i=0;i<myNumberList.length;i++) {
    		System.out.println("POSITION: " + i + "VALUE: " + myNumberList[i]);
       	}
    	
    	    	
        	
    }
    
    
}
