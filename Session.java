package cinemaProject;

import javax.persistence.*;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.ArrayList;
import java.util.Date;

@Entity
@Table(name = "cinema_db.session")
public class Session {
	@Id
	@Column(name = "sid")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int SessionID;
	
	@ManyToOne(fetch = FetchType.LAZY, optional=false, cascade=CascadeType.ALL)
	@JoinColumn(name="film_id")
	private Film film_id;
	
	@Column(name = "s_date")
	private Calendar Date;
	
	@Column(name = "s_starttime")
	private Calendar StartTime;
	
	@Column(name = "s_finishtime")
	private Calendar FinishTime;
	
	@Column(name = "s_ticketcount")
	private int TicketCount;
	
	
	
	public int GetSessionID() {
		return SessionID;
	}
	public boolean SetSessionID(int sessionID) {
		this.SessionID = sessionID;
		return true;
	}
	
	public Film GetFilmID() {
		return film_id;
	}
	public boolean SetFilmID(Film filmID) {
		this.film_id = filmID;
		return true;
	}
	
	public Date GetDate() {
		return Date.getTime();
	}
	public boolean SetDate(int year, int month, int day) {
		Date = new GregorianCalendar();
		Date.set(Calendar.YEAR, year);
		Date.set(Calendar.MONTH, (month-1));
		Date.set(Calendar.DAY_OF_MONTH, day);
		return true;
	}
	
	public Date GetStartTime() {
		return StartTime.getTime();
	}
	public boolean SetStartTime(int hour, int minute) {
		//!!пофиксить если Date == null
		StartTime = new GregorianCalendar(this.Date.get(Calendar.YEAR),this.Date.get(Calendar.MONTH)-1,this.Date.get(Calendar.DAY_OF_MONTH)); 
		StartTime.set(Calendar.HOUR_OF_DAY, hour);
		StartTime.set(Calendar.MINUTE, minute);
		return true;
	}
	
	public Date GetFinishTime() {
		return FinishTime.getTime();
	}
	public boolean SetFinishTime(int hour, int minute) {
		//!!пофиксить если Date == null
		FinishTime = new GregorianCalendar(this.Date.get(Calendar.YEAR),this.Date.get(Calendar.MONTH)-1,this.Date.get(Calendar.DAY_OF_MONTH));
		FinishTime.set(Calendar.HOUR_OF_DAY, hour);
		FinishTime.set(Calendar.MINUTE, minute);
		return true;
	}
	
	public int GetTicketCount() {
		return TicketCount;
	}
	public boolean SetTicketCount(int ticketCount) {
		this.TicketCount = ticketCount;
		return true;
	}
	

	public ArrayList<Integer> GetSessionTime() {
		ArrayList<Integer> res = new ArrayList<Integer>();
		res.add(0, this.FinishTime.get(Calendar.HOUR_OF_DAY) - this.StartTime.get(Calendar.HOUR_OF_DAY));
		res.add(1, this.FinishTime.get(Calendar.MINUTE) + (60 - this.StartTime.get(Calendar.MINUTE)));
		return res;
	}
	
	public Session() {
		
	}
}
