package com.indra.c3po.tutorial.domain;

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
	
	public static Boolean checkDni(Integer number) {
		return true;
	}
	
	protected Integer getDni() {
		return dni;
	}
	
	public final void setDni(Integer dni) {
		this.dni = dni;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setName(String name, Boolean toUpperCase) {
		if (toUpperCase) {
			this.name = name.toUpperCase();
		} else {
			this.name = name.toLowerCase();
		}
	}
}
