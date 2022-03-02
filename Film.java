package tasks.fims;

import java.util.List;

public class Film {
	private int FilmID;
	private String Name;
	private String Genre;
	private int ReleaseYear;
	private List<Integer> SessionList;
	private List<Integer> ProduserList;
	private List<Integer> ActorList;
	
	public int GetFilmID() {
		return FilmID;
	}
	
	public boolean SetFilmID(int filmID) {
		return true; //or false(later)
	}
	
	public String GetName() {
		return Name;
	}
	
	public boolean SetName(String name) {
		return true; //or false(later)
	}
	
	public String GetGenre() {
		return Genre;
	}
	
	public boolean SetGenre(String genre) {
		return true; //or false(later)
	}
	
	public int GetReleaseYear() {
		return ReleaseYear;
	}
	
	public boolean SetReleaseYear(int releaseYear) {
		return true; //or false(later)
	}
	
	public List<Integer> GetSessionList() {
		return SessionList;
	}

	public List<Integer> GetProduserList() {
		return ProduserList;
	}
	
	public boolean SetProduserList(List<Integer> produserList) {
		return true;
	}
	
	public List<Integer> GetActorList() {
		return ActorList;
	}
	
	public boolean SetActorList(List<Integer> actorList) {
		return true;
	}
}
