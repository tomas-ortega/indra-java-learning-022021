package com.indra.c3po.tutorial.domain;

public class PatientDTO extends PersonDTO implements Cloneable, Comparable<PatientDTO> {
	
	private String nhc;

	public PatientDTO() {
		super(4, "pako");
		this.nhc = null;
	}
	
	@Override
	public String getName() {
		return this.name.toUpperCase();
	}
	
	public void setNhc(String nhc) {
		this.nhc = nhc;
	}
	
	public String getNhc() {
		return this.nhc;
	}
	
	@Override
	public Integer getDni() {
		return super.getDni();
	}
	

	public static Boolean checkDni(Integer number) {
		return PersonDTO.checkDni(number);
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	
	@Override
	public String toString() {
		StringBuilder strReturnBuilded = new StringBuilder();
		
    	strReturnBuilded.append("Paciente: dni=");
    	strReturnBuilded.append(this.getDni());
    	
    	strReturnBuilded.append(",nombre=");
    	strReturnBuilded.append(this.getName());
    	
    	strReturnBuilded.append(",nhc=");
    	strReturnBuilded.append(this.getNhc());
        	
        return strReturnBuilded.toString();
	}

	@Override
	public int compareTo(PatientDTO incomingPatient) {
		return this.nhc.compareTo(incomingPatient.getNhc());
	}
	
	@Override
    public boolean equals(Object objectToCompare) {
        boolean equals = true;
        PatientDTO patientToCompare;
        
        if (objectToCompare == null) {
            equals = false;
        } else if (objectToCompare instanceof PatientDTO) {
            patientToCompare = (PatientDTO) objectToCompare;
            
            if(!this.nhc.equals(patientToCompare.getNhc())
                    || !this.getDni().equals(patientToCompare.getDni())) {
                equals = false;
            }
        } else {
            equals = false;
        }
        
        return equals;
    }
}






