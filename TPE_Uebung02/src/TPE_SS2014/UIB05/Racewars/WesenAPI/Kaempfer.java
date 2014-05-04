package TPE_SS2014.UIB05.Racewars.WesenAPI;

/**
 * Interface Kaempfer stellt die Attacke bereit.
 * 
 * @author Timo Neumann, 1312143
 * @author Constantin Schneider, 1315272
 */
public interface Kaempfer {
	
	/**
	 * Attackiert einen anderen Kaempfer und fügt diesem Schaden zu.
	 * @param r
	 */
	public void attack(Kaempfer r);
}
