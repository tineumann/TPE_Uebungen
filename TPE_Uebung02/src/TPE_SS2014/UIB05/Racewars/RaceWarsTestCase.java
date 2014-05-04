package TPE_SS2014.UIB05.Racewars;

import static org.junit.Assert.*;

import org.junit.Test;

import TPE_SS2014.UIB05.Racewars.WesenImpl.*;
import TPE_SS2014.UIB05.Racewars.WesenAPI.*;

public class RaceWarsTestCase {

	@Test
	public void testIsLebendig() {
		Mensch m1 = new Mensch();
		assertTrue(m1.isLebendig());

		Mensch m2 = new Mensch();
		m2.setLebenspunkte(0);
		assertFalse(m2.isLebendig());

		Mensch m3 = new Mensch();
		m3.setLebenspunkte(-100);
		assertFalse(m2.isLebendig());
	}

	@Test
	public void testFactory() {
		Kaempfer[] kaempfer1 = WesenFactory.kaufeMensch(330);
		assertEquals(kaempfer1.length, 2);
		assertEquals(true, kaempfer1[0] instanceof Erzmagier);

		Kaempfer[] kaempfer2 = WesenFactory.kaufeOrk(10);
		assertEquals(0, kaempfer2.length);

		Kaempfer[] kaempfer3 = WesenFactory.kaufeUntoter(70);
		assertEquals(0, kaempfer3.length);

		Kaempfer[] kaempfer4 = WesenFactory.kaufeOrk(600);
		assertEquals(3, kaempfer4.length);

		Kaempfer[] kaempfer5 = WesenFactory.kaufeUntoter(600);
		assertEquals(7, kaempfer5.length);

		Kaempfer[] kaempfer6 = WesenFactory.kaufeMensch(600);
		assertEquals(4, kaempfer6.length);

		Kaempfer[] kaempfer7 = WesenFactory.kaufeNachtelf(600);
		assertEquals(3, kaempfer7.length);
	}
}
