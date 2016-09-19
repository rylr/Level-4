package uml;

import java.util.ArrayList;

public class Hospital {
	ArrayList<Doctor> dcs = new ArrayList<Doctor>();
	ArrayList<Patient> pts = new ArrayList<Patient>();
	ArrayList<Zombie> zmbs = new ArrayList<Zombie>();
	
	public void add(Object o) {
		if(o instanceof Doctor)
			dcs.add((Doctor) o);
		else if(o instanceof Patient)
			pts.add((Patient) o);
		else if(o instanceof Zombie)
			zmbs.add((Zombie) o);
	}
	
	public void addDoctor(Doctor doc) {
		dcs.add(doc);
	}
	
	public void addPatient(Patient pat) {
		pts.add(pat);
	}
	
	public void assignPatientsToDoctors() {
		int doc = 0;
		int cycle = 0;
	
		for(Patient p : pts) {
			if(cycle >= 3) {
				doc++;
				cycle = 0;
			}
			
			cycle++;
			try {
				dcs.get(doc).assignPatient(p);
			} catch (DoctorFullException e) {
				e.printStackTrace();
			}
		}
	}

	public ArrayList<Doctor> getDoctors() {
		return dcs;
	}

	public ArrayList<Patient> getPatients() {
		return pts;
	}
	
	public ArrayList<Zombie> getZombies() {
		return zmbs;
	}
	
	public void makeDoctorsWork() {
		for(Doctor d : dcs)
			d.doMedicine();
		
		int zombies = 0;
		
		for(Patient p : pts) {
			if(p.isAlive() == false) {
				zombies++;
			}
		}
		
		for(int i = 0; i < zombies; i++)
			pts.remove(i);
	}
}