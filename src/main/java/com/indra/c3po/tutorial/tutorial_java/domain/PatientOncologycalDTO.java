package com.indra.c3po.tutorial.tutorial_java.domain;

public class PatientOncologycalDTO extends PatientDTO {
	
	public PatientOncologycalDTO(Integer dni, String name) {
		super();
		// TODO Auto-generated constructor stub
	}


	private Integer phase;



	public String getName() {
		return "ONCOLOGYCAL " + super.getName().toUpperCase();
	}
}
