package TPE_SS2014.UIB05.Uebung04.Kinoprogramm;

import static org.junit.Assert.*;

import org.junit.Test;

public class KinoTest {

	@Test
	public void zeitTest() {
		try {
			Zeit zeit = new Zeit("17:00");
			assertEquals(17, zeit.getStunden());
			assertEquals(0, zeit.getMinuten());
			
		} catch (NumberFormatException | IllegalTimeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
}
