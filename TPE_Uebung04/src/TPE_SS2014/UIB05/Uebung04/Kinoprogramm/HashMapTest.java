package TPE_SS2014.UIB05.Uebung04.Kinoprogramm;

import java.util.*;

public class HashMapTest {

	public static void main(String[] args){
		HashMap map = new HashMap();
		
		Saal saal1 = new Saal("Blauer Saal", 2000, new LinkedList<Film>());
		Saal saal2 = new Saal("Weisser Saal", 222, new LinkedList<Film>());
		Saal saal3 = new Saal("Roter Saal", 6666, new LinkedList<Film>());
		
		map.put(new String(saal1.getName()), saal1);
		map.put(new String(saal2.getName()), saal2);
		map.put(new String(saal3.getName()), saal3);
		
		
	}
	
	/*
	 * // main-Methode
    public static void main(String[] args)
    {
        HashMap map = new HashMap();

        // Drei Objekte der Klasse Student werden erzeugt
        Student st1 = new Student("Topf", "Hans", 12345);
        Student st2 = new Student("Teller", "Hannes", 12323);
        Student st3 = new Student("Besteck", "Maxi", 12345);

        // Einfügen der Objekte in die HashMap
        // Matrikelnummer wird als Key eingetragen 
        map.put(new Integer(st1.getMatrikelnummer()), st1);
        map.put(new Integer(st2.getMatrikelnummer()), st2);

        // Student st1 wird durch st3 ersetzt, da die 
        // Matrikelnummer schon als Schlüssel vergeben ist
        map.put(new Integer(st3.getMatrikelnummer()), st3);
    }
	 */
}
