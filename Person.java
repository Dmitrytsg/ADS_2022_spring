package tasks.persons;


public class Person {
	private int PersonID;
	private int YearsOld;
	private String FirstName;
	private String LastName;
	
	public int GetPersonID() {
		return PersonID;
	}
	public boolean SetPersonID(int personID) {
		return true;
	}
	
	public int GetYearsOld() {
		return YearsOld;
	}
	public boolean SetYearsOld(int yearsOld) {
		return true;
	}
	
	public String GetFirstName() {
		return FirstName;
	}
	public boolean SetFirstName(String firstName) {
		return true;
	}
	
	public String GetLastName() {
		return LastName;
	}
	public boolean SetLastName(String lastName) {
		return true;
	}
}
