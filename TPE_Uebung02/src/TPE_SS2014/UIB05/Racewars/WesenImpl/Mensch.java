package TPE_SS2014.UIB05.Racewars.WesenImpl;





public class Mensch extends Wesen {
	
	
	public Mensch(){
		super(Rasse.MENSCH);
	}
	
	public double beschraenkeSchaden(double damage) {
		return damage * 0.9d;
	}
}
