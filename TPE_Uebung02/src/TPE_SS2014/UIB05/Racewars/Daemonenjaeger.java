package TPE_SS2014.UIB05.Racewars;
/**
 * Die Klasse Daemonenjaeger ist Subklasse von Nachtelf. Es gibt nur ein
 * einziges Objekt (Singleton), dem das Element LUFT zugeorndet ist.
 * 
 * @author Constantin Schneider
 * @author Timo Neumann
 * 
 */

public class Daemonenjaeger extends Held {

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

	public static void goldschuss(Squad s) {
		for (Kaempfer k : s) {
			if (k instanceof Wesen) {
				Wesen wesen = ((Wesen) k);
				wesen.setLebenspunkte(wesen.getLebenspunkte() - 25);
			}
		}
	}
}
