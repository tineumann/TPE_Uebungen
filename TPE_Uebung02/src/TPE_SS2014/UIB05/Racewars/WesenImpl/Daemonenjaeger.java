package TPE_SS2014.UIB05.Racewars.WesenImpl;

import TPE_SS2014.UIB05.Racewars.Squad;
import TPE_SS2014.UIB05.Racewars.WesenAPI.Kaempfer;
import TPE_SS2014.UIB05.Racewars.WesenAPI.Rasse;
import TPE_SS2014.UIB05.Racewars.WesenAPI.Wesen;

/**
 * Der Daemonenjaeger ist der Held der Nachtelfen. Es gibt nur ein einziges
 * Objekt (Singleton).
 * 
 * @author Timo Neumann, 1312143
 * @author Constantin Schneider, 1315272
 * 
 */

public class Daemonenjaeger extends HeldImpl {

	private static Daemonenjaeger daemonenjaeger;

	static {
		daemonenjaeger = new Daemonenjaeger();
	}

	/**
	 * Default-Konstruktor, der nicht außerhalb der Klasse aufgerufen werden
	 * kann
	 */
	private Daemonenjaeger() {
		super(Rasse.NACHTELF, Element.LUFT, 3d);
	}

	/**
	 * Statische Methode, die den einzigen Daemonenjaeger zurückgibt
	 */
	public static Daemonenjaeger getDaemonenjaeger() {
		return daemonenjaeger;
	}

	@Override
	public String toString() {
		return new String("Daemonenjaeger, LP: "
				+ Double.toString(this.getLebenspunkte()));
	}

	/**
	 * Spezialattacke des Daemonenjaeger. Zieht jedem Wesen des Squads
	 * 
	 * @param s
	 */
	public static void goldschuss(Squad s) {
		for (Kaempfer k : s) {
			if (k instanceof Wesen) {
				Wesen wesen = ((Wesen) k);
				wesen.setLebenspunkte(wesen.getLebenspunkte() - 25);
			}
		}
	}
}
