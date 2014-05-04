package TPE_SS2014.UIB05.Racewars.WesenImpl;

import TPE_SS2014.UIB05.Racewars.Squad;
import TPE_SS2014.UIB05.Racewars.WesenAPI.Kaempfer;
import TPE_SS2014.UIB05.Racewars.WesenAPI.Rasse;

/**
 * Die Klasse Daemonenjaeger ist Subklasse von Nachtelf. Es gibt nur ein
 * einziges Objekt (Singleton), dem das Element LUFT zugeorndet ist.
 * 
 * @author Constantin Schneider
 * @author Timo Neumann
 * 
 */

public class Daemonenjaeger extends HeldImpl {

	private static Daemonenjaeger daemonenjaeger;

	static {
		daemonenjaeger = new Daemonenjaeger();
	}

	/*
	 * Default-Konstruktor, der nicht außerhalb der Klasse aufgerufen werden
	 * kann
	 */
	private Daemonenjaeger() {
		super(Rasse.NACHTELF, Element.LUFT, 3d);
	}

	/*
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

	public static void goldschuss(Squad s) {
		for (Kaempfer k : s) {
			if (k instanceof WesenImpl) {
				WesenImpl wesen = ((WesenImpl) k);
				wesen.setLebenspunkte(wesen.getLebenspunkte() - 25);
			}
		}
	}
}
