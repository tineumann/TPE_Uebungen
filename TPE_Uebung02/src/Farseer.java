/**
 * Farseer. Eine Subklasse von Ork. Es wird nur ein Objekt der Klasse Farseer
 * geben, realisiert durch ein Singleton.
 * 
 * @author Constantin Schneider
 * @author Timo Neumann
 *
 */
public class Farseer extends Wesen {
	
	// Farseer bekommt das Element ERDE zugewiesen
	private Element element = Element.ERDE;
	private double bonusfaktor = 1.2d;
	private static Farseer farseer;
	
	static{
		farseer = new Farseer();
	}
	
	/* Default-Konstruktor, der nicht außerhalb der Klasse aufgerufen werden
	 * kann
	*/
	private Farseer(){
		super(Rasse.ORK);
	}
	
	@Override
	public void attack(Kaempfer r){
		
	}
	
	/*
	 * Statische Methode, die den einzigen Farseer zurückgibt
	 */
	public static Farseer getFarseer(){
		return farseer;
	}
}

