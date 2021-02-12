package com.indra.c3po.tutorial.business;

import com.indra.c3po.tutorial.domain.PatientDTO;

public interface IPatientnterfaceBS {
	Integer insert(PatientDTO object) throws Exception;
	Integer delete(Integer id) throws Exception;
	PatientDTO searchSinglePatient(Integer id) throws Exception;
}
