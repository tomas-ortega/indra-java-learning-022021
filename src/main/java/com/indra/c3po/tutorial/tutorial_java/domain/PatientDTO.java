package com.indra.c3po.tutorial.tutorial_java.domain;

public class PatientDTO extends PersonDTO implements Cloneable{
	private String nhc;
	
	public String getNhc() {
		return nhc;
	}
	public void setNhc(String nhc) {
		this.nhc = nhc;
	}
	public PatientDTO() {
		super(4,"pako"); 
		this.nhc = null;
	}
	@Override
	public String getName() {
		return super.getName().toUpperCase();
	}
	
	@Override
	public Integer getDNI() {
		return super.getDNI();
	}

	public static Boolean checkDNI(Integer number) {
		return true;
	}
	
	public Object clone() throws CloneNotSupportedException{
		return super.clone();
	}
	@Override
	public String toString() {
		StringBuilder strReturnBuilded = new StringBuilder();
		
		strReturnBuilded.append("Paciente: dni=");
		strReturnBuilded.append(this.getDNI());
		strReturnBuilded.append(",nombre=");
		strReturnBuilded.append(this.getName());
		strReturnBuilded.append(",nhc=");
		strReturnBuilded.append(this.getNhc());
		return strReturnBuilded.toString();
	}
	
}
