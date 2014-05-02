/**
 * Die Klasse Daemonenjaeger ist Subklasse von Nachtelf. Es gibt nur ein
 * einziges Objekt (Singleton), dem das Element LUFT zugeorndet ist.
 * 
 * @author Constantin Schneider
 * @author Timo Neumann
 *
 */

public class Daemonenjaeger extends Wesen {
	
	// Daemonenjaeger bekommt das Element LUFT zugewiesen
	Element element = Element.LUFT;
	
	private static Daemonenjaeger daemonenjaeger = null;
	
	/* Default-Konstruktor, der nicht außerhalb der Klasse aufgerufen werden
	 * kann
	*/
	private Daemonenjaeger(){
	}
	
	/*
	 * Statische Methode, die den einzigen Daemonenjaeger zurückgibt
	 */
	public static Daemonenjaeger getDaemonenjaeger(){
		if(daemonenjaeger == null)
			daemonenjaeger = new Daemonenjaeger();
		return daemonenjaeger;
	}
}
