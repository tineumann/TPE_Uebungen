package TPE_SS2014.UIB05.Racewars.WesenImpl;

import TPE_SS2014.UIB05.Racewars.Squad;
import TPE_SS2014.UIB05.Racewars.WesenAPI.Kaempfer;
import TPE_SS2014.UIB05.Racewars.WesenAPI.Rasse;
import TPE_SS2014.UIB05.Racewars.WesenAPI.Wesen;

/**
 * Lich ist der Held der Untoten. Es gibt nur ein einziges Objekt (Singleton).
 * 
 * @author Timo Neumann, 1312143
 * @author Constantin Schneider, 1315272
 * 
 */
public class Lich extends HeldImpl {

	// Lich bekommt das Element WASSER zugewiesen
	private static Lich lich;

	static {
		lich = new Lich();
	}

	/*
	 * Default-Konstruktor, der nicht außerhalb der Klasse aufgerufen werden
	 * kann
	 */
	private Lich() {
		super(Rasse.UNTOTER, Element.WASSER, 2.3d);
	}

	/*
	 * Statische Methode, die den einzigen Lich zurückgibt
	 */
	public static Lich getLich() {
		if (lich == null)
			lich = new Lich();
		return lich;
	}

	/**
	 * Spezialattacke von Lich. Zieht allen Wesen im gegnerischen Squad 7
	 * Lebenspunkte ab und absorbiert diese.
	 * 
	 * @param s
	 */
	public static void verwesung(Squad s) {
		int anzahlGegner = 0;
		for (Kaempfer gegner : s) {
			if (gegner instanceof Wesen) {
				Wesen wesen = ((Wesen) gegner);
				wesen.setLebenspunkte(wesen.getLebenspunkte() - 7);
				anzahlGegner++;
			}
		}
		lich.setLebenspunkte(lich.getLebenspunkte() + (anzahlGegner * 7));
	}

	@Override
	public String toString() {
		return new String("Lich, LP: "
				+ Double.toString(this.getLebenspunkte()));
	}
}
