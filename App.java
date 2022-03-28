package cinemaProject;

import java.time.Period;
import java.util.List;
import java.util.concurrent.TimeUnit;

import javax.persistence.*;
import cinemaProject.*;

public class App {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("hb-persistence");
		EntityManager em = emf.createEntityManager();
		
		System.out.println("Start");
		
		em.getTransaction().begin();
		
		
		Person pr = em.find(Person.class, 2);
		Film fm = em.find(Film.class, 3);
		
		//pr.addFilm(fm);
		
		pr.addFilm(fm);
		
		/*Person pr = new Person();
		pr.SetYearsOld(32);
		pr.SetFirstName("Dima");
		pr.SetLastName("Tsygankov");
		pr.SetStatus("Actor");*/
		
		/*Session sn = new Session();
		sn.SetDate(2021, 5, 12);
		sn.SetTicketCount(45);
		sn.SetStartTime(16, 55);
		sn.SetFinishTime(18, 34);
		sn.SetFilmID(em.find(Film.class, 1));*/
		
		/*Session sn = em.find(Session.class, 3);
	
		Film fm = new Film();
		fm.SetGenre("crim");
		fm.SetName("Stringer 3");
		fm.SetReleaseYear(2009);
		fm.addSession(sn);*/
		
		//sn.SetFilmID(em.find(Film.class, 1));
		
		
		em.persist(pr);
		em.getTransaction().commit();
		System.out.println("Finish");
	}
	
}
