package com.indra.c3po.tutorial.domain;

public class PatientOncologycalDTO extends PatientDTO {
	private Integer phase;
	
	public PatientOncologycalDTO() {
		super();
		this.phase = null;
	}
	
	@Override
	public String getName() {
		return "ONCOLOGYCAL: " + this.name.toUpperCase();
	}
}
