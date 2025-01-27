package test6.sub06;

import java.util.ArrayList;
import java.util.List;

public class Doctor {
	
	private String name;
	private String id;
	private String special;
	
	List<Patient> patients = new ArrayList<>();

	public Doctor(String name, String id, String special) {
		this.name = name;
		this.id = id;
		this.special = special;
	}
	
	
	public void addPatient(Patient patient){
		patients.add(patient);
	}


	@Override
	public String toString() {
		return "Doctor [name=" + name + ", id=" + id + ", special=" + special + ", patients=" + patients + "]\n";
	}


		
	
	
	
}
