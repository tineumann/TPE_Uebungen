package TPE_SS2014.UIB05.Uebung04.CollatzFolge;

public class CollatzThread implements Runnable {
	
	private int startwert = 2;
	
	private static Collatz laengsteFolge = new Collatz(1);
	
	@Override
	public void run() {
		while(getStartwert() <= 1000000000){
			Collatz c = new Collatz(this.getStartwert());
			this.erhoeheStartwert();			
			if(c.size() > getLaengsteFolge().size()){
				setLaengsteFolge(c);
			}
			
			
		}

	}

	public static Collatz getLaengsteFolge(){
		return laengsteFolge;
	}
	
	public static synchronized void setLaengsteFolge(Collatz c){
		laengsteFolge = c;
	}
	
	public int getStartwert(){
		return startwert;
	}
	
	public synchronized void erhoeheStartwert(){
		startwert++;
	}
}
