package TPE_SS2014.UIB05.Uebung04.Kinoprogramm;
/**
 * Aufzählung der Altersfreigaben
 * 
 * @author Constantin Schneider, 1315272
 * @author Timo Neumann, 1312143
 *
 */

public enum Altersfreigabe {
	OHNEALTERSBESCHRAENKUNG, ABSECHSJAHRE, ABZWOELFJAHRE, ABSECHSZEHNJAHRE,
	OHNEJUGENDFREIGABE;

	public String toString(Altersfreigabe altersfreigabe){
		if(altersfreigabe.equals(OHNEALTERSBESCHRAENKUNG))
			return "ohne Altersbeschränkung";
		else if(altersfreigabe.equals(ABSECHSJAHRE))
			return "ab 6 Jahre";
		else if(altersfreigabe.equals(ABZWOELFJAHRE))
			return "ab 12 Jahre";
		else if(altersfreigabe.equals(ABSECHSZEHNJAHRE))
			return "ab 16 Jahre";
		else if(altersfreigabe.equals(OHNEJUGENDFREIGABE))
			return "ohne Jugendfreigabe";
		else
			return null;
	}
}
