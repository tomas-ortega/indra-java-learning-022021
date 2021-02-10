package com.indra.c3po.tutorial.tutorial_java;

import java.util.StringTokenizer;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	App miApp = new App();
    	
    	//miApp.learnEquals();
    	//miApp.casting();
    	//miApp.array();
    	miApp.tokenizerAndSplited();
    }
    
    private void learnEquals() {
    	
    	int number1 = 0;
    	int number2 = 0;
    	
    	System.out.println(number1 == number2);
    }
    
    private void casting(){
    	
    	Integer number1=0;
    	Double number2=1.5;
    	Float number3=1.30F;
    	
    	String string4 = "40";
    	
    	System.out.println("PASAR DE STRING A INT: " + Integer.parseInt(string4));
    }
    
    public void array() {
    	
    	Integer[] miarray = new Integer[5];
    	
    	for (int i=0; i<miarray.length; i++) {
    		miarray[i] = (int)(Math.random()*100);
    		System.out.println("POSITION " + i + "VALUE: " + miarray[i]);
    	}
    	
    }
    
    public void tokenizerAndSplited() {
    	
    	String inputData = "codigo_cliente=1,nombre_cliente=pako,apellido_cliente=jarls #codigo_cliente=2,nombre_cliente=juanito,apellido_cliente=jarls";
        
        StringTokenizer tokenizer = new StringTokenizer(inputData,", ", true);
        
        while(tokenizer.hasMoreElements()) {
            System.out.println(tokenizer.nextToken());
            
        }
    	
    }
    
}

