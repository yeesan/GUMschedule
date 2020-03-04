package gumSchedule2;

public class Person {

	// TODO name, group, bonding
	int id;
	String[] available = new String[5];
	boolean stillAvailable;
	
	public Person(int id_assign, String availableService[]) {
		//assign ID
		id = id_assign;
		//assign date and service
		for (int i = 0; i<5; i++) {
			available[i] = availableService[i];
		}
		//check availability
		stillAvailable = checkAvailableDate();
	}
	//check if all dates not available. mark T if not
	private boolean checkAvailableDate() {
		boolean result = false;
		for (int i = 0 ; i < 5; i++) {
			if(available[i].equals("01") || available[i].equals("10") || available[i].equals("11") ) {
				result = true;
				break;
			}
		}
		return result;
	}
	//set stillAvailable
	public void setStillAvailable() {
		stillAvailable = false;
	}
	//get available[i]
	public String getAvailableOnDay(int i) {
		return available[i];
	}
	
	//getter for stillAvailable
	public boolean getStillAvailable() {
		return stillAvailable;
	}
	
	//getter for ID
	public int getID() {
		return id;
	}
	

}
