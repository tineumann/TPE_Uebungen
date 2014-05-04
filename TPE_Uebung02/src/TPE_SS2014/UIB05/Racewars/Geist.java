package TPE_SS2014.UIB05.Racewars;

import TPE_SS2014.UIB05.Racewars.WesenAPI.*;
/**
 * Geist ist ein ätherisches Wesen, welches ausschließlich attackieren kann.
 * 
 * @author Timo Neumann, 1312143
 * @author Constantin Schneider, 1315272
 */
public class Geist implements Kaempfer {
	
	/**
	 * Attackiert den im Parameter mitgegebenen Kaempfer.
	 * @param Kaempfer
	 */
	@Override
	public void attack(Kaempfer r) {
		if(r instanceof Wesen){
			((Wesen) r).setLebenspunkte(((Wesen) r).getLebenspunkte() - 1);
		}
	}
}
