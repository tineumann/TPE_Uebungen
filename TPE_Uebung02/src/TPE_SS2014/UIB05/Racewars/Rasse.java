package TPE_SS2014.UIB05.Racewars;
public enum Rasse {

	ORK(100, 33, 1, 30.0, 4.0, 150), UNTOTER(120, 16, 2, 30.0, 1.6, 70), MENSCH(
			140, 40, 2, 40.0, 10.0, 110), NACHTELF(120, 15, 3, 20.0, 2.9, 145);

	private int lebenspunkte;
	private int schaden;
	private int geschwindigkeit;
	private int kosten;
	private double ruestung;
	private double spezialattribut;

	private Rasse(int lebenspunkte, int schaden, int geschwindigkeit,
			double ruestung, double spezialattribut, int kosten) {

		this.lebenspunkte = lebenspunkte;
		this.schaden = schaden;
		this.geschwindigkeit = geschwindigkeit;
		this.ruestung = ruestung;
		this.spezialattribut = spezialattribut;
		this.kosten = kosten;
	}

	public int getLebenspunkte() {
		return this.lebenspunkte;
	}

	public int getSchaden() {
		return this.schaden;
	}

	public int getGeschwindigkeit() {
		return this.geschwindigkeit;
	}

	public double getRuestung() {
		return this.ruestung;
	}

	public double getSpezialattribut() {
		return this.spezialattribut;
	}

	public int getKosten() {
		return this.kosten;
	}
}
