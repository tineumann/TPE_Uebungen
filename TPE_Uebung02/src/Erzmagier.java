/**
 * Die Klasse Erzmagier ist Subklasse von Mensch. Es gibt nur ein einziges
 *  Objekt (Singleton), dem das Element FEUER zugeorndet ist.
 * 
 * @author Constantin Schneider
 * @author Timo Neumann
 *
 */

public class Erzmagier extends Held {
	
	// Erzmagier bekommt das Element FEUER zugewiesen
	private Element element = Element.FEUER;
	private double bonusfaktor = 5.0d;
	private static Erzmagier erzmagier;
	
	static{
		erzmagier = new Erzmagier();
	}
	
	/* Default-Konstruktor, der nicht außerhalb der Klasse aufgerufen werden
	 * kann
	*/
	private Erzmagier(){
		super(Rasse.MENSCH);
	}
	
	/*
	 * Statische Methode, die den einzigen Erzmagier zurückgibt
	 */
	public static Erzmagier getErzmagier(){
		return erzmagier;
	}
}


