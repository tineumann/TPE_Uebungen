package tpe.uib._05;

/**
 * Berechnet ein einfaches Annuitätendarlehen. Zur Benutzung wird die Klasse 
 * FestkommaZahl benötigt.
 * 
 * @author Timo Neumann, 1312143
 * @author Constantin Schneider, 13152720
 */
public class Darlehen {
	private final Festkommazahl darlehenssumme;
	private Festkommazahl annuität;
	private double zinssatz;
	private double tilgungsrate;
	
	public Darlehen(Festkommazahl betrag, double zinssatzInProzent, 
			double tilgungsrateInProzent)
	{		
		this.darlehenssumme = betrag;
		this.zinssatz = zinssatzInProzent;
		this.tilgungsrate = tilgungsrateInProzent;
		
		Festkommazahl tilgung 
			= this.darlehenssumme.multipliziere(this.tilgungsrate)
				.dividiere(100);
		
		Festkommazahl zinsen 
			= this.darlehenssumme.multipliziere(this.zinssatz)
				.dividiere(100);
				
		this.annuität = tilgung.addiere(zinsen);
	}
	
	/**
	 * Berechnet ein Darlehen über die Dauer anzahlJahre.
	 * 
	 *<ul>
	 *<li>darlehen[i][0] bezeichnet die Zinsen im betreffenden Jahr </li>
	 *<li>darlehen[i][1] bezeichnet die Tilgung im betreffenden Jahr</li>
	 *<li>darlehen[i][2] bezeichnet die Restschuld nach dem Jahr</li>
	 *</ul>
	 * @param anzahlJahre
	 * @return Array aller Darlehens-Daten
	 */
	public Festkommazahl[][] jahresDaten(int anzahlJahre)
	{
		Festkommazahl[][] darlehen = new Festkommazahl[anzahlJahre][3];
		Festkommazahl restschuld 
			= new Festkommazahl(this.darlehenssumme.getAsDouble());
		
		for (int i = 0; i < anzahlJahre; i++)
		{
			//Zinsen berechnen
			darlehen[i][0] = restschuld.multipliziere(this.zinssatz)
					.dividiere(100);

			//Tilgung berechnen
			darlehen[i][1] = annuität.subtrahiere(darlehen[i][0]);

			//Restschuld berechnen
			darlehen[i][2] = restschuld;
			
			restschuld = restschuld.subtrahiere(darlehen[i][1]);
		}

		return darlehen;
	}
}
