package TPE_SS2014.UIB05.Racewars;

import java.util.*;

import TPE_SS2014.UIB05.Racewars.WesenAPI.Kaempfer;

/**
 * ArrayList von Kämpfern stellen ein Squad dar.
 * 
 * @author Timo Neumann, 1312143
 * @author Constantin Schneider, 1315272
 */
public class Squad extends ArrayList<Kaempfer> {

	private static final long serialVersionUID = 1L;

	private String name;

	/**
	 * Add-Methode, mit der das Hinzufügen von ganzen Arrays möglich ist.
	 * 
	 * @param kaempfer
	 *            - Array mit Kaempfern.
	 */
	public void add(Kaempfer[] kaempfer) {
		for (Kaempfer k : kaempfer) {
			this.add(k);
		}
	}

	public String getName() {
		return name;
	}

	public Squad(String name) {
		this.name = name;
	}
}
