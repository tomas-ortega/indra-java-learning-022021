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

import com.indra.c3po.tutorial.business.PatientBS;
import com.indra.c3po.tutorial.domain.OrderPatientByDniComparator;
import com.indra.c3po.tutorial.domain.PatientDTO;
import com.indra.c3po.tutorial.domain.PatientOncologycalDTO;
import com.indra.c3po.tutorial.domain.PersonDTO;

/**
 * Hello world!
 *
 */
public class App 
{	
    public static void main( String[] args ) throws CloneNotSupportedException, Exception
    {
        App myApp = new App();
        
        //lSw52GV&KV:4
        
        //myApp.learnEqualsWithOperator();
        //myApp.learnEqualsWithObject();
        //myApp.learnCasting();
        //myApp.learnInterators();
        //myApp.learnIteratorsStream();
        //myApp.stringVsStringBuilder();
        //myApp.stringTokenizerAndSplitted();
        //myApp.learnFinal();
        //myApp.learClasses();
        //myApp.learnClone();
        //myApp.learnComparator();
        //myApp.learnConnectionDb();
    }
    
    private void callBsToInsertPatient() throws Exception {
    	PatientBS patientBs = new PatientBS();
    	
    	PatientDTO newPatient = null;
    	
    	newPatient = new PatientDTO();
		newPatient.setDni(1);
		newPatient.setName("pako");
		newPatient.setNhc("NHC1");
    	
    	patientBs.insert(newPatient);
    }
  
    private void callBsSearchPatient() throws Exception {
    	PatientBS patientBs = new PatientBS();
    	
    	PatientDTO patientFound = null;
    	
    	patientFound = patientBs.searchSinglePatient(1);
    }
    
    private void learnComparator() {
    	PatientDTO singlePatient1 = new PatientDTO();
    	PatientDTO singlePatient2 = new PatientDTO();
    	
    	singlePatient1.setNhc("NHC1");
    	singlePatient2.setNhc("NHC1");
    	System.out.println("SON IGUALES (0): " + singlePatient1.compareTo(singlePatient2));
    	
    	singlePatient1.setNhc("NHC1");
    	singlePatient2.setNhc("NHC2");
    	System.out.println("EL PRIMERO ES MENOR QUE EL SEGUNDO (-1): " + singlePatient1.compareTo(singlePatient2));
    	
    	singlePatient1.setNhc("NHC1");
    	singlePatient1.setDni(2);
    	
    	singlePatient2.setNhc("NHC2");
    	singlePatient2.setDni(1);
    	System.out.println("EL SEGUNDO ES MENOR QUE EL PRIMERO (+1): " + singlePatient1.compareTo(singlePatient2));
    	
    	List<PatientDTO> patientList = new ArrayList<>();
    	patientList.add(singlePatient1);
    	patientList.add(singlePatient2);
    	
    	Collections.sort(patientList);
    	System.out.println("PATIENT LIST NATURAL ORDER: " + patientList);
    	
    	Collections.sort(patientList, Collections.reverseOrder());
    	System.out.println("PATIENT LIST REVERSE ORDER: " + patientList);
    	
    	Collections.sort(patientList, new OrderPatientByDniComparator());
    	System.out.println("PATIENT LIST DNI ORDER: " + patientList);
    	
    	singlePatient1.setNhc("NHC1");
    	singlePatient1.setDni(1);
    	
    	singlePatient2.setNhc("NHC1");
    	singlePatient2.setDni(1);
    	
    	System.out.println("¿PATIENT1 == PATIENT2?: " + singlePatient1.equals(singlePatient2));
    }
    
    private void learnClone() throws CloneNotSupportedException {
    	PatientDTO singlePatient1 = new PatientDTO();
    	singlePatient1.setDni(4);
    	
    	PatientDTO singlePatient2 = null;
    	//singlePatient2 = singlePatient1;
    	singlePatient2 = (PatientDTO) singlePatient1.clone();
    	
    	singlePatient2.setDni(0);
    	
    	System.out.println("PATIENT1 DNI: " + singlePatient1.getDni());
    	System.out.println("PATIENT2 DNI: " + singlePatient2.getDni());
    	
    	System.out.println("RAW PATIENT1: " + singlePatient1);
    }
    
    private void learClasses() {
    	PatientOncologycalDTO singleOncologycalPatient = new PatientOncologycalDTO();
    	PatientDTO singlePatient = new PatientDTO();
    	PersonDTO singlePerson = new PersonDTO();
    	
    	
    	singlePatient.setName("Pako");
    	singlePatient.setDni(1);
    	singlePatient.getDni();
    	
    	singlePerson.setName("Juanito");
    	singlePerson.setDni(1);
    	//singlePerson.getDni();
    	
    	singleOncologycalPatient.setName("2 telediarios");
    	
    	System.out.println("PERSON NAME: " + singlePerson.getName());
    	System.out.println("PATIENT NAME: " + singlePatient.getName());
    	System.out.println("ONCOLOGYCAL PATIENT: " + singleOncologycalPatient.getName());
    	
    	PersonDTO.checkDni(57484743);
    	
    	PersonDTO personConstructor = new PersonDTO(5, "pakito");
    	
    }
    
