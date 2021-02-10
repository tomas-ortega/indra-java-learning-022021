package com.indra.c3po.tutorial;

import java.math.BigDecimal;
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
       App myApp = new App();
       //myApp.learnEqualsWithOperator();       
       //myApp.learnCasting();
       //myApp.learnIterators();
       //myApp.learIteratorsStream();
       //myApp.askJumpers();
       //myApp.stringVBuilder();
       myApp.stringTokenizerAnSplitted();
    }
    
    private void stringTokenizerAnSplitted() {
    	
	    String inputData = "codigo_cliente=1,nombre_cliente=pako,apellido_cliente=jarls#codigo_cliente=2,nombre_cliente=juanito,apellido_cliente=jarls";
	    
	    StringTokenizer tokenizer = new StringTokenizer(inputData, "#");
	    
	    while(tokenizer.hasMoreElements()) {
	        System.out.println("CLIENT: " + tokenizer.nextElement());
	        System.out.println("");
	        String[] infoCliente =  inputData.split(",");	        
	        for(int i = 0;i < infoCliente.length;i++) {	        
	        	infoCliente[i]=infoCliente[i].replace("=",":");
	        	infoCliente[i]=infoCliente[i].replace("_"," ");  
	        	infoCliente[i]=infoCliente[i].toUpperCase();
	        	System.out.println(infoCliente[i]);	        	
	        }
	        
	        
	    }
    }
    
    private void stringVBuilder() {
    	String sayHello = "Hello Indra";
    	sayHello += " From Malaga";
    	
    	System.out.println("String: " + sayHello);
    	
    	StringBuilder sayHelloBuilder = new StringBuilder();
    	sayHelloBuilder.append ("Hello indra");
    	sayHelloBuilder.append (" From Málaga");
    	
    	System.out.println("Stringbuilder: " + sayHelloBuilder);
    }
    
    private void learnEqualsWithOperator() {
    	int num1 = 0;
    	int num2 = 0;
    	
    	System.out.println(num1==num2);    	
    }
    
    private void learnEEqualWithObject () {
    	Integer num1 = 0;
    	Integer num2 = 0;
    	
    	System.out.println (num1.equals(num2));
    	
    }
    
    private void learnCasting() {
    	Integer num1 = 0 ;
    	Long num1Long = 0L;
    	BigInteger  num1BigInteger = new BigInteger (num1.toString());
    	
    	Double num2 = 2.54;
    	Float num3 = 1.9F;
    	BigDecimal num3BigDecimal = new BigDecimal (num2);
    	 
    	String stringnumber4 = "42";
    	stringnumber4  = new String ("21");
    	
    	//num1 = new Integer("2");
    	num1 = 8;
	
    	System.out.println("Casting de Integer a String: " + num1);
    	System.out.println("Casting de Integer a String: " + num1.toString());
    	System.out.println("Casting de String a Integer: " + Integer.valueOf(stringnumber4));
    	System.out.println("Casting de String a Double: " + Double.valueOf(stringnumber4));
    	System.out.println("Casting de String a Float: " + Float.valueOf(stringnumber4));
    	System.out.println("Casting de Float a Integer: " + num3);
    	System.out.println("Big Integer value: " + num1BigInteger);
    	System.out.println("Big Integer value: " + num3BigDecimal);
    	
    }    
    /*1º rellenar todos los datos
     ver en pantalla orden ascendente
     ver en prden descendentes*/
    
    public void learnIterators() {
    	Integer[] myNumberList = new Integer [5];
    	//Rellenado
    	for (int i=0;i<myNumberList.length;i++) {
    		myNumberList[i]=i;
       	}    	
    	//Listado ascendente.
    	for (int i=0;i<myNumberList.length;i++) {    		
    		System.out.println("Position: " + i + " VALUE : " + myNumberList[i]);
    	}
    	//Listado descendente.
    	for (int i=myNumberList.length-1;i>0;i--) {
    		System.out.println("Position: " + i + " VALUE : " + myNumberList[i]);
    	}    	
    }
    /*
    System.out.println(numb);
    System.out.println(++numb);
    System.out.println(numb);
    
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
    }*/
    
    
    public void learIteratorsStream() {
    	List <Integer> myNumberList = new ArrayList<>();
    	
    	myNumberList.add(1);
    	
    	System.out.println("LIST SIZE: " + myNumberList.size());
    	
    	myNumberList.remove(0);    	
    	System.out.println("LIST SIZE: " + myNumberList.size());
    	
    	myNumberList.contains(2);
    	
    	myNumberList.add(5);
    	myNumberList.add(7);
    	myNumberList.add(2);
    	
        Iterator<Integer> iteratorList = myNumberList.iterator();
        
        while(iteratorList.hasNext()){
        	System.out.println("DATO ITERATOR: " + iteratorList.next());
        }      
    	
    }
    private Integer askJumpers(){
    	//Zona declarativa
    	Integer number1 = 0;
    	Integer evaluationResult = 0;
    	
    	//Zona de procesamiento
    	if(number1 > 1){
    		evaluationResult = 1;
    	} else {
    		evaluationResult = 0;
    	}
    	
    	return evaluationResult;
    }
    
    
    
    
    
    
    
    
    
}
