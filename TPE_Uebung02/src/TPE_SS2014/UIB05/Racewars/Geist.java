package TPE_SS2014.UIB05.Racewars;

import TPE_SS2014.UIB05.Racewars.WesenAPI.*;

public class Geist implements Kaempfer {

	@Override
	public void attack(Kaempfer r) {
		if(r instanceof Wesen){
			((Wesen) r).setLebenspunkte(((Wesen) r).getLebenspunkte() - 1);
		}
	}
}
