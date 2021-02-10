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
    	
    	myApp.tokenElement();
    }
    
    private void learnEqualsWithOperator() {
    	int number1 = 0;
    	int number2 = 0;
    	
    	System.out.println(number1==number2);
    }
    
    private void learnEqualWithObject() {
    	Integer number1 = 0;
    	Integer number2 = 0;
    	
    	System.out.println(number1==number2);
    }
    
    private void learnCasting() {
    	Integer number1 = 0;
    	Double number2 = 3.14;
    	Float number3 = 5.21F;
    	String stringNumber = "24";
    	
    	System.out.println("Casting de Integer a String: " + number1);
    	System.out.println("Casting de Integer a String: " + number1.toString());
    	System.out.println("Casting de String a Integer: " + Integer.valueOf(stringNumber));
    }
    
    public void learnIterators() {
    	Integer[] myNumberList = new Integer[5];
    	
    	for(int i = 0; i < myNumberList.length; ++i) {
    		myNumberList[i] = myNumberList.length - i;
    	}
    	
    	
    	for(int i = 0; i < myNumberList.length; ++i) {
    		for(int j = 4;j > i; --j) {
    			if(myNumberList[i] > myNumberList[j]) {
    				int aux = myNumberList[i];
    				int aux2 = myNumberList[j];
    				myNumberList[i] = aux2;
    				myNumberList[j] = aux;
    			}
    		}
    	}
    	
    	for(int i = 0; i < myNumberList.length; ++i) {
    		System.out.println("POSITION " + i + " VALUE " + myNumberList[i]);
    	}
    }
    
    public void tokenElement() {
    	String inputData = "codigo_cliente=1,nombre_cliente=pako,apellido_cliente=jarls#codigo_cliente=2,nombre_cliente=juanito,apellido_cliente=jarls";
        
        StringTokenizer tokenizer = new StringTokenizer(inputData, "#");
        
        while(tokenizer.hasMoreElements()) {
            String cad = tokenizer.nextElement().toString();
            StringTokenizer tokenizer2 = new StringTokenizer(cad, ",");
            
            while(tokenizer2.hasMoreElements()) {
            	System.out.println("codigo: " + datos(tokenizer2.nextElement().toString()));
            	System.out.println("Nombre: " + datos(tokenizer2.nextElement().toString()));
            	System.out.println("Apellido: " + datos(tokenizer2.nextElement().toString()) + "\n");
            }
        }
    }
    
    public String datos(String cad) {
    	StringTokenizer tokenizer = new StringTokenizer(cad, "=");
    	String[] resul = new String[2];
    	
    	resul[0] = tokenizer.nextElement().toString();
    	resul[1] = tokenizer.nextElement().toString();
    	
    	return resul[1];
    }
}
