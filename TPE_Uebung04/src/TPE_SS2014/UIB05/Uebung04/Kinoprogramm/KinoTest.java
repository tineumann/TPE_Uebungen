package TPE_SS2014.UIB05.Uebung04.Kinoprogramm;

import static org.junit.Assert.*;

import java.util.Collections;
import java.util.LinkedList;

import org.junit.Test;

import TPE_SS2014.UIB05.Uebung04.Kinoprogramm.Comparator.TitelComparator;
import TPE_SS2014.UIB05.Uebung04.Kinoprogramm.Comparator.ZeitComparator;

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
