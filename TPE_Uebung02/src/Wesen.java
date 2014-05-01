/**
 * Die abstrakte Klasse Wesen stellt ledeiglich Attribute und Methoden ihrer
 * Subklassen dar. Es sollen keine Objekte vom Typ Wesen erzeugt werden, da
 * es nur Objekte ihrer Subklassen gibt.
 * 
 * @author Constantin Schneider
 * @author Timo Neumann
 *
 */
public class Wesen {

	private int lebenspunkte;
	private int ruestung;
	private int schaden;
	private int geschwindigkeit;
	private double spezialattribut;
	
	public boolean isLebendig(){
		if(this.lebenspunkte > 0)
			return true;
		else return false;
	}
	
	public void attack(Squad s){
		
	}
	
}
