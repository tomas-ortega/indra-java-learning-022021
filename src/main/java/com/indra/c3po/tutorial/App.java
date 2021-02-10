package com.indra.c3po.tutorial;

import java.math.BigDecimal;
import java.math.MathContext;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;
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
    	String inputData = "codigo_cliente=1,nombre_cliente=pako,apellido_cliente=jarls#codigo_cliente=2,nombre_cliente=juanito,apellido_cliente=jarls";
        
        StringTokenizer tokenizer = new StringTokenizer(inputData, "#");
        
        while(tokenizer.hasMoreElements()) {
            StringTokenizer client = new StringTokenizer((String) tokenizer.nextElement(), ",");
            while(client.hasMoreElements()) {
            	//System.out.println(client.nextElement().toString().replace("=", ": ").replace("_", " "));
            	StringTokenizer data = new StringTokenizer((String) client.nextElement(), "=");
            	System.out.println(data.nextToken().toString().replace("_", " ").toUpperCase() + ": " + data.nextToken());
            	
            }
            System.out.println("");
        }
    }
    
    private void learnEquals() {
    	int number1 = 0;
    	int number2 = 0;
    	
    	System.out.println(number1 == number2);
    	
    	
    	Integer number3 = new Integer(3);
    	Integer number4 = new Integer(3);
    	
    	System.out.println(number3.equals(number4));
    }
    
    private void learnCasting() {
    	Integer number1 = 1;
    	Double number2 = 1.1;
    	Float number3 = 1.11F;
    	
    	String strNumber4 = "42";
    	strNumber4 = new String("21");
    	
    	number1 = new Integer("2");
    	
    	System.out.println(number1);
    	System.out.println(number1.toString());
    	
    	System.out.println(Integer.valueOf(strNumber4));
    }
    
    private void preincrementFor() {
    	int out = 0;
    	for (int i = 0; i < 10; ++i) {
    		++out;
    	}
    	System.out.println(out);
    }
    
    private void postincrementFor() {
    	int out = 0;
    	for (int i = 0; i < 10; i++) {
    		++out;
    	}
    	System.out.println(out);
    }
    
    private void ejercicioFor() {
    	Integer[] myNumberList = new Integer[5];
    	
    	 //RELLENO
        for (int i = 0; i < myNumberList.length; i++) {
            myNumberList[i] = (int)(Math.random()*100);
        }
        
        //NORMAL
        for (int i = 0; i < myNumberList.length; ++i) {
            System.out.println("POSITION: " + i + " VALUE: " + myNumberList[i]);
        }
        
        System.out.println("");
               
        //ASCENDENTE
        Arrays.sort(myNumberList);
        for (int i = 0; i < myNumberList.length; i++) {
            System.out.println("POSITION: " + i + " VALUE: " + myNumberList[i]);
        }
        
        System.out.println("");
        
        //DESCENDENTE
        Arrays.sort(myNumberList, Collections.reverseOrder());
        for (int i = 0; i < myNumberList.length; i++) {
            System.out.println("POSITION: " + i + " VALUE: " + myNumberList[i]);
        }
    	
    }

    private void learnIteratorsStream() {
    	List<Integer> myNumberList = new ArrayList<Integer>();
    	for (int i = 0; i < 5; i++) {
            myNumberList.add((int)(Math.random()*100));
        }
    	myNumberList.forEach(num -> {
    		System.out.println("Dato:" + num);
    	});
    }
}
