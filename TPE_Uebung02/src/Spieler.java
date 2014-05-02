
public class Spieler {
	
	private int geld = 2000;	
	public int getGeld() {
		return geld;
	}

	public Squad squad = new Squad();
	
	public Spieler(){
		
	}
	
	public Kaempfer kaufen(Rasse rasse){
		geld -= rasse.getKosten();
		
		return WesenFactory.createWesen(rasse);
	}
	
}
