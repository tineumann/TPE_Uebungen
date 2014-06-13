package TPE_SS2014.UIB05.Uebung04.Kinoprogramm;

import java.text.ParseException;
import java.util.Date;

public class AusgabenTest {

	public static void main(String[] args) {
		/*Zeit zeit1 = new Zeit("11:30");
		Date date = zeit1.toDate(zeit1.getZeit());
		println(date);*/
		
		Kino kino1 = new Kino("Cinemaxx", "Mannheim");
		Saal saal1 = new Saal("Blauer Saal",250);
		Kino.saele.add(0, saal1);
		System.out.println(Kino.saele.size());
	}

}
