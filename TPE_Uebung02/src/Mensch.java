
public class Mensch extends Wesen {
	
	
	public Mensch(){
		super(Rasse.MENSCH);
	}
	
	public double beschraenkeSchaden(double damage) {
		return damage * 0.9d;
	}
}
