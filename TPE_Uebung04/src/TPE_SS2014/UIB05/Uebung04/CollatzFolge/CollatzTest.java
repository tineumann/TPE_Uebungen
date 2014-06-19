package TPE_SS2014.UIB05.Uebung04.CollatzFolge;

import static org.junit.Assert.*;

import java.util.LinkedList;

import org.junit.Test;

public class CollatzTest {

	@Test
	public void test() {
		LinkedList<Integer> list = new LinkedList<>();
		//13 -> 40 -> 20 -> 10 -> 5 -> 16 -> 8 -> 4 -> 2 -> 1
		list.add(13);
		list.add(40);
		list.add(20);
		list.add(10);
		list.add(5);
		list.add(16);
		list.add(8);
		list.add(4);
		list.add(2);
		list.add(1);
		
		Collatz c = new Collatz(13);
		assertEquals(list, c);
	}
	
	

}
