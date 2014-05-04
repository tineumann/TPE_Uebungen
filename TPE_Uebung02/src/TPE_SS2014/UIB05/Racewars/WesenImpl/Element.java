package TPE_SS2014.UIB05.Racewars.WesenImpl;

/**
 * Enum, welches alle Elemente bereitstellt.
 * 
 * @author Timo Neumann, 1312143
 * @author Constantin Schneider, 1315272
 * 
 */
public enum Element {
	ERDE, WASSER, FEUER, LUFT;

	/**
	 * Methode, welche zurückgibt, ob das jeweilige Element dem gegnerischen
	 * überlegen ist.
	 * 
	 * @param gegnerElement - Element des Gegners.
	 * @return boolscher Wert - true heißt überlegen.
	 */
	public boolean isUeberlegen(Element gegnerElement) {
		switch (this) {
		case FEUER:
			if (gegnerElement == Element.LUFT)
				return true;
			else
				return false;
		case ERDE:
			if (gegnerElement == Element.WASSER)
				return true;
			else
				return false;
		case WASSER:
			if (gegnerElement == Element.FEUER)
				return true;
			else
				return false;
		case LUFT:
			if (gegnerElement == Element.ERDE)
				return true;
			else
				return false;
		default:
			return false;
		}
	}
}
