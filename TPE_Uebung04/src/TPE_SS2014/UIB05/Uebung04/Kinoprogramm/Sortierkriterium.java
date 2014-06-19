package TPE_SS2014.UIB05.Uebung04.Kinoprogramm;

import java.util.Comparator;

import TPE_SS2014.UIB05.Uebung04.Kinoprogramm.Comparator.*;

/**
 * Aufzaehlung der Sortierkriterien nach dem ein Programm absteigend ausgegeben
 * werden soll
 * 
 * @author Constantin Schneider, 1315272
 * @author Timo Neumann, 1312143
 */
public enum Sortierkriterium {
	NAME, ALTERSFREIGABE, LAUFZEIT;

	/**
	 * @author Constantin Schneider, 1315272
	 * @author Timo Neumann, 1312143
	 * @return passende Comparatorklasse
	 */
	public Comparator<Film> getComparator() {
		if (this.equals(NAME))
			return new TitelComparator();
		if (this.equals(ALTERSFREIGABE))
			return new AlterComparator();
		if (this.equals(LAUFZEIT))
			return new LaufzeitComparator();

		else
			return new TitelComparator();
	}
}
