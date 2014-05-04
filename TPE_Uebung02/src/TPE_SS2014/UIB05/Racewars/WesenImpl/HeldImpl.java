package TPE_SS2014.UIB05.Racewars.WesenImpl;

import TPE_SS2014.UIB05.Racewars.Squad;
import TPE_SS2014.UIB05.Racewars.WesenAPI.Kaempfer;
import TPE_SS2014.UIB05.Racewars.WesenAPI.Rasse;
import TPE_SS2014.UIB05.Racewars.WesenAPI.Held;

/**
 * Implementierung des Interfaces Held und Subklasse von Wesenimpl.
 * Stellt alle den Helden gemeinsamen Methoden zur Verfügung.
 * 
 * @author Timo Neumann, 1312143
 * @author Constantin Schneider, 1315272
 * 
 */
public abstract class HeldImpl extends WesenImpl implements Held {
	Element element;
	double bonusfaktor;

	public HeldImpl(Rasse rasse, Element element, double bonusfaktor) {
		super(rasse);
		this.element = element;
		this.bonusfaktor = bonusfaktor;
		super.setLebenspunkte(super.getLebenspunkte() * this.bonusfaktor);
	}

	@Override
	public void attack(Kaempfer r) {
		double damage;
		WesenImpl gegner;

		if (r instanceof WesenImpl) {
			gegner = ((WesenImpl) r);
			damage = getDamage(gegner) * this.bonusfaktor;

			if (r instanceof HeldImpl) {
				if (this.element.isUeberlegen(((HeldImpl) gegner).element)) {
					damage *= 2;
				}
			}

			damage = damage / (gegner.getRasse().getRuestung() / 100);
			gegner.setLebenspunkte(gegner.getLebenspunkte() - damage);
		}
	}

	@Override
	public void superattacke(Squad s) {
		if (this instanceof Farseer) {
			Farseer.doppelschlag(s);
		} else if (this instanceof Lich) {
			Lich.verwesung(s);
		} else if (this instanceof Erzmagier) {
			Erzmagier.absorption();
		} else if (this instanceof Daemonenjaeger) {
			Daemonenjaeger.goldschuss(s);
		}
	}
}
