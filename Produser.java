package tasks.persons;

import java.util.List;

public class Produser extends Person{
	private List<Integer> ListOfFilms;
	
	public List<Integer> GetListOfFilms() {
		return ListOfFilms;
	}
	
	public boolean SetListOfFilms(List<Integer> listOfFilms) {
		return true;
	}
}
