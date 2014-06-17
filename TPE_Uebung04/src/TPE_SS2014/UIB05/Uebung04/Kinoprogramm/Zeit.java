package TPE_SS2014.UIB05.Uebung04.Kinoprogramm;

import java.text.*;

/**
 * Die Klasse Zeit simuliert die Zeit mit dem Format HH:MM
 * 
 * @author Constantin Schneider, 1315272
 * @author Timo Neumann, 1312143
 * 
 */

public class Zeit {
	private int stunden;
	private int minuten;
	/**
	 * Format als Konstante definiert HH:MM
	 */
	public static final SimpleDateFormat zeitformat = new SimpleDateFormat(
			"HH:mm");

	public Zeit(String zeit) throws IllegalTimeException, NumberFormatException 
	{
		try {
			String[] zeitString = zeit.split("\\:");
			this.stunden = Integer.parseInt(zeitString[0]);
			this.minuten = Integer.parseInt(zeitString[1]);
		} catch (NumberFormatException e) {
			NumberFormatException nfe = e;
			throw nfe;
		}

		if (this.stunden > 24 || this.stunden < 0) {
			IllegalTimeException ite = new IllegalTimeException();
			throw ite;
		}
		if (minuten > 59 || minuten < 0) {
			IllegalTimeException ite = new IllegalTimeException();
			throw ite;
		}
	}

	/**
	 * get-Methode fuer den String der Zeit
	 * 
	 * @param args
	 */
	public String getZeitAsString() {
		return this.toString();
	}

	@Override
	public String toString() {
		return Integer.toString(stunden) + ":" + Integer.toString(minuten);
	}

}
