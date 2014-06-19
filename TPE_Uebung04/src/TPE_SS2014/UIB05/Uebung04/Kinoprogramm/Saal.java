package TPE_SS2014.UIB05.Uebung04.Kinoprogramm;

import java.util.*;

/**
 * Simuliert einen Saal. Jeder Saal hat einen Namen und eine feste Anzahl an
 * Sitzplätzen. Desweiteren besitz jeder Saal ein Filmprogramm.
 * 
 * @author Constantin Schneider, 1315272
 * @author Timo Neumann, 1312143
 * 
 */

public class Saal {

	private String name;
	private final int anzahlSitze;
	private HashMap<Zeit, Film> programm;

	/**
	 * Konstruktor
	 * 
	 * @param name
	 *            - Name des Saals
	 * @param anzahlSitze
	 *            - Anzahl der Sitzplaetze im Saal
	 * @param programm
	 *            - Liste des Filmprogramms
	 */
	public Saal(String name, int anzahlSitze, HashMap<Zeit, Film> programm) {
		this.name = name;
		this.anzahlSitze = anzahlSitze;
		this.programm = programm;
	}

	/**
	 * get-Methode für den Namen des Saals
	 * 
	 * @return name - Name des Saals
	 */
	public String getName() {
		return name;
	}

	/**
	 * get-Methode für die Anzahl der Sitzplaetze im Saal
	 * 
	 * @return anzahlSitze - Anzahl der Sitzplaetze im Saal
	 */
	public int getAnzahlSitze() {
		return anzahlSitze;
	}

	/**
	 * get-Methode für das gesamte Programm
	 * 
	 * @return programm - Filmprogramm des Saals
	 */
	public HashMap<Zeit, Film> getProgramm() {
		return this.programm;
	}

	/**
	 * Methode um dem Filmprogramm einen Film hinzuzufuegen
	 * 
	 * @param name
	 *            - Name des Films
	 * @param laufzeit
	 *            - Laufzeit des Films in Minuten
	 * @param altersfreigabe
	 *            - Altersfreigabe aus Enum Altersfreigabe
	 * @param zeit
	 *            - Startzeit des Films als Zeit
	 */
	public void filmHinzufuegen(Zeit zeit, Film film) {
		this.programm.put(zeit, film);
	}

	/**
	 * toString-Methode der Klasse Saal Ausgegeben wird der Saalname sowie die
	 * Anzahl der Sitzplaetze des Saals
	 */
	@Override
	public String toString() {
		String s = "Saal" + "'" + this.name + "'" + "(" + this.anzahlSitze
				+ "Plaetze" + ")\n";
		
		for (Film f : this.programm){
			s += f.toString() + "\n";
		}
		
		return s;
	}
}
