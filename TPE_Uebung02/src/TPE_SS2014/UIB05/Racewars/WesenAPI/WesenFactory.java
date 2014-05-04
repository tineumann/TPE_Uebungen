package TPE_SS2014.UIB05.Racewars.WesenAPI;

import java.util.ArrayList;

import TPE_SS2014.UIB05.Racewars.WesenImpl.*;

public class WesenFactory {

	private Kaempfer[] kaufeWesen(Rasse rasse, int geld) {

		if (rasse == null)
			return null;

		ArrayList<Kaempfer> produzierteWesen = new ArrayList<Kaempfer>();

		int anzahlWesen = 0;

		switch (rasse) {
		case MENSCH:
			produzierteWesen.add(((Kaempfer) Erzmagier.getErzmagier()));
			break;
		case ORK:
			produzierteWesen.add(((Kaempfer) Farseer.getFarseer()));
			break;
		case UNTOTER:
			produzierteWesen.add(((Kaempfer) Lich.getLich()));
			break;
		case NACHTELF:
			produzierteWesen
					.add(((Kaempfer) Daemonenjaeger.getDaemonenjaeger()));
			break;
		default:
			return null;
		}

		while (geld > rasse.getKosten()) {
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

	public Kaempfer[] kaufeMensch(int geld) {
		return this.kaufeWesen(Rasse.MENSCH, geld);
	}

	public Kaempfer[] kaufeOrk(int geld) {
		return this.kaufeWesen(Rasse.ORK, geld);
	}

	public Kaempfer[] kaufeUntoter(int geld) {
		return this.kaufeWesen(Rasse.UNTOTER, geld);
	}

	public Kaempfer[] kaufeNachtelf(int geld) {
		return this.kaufeWesen(Rasse.NACHTELF, geld);
	}
}