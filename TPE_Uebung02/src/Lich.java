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
	private static double bonusfaktor = 1.2d;
	private static Lich lich;
	
	static{
		lich = new Lich();
	}
	
	/* Default-Konstruktor, der nicht außerhalb der Klasse aufgerufen werden
	 * kann
	*/
	private Lich(){
		super(Rasse.UNTOTER);
	}
	
	/*
	 * Statische Methode, die den einzigen Lich zurückgibt
	 */
	public static Lich getLich(){
		if(lich == null)
			lich = new Lich();
		return lich;
	}
	
	@Override
	public void attack(Kaempfer r){
		if(r instanceof Farseer){
						
		}
	}
}

