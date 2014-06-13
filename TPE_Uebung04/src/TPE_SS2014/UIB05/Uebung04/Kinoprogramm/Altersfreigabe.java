package TPE_SS2014.UIB05.Uebung04.Kinoprogramm;
/**
 * Aufzählung der Altersfreigaben
 * 
 * @author Constantin Schneider, 1315272
 * @author Timo Neumann
 *
 */

public enum Altersfreigabe {
	OHNEALTERSBESCHRAENKUNG, ABSECHSJAHRE, ABZWOELFJAHRE, ABSECHSZEHNJAHRE,
	OHNEJUGENDFREIGABE;

	public String toString(Object o){
		if(o.equals(OHNEALTERSBESCHRAENKUNG))
			return "ohne Altersbeschränkung";
		else if(o.equals(ABSECHSJAHRE))
			return "ab 6 Jahre";
		else if(o.equals(ABZWOELFJAHRE))
			return "ab 12 Jahre";
		else if(o.equals(ABSECHSZEHNJAHRE))
			return "ab 16 Jahre";
		else if(o.equals(OHNEJUGENDFREIGABE))
			return "ohne Jugendfreigabe";
		else
			return null;
	}
}
