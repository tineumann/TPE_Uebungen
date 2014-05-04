public abstract class Held extends Wesen {
	Element element;
	double bonusfaktor;

	public Held(Rasse rasse, Element element, double bonusfaktor) {
		super(rasse);
		this.element = element;
		this.bonusfaktor = bonusfaktor;
		super.setLebenspunkte(super.getLebenspunkte() * this.bonusfaktor);
	}

	@Override
	public void attack(Kaempfer r) {
		double damage;
		Wesen gegner;

		if (r instanceof Wesen) {
			gegner = ((Wesen) r);
			damage = getDamage(gegner) * this.bonusfaktor;
			
			if (r instanceof Held) {
				if (this.element.isUeberlegen(((Held)gegner).element)) {
					damage *= 2;
				}
			}
			
			damage = damage / (gegner.getRasse().getRuestung() / 100);
			gegner.setLebenspunkte(gegner.getLebenspunkte() - damage);		
		}
	}
}
