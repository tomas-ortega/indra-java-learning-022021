package com.indra.c3po.tutorial;

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
        //myApp.learnIterators();
        myApp.stringTokenizerAndSplitted();
    }
    
    public void learnIterators() {
    	Integer[] array = new Integer[5];
    	for(int i = 0;i<array.length;i++){	
    		array[i] = i;
    	}
    	System.out.println(array);
    }
    
    private void stringTokenizerAndSplitted() {
    	String inputData = "codigo_cliente=1,nombre_cliente=pako,apellido_cliente=jarls#codigo_cliente=2,nombre_cliente=juanito,apellido_cliente=jarls";
        
        StringTokenizer tokenizer = new StringTokenizer(inputData, "#");
        
        while(tokenizer.hasMoreElements()) {
        	String temp=(String) tokenizer.nextElement();
            StringTokenizer elementTokenizer = new StringTokenizer(temp, ",");
            while(elementTokenizer.hasMoreElements()) {
            	String tempFinal=(String) elementTokenizer.nextElement();
            	System.out.println(tempFinal.replace("=", ":"));
            }
            System.out.println("------");
        }
    }
}
