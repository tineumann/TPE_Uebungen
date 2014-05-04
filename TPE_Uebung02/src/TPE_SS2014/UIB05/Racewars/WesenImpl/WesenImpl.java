package TPE_SS2014.UIB05.Racewars.WesenImpl;

import TPE_SS2014.UIB05.Racewars.WesenAPI.Rasse;
import TPE_SS2014.UIB05.Racewars.WesenAPI.Wesen;
import TPE_SS2014.UIB05.Racewars.WesenAPI.Kaempfer;

/**
 * Implementiert das Interface Wesen und Kaempfer.
 * 
 * @author Timo Neumann, 1312143
 * @author Constantin Schneider, 1315272
 * 
 */

public abstract class WesenImpl implements Wesen, Kaempfer {

	private double lebenspunkte;
	private final Rasse rasse;

	public WesenImpl(Rasse rasse) {
		this.rasse = rasse;

		this.lebenspunkte = this.rasse.getLebenspunkte();
	}
	
	@Override
	public boolean isLebendig() {
		if (this.lebenspunkte > 0)
			return true;
		else
			return false;
	}

	@Override
	public void attack(Kaempfer r) {
		double damage = 0;
		if (r instanceof WesenImpl) {
			WesenImpl gegner = ((WesenImpl) r);

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
	public double getDamage(WesenImpl r) {
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
	
	@Override
	public double getLebenspunkte() {
		return this.lebenspunkte;
	}
	
	@Override
	public void setLebenspunkte(double lebenspunkte) {
		this.lebenspunkte = lebenspunkte;
	}

	@Override
	public String toString() {
		return new String(this.rasse.toString() + ", LP: "
				+ Double.toString(this.getLebenspunkte()));
	}
}
