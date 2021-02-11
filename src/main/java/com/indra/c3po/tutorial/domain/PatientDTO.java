package com.indra.c3po.tutorial.domain;

public class PatientDTO extends PersonDTO implements Cloneable{
	private String nhc;

	public String getNhc() {
		return nhc;
	}

	public void setNhc(String nhc) {
		this.nhc = nhc;
	}
	
	@Override
	public String getName() {
		return this.name.toUpperCase();
	}
	
	@Override
	public Integer getDni() {
		return super.getDni();
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException{
		return super.clone();
	}
	
}
