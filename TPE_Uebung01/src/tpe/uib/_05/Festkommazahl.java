package tpe.uib._05;
/**
 * Die Klasse Festkommazahl stellt Methoden bereit, um mit POSITIVEN 
 * Festkommazahlen umgehen zu können. 
 * 
 *@author Timo Neumann, 1312143
 *@author Constantin Schneider, 13152720
 */
public class Festkommazahl {
	//Speichert die Festkommazahl in einem Long-Wert
	private final long wert;
	
	//speichert die Anzahl der Stellen nach dem Komma
	private final int nachKommaStellen;
	private final int MAX_NACHKOMMASTELLEN = 6;
	private final int MIN_NACHKOMMASTELLEN = 2;
	
	/**
	 * Konstruktor, in dem drei Argumente übergeben werden. Bei überschreiten
	 * der maximalen Nachkommastellen wird die Anzahl der Nachkommastellen auf 
	 * 6 begrenzt. Bei unterschreiten der minimalen Nachkommastellen auf 2.
	 * 
	 * @param vorKomma, Stellen vor dem Komma
	 * @param nachKomma, Stellen nach dem Komma
	 * @param anzahlNachKommaStellen, Anzahl der Nachkommastellen
	 */
	public Festkommazahl(long vorKomma, long nachKomma, 
			int anzahlNachKommaStellen){
		
		this.nachKommaStellen = fixNachKommaStellen(anzahlNachKommaStellen);
		
		/*
		 * Es werden lediglich so viele Nachkommstellen übernommen,
		 * wie angegeben, der Rest wird abgeschnitten.
		 */		
		if (Long.toString(nachKomma).length() > anzahlNachKommaStellen)
			nachKomma = Long.parseLong(Long.toString(nachKomma)
					.substring(0, this.nachKommaStellen));
		
		this.wert = 
				(long) (vorKomma * Math.pow(10 , this.nachKommaStellen) 
						+ nachKomma);
	}

	/**
	 * Konstruktor, bei dem zwei Parameter übergeben werden und mit den
	 * Standard-Nachkommastellen von 4 gerechnet wird.
	 * 
	 * @param vorKomma, , Stellen vor dem Komma
	 * @param nachKomma, , Stellen nach dem Komma
	 */
	public Festkommazahl(long vorKomma, long nachKomma)
	{
		this(vorKomma, nachKomma, 4);
	}
	
	/**
	 * Konstruktor bei dem eine Fließkommazahl vom Typ double übergeben wird.
	 * Es werden nur 2 Nachkommastellen übernommen!
	 * 
	 * @param festkommazahl, Zahl in double Darstellung
	 */
	public Festkommazahl(double festkommazahl)
	{		
		this.nachKommaStellen = 2;
		
		//Durch den Cast werden übrige Nachkommastellen abgeschnitten.
		this.wert = (long) (festkommazahl * 100);
	}
	
	/**
	 * Die Methode analysiert die Anzahl der Nachkommastellen, die übergeben
	 * werden sollen und korrigiert diese, falls nötig.
	 * 
	 * @param anzahlNachKommaStellen, die Anzahl wie viele Stellen nach dem
	 * Komma übergeben werden soll
	 * @return die Anzahl der Nachkommastellen, mit denen gerechnet bzw.
	 * ausgegeben wird
	 */
	private int fixNachKommaStellen(int anzahlNachKommaStellen){
		if(anzahlNachKommaStellen > this.MAX_NACHKOMMASTELLEN)
			anzahlNachKommaStellen = 6;
		else if(anzahlNachKommaStellen < this.MIN_NACHKOMMASTELLEN)
			anzahlNachKommaStellen = 2;
		
		return anzahlNachKommaStellen;
	}
	
