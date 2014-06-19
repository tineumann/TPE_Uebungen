package TPE_SS2014.UIB05.Uebung04.Kinoprogramm.Comparator;

import java.util.Comparator;

import TPE_SS2014.UIB05.Uebung04.Kinoprogramm.Film;


public class LaufzeitComparator implements Comparator<Film> {

	@Override
	public int compare(Film v1, Film v2) {
		return Integer.compare(v1.getLaufzeit(), v1.getLaufzeit());

	}
}
