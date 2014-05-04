package TPE_SS2014.UIB05.Racewars.WesenImpl;

import TPE_SS2014.UIB05.Racewars.WesenAPI.Rasse;





public class Mensch extends WesenImpl {
	
	
	public Mensch(){
		super(Rasse.MENSCH);
	}
	
	public double beschraenkeSchaden(double damage) {
		return damage * 0.9d;
	}
}
