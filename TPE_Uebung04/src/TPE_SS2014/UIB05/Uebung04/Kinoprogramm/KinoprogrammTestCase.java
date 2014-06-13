package TPE_SS2014.UIB05.Uebung04.Kinoprogramm;

import static org.junit.Assert.*;

import java.util.Date;
import java.util.LinkedList;

import org.junit.Test;

public class KinoprogrammTestCase {

	@Test
	public void testCreateKino() {
		Kino kino = new Kino("Peter", "Berlin");

		assertEquals(kino.getName(), "Peter");
		assertEquals(kino.getStadt(), "Berlin");
	}
	
	@Test
	public void testCreateSaal(){
		Saal saal = new Saal("Blau", 50);
		
		assertEquals(saal.getName(), "Blau");
		assertEquals(saal.getAnzahlSitze(), 50);
	}
	
	@Test
	public void testAll(){
		Kino kino1 = new Kino("Cinemaxx", "Mannheim");
		Saal saal1 = new Saal("Blauer Saal",250);
		kino1.saele.add(0, saal1);
		System.out.println(Kino.saele.size());
	}
}
