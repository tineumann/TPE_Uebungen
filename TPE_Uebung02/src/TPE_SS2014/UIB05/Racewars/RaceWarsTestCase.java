package TPE_SS2014.UIB05.Racewars;
import static org.junit.Assert.*;

import org.junit.Test;

import TPE_SS2014.UIB05.Racewars.WesenImpl.Mensch;
import TPE_SS2014.UIB05.Racewars.WesenImpl.Untoter;


	public class RaceWarsTestCase {

		@Test
		public void testIsLebendig(){
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
		public void testAttack(){
			
		}
	

}
