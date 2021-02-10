package com.indra.c3po.tutorial;

import java.math.BigInteger;
import java.util.ArrayList;
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
        System.out.println( "Hello World!" );
        App myApp = new App();
        /*myApp.learnEqualsWithOperator();
        myApp.learnEqualsWithObject();
        myApp.learnCasting();*/
        //myApp.learnIterators();
        //myApp.learnIteratorsStream();
        myApp.stringTokenizerAndSplitted();
    }
    
    private void learnEqualsWithOperator() {
    	int number1 = 0;
    	int number2 = 0;
    	
    	System.out.println(number1==number2);
    }
    
    private void learnEqualsWithObject() {
    	Integer number1 = 0;
    	Integer number2 = 0;
    	
    	System.out.println(number1.equals(number2));
    }
    
    private void learnCasting() {
    	
    	Integer number1 = 0;
    	Double number2 = 2.54;
    	Float number3 = 1.29F;
    	String stringnumber4 = "42";
    	
    	Long l = Long.valueOf(number1.longValue());
    	Long l2 = new Long(number1);
    	
    	number1 = new Integer(2);
    	
    	System.out.println("CASTING DE INTEGER A STRING\n");
    	System.out.println(number1.toString());
    	System.out.println(Integer.valueOf(stringnumber4));
    	System.out.println("CASTING DE STRING A DOUBLE: " + Double.valueOf(stringnumber4));
    	System.out.println("CASTING DE STRING A FLOAT: " + Float.valueOf(stringnumber4));
    	System.out.println("CASTING DE FLOAT A STRING: " + number3.toString());
    	
    }
    
    public void learnIteratorsStream() {
    	//List<Integer> myNumberList = new ArrayList<Integer>();
    	List myNumberList = new ArrayList();
    	
    	myNumberList.add("A");
    	myNumberList.add(3);
    	System.out.println("Tamaño de la lista: " + myNumberList.size());
    	myNumberList.forEach(pako -> 
    	{
    		System.out.println("Dato: " + pako);
    	});
    	
    	// Tenemos que hacerlo sabiendo el tipo del dato
    	List<Integer> myListaTipada = new ArrayList<Integer>();
    	for (Integer i: myListaTipada) {
    		System.out.println("DATO: " + i);
    	}
    	
    	// Iterador
    	Iterator<Integer> iteratorList = myNumberList.iterator();
    	
    	while(iteratorList.hasNext()) {
    		System.out.println("DATO: " + iteratorList.next());
    	}
    }
    
    public void learnIterators() {
    	Integer[] myNumberList = new Integer[5];
    	
    	// Rellenar datos
    	System.out.println("RELLENAR ARRAY");
    	for(int i = 0; i < myNumberList.length; i++) {
    		myNumberList[i] = (int)(Math.random()*100);
    	}
    	
    	System.out.println("ASCENDENTE");
    	// Ver en pantalla los datos en orden ascendente
    	for(int i = 0; i < myNumberList.length; i++) {
    		System.out.println("Posicion: " + i + " valor: " + myNumberList[i]);
    	}
    	
    	// Ver en orden descendente
    	System.out.println("DESCENDENTE");
    	for(int i = myNumberList.length-1; i >= 0; i--) {
    		System.out.println("Posicion: " + i + " valor: " + myNumberList[i]);
    	}
    	
    }
    
    private int preguntarSaltos() {
    	Integer number1 = 0;
    	Integer evaluacionReturn = 0;
    	
    	if(number1 > 1) {
    		evaluacionReturn = 1;
    	} else {
    		evaluacionReturn = 0;
    	}
    	
    	return evaluacionReturn;
    	
    }
    
    // PARA ARCHIVOS CSV
    private void stringTokenizerAndSplitted() {
    	String inputData = "codigo_cliente=1,nombre_cliente=pako,apellido_cliente=jarls#codigo_cliente=2,nombre_cliente=jaunito,apellido_cliente=garcia";
    	
    	StringTokenizer tokenizer = new StringTokenizer(inputData, "#"); // separa por #
    	
    	while(tokenizer.hasMoreElements()) { // Mientras tenga elementos sigue
    		Object cliente = tokenizer.nextElement();
    		System.out.println("CLIENT: " + cliente);
    		
    		// Ahora separamos por la coma
    		StringTokenizer tokenizerComa = new StringTokenizer(cliente.toString(), ",");
    		while(tokenizerComa.hasMoreElements()) {
    			System.out.println("CODIGO: " + tokenizerComa.nextElement());
    			System.out.println("NOMBRE: " + tokenizerComa.nextElement());
    			System.out.println("APELLIDO: " + tokenizerComa.nextElement());
    		}
    		
    		System.out.println();
    	}
    }
}
