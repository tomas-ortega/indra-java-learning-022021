package com.indra.c3po.tutorial.domain;

public class PatientOncologycalDTO extends PatientDTO{
	
	public String getName() {
		return "Oncologycal: " + this.name.toUpperCase();
	}

}
