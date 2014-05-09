package TPE_SS2014.UIB05.Racewars.WesenImpl;

import TPE_SS2014.UIB05.Racewars.WesenAPI.Rasse;

/**
 * Klasse Mensch stellt die Methode zur Schadensbeschränkung bereit.
 * 
 * @author Timo Neumann, 1312143
 * @author Constantin Schneider, 1315272
 * 
 */
public class Mensch extends WesenImpl {

	public Mensch() {
		super(Rasse.MENSCH);
	}

	/**
	 * Nur beim Menschen wird der erzeugte Schaden beschränkt.
	 * 
	 * @param damage - Schaden, der erzeugt wird.
	 * @return damage - Schaden, der beim Menschen erzeugt wird.
	 */
	public double beschraenkeSchaden(double damage) {
		return damage * 0.9d;
	}
}
