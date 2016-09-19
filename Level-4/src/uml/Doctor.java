package uml;

import java.util.ArrayList;

public class Doctor {
	public boolean performsSurgery = false;
	public boolean makesHouseCalls = false;
	public boolean evil = false;
	public String name;
	public Hospital hos;
	ArrayList<Patient> list = new ArrayList<Patient>();
	
	Doctor() {
		
	}
	
	Doctor(String name) {
		this.name = name;
		if(name.equals("666")) {
			joinTheDarkSide();
		}
	}
	
	Doctor(String name, Hospital h) {
		this.name = name;
		if(name.equals("666")) {
			joinTheDarkSide();
		}
		hos = h;
	}
	
	public boolean performsSurgery() {
		return performsSurgery;
	}

	public void doMedicine() {
		for(Patient p : list) {
			if(evil == true) {
				p.kill();
			}
			else {
				p.checkPulse();
				p.feelsCaredFor();
			}
		}
	}

	public ArrayList<Patient> getPatients() {
		return list;
	}

	public void assignPatient(Patient patient) throws DoctorFullException{
		if(list.size() >= 3)
			throw new DoctorFullException("Too many patients.");
		else
			list.add(patient);
	}

	public boolean makesHouseCalls() {
		return makesHouseCalls;
	}
	
	public int getNum() {
		return list.size();
	}
	
	public boolean isEvil() {
		if(evil == true)
			return true;
		
		return false;
	}
	
	public void joinTheDarkSide() {
		evil = true;
	}
	
	public Hospital getHospital() {
		return hos;
	}
	
}
