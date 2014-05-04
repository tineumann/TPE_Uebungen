/**
 * Die Klasse Lich ist Subklasse von Untoter. Es gibt nur ein einziges Objekt
 * (Singleton), dem das Element Wasser zugeorndet ist.
 * 
 * @author Constantin Schneider
 * @author Timo Neumann
 *
 */

public class Lich extends Held {
	
	// Lich bekommt das Element WASSER zugewiesen
	private static Lich lich;
	
	static{
		lich = new Lich();
	}
	
	/* Default-Konstruktor, der nicht außerhalb der Klasse aufgerufen werden
	 * kann
	*/
	private Lich(){
		super(Rasse.UNTOTER, Element.WASSER, 2.3d);
	}
	
	/*
	 * Statische Methode, die den einzigen Lich zurückgibt
	 */
	public static Lich getLich(){
		if(lich == null)
			lich = new Lich();
		return lich;
	}
	
	public void verwesung(Squad s){
		int anzahlGegner = 0;
		for(Kaempfer gegner : s){
			if(gegner instanceof Wesen){
				Wesen wesen = ((Wesen)gegner);
				wesen.setLebenspunkte(wesen.getLebenspunkte() - 7);
				anzahlGegner++;
			}
		}
		lich.setLebenspunkte(lich.getLebenspunkte() + (anzahlGegner * 7));		
	}
}

