package TPE_SS2014.UIB05.Racewars.WesenImpl;
public enum Element {
	ERDE, WASSER, FEUER, LUFT;

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
