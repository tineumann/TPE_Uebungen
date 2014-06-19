package TPE_SS2014.UIB05.Uebung04.Kinoprogramm;

import java.util.Collections;
import java.util.LinkedList;

import TPE_SS2014.UIB05.Uebung04.Kinoprogramm.Comparator.ZeitComparator;

/**
 * Testklasse zur Simulation eines Kinos
 * 
 * @author Constantin Schneider, 1315272
 * @author Timo Neumann, 1312143
 */
public class KinoSimulation {

	public static void main(String[] args) {

		try {
			System.out.println(getKino().toString());
		} catch (NumberFormatException | IllegalTimeException e) {
			e.printStackTrace();
		}
	}

	/**
	 * Gibt ein Testkino aus.
	 * @return Kino
	 * @throws IllegalTimeException
	 * @throws NumberFormatException
	 */
	public static Kino getKino() throws IllegalTimeException,
			NumberFormatException {
		Film batman = new Film("Batman begins", 134,
				Altersfreigabe.ABZWOELFJAHRE);
		Film barbie = new Film("Barbie", 81,
				Altersfreigabe.OHNEALTERSBESCHRAENKUNG);
		Film iceAge = new Film("Ice Age 3", 90,
				Altersfreigabe.OHNEALTERSBESCHRAENKUNG);
		Film machete = new Film("Machete", 100,
				Altersfreigabe.OHNEJUGENDFREIGABE);
		Film trainspotting = new Film("Trainspotting", 89,
				Altersfreigabe.OHNEJUGENDFREIGABE);
		Film pfiction = new Film("Pulp Fiction", 148,
				Altersfreigabe.ABSECHSZEHNJAHRE);
		Film fdtd = new Film("From Dusk Till Dawn", 87,
				Altersfreigabe.ABSECHSZEHNJAHRE);
		Film choco = new Film("Chocolat", 121, Altersfreigabe.ABSECHSJAHRE);

		LinkedList<Vorstellung> pBlauerSaal = new LinkedList<>();
		LinkedList<Vorstellung> pGruenerSaal = new LinkedList<Vorstellung>();
		LinkedList<Vorstellung> pStudio = new LinkedList<Vorstellung>();
		LinkedList<Vorstellung> pKellerloch = new LinkedList<Vorstellung>();
		try {
			pBlauerSaal.add(new Vorstellung(new Zeit("23:00"), batman));
			pBlauerSaal.add(new Vorstellung(new Zeit("20:00"), batman));
			pBlauerSaal.add(new Vorstellung(new Zeit("17:00"), batman));
			pBlauerSaal.add(new Vorstellung(new Zeit("14:00"), batman));
			Collections.sort(pBlauerSaal, new ZeitComparator());

			pGruenerSaal.add(new Vorstellung(new Zeit("21:00"), machete));
			pGruenerSaal.add(new Vorstellung(new Zeit("19:00"), iceAge));
			pGruenerSaal.add(new Vorstellung(new Zeit("17:00"), iceAge));
			pGruenerSaal.add(new Vorstellung(new Zeit("15:00"), barbie));
			Collections.sort(pGruenerSaal, new ZeitComparator());

			pStudio.add(new Vorstellung(new Zeit("23:00"), fdtd));
			pStudio.add(new Vorstellung(new Zeit("20:00"), pfiction));
			pStudio.add(new Vorstellung(new Zeit("17:00"), trainspotting));
			pStudio.add(new Vorstellung(new Zeit("15:00"), iceAge));
			Collections.sort(pStudio, new ZeitComparator());

			pKellerloch.add(new Vorstellung(new Zeit("23:00"), trainspotting));
			pKellerloch.add(new Vorstellung(new Zeit("20:00"), choco));
			Collections.sort(pKellerloch, new ZeitComparator());

		} catch (NumberFormatException e) {

		} catch (IllegalTimeException e) {

		}

		Saal blau = new Saal("Blauer Saal", 250, pBlauerSaal);
		Saal gruen = new Saal("Grüner Saal", 200, pGruenerSaal);
		Saal studio = new Saal("Studio", 150, pStudio);
		Saal keller = new Saal("Kellerloch", 30, pKellerloch);

		LinkedList<Saal> saele = new LinkedList<>();
		saele.add(blau);
		saele.add(gruen);
		saele.add(studio);
		saele.add(keller);

		Kino kino = new Kino("Cinemaxx in Mannheim", "Mannheim", saele);

		return kino;
	}
}
