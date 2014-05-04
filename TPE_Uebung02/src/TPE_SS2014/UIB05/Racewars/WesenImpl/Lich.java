package TPE_SS2014.UIB05.Racewars.WesenImpl;

import TPE_SS2014.UIB05.Racewars.Squad;
import TPE_SS2014.UIB05.Racewars.WesenAPI.Kaempfer;
import TPE_SS2014.UIB05.Racewars.WesenAPI.Rasse;

/**
 * Die Klasse Lich ist Subklasse von Untoter. Es gibt nur ein einziges Objekt
 * (Singleton), dem das Element Wasser zugeorndet ist.
 * 
 * @author Constantin Schneider
 * @author Timo Neumann
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

	public static void verwesung(Squad s) {
		int anzahlGegner = 0;
		for (Kaempfer gegner : s) {
			if (gegner instanceof WesenImpl) {
				WesenImpl wesen = ((WesenImpl) gegner);
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
