/**
 * Farseer. Eine Subklasse von Ork. Es wird nur ein Objekt der Klasse Farseer
 * geben, realisiert durch ein Singleton.
 * 
 * @author Constantin Schneider
 * @author Timo Neumann
 *
 */
public class Farseer implements Wesen {
	
	// Farseer bekommt das Element ERDE zugewiesen
	Element element = Element.ERDE;
	
	private static Farseer farseer = null;
	
	/* Default-Konstruktor, der nicht außerhalb der Klasse aufgerufen werden
	 * kann
	*/
	private Farseer(){
	}
	
	
	
	/*
	 * Statische Methode, die den einzigen Farseer zurückgibt
	 */
	public static Farseer getFarseer(){
		if(farseer == null)
			farseer = new Farseer();
		return farseer;
	}
}

