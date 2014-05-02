/**
 * Die Klasse WesenImpl stellt lediglich Attribute und Methoden ihrer
 * Subklassen dar. Es sollen keine Objekte vom Typ Wesen erzeugt werden, da
 * es nur Objekte ihrer Subklassen gibt.
 * 
 * @author Constantin Schneider
 * @author Timo Neumann
 *
 */
public class Wesen implements Kaempfer {

	private int lebenspunkte;
	private int ruestung;
	private int schaden;
	private int geschwindigkeit;
	private double spezialattribut;
	private Rasse rasse;
	
	public boolean isLebendig(){
		if(this.lebenspunkte > 0)
			return true;
		else return false;
	}
	
	@Override
	public void attack(Kaempfer r){
		
	}
	
	public Rasse getRasse(){
		return this.rasse;
	}
	
	public int getGeschwindigkeit(){
		return this.geschwindigkeit;
	}
	
	public double getSpezialattribut(){
		return this.spezialattribut;
	}
	
	public int getRuestung(){
		return this.ruestung;
	}
	
	public int getSchaden(){
		return this.schaden;
	}
	
	public int getLebenspunkte(){
		return this.lebenspunkte;
	}
	
	public void setLebenspunkte(int lebenspunkte){
		this.lebenspunkte = lebenspunkte;
	}
	
}

