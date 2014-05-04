package TPE_SS2014.UIB05.Racewars;


public class Spieler {
	
	private int geld = 2000;	
	public int getGeld() {
		return geld;
	}

	public Squad squad;
	
	public Spieler(Squad s){
		this.squad = s;
	}	
}
