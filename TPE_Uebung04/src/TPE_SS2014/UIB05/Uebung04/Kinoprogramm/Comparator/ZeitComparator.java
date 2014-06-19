package TPE_SS2014.UIB05.Uebung04.Kinoprogramm.Comparator;

import java.util.Comparator;

import TPE_SS2014.UIB05.Uebung04.Kinoprogramm.Vorstellung;

public class ZeitComparator implements Comparator<Vorstellung> {

	@Override
	public int compare(Vorstellung v1, Vorstellung v2) {
		if (Integer.compare(v1.getZeit().getStunden(), v1.getZeit()
				.getStunden()) == 0) {
			return Integer.compare(v1.getZeit().getMinuten(), v1.getZeit()
					.getMinuten());
		} else
			return v1.getZeit().getZeitAsString()
					.compareTo(v2.getZeit().getZeitAsString());
	}

}
