package TPE_SS2014.UIB05.Racewars.WesenImpl;

import TPE_SS2014.UIB05.Racewars.WesenAPI.Rasse;


/**
 * Die Klasse Erzmagier ist Subklasse von Mensch. Es gibt nur ein einziges
 *  Objekt (Singleton), dem das Element FEUER zugeorndet ist.
 * 
 * @author Constantin Schneider
 * @author Timo Neumann
 *
 */

public class Erzmagier extends HeldImpl {
	private static Erzmagier erzmagier = null;
	private static boolean absorption = false;
	
	static{
		erzmagier = new Erzmagier();
	}
	
	/* Default-Konstruktor, der nicht außerhalb der Klasse aufgerufen werden
	 * kann
	*/
	private Erzmagier(){
		super(Rasse.MENSCH, Element.FEUER, 5d);		
	}
	
	/*
	 * Statische Methode, die den einzigen Erzmagier zurückgibt
	 */
	public static Erzmagier getErzmagier(){
		if(erzmagier == null){
			erzmagier = new Erzmagier();
		}
		
		return erzmagier;
	}
	
	@Override
	public String toString() {
		return new String("Erzmagier, LP: "
				+ Double.toString(this.getLebenspunkte()));
	}
	
	public static boolean isAbsorption(){
		return absorption;
	}
	
	public static void absorption(){
		absorption = true;
	}
}

