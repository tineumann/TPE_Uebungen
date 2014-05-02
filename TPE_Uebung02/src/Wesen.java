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
	private Rasse rasse;
	
	public Wesen(Rasse rasse){
		this.rasse = rasse;
		
		this.lebenspunkte = this.rasse.getLebenspunkte();
	}
	
	public boolean isLebendig(){
		if(this.lebenspunkte > 0)
			return true;
		else return false;
	}
	
	@Override
	public void attack(Kaempfer r){
		double damage = this.getRasse().getGeschwindigkeit() 
				* this.getRasse().getSchaden()
				* this.getRasse().getSpezialattribut();
		
		if(((Wesen)r).rasse == Rasse.MENSCH){
			damage = beschraenkeSchaden(damage);
		}
		
		((Wesen)r).setLebenspunkte(((Wesen)r).lebenspunkte - (int)damage);
	}
	
	public double beschraenkeSchaden(double damage){
		return damage * 0.9d;
	}
	
	public Rasse getRasse(){
		return this.rasse;
	}

	public int getLebenspunkte(){
		return this.lebenspunkte;
	}
	
	public void setLebenspunkte(int lebenspunkte){
		this.lebenspunkte = lebenspunkte;
	}
	
}

