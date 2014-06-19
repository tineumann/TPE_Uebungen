package TPE_SS2014.UIB05.Uebung04.CollatzFolge;

public class CollatzThread implements Runnable {
	
	private int startwert = 2;
	
	private static Collatz laengsteFolge = new Collatz(1);
	
	@Override
	public void run() {
		while(getStartwert() < 1000000){
			Collatz c = new Collatz(this.getStartwert());
			
			if(c.size() > this.getLaengsteFolge().size()){
				this.setLaengsteFolge(c);
			}
			
			this.erhoeheStartwert();
		}

	}

	public synchronized Collatz getLaengsteFolge(){
		return laengsteFolge;
	}
	
	public synchronized void setLaengsteFolge(Collatz c){
		laengsteFolge = c;
	}
	
	public synchronized int getStartwert(){
		return startwert;
	}
	
	public synchronized void erhoeheStartwert(){
		startwert++;
	}
}
