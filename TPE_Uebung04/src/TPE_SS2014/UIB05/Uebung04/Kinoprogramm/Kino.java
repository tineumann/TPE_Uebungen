package TPE_SS2014.UIB05.Uebung04.Kinoprogramm;

import java.util.*;

import TPE_SS2014.UIB05.Uebung04.Kinoprogramm.Comparator.*;

/**
 * Simuliert ein Kino. Jedes Kino hat einen Namen, liegt in einer Stadt und
 * besitzt einen oder mehrere Säle.
 * 
 * @author Constantin Schneider, 1315272
 * @author Timo Neumann, 1312143
 * 
 */

public class Kino extends LinkedList<Saal>{

	private static final long serialVersionUID = 1L;
	private String name;
	private String stadt;

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
		this.addAll(saele);
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
			LinkedList<Vorstellung> programm) {
		this.add(new Saal(name, anzahlSitze, programm));
	}

	public void saeleHinzufuegen(Saal saal) {
		this.add(saal);
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
		for(Vorstellung v : s){
			filme.add(v.toString());
		}
		
		Collections.sort(filme, new StringComparator());
		
		String[] filmeString = new String[filme.size()];
		filme.toArray(filmeString);
		return filmeString;
	}

	/**
	 * Methode um alle Filmtitel, die im Kino laufen zu bekommen. Doppelte
	 * Filmtitel werden ignoriert.
	 * 
	 * @return filme - alle Filme im Kino
	 */
	public Film[] getAlleFilme() {
		return getAlleFilme(Sortierkriterium.NAME);
	}

	public Film[] getAlleFilme(Sortierkriterium kriterium){
		ArrayList<Film> filmliste = new ArrayList<>();

		for (Saal s : this) {
			for (Vorstellung v : s) {
				if (!filmliste.contains(v.getFilm())) {
					filmliste.add(v.getFilm());
				}
			}
		}
		
		Collections.sort(filmliste, kriterium.getComparator());
		
		Film[] filme = new Film[filmliste.size()];
		filmliste.toArray(filme);
		java.util.Arrays.sort(filme);
		return filme;
	}
	
	/**
	 * Auslesen aller Filme im gesamten Kino mit ihren Anfangszeiten als Array
	 * sortiert nach der Anfangszeit.
	 * 
	 * @return
	 */
	public Vorstellung[] getAlleFilmeMitZeiten() {
		ArrayList<Vorstellung> filmliste = new ArrayList<>();
		for (Saal s : this) {
			for (Vorstellung v : s) {
					filmliste.add(v);
			}
		}
		
		Collections.sort(filmliste, new ZeitComparator());
		Vorstellung[] filme = new Vorstellung[filmliste.size()];
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
		return this;
	}

	/**
	 * gesamten Spielplan ausgeben
	 */
	public String toString() {
		String s = this.name + " in " + this.stadt + "\n";

		for (Saal saal : this) {
			s += saal.toString() + "\n";
			String[] filme = getFilmeFuerSaalMitZeiten(saal);
			for(String film : filme){
				s += film + "\n";
			}
			s+="\n";
		}

		return s;
	}

}
