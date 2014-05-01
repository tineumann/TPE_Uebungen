/**
 * Die Klasse Erzmagier ist Subklasse von Mensch. Es gibt nur ein einziges
 *  Objekt (Singleton), dem das Element FEUER zugeorndet ist.
 * 
 * @author Constantin Schneider
 * @author Timo Neumann
 *
 */

public class Erzmagier extends Wesen {
	
	// Erzmagier bekommt das Element FEUER zugewiesen
	Element element = Element.FEUER;
	
	private static Erzmagier erzmagier = null;
	
	/* Default-Konstruktor, der nicht außerhalb der Klasse aufgerufen werden
	 * kann
	*/
	private Erzmagier(){
	}
	
	/*
	 * Statische Methode, die den einzigen Erzmagier zurückgibt
	 */
	public static Erzmagier getErzmagier(){
		if(erzmagier == null)
			erzmagier = new Erzmagier();
		return erzmagier;
	}
}


