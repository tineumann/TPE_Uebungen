package TPE_SS2014.UIB05.Uebung04.Kinoprogramm;

import java.util.*;

/**
 * Simuliert ein Kino
 * Jedes Kino hat einen Namen, liegt in einer Stadt und besitzt einen oder
 * mehrere Säle.
 * 
 * @author Constantin Schneider, 1315272
 * @author Timo Neumann,
 *
 */

public class Kino {
	
	private String name;
	private String stadt;
	public static LinkedList<Saal> saele;
	
	/**
	 * Konstruktor
	 * @param name - Kinoname
	 * @param stadt - Ort des Kinos
	 */
	public Kino(String name, String stadt /*LinkedList saele*/){
		this.name = name;
		this.stadt = stadt;
		//this.saele = saele;
	}
	
	/**
	 * get-Methode für den Kinonamen
	 * @return name - Name des Kinos
	 */
	public String getName(){
		return name;
	}
	
	/**
	 * get-Methode für die Stadt
	 * @return stadt - Name der Stadt
	 */
	public String getStadt(){
		return stadt;
	}

	/**
	 * gesamten Spielplan ausgeben
	 */
	public String toString(){
		return null;
	}
	
}
