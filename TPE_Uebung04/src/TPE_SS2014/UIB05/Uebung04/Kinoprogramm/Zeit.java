package TPE_SS2014.UIB05.Uebung04.Kinoprogramm;

import java.text.*;
import java.util.*;

/**
 * Die Klasse Zeit simuliert die Zeit mit dem Format HH:MM
 * 
 * @author Constantin Schneider, 1315272
 * @author Timo Neumann
 *
 */

public class Zeit {
	
	private String zeit;
	
	public Zeit(String zeit){
		this.zeit = zeit;
	}
	
	/**
	 * Format als Konstante definiert HH:MM
	 */
	public static final SimpleDateFormat
		zeitformat = new SimpleDateFormat("HH:mm");
	
	/**
	 * Methode zum überprüfen der Startzeit
	 * 00:00 bis 23:59
	 */
	private static void validate(Date d){
		
	}
	
	/**
	 * Methode um aus dem String eine Zeit zu machen
	 * @throws ParseException 
	 */
	public Date toDate(String zeit) throws ParseException{
		Date date = zeitformat.parse(zeit);
		return date;
	}
	
	/**
	 * Methode zur formatierten Ausgabe
	 */
	public static void println (Date d){
		System.out.println(zeitformat.format(d));
	}
	
	/**
	 * get-Methode fuer den String der Zeit
	 * @param args
	 */
	public String getZeit(){
		return this.zeit;
	}
	
	/**
	 * to-String Methode
	 */
	public static String toString (Date d){
		String dateString = zeitformat.format(d);
		return dateString;
	}
	
	/**
	 * Test-Methode
	 * @param args
	 * @throws ParseException
	 */
	public static void main(String[] args) throws ParseException {
		Zeit zeit1 = new Zeit("33:30");
		Date date = zeit1.toDate(zeit1.getZeit());
		println(date);
		System.out.println(Zeit.toString(date));
	}
}
