package com.indra.c3po.tutorial.tutorial_java.business;

import com.indra.c3po.tutorial.tutorial_java.domain.PatientDTO;

public class PatientBS extends BaseBsAbstract implements InterfaceBS{

	@Override
	public Integer insert(Object object) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer remove(Object object) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	Object search(Object searchCriterial) {
		// TODO Auto-generated method stub
		PatientDTO patientFound = new PatientDTO();
		
		patientFound.setDNI(3);
		patientFound.setName("Pako");
		
		return patientFound;
	}

}
