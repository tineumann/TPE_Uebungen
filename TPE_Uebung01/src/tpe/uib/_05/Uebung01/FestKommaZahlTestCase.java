package tpe.uib._05.Uebung01;

import static org.junit.Assert.*;
import org.junit.Test;

public class FestKommaZahlTestCase {

	@Test
	public void testAddieren() {
		/**
		 * Addieren
		 */
		Festkommazahl festkommazahl1 = new Festkommazahl(123.20);
		Festkommazahl festkommazahl2 = new Festkommazahl(0.20);
		assertEquals(new Festkommazahl(123.40), 
				festkommazahl1.addiere(festkommazahl2));
		
		Festkommazahl festkommazahl3 = new Festkommazahl(345.67);
		Festkommazahl festkommazahl4 = new Festkommazahl(12.3);
		assertEquals(new Festkommazahl(357.97),
				festkommazahl3.addiere(festkommazahl4));
		
		Festkommazahl festkommazahl5 = new Festkommazahl(0.00);
		Festkommazahl festkommazahl6 = new Festkommazahl(0.001);
		assertEquals(new Festkommazahl(0.00),
				festkommazahl5.addiere(festkommazahl6));
	}
	
	@Test
	public void testSubtrahieren(){
		/**
		 * Subtrahieren
		 */
		Festkommazahl festkommazahl1 = new Festkommazahl(123.20);
		Festkommazahl festkommazahl2 = new Festkommazahl(0.20);
		assertEquals(new Festkommazahl(123.00),
				festkommazahl1.subtrahiere(festkommazahl2));
		
		Festkommazahl festkommazahl3 = new Festkommazahl(345.67);
		Festkommazahl festkommazahl4= new Festkommazahl(12.3);
		assertEquals(new Festkommazahl(333.37),
				festkommazahl3.subtrahiere(festkommazahl4));
		
		Festkommazahl festkommazahl5 = new Festkommazahl(00.00);
		Festkommazahl festkommazahl6 = new Festkommazahl(00.001);
		assertEquals(new Festkommazahl(00.00),
				festkommazahl5.subtrahiere(festkommazahl6));
		
		Festkommazahl festkommazahl7= new Festkommazahl(-12.34);
		Festkommazahl festkommazahl8 = new Festkommazahl(-8.34);
		assertEquals(new Festkommazahl(0),
				festkommazahl7.subtrahiere(festkommazahl8));
		Festkommazahl festkommazahl9 = new Festkommazahl(12.3456789);
		Festkommazahl festkommazahl10 = new Festkommazahl(1.23);
		assertEquals(new Festkommazahl(11.1156789),
				 festkommazahl9.subtrahiere(festkommazahl10));
		
	}
	
	@Test
	public void testMultiplizieren(){
		/**
		 * Multiplizieren
		 */
		Festkommazahl festkommazahl1 = new Festkommazahl(22.22);
		Festkommazahl festkommazahl2 = new Festkommazahl(33.33);
		assertEquals(new Festkommazahl(740, 5926, 4),
				festkommazahl1.multipliziere(festkommazahl2));
		
		Festkommazahl festkommazahl3 = new Festkommazahl(0.01);
		Festkommazahl festkommazahl4 = new Festkommazahl(22.22);
		assertEquals(new Festkommazahl(0, 2222, 4),
				festkommazahl3.multipliziere(festkommazahl4));
		
		Festkommazahl festkommazahl5 = new Festkommazahl(123.45);
		Festkommazahl festkommazahl6 = new Festkommazahl(987.65);
		assertEquals(new Festkommazahl(121925,393,3).toString(),
				festkommazahl5.multipliziere(festkommazahl6).toString());
		
	}
	
	@Test
	public void testDividiere(){
		/**
		 * Dividieren
		 */
		
		Festkommazahl festkommazahl4 = new Festkommazahl(100, 555, 2);
		assertEquals(new Festkommazahl((double) 100.55 / 86.246),
				festkommazahl4.dividiere(86.246));
		
		Festkommazahl festkommazahl3 = new Festkommazahl(20.05);
		assertEquals(null,
				festkommazahl3.dividiere(0));
		
		Festkommazahl festkommazahl1 = new Festkommazahl(700.150);
		assertEquals(new Festkommazahl(34.15),
				festkommazahl1.dividiere(20.50));
		
		Festkommazahl festkommazahl2 = new Festkommazahl(50.50);
		assertEquals(new Festkommazahl(25.25),
				festkommazahl2.dividiere(2));
	}
	
	@Test
	public void testProzent(){
		Festkommazahl festkommazahl1 = new Festkommazahl(100,0000,4);
		Festkommazahl festkommazahl2 = new Festkommazahl(50,000,3);
		assertEquals(new Festkommazahl(50.00),
				festkommazahl1.prozent(festkommazahl2));
		
		Festkommazahl festkommazahl3 = new Festkommazahl(50.90);
		Festkommazahl festkommazahl4 = new Festkommazahl(5.677);
		assertEquals(new Festkommazahl(11.13), 
				festkommazahl3.prozent(festkommazahl4));
	}
	
	@Test
	public void testGetVorkomma(){
		Festkommazahl festkommazahl1 = new Festkommazahl(123, 456, 3);
		assertEquals(123, festkommazahl1.getVorkomma());
		
		Festkommazahl festkommazahl2 = new Festkommazahl(23.45);
		assertEquals(23, festkommazahl2.getVorkomma());
		
		Festkommazahl festkommazahl3 = new Festkommazahl(0.1);
		assertEquals(0, festkommazahl3.getVorkomma());
	}
	
	@Test
	public void testGetNachkomma(){
		Festkommazahl festkommazahl1 = new Festkommazahl(987.654321);
		assertEquals(65, festkommazahl1.getNachkomma());
		
		Festkommazahl festkommazahl2 = new Festkommazahl(123, 456, 3);
		assertEquals(46l, festkommazahl2.getNachkomma());
		
		Festkommazahl festkommazahl3 = new Festkommazahl(0.01);
		assertEquals(0l, festkommazahl3.getNachkomma());
		
		Festkommazahl festkommazahl4 = new Festkommazahl(0, 4567, 4);
		assertEquals(46l, festkommazahl4.getNachkomma());
	}
	
	@Test
	public void testGetAsDouble(){
		Festkommazahl festkommazahl1 = new Festkommazahl(123, 456, 3);
		assertEquals("123.45", Double.toString(festkommazahl1.getAsDouble())); // !
	}
	
	@Test
	public void testEquals(){
		Festkommazahl festkommazahl1 = new Festkommazahl(123, 456, 3);
		Festkommazahl festkommazahl2 = new Festkommazahl(123, 456, 3);
		assertTrue(festkommazahl1.equals(festkommazahl2));
		
		Festkommazahl festkommazahl3 = new Festkommazahl(98.76);
		Festkommazahl festkommazahl4 = new Festkommazahl(98, 76, 2);
		assertTrue(festkommazahl3.equals(festkommazahl4));
		
		assertFalse(festkommazahl1.equals(festkommazahl3));
		assertFalse(festkommazahl2.equals(festkommazahl4));
	}
	
	@Test
	public void testParse(){
		
		assertEquals(new Festkommazahl(123.45), Festkommazahl.parse("123.45"));
		
		assertEquals(new Festkommazahl(0.91), Festkommazahl.parse("0.91"));
		
		assertEquals(new Festkommazahl(45.98), Festkommazahl.parse("45.98"));
		
	}
	
	@Test
	public void testRunden(){
		assertEquals(8l, new Festkommazahl(1, 76, 3).getNachkomma());
	}
	

}
