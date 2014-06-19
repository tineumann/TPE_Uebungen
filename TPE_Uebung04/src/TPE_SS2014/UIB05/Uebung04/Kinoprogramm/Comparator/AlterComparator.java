package TPE_SS2014.UIB05.Uebung04.Kinoprogramm.Comparator;

import java.util.Comparator;

import TPE_SS2014.UIB05.Uebung04.Kinoprogramm.Film;



public class AlterComparator implements Comparator<Film> {

	@Override
	public int compare(Film v1, Film v2) {
		return Integer.compare(v1.getAltersfreigabe().getWert(), v2
				.getAltersfreigabe().getWert());
	}

}
