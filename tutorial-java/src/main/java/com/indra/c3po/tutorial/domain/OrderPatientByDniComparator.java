package com.indra.c3po.tutorial.domain;

import java.util.Comparator;

public class OrderPatientByDniComparator implements Comparator<PatientDTO> {

	@Override
	public int compare(PatientDTO patient1, PatientDTO patient2) {
		return patient1.getDni().compareTo(patient2.getDni());
	}
}