	/**
	 * Die Methode soll einen Nachkommawert runden, sobald weniger
	 * Nachkommastellen angegeben werden, als der Nachkommawert bereit besitzt.
	 * 
	 * @param nachKomma, der Wert, der Nach dem Komma steht.
	 * @param anzahlNachKommaStellen, die Anzahl wie viele Stellen nach dem
	 * Komma übergeben werden soll
	 * @return der neue gerundete Wert, der nach dem Komma steht
	 */
	private long runden(long nachKomma, int anzahlNachKommaStellen){
		/*
		 * Wenn der Wert von nachKomma kleiner als 5 ist, 
		 *wird definitiv auf 0 abgerundet.
		 */
		if(nachKomma < 5) return 0;

		if (Long.toString(nachKomma).length() > anzahlNachKommaStellen){			
			//Die letzte Nachkommastelle wird in einen Integer geschrieben.
			int i = Integer.parseInt(Character.toString(Long.toString(nachKomma)
					.charAt(anzahlNachKommaStellen - 1)));
			//Es werden alle zu übernehmenden Ziffern übernommen.
			nachKomma = Long.parseLong(Long.toString(nachKomma)
					.substring(0, anzahlNachKommaStellen));			
			/*
			 * Wenn die letzte Ziffer größer als 4 ist,
			 * muss der Wert aufgerundet werden. 
			 */
			
			if (i > 4)	nachKomma++;
		}
		
		return nachKomma;
	}
	
	/**
	 * In der Methode addieren, werden die beiden Werte der beiden in long
	 * konvertierte Zahlen addiert. Zuerst werden die Anzahl der
	 * Nachkommastellen analysiert und die Zahl mit den meisten
	 * Nachkommastellen übernommen.
	 * @param zahl2 zweite zu addierende Zahl
	 * @return es wird eine neue Festkommazahl generiert, mit den vorher
	 * berechneten Eigenschaften
	 */
	public Festkommazahl addiere(Festkommazahl zahl2){
		return addiere(this, zahl2);
	}
	
	private Festkommazahl addiere(Festkommazahl zahl1, Festkommazahl zahl2){
		long wert1 = zahl1.wert;
		long wert2 = zahl2.wert;
		
		/*
		 * Die Anzahl der Nachkommstellen entspricht der, des Summanden
		 * mit den meisten Nachkommastellen.
		 */
		int erg_AnzahlNachKommaStellen = 
				Math.max(zahl1.nachKommaStellen, 
						zahl2.nachKommaStellen);
		
		/*
		 * Der Summand mit weniger Nachkommastellen wird mit 10 multipliziert,
		 * bis beide Summanden die selbe Anzahl Nachkommastellen besitzen.
		 */
		if(zahl1.nachKommaStellen 
				< zahl2.nachKommaStellen){
			wert1 *= Math.abs(zahl2.nachKommaStellen 
					- zahl1.nachKommaStellen);
		}
		else if (zahl1.nachKommaStellen 
				> zahl2.nachKommaStellen){
			wert2 *= Math.abs(zahl2.nachKommaStellen 
					- zahl1.nachKommaStellen);
		}
		
		long ergebnis = wert1 + wert2;
		
		long erg_VorKomma = this.getVorKomma(ergebnis, 
				erg_AnzahlNachKommaStellen);
		
		long erg_NachKomma = this.getNachkomma(ergebnis, 
				erg_AnzahlNachKommaStellen);
		
		return new Festkommazahl(erg_VorKomma, erg_NachKomma, 
				erg_AnzahlNachKommaStellen);
	}
	
	/**
	 * Subtrahiert zwei Festkommazahlen und gibt eine neue Festkommazahl zurück.
	 * @param zahl2, zu subtrahierende Zahl
	 * @return es wird eine neue Festkommazahl generiert, mit den vorher
	 * berechneten Eigenschaften
	 */
	public Festkommazahl subtrahiere(Festkommazahl zahl2){
		return subtrahiere(this, zahl2);
	}
	
