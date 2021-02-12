package com.indra.c3po.tutorial.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.indra.c3po.tutorial.domain.PatientDTO;

public class PatientDAO {

	public void insert(PatientDTO patientToInsert, Connection connection) throws SQLException {
		StringBuilder insertSql = new StringBuilder();
		PreparedStatement statement = null;
		
		try {
			insertSql.append("INSERT INTO ");
			insertSql.append("patient");
			insertSql.append("(dni,name,nhc)");
			insertSql.append(" VALUES (?,?,?)");
			
			statement = connection.prepareStatement(insertSql.toString());
			
			statement.setInt(1, patientToInsert.getDni());
			statement.setString(2, patientToInsert.getName());
			statement.setString(3, patientToInsert.getNhc());
			
			statement.execute();
		} catch(SQLException ex) {
			throw ex;
		}
	}
	
	public PatientDTO search(Integer patientDni, Connection connection) throws SQLException {
		PatientDTO patientFound = null;
		StringBuilder select = null;
		ResultSet resultSet = null;
		PreparedStatement preparedStatement = null;
        Integer auxiliaryInteger = null;

		try {
	         select = new StringBuilder();
	         
	         select.append("SELECT ");
	         select.append("patient.dni,");
	         select.append("patient.name,");
	         select.append("patient.nhc");
	         select.append(" FROM ");
	         select.append(" patient ");
	         select.append(" WHERE ");
	         select.append(" patient.dni = ?");
	         
	         preparedStatement = connection.prepareStatement(select.toString());
	         preparedStatement.setInt(1, patientDni);
	         
	         resultSet = preparedStatement.executeQuery();
	         
	         while (resultSet.next()) {
	             patientFound = new PatientDTO();
	             
	             auxiliaryInteger = resultSet.getInt("dni");
	             
	             if (!resultSet.wasNull()) {
	                 patientFound.setDni(auxiliaryInteger);
	             }
	             
	             patientFound.setName(resultSet.getString("name"));
	             patientFound.setNhc(resultSet.getString("nhc"));
	         }
	         
	         return patientFound;
		            
		} catch(SQLException ex) {
			throw ex;
		}
	}
}
