/**
 * Die Klasse Lich ist Subklasse von Untoter. Es gibt nur ein einziges Objekt
 * (Singleton), dem das Element Wasser zugeorndet ist.
 * 
 * @author Constantin Schneider
 * @author Timo Neumann
 *
 */

public class Lich extends Wesen {
	
	// Lich bekommt das Element WASSER zugewiesen
	Element element = Element.WASSER;
	
	private static Lich lich = null;
	
	/* Default-Konstruktor, der nicht außerhalb der Klasse aufgerufen werden
	 * kann
	*/
	private Lich(){
	}
	
	/*
	 * Statische Methode, die den einzigen Lich zurückgibt
	 */
	public static Lich getLich(){
		if(lich == null)
			lich = new Lich();
		return lich;
	}
}

