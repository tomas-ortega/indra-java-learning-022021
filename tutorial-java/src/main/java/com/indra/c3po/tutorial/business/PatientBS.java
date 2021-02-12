package com.indra.c3po.tutorial.business;

import java.sql.Connection;

import com.indra.c3po.tutorial.dao.PatientDAO;
import com.indra.c3po.tutorial.domain.PatientDTO;

public class PatientBS extends BaseBsAbstract implements IPatientnterfaceBS {

	@Override
	public Integer insert(PatientDTO patientToInsert) throws Exception {
		PatientDAO patientDAO;
		Connection connectionDb = null;
		
		try {
			connectionDb = DbConnection.getDbConnection();
			patientDAO = new PatientDAO();
			
			patientDAO.insert(patientToInsert, connectionDb);
			
			return 1;
		} catch(Exception ex) {
			throw ex;
		} finally {
			DbConnection.closeConnection(connectionDb);
		}
	}
	
	

	@Override
	public Integer delete(Integer id) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PatientDTO searchSinglePatient(Integer id) throws Exception {
		PatientDTO patientFound = null;
		PatientDAO patientDAO = null;
		Connection connectionDb = null;
		
		try {
			connectionDb = DbConnection.getDbConnection();
			patientDAO = new PatientDAO();
			
			patientFound = patientDAO.search(id, connectionDb);
			
			return patientFound;
		} catch(Exception ex) {
			throw ex;
		}
	}
}
