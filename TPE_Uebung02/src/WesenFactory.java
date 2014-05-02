public class WesenFactory {

	public static Kaempfer[] getKaempfer(Rasse rasse, int geld) {
		int anzahlKaempfer = geld / rasse.getKosten();
		Kaempfer[] kaempfer = new Kaempfer[anzahlKaempfer];
		if (anzahlKaempfer > 0) {
			for (int i = 0; i < anzahlKaempfer; i++) {
				
				
				kaempfer[i] = new Wesen(rasse);
			}
		}
		return kaempfer;
	}
}