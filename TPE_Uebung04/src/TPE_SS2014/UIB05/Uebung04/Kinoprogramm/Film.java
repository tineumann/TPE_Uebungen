package TPE_SS2014.UIB05.Uebung04.Kinoprogramm;

import java.io.*;
import java.text.*;

/**
 * Simuliert einen Film.
 * Ein Film hat einen Titel, eine Laufzeit und eine Altersfreigabe.
 * 
 * @author Constantin Schneider, 1315272
 * @author Timo Neumann
 *
 */

public class Film {
	
	private String titel;
	private int laufzeit;
	private Altersfreigabe altersfreigabe;
	
	public Film(String titel, int laufzeit, Altersfreigabe altersfreigabe){
		this.titel = titel;
		this.laufzeit = laufzeit;
		this.altersfreigabe = altersfreigabe;
	}
	
}

