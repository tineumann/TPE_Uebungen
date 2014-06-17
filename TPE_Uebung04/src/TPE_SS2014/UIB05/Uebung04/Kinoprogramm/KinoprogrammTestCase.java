package TPE_SS2014.UIB05.Uebung04.Kinoprogramm;

import static org.junit.Assert.*;
import java.util.*;

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
		kino1.saeleHinzufuegen(saal1);
		assertEquals(250, kino1.getSaele().getFirst().getAnzahlSitze());
	}
	
	@Test
	public void testAddSaal(){
		Kino kino1 = new Kino("Cinemaxx", "Mannheim");
		kino1.saeleHinzufuegen("Saal1", 1000);
		LinkedList<Saal> saalListe = new LinkedList<>();
		saalListe.add(new Saal("Saal1", 1000));
		assertEquals(kino1.getSaele(), saalListe);
	}
}
