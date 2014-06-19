package TPE_SS2014.UIB05.Uebung04.Kinoprogramm;
/**
 * Aufzählung der Altersfreigaben
 * Altersfreigaben werden den Filmen zugeordnet.
 * 
 * @author Constantin Schneider, 1315272
 * @author Timo Neumann, 1312143
 *
 */

public enum Altersfreigabe {
	OHNEALTERSBESCHRAENKUNG, ABSECHSJAHRE, ABZWOELFJAHRE, ABSECHSZEHNJAHRE,
	OHNEJUGENDFREIGABE;

	/**
	 * to-String Methode um die aufgezaehlten Altersfreigaben
	 * ordnungsgemaess Ausgeben zu koennen
	 * 
	 * @param altersfreigabe - die verschiedenen Altersfreigaben
	 * @return String: Bezeichner der Altersfreigaben mit Leerzeichen 
	 */
	public String toString(){
		if(this.equals(OHNEALTERSBESCHRAENKUNG))
			return "ohne Altersbeschränkung";
		else if(this.equals(ABSECHSJAHRE))
			return "ab 6 Jahre";
		else if(this.equals(ABZWOELFJAHRE))
			return "ab 12 Jahre";
		else if(this.equals(ABSECHSZEHNJAHRE))
			return "ab 16 Jahre";
		else if(this.equals(OHNEJUGENDFREIGABE))
			return "ohne Jugendfreigabe";
		else
			return null;
	}
	
	public int getWert(){
		if(this.equals(OHNEALTERSBESCHRAENKUNG))
			return 0;
		else if(this.equals(ABSECHSJAHRE))
			return 1;
		else if(this.equals(ABZWOELFJAHRE))
			return 2;
		else if(this.equals(ABSECHSZEHNJAHRE))
			return 3;
		else if(this.equals(OHNEJUGENDFREIGABE))
			return 4;
		else
			return 0;
	}
}
