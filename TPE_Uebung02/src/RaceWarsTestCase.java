import static org.junit.Assert.*;
import org.junit.Test;


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
			Mensch m1 = new Mensch();
			Mensch m2 = new Mensch();
			m1.attack(m2);
			assertFalse(m2.isLebendig());
			
			Mensch m3 = new Mensch();
			Untoter u1 = new Untoter();
			m3.attack(u1);
			assertTrue(440 == u1.getLebenspunkte());
			
		}
	

}
