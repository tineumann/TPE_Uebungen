public abstract class Held extends Wesen {
	Element element;
	double bonusfaktor;
	
	public Held(Rasse rasse, Element element, double bonusfaktor){
		super(rasse);
		this.element = element;
		this.bonusfaktor = bonusfaktor;
	}
}
