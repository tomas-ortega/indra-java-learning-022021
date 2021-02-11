package com.indra.c3po.tutorial.domain;

public class PersonDTO {
	protected Integer dni;
	protected String name;
	
	public PersonDTO() {
		this.dni = null;
		this.name = null;
	}
	
	public Integer getDni() {
		return dni;
	}
	
	public void setDni(Integer id) {
		this.dni = dni;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

}