	/**
	 * Subtrahiert zwei Festkommazahlen und gibt eine neue Festkommazahl zurück.
	 * @param zahl2, zu subtrahierende Zahl
	 * @return es wird eine neue Festkommazahl generiert, mit den vorher
	 * berechneten Eigenschaften
	 */
	private Festkommazahl subtrahiere(Festkommazahl zahl1, 
			Festkommazahl zahl2){
		long wert1 = zahl1.wert;
		long wert2 = zahl2.wert;
		
		/*
		 * Die Anzahl der Nachkommstellen entspricht der, des Summanden
		 * mit den meisten Nachkommastellen.
		 */
		int erg_AnzahlNachKommaStellen = 
				Math.max(zahl1.nachKommaStellen, 
						zahl2.nachKommaStellen);
		
		/*
		 * Die Zahl mit weniger Nachkommastellen wird mit 10 multipliziert,
		 * bis beide Zahlen die selbe Anzahl Nachkommastellen besitzen.
		 */
		if(zahl1.nachKommaStellen 
				< zahl2.nachKommaStellen){
			wert1 *= Math.abs(zahl2.nachKommaStellen 
					- zahl1.nachKommaStellen);
		}
		else if (zahl1.nachKommaStellen 
				> zahl2.nachKommaStellen){
			wert2 *= Math.abs(zahl2.nachKommaStellen 
					- zahl1.nachKommaStellen);
		}
		
		long ergebnis = wert1 - wert2;
		
		//Negative Zahlen werden nicht berücksichtigt.
		if (ergebnis <= 0)
			return new Festkommazahl(0d);
		
		long erg_VorKomma = this.getVorKomma(ergebnis, 
				erg_AnzahlNachKommaStellen);
		long erg_NachKomma = this.getNachkomma(ergebnis, 
				erg_AnzahlNachKommaStellen);
		return new Festkommazahl(erg_VorKomma, erg_NachKomma, 
				erg_AnzahlNachKommaStellen);
	}
	
	/**
	 * Multipliziert zwei Festkommazahlen und 
	 * gibt eine neue Festkommazahl zurück.
	 * @param zahl2
	 * @return Festkommazahl
	 */
	public Festkommazahl multipliziere(double zahl2){
		return this.multipliziere(this, new Festkommazahl(zahl2));
	}
	
	/**
	 * Multipliziert zwei Festkommazahlen und 
	 * gibt eine neue Festkommazahl zurück.
	 * @param zahl2, zweite Zahl mit der multipliziert werden soll
	 * @return neue Festkommazahl, mit 3 Parametern
	 */
	public Festkommazahl multipliziere(Festkommazahl zahl2){
		return this.multipliziere(this, zahl2);
	}
	
	/**
	 * Multipliziert zwei Festkommazahlen und 
	 * gibt eine neue Festkommazahl zurück.
	 * @param zahl1
	 * @param zahl2
	 * @return Festkommazahl
	 */
	private Festkommazahl multipliziere(Festkommazahl zahl1, 
			Festkommazahl zahl2){
		/*
		 * Prinzip der schriftlichen Multiplikation wird angewandt.
		 * Anzahl der Nachkommastellen wird addiert.
		 */
		int erg_anzahlNachKommaStellen = zahl1.nachKommaStellen 
				+ zahl2.nachKommaStellen;
		
		long erg = zahl1.wert * zahl2.wert;
		
		long erg_VorKomma = getVorKomma(erg, erg_anzahlNachKommaStellen);
		
		long erg_NachKomma = 
				getNachkomma(erg, erg_anzahlNachKommaStellen);
		
		return new Festkommazahl(erg_VorKomma, erg_NachKomma, 
				erg_anzahlNachKommaStellen);
	}

	/**
	 * Eine Festkommazahl wird durch einen double-Wert geteilt.
	 * Es wird eine neue Festkommazahl ausgegeben.
	 * 
	 * @param zahl2
	 * @return Festkommazahl
	 */
	public Festkommazahl dividiere(double zahl2){
		if (zahl2 == 0)
			return null;
		
		/*
		 * Double wird nicht über Konstruktor mit double-Parameter 
		 * in Festkommazahl konvertiert, um mehr als 2 Nachkommastellen 
		 * berechnen zu können.
		 */
		String vorkomma = Double.toString(zahl2).split("\\.")[0];
		String nachkomma = Double.toString(zahl2).split("\\.")[1];
		
		while (nachkomma.length() < 2)
			nachkomma += "0";
		
		Festkommazahl zahl2_FK = new Festkommazahl(Long.parseLong(vorkomma), 
								 Long.parseLong(nachkomma), nachkomma.length());
		
		long wert1 = this.wert;
		long wert2 = zahl2_FK.wert;
		
		int differenz_nachKommaStellen = Math.abs(this.nachKommaStellen 
				- zahl2_FK.nachKommaStellen);
		
		if(this.nachKommaStellen < zahl2_FK.nachKommaStellen){
			while(differenz_nachKommaStellen > 0){
				wert1 *= 10;
				differenz_nachKommaStellen--;
			}
		}
		else if(this.nachKommaStellen > zahl2_FK.nachKommaStellen){
			while(differenz_nachKommaStellen > 0){
				wert2 *= 10;
				differenz_nachKommaStellen--;
			}
		}
		
		double ergebnis = (double)wert1 / (double)wert2;
		
		return new Festkommazahl(ergebnis);
	}
	
