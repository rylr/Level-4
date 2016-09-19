package uml;

public class Patient {
	public boolean checked = false;
	public boolean dead = false;
	
	public boolean feelsCaredFor() {
		if(checked == true)
			return true;
		
		return false;
	}

	public void checkPulse() {
		checked = true;
	}
	
	public boolean isAlive() {
		if(dead == false)
			return true;
		
		return false;
	}
	
	public void kill() {
		dead = true;
	}
	
}