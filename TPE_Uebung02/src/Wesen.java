
public abstract class Wesen {

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