    private void learnFinal() {
    	final Integer myNumber = 0;
    	
    	/*No podría realizar la asignación por que el valor de la variable es inmutable*/
    	//myNumber = new Integer(0);
    	
    	this.changeFinalValue(myNumber);
    	
    	System.out.println(myNumber);
    	
    	
    	/*Probando el final con un array*/
    	final List<Integer> finalNumbers = new ArrayList<>();
    	
    	finalNumbers.add(3);
    	finalNumbers.add(2);
    	finalNumbers.remove(1);
    	
    	System.out.println("ARRAY FINAL SIZE: " + finalNumbers.size());
    }
    
    private void changeFinalValue(Integer numberToChange) {
    	numberToChange++;
    	
    	System.out.println("CHANGE FINAL VALUE: " + numberToChange);
    }
    
    private void stringTokenizerAndSplitted() {
    	String inputData = "codigo_cliente=1,nombre_cliente=pako,apellido_cliente=jarls#codigo_cliente=2,nombre_cliente=juanito,apellido_cliente=jarls";
    	
		StringTokenizer tokenizer = new StringTokenizer(inputData, "#");

		while (tokenizer.hasMoreElements()) {
			
			String datos = (String) tokenizer.nextElement();
			ArrayList<String> datosList = new ArrayList<>(Arrays.asList(datos.split(",")));
			
			for (int i=0; i<datosList.size(); i++) {
				StringTokenizer tokenizerSingleClient = new StringTokenizer(datosList.get(i), "=");
				
				while(tokenizerSingleClient.hasMoreElements()) {
					String currentElement = tokenizerSingleClient.nextElement().toString();
					
					if (!tokenizerSingleClient.hasMoreElements()) {
						switch (i) {
							case 0:
								System.out.println("CODIGO CLIENTE: " + currentElement);
								break;
							
							case 1:
								System.out.println("NOMBRE CLIENTE: " + currentElement);
								break;
								
							case 2:
								System.out.println("APELLIDO CLIENTE: " + currentElement);
								break;
	
							default:
								break;
						}
					}
				}
				
				System.out.println("");
			}
		}
    }
    

    
    private void stringVsStringBuilder() {
    	String sayHello = "Hello Indra!";
    	sayHello += " From Málaga!";
    	
    	System.out.println("STRING: " + sayHello);
    	
    	StringBuilder sayHelloBuilder = new StringBuilder();
    	sayHelloBuilder.append("Hello Indra!");
    	sayHelloBuilder.append(" From Málaga!");
    	
    	System.out.println("STRINGBUILDER: " + sayHelloBuilder);
    }
    
    private Integer askJumpers() {
    	//Zona declarativa
    	Integer number1 = 0;
    	Integer evaluationResult = 0;
    	
    	//Zona de procesamiento
    	if (number1 > 1) {
    		evaluationResult = 1;
    	} else {
    		evaluationResult = 0;
    	}
    	
    	//1 único punto de salida
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
    	
    	for (int i = 0; i < myNumberListLegacy.length && !itemFound; i++) {
    		if (myNumberListLegacy[i].equals(8)) {
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
    	
    	System.out.println(number1.equals(0));
    }
    
    private void learnCasting() {
    	Integer number1 = 0;
    	Long number1Long = 0L;
    	BigInteger number1BigInteger = new BigInteger(number1.toString());
    	
    	Double number2 = 2.54;
    	Float number3 = 1.298f;
    	BigDecimal number3BigDecimal = new BigDecimal(number2.toString());
    	BigDecimal number4BigDecimal = new BigDecimal(number2, MathContext.DECIMAL128);
    	
    	
    	String stringNumber4 = "42";
    	stringNumber4 = new String("21");
    	
    	//number1 = new Integer("2");
    	number1 = 8;
    	
    	System.out.println("CASTING DE INTEGER A STRING: " + number1);
    	System.out.println("CASTING DE INTEGER A STRING: " + number1.toString());
    	System.out.println("CASTING DE STRING A INTEGER: " + Integer.valueOf(stringNumber4));
    	System.out.println("CASTING DE STRING A DOUBLE: " + Double.valueOf(stringNumber4));
    	System.out.println("CASTING DE STRING A FLOAT: " + Float.valueOf(stringNumber4));
    	System.out.println("CASTING DE FLOAT A STRING: " + number3);
    	System.out.println("BIG INTEGER VALUE: " + number1BigInteger);
    	System.out.println("BIG DECIMAL VALUE: " + number3BigDecimal);
    	
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
    	
    	
    	//Java 8
    	myNumberList.forEach(pako -> { 
    		System.out.println("DATO LAMBDA: " + pako);
    	});

    	
    	//Java < 8
    	for (Integer currentNumber: myNumberList) {
    		System.out.println("DATO BUCLE FOR: " + currentNumber);
    	}
    	
    	Iterator<Integer> iteratorList = myNumberList.iterator();
    	
    	while(iteratorList.hasNext()) {
    		System.out.println("DATO ITERATOR: " + iteratorList.next());
    	}
    }
    
    public void learnInteratorsFor() {
    	Integer[] myNumberList = new Integer[5];
    	
    	//1º rellenar todos los datos en todas las posiciones
    	//2º quiero ver en pantalla todos los datos (orden ascendente)
    	//3º quiero ver en pantalla todos los datos (orden descendente)
    	
    	/*Integer myNumber = 0;
    	myNumber++;
    	
    	System.out.println("NUMBER: " + myNumber);*/
    	
    	int numb = 0;
        System.out.println(numb++);
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
        }
    }
}

//Object
