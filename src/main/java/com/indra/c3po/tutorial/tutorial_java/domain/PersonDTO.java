package com.indra.c3po.tutorial.tutorial_java.domain;

public class PersonDTO {
	protected Integer dni;
	protected String name;
	
	public PersonDTO() {
		this.dni = null;
		this.name = null;
	}
	
	public PersonDTO(Integer dni, String name) {
		this();
		this.dni = dni;
		this.name = name;
	}
	
	public static Boolean checkDNI(Integer number) {
		return true;
		
	}
	protected Integer getDNI() {
		return dni;
	}
	
	public final void setDNI(Integer dni) {
		this.dni = dni;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public void setName(String name,Boolean toUpperCase) {
		if (toUpperCase) {
			this.name = name.toUpperCase();
		}else {
			this.name = name.toLowerCase();
		}
		
	}

	
}
