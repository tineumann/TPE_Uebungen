package TPE_SS2014.UIB05.Racewars.WesenAPI;

import java.util.ArrayList;

import TPE_SS2014.UIB05.Racewars.WesenImpl.*;

public class WesenFactory {

	private static Kaempfer[] kaufeWesen(Rasse rasse, int geld) {

		if (rasse == null)
			return null;

		ArrayList<Kaempfer> produzierteWesen = new ArrayList<Kaempfer>();

		int anzahlWesen = 0;

		switch (rasse) {
		case MENSCH:
			geld -= rasse.getKosten() * 2;
			if(geld >= 0)
			produzierteWesen.add(((Kaempfer) Erzmagier.getErzmagier()));
			break;
		case ORK:
			geld -= rasse.getKosten() * 2;
			if(geld >= 0)
			produzierteWesen.add(((Kaempfer) Farseer.getFarseer()));
			break;
		case UNTOTER:
			geld -= rasse.getKosten() * 2;
			if(geld >= 0)
			produzierteWesen.add(((Kaempfer) Lich.getLich()));
			break;
		case NACHTELF:
			geld -= rasse.getKosten() * 2;
			if(geld >= 0)
			produzierteWesen
					.add(((Kaempfer) Daemonenjaeger.getDaemonenjaeger()));
			break;
		default:
			return null;
		}

		while (geld >= rasse.getKosten()) {
			WesenImpl wesen;
			switch (rasse) {
			case MENSCH:
				wesen = new Mensch();
				break;
			case ORK:
				wesen = new Ork();
				break;
			case UNTOTER:
				wesen = new Untoter();
				break;
			case NACHTELF:
				wesen = new Nachtelf();
				break;
			default:
				return null;
			}
			produzierteWesen.add(((Kaempfer) wesen));
			geld -= rasse.getKosten();

			anzahlWesen++;
		}

		Kaempfer[] k = new Kaempfer[anzahlWesen];
		return produzierteWesen.toArray(k);
	}

	public static Kaempfer[] kaufeMensch(int geld) {
		return kaufeWesen(Rasse.MENSCH, geld);
	}

	public static Kaempfer[] kaufeOrk(int geld) {
		return kaufeWesen(Rasse.ORK, geld);
	}

	public static Kaempfer[] kaufeUntoter(int geld) {
		return kaufeWesen(Rasse.UNTOTER, geld);
	}

	public static Kaempfer[] kaufeNachtelf(int geld) {
		return kaufeWesen(Rasse.NACHTELF, geld);
	}
}