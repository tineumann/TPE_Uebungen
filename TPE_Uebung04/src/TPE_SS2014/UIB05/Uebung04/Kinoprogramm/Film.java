package TPE_SS2014.UIB05.Uebung04.Kinoprogramm;

/**
 * Simuliert einen Film. Ein Film hat einen Titel und besitzt eine entsprechende
 * Laufzeit in Minuten. Desweiteren wird eine Altersfreigabe aus der Enum
 * Altersfreigabe dem Film zugeordnet, sowie eine Startzeit aus der Klasse Zeit
 * 
 * @author Constantin Schneider, 1315272
 * @author Timo Neumann, 1312143
 * 
 */

public class Film {

	private String titel;
	private int laufzeit;
	private Altersfreigabe altersfreigabe;

	/**
	 * Konstruktor
	 * 
	 * @param titel
	 *            - Titel des Films
	 * @param laufzeit
	 *            - Laufzeit des Films in Minuten
	 * @param altersfreigabe
	 *            - Altersfreigabe aus Enum Altersfreigabe
	 * @param startzeit
	 *            - Startzeit des Films aus der Klasse Zeit
	 */
	public Film(String titel, int laufzeit, Altersfreigabe altersfreigabe) {
		this.titel = titel;
		this.laufzeit = laufzeit;
		this.altersfreigabe = altersfreigabe;
	}

	/**
	 * get-Methode für den Titel des Films
	 * 
	 * @return titel - Titel des Films
	 */
	public String getTitel() {
		return this.titel;
	}

	/**
	 * get-Methode für die Laufzeit des Films
	 * 
	 * @return laufzeit - Laufzeit des Films
	 */
	public int getLaufzeit() {
		return this.laufzeit;
	}

	/**
	 * get-Methode für die Altersfreigabe des Films
	 * 
	 * @return altersfreigabe - Altersfreigabe für den Film
	 */
	public Altersfreigabe getAltersfreigabe() {
		return this.altersfreigabe;
	}

	/**
	 * toString-Methode um das gesamte Programm eines Saals ordnungsgemaess
	 * ausgeben zu koennen
	 * 
	 * @param s
	 *            - der Saal mit dem entsprechendem Programm
	 * @return Filme als String mit der Startzeit, dem Titel, der
	 *         Altersfreigabe, sowie der Laufzeit
	 */
	public String toString() {
		return this.titel + "["
				+ this.altersfreigabe.toString(this.altersfreigabe) + "] "
				+ this.laufzeit + "min";
	}
}
