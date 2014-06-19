package TPE_SS2014.UIB05.Uebung04.Kinoprogramm;

import java.util.*;

/**
 * Simuliert ein Kino. Jedes Kino hat einen Namen, liegt in einer Stadt und
 * besitzt einen oder mehrere Säle.
 * 
 * @author Constantin Schneider, 1315272
 * @author Timo Neumann, 1312143
 * 
 */

public class Kino {

	private String name;
	private String stadt;
	private LinkedList<Saal> saele;

	/**
	 * Konstruktor
	 * 
	 * @param name
	 *            - Kinoname
	 * @param stadt
	 *            - Ort des Kinos
	 * @param saele
	 *            - Liste aller Saele
	 */
	public Kino(String name, String stadt, LinkedList<Saal> saele) {
		this.name = name;
		this.stadt = stadt;
		this.saele = saele;
	}

	/**
	 * Methoden um die Saele zu befüllen
	 * 
	 * @param name
	 *            - Name des Saals
	 * @param anzahlSitze
	 *            - Anzahl der Sitze im Saal
	 * @param programm
	 *            - Liste aller Filme
	 */
	public void saeleHinzufuegen(String name, int anzahlSitze,
			HashMap<Zeit, Film> programm) {
		this.saele.add(new Saal(name, anzahlSitze, programm));
	}

	public void saeleHinzufuegen(Saal saal) {
		this.saele.add(saal);
	}

	/**
	 * Methode um alle Filme eines Saals geordnet nach den Anfagnszeiten
	 * auszugeben
	 * 
	 * @param s
	 *            - bestimmter Saal aus dem Kino
	 * @return filmliste - Liste aller Filmtitel
	 */

	public String[] getFilmeFuerSaalMitZeiten(Saal s) {
		ArrayList<String> filme = new ArrayList<>();

		for (Film f : s.getProgramm()) {
			if (!filme.contains(f.getTitel())) {
				filme.add(f.getTitel());
			}
		}

		String[] filmliste = new String[filme.size()];
		filme.toArray(filmliste);
		return filmliste;
	}

	/**
	 * Methode um alle Filmtitel, die im Kino laufen zu bekommen. Doppelte
	 * Filmtitel werden ignoriert.
	 * 
	 * @return filme - alle Filme im Kino
	 */
	public String[] getAlleFilme() {

		ArrayList<String> filmliste = new ArrayList<>();

		for (Saal s : this.saele) {
			for (Film f : s.getProgramm()) {
				if (!filmliste.contains(f.getTitel())) {
					filmliste.add(f.getTitel());
				}
			}
		}

		String[] filme = new String[filmliste.size()];
		filmliste.toArray(filme);
		java.util.Arrays.sort(filme);
		return filme;
	}

	/**
	 * Auslesen aller Filme im gesamten Kini mit ihren Anfangszeiten als Array
	 * sortiert nach der Anfangszeit.
	 * 
	 * @return
	 */
	public String[] getAlleFilmeMitZeiten() {
		ArrayList<Film> filmliste = new ArrayList<>();
		for (Saal s : this.saele) {
			for (Film f : s.getProgramm().values()) {
				if (!filmliste.contains(f))
					filmliste.add(f);
						
			}
		}
		Film[] filme = new Film[filmliste.size()];
		filmliste.toArray(filme);
		return filme;
	}

	/**
	 * get-Methode für den Kinonamen
	 * 
	 * @return name - Name des Kinos
	 */
	public String getName() {
		return this.name;
	}

	/**
	 * get-Methode für die Stadt
	 * 
	 * @return stadt - Name der Stadt
	 */
	public String getStadt() {
		return this.stadt;
	}

	/**
	 * get-Methode für die Saele
	 * 
	 * @return saele - Liste aller Saele
	 */
	public LinkedList<Saal> getSaele() {
		return this.saele;
	}

	/**
	 * gesamten Spielplan ausgeben
	 */
	public String toString() {
		String s = this.name + " in " + this.stadt + "\n";
		
		for(Saal saal : this.saele){
			s += saal.toString();
		}
		
		return s;
	}

}
