package tasks.fims;

public class Session {
	private int SessionID;
	private int FilmID;
	private int Day;
	private int Mounth;
	private int StartTime;
	private int FinishTime;
	private int TicketCount;
	
	public int GetSessionID() {
		return SessionID;
	}
	
	public boolean SetSessionID(int sessionID) {
		return true; //or false(later)
	}
	
	public int GetFilmID() {
		return FilmID;
	}
	
	public boolean SetFilmID(int filmID) {
		return true; //if in DB
	}
	
	public int GetDay() {
		return Day;
	}
	
	public boolean SetDay(int day) {
		return true; //or false(later)
	}
	
	public int GetMounth() {
		return Mounth;
	}
	
	public boolean SetMounth(int mounth) {
		return true; //or false(later)
	}
	
	public int GetStartTime() {
		return StartTime;
	}
	
	public boolean SetStartTime(int startTime) {
		return true; //or false(later)
	}
	
	public int GetFinishTime() {
		return FinishTime;
	}
	
	public boolean SetFinishTime(int finishTime) {
		return true; //or false(later)
	}
	
	public int GetTicketCount() {
		return TicketCount;
	}
	
	public boolean SetTicketCount(int ticketCount) {
		return true; //or false(later)
	}
}
