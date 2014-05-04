package TPE_SS2014.UIB05.Racewars.WesenImpl;

import TPE_SS2014.UIB05.Racewars.Squad;
import TPE_SS2014.UIB05.Racewars.WesenAPI.Rasse;

/**
 * Farseer ist der Held der Orks. Es gibt nur ein einziges Objekt (Singleton).
 * 
 * @author Timo Neumann, 1312143
 * @author Constantin Schneider, 1315272
 * 
 */
public class Farseer extends HeldImpl {

	// Farseer bekommt das Element ERDE zugewiesen
	private static Farseer farseer;

	static {
		farseer = new Farseer();
	}

	/**
	 * Default-Konstruktor, der nicht außerhalb der Klasse aufgerufen werden
	 * kann
	 */
	private Farseer() {
		super(Rasse.ORK, Element.ERDE, 1.2d);
	}

	/**
	 * Statische Methode, die den einzigen Farseer zurückgibt
	 */
	public static Farseer getFarseer() {
		return farseer;
	}

	/**
	 * Spezialattacke von Farseer. Tötet zwei zufällige Kaempfer des Gegners.
	 * 
	 * @param Squad s - Squad, die angegriffen wird.
	 */
	public static void doppelschlag(Squad s) {
		for (int i = 0; i < 2; i++) {
			s.remove((Math.random() * s.size()) - 1);
		}
	}

	@Override
	public String toString() {
		return new String("Farseer, LP: "
				+ Double.toString(this.getLebenspunkte()));
	}
}
