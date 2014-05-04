package TPE_SS2014.UIB05.Racewars;
/**
 * Die Klasse WesenImpl stellt lediglich Attribute und Methoden ihrer Subklassen
 * dar. Es sollen keine Objekte vom Typ Wesen erzeugt werden, da es nur Objekte
 * ihrer Subklassen gibt.
 * 
 * @author Constantin Schneider
 * @author Timo Neumann
 * 
 */
public abstract class Wesen implements Kaempfer {

	private double lebenspunkte;
	private final Rasse rasse;

	public Wesen(Rasse rasse) {
		this.rasse = rasse;

		this.lebenspunkte = this.rasse.getLebenspunkte();
	}

	public boolean isLebendig() {
		if (this.lebenspunkte > 0)
			return true;
		else
			return false;
	}

	@Override
	public void attack(Kaempfer r) {
		double damage = 0;
		if (r instanceof Wesen) {
			Wesen gegner = ((Wesen) r);

			if (r instanceof Erzmagier && Erzmagier.isAbsorption()) {
				damage = 0;
			}

			else {
				damage = getDamage(gegner) / (gegner.rasse.getRuestung() / 100);
			}

			gegner.setLebenspunkte(gegner.lebenspunkte - damage);
		}
	}

	/**
	 * Errechnet den Schaden, den ein Wesen bei einem Angriff erzeugt.
	 */
	public double getDamage(Wesen r) {
		double damage = this.getRasse().getGeschwindigkeit()
				* this.getRasse().getSchaden()
				* this.getRasse().getSpezialattribut();

		if (r instanceof Mensch) {
			damage = ((Mensch)r).beschraenkeSchaden(damage);
		}

		return damage;
	}



	public Rasse getRasse() {
		return this.rasse;
	}

	public double getLebenspunkte() {
		return this.lebenspunkte;
	}

	public void setLebenspunkte(double lebenspunkte) {
		this.lebenspunkte = lebenspunkte;
	}

	@Override
	public String toString() {
		return new String(this.rasse.toString() + ", LP: "
				+ Double.toString(this.getLebenspunkte()));
	}

}
