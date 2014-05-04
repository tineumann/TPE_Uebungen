package TPE_SS2014.UIB05.Racewars.WesenAPI;

import TPE_SS2014.UIB05.Racewars.*;

/**
 * Interface Held stellt die superattacke bereit, welche jeder Held ausführen
 * kann.
 * 
 * @author Timo Neumann, 1312143
 * @author Constantin Schneider, 1315272
 */
public interface Held {
	/**
	 * Stellt die Superattacke der Helden zur Verfügung.
	 * 
	 * @param Squad
	 *            s - Falls der Held eine Squad zum Angriff braucht, wird diese
	 *            benötigt.
	 */
	public void superattacke(Squad s);

}
