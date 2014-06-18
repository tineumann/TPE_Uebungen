package TPE_SS2014.UIB05.Uebung04.Kinoprogramm;

/**
 * Simuliert einen Film.
 * Ein Film hat einen Titel und besitzt eine entsprechende Laufzeit in
 * Minuten. Desweiteren wird eine Altersfreigabe aus der Enum Altersfreigabe
 * dem Film zugeordnet, sowie eine Startzeit aus der Klasse Zeit
 * 
 * @author Constantin Schneider, 1315272
 * @author Timo Neumann, 1312143
 *
 */

public class Film implements Comparable<Film> {
	
	private String titel;
	private int laufzeit;
	private Altersfreigabe altersfreigabe;
	private Zeit startzeit;
	
	/**
	 * Konstruktor 
	 * 
	 * @param titel - Titel des Films
	 * @param laufzeit - Laufzeit des Films in Minuten
	 * @param altersfreigabe - Altersfreigabe aus Enum Altersfreigabe
	 * @param startzeit - Startzeit des Films aus der Klasse Zeit
	 */
	public Film(String titel, int laufzeit,
			Altersfreigabe altersfreigabe, Zeit startzeit){
		this.titel = titel;
		this.laufzeit = laufzeit;
		this.altersfreigabe = altersfreigabe;
		this.startzeit = startzeit;
	}
	
	/**
	 * get-Methode für den Titel des Films
	 * 
	 * @return titel - Titel des Films
	 */
	public String getTitel(){
		return this.titel;
	}
	
	/**
	 * get-Methode für die Laufzeit des Films
	 * 
	 * @return laufzeit - Laufzeit des Films
	 */
	public int getLaufzeit(){
		return this.laufzeit;
	}
	
	/**
	 * get-Methode für die Altersfreigabe des Films
	 * 
	 * @return altersfreigabe - Altersfreigabe für den Film
	 */
	public Altersfreigabe getAltersfreigabe(){
		return this.altersfreigabe;
	}
	
	/**
	 * get-Methode für die Startzeit des Films
	 * 
	 * @return startzeit - Startzeit des Films als Zeit
	 */
	public Zeit getStartzeit(){
		return this.startzeit;
	}
	
	/**
	 * toString-Methode um das gesamte Programm eines Saals ordnungsgemaess
	 * ausgeben zu koennen
	 * 
	 * @param s - der Saal mit dem entsprechendem Programm
	 * @return Filme als String mit der Startzeit, dem Titel, der
	 *         Altersfreigabe, sowie der Laufzeit
	 */
	public String toString(Saal s){
		
		for(Film f : s.getProgramm()){
			return this.startzeit + " -- " + this.titel +
			"[" + this.altersfreigabe.toString(this.altersfreigabe) +
			"] " + this.laufzeit + "min";
	}
		return null;
	}

	@Override
	public int compareTo(Film f) {
		if(f.getStartzeit() == null && f.getStartzeit() == null){
			return 0;
		}
		if(f.getStartzeit() == null) {
			return 1;
		}
		if(f.getStartzeit() == null) {
			return -1;
		}
		return this.getStartzeit().compareTo(f.getStartzeit());
	}

}