	/**
	 * Methode, die angibt welchen Anteil die zweite Zahl in Relation zur 
	 * ersten Zahl besitzt.
	 * @param zahl2, zweite Zahl 
	 * @return Prozentangabe, neue Festkommazahl als double
	 */
	public Festkommazahl prozent(Festkommazahl zahl2){
		return new Festkommazahl((double)(zahl2.getAsDouble() 
				/ this.getAsDouble() * 100));
	}
	
	/**
	 * getter-Methode für die Vorkommastellen
	 * @return Vorkommastellen als longwert, oder 0 
	 */
	public long getVorkomma(){
		return getVorKomma(this.wert, this.nachKommaStellen);
	}
	
	private long getVorKomma(long zahl, int anzahlNachKommaStellen){
		
		if(Long.toString(zahl).length() > anzahlNachKommaStellen)
		{
			String vorKomma = Long.toString(zahl).
				substring(0, Long.toString(zahl).length() 
						- anzahlNachKommaStellen);
			return Long.parseLong(vorKomma);
		}
		else return 0;		
	}
	
	/**
	 * getter-Methode für die Nachkommastellen. 
	 * @return long-Wert für Nachkommastellen
	 */
	public long getNachkomma(){
		if (this.wert > 0) {
			if (Long.toString(this.getNachkomma(this.wert, 
					this.nachKommaStellen)).length() < nachKommaStellen){
			return this.runden(this.getNachkomma(this.wert, 
					this.nachKommaStellen), 1);
			}
			else return this.runden(this.getNachkomma(this.wert, 
					this.nachKommaStellen), 2);	
		}
		else return 0;
	}
	
	/**
	 * getter-Methode für die Nachkommastellen. 
	 * @return long-Wert für Nachkommastellen
	 */
	private long getNachkomma(long zahl, int anzahlNachKommaStellen){
		if (Long.toString(zahl).length() <= anzahlNachKommaStellen)
			return zahl;
		
		if(zahl > 0){
		String nachKomma = Long.toString(zahl).
				substring(Long.toString(zahl).length()
						- anzahlNachKommaStellen);			
		return Long.parseLong(nachKomma);
		}
		else return 0;
		
	}
	/**
	 * Gibt den Wert der Festkommazahl als Double aus.
	 * @return double Wert eines Strings
	 */
	public double getAsDouble(){
		return Double.parseDouble(this.toString());		
	}
	
	/**
	 * Castet einen String in eine FestKommaZahl, falls möglich.
	 * @param Zahl als String
	 * @return neue Festkommazahl
	 */
	public static Festkommazahl parse(String s){
		String[] array = s.split("\\.");
		return new Festkommazahl(Long.parseLong(array[0]),
				Long.parseLong(array[1]), array[1].length());
	}
	
	@Override
	public String toString(){
		String nachKomma = Long.toString(getNachkomma(this.wert, 
											this.nachKommaStellen));
		
		int fuehrendeNullen = this.nachKommaStellen
				- nachKomma.length();
		
		String nachKomma_neu="";
		while(fuehrendeNullen > 0){
			nachKomma_neu += "0";
			fuehrendeNullen--;
		}
		
		nachKomma_neu += nachKomma;
		
		return Long.toString(this.getVorkomma()) + "." + 
				nachKomma_neu.substring(0, 2);
	}
	
 @Override
 public boolean equals(Object o){
	if(this == (Festkommazahl) o)
		return true;
	else if (this.wert == ((Festkommazahl)o).wert && 
			this.nachKommaStellen == 
			((Festkommazahl)o).nachKommaStellen)
		return true;
	else return false;
 }
 
 @Override
 public int hashCode(){
	 return (int)this.wert;
 }
}
