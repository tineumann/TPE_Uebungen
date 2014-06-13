package TPE_SS2014.UIB05.Uebung04.Kinoprogramm;

import java.util.*;
/**
 * Simuliert einen Saal.
 * Jeder Saal hat einen Namen und eine feste Anzahl an Sitzplätzen.
 * 
 * @author Constantin Schneider, 1315272
 * @author Timo Neumann
 *
 */

public class Saal {
	
	private String name;
	private final int anzahlSitze;
	private LinkedList<Film> programm;
	
	public Saal(String name, int anzahlSitze /*LinkedList<Film> programm*/){
		this.name = name;
		this.anzahlSitze = anzahlSitze;
		/*this.programm = programm;*/
	}
	
	/**
	 * get-Methode für den Namen des Saals
	 * @return name - Name des Saals
	 */
	public String getName(){
		return name;
	}
	
	/**
	 * get-Methode für die Anzahl der Sitzplaetze im Saal
	 * @return anzahlSitze - Anzahl der Sitzplaetze im Saal
	 */
	public int getAnzahlSitze(){
		return anzahlSitze;
	}

}
