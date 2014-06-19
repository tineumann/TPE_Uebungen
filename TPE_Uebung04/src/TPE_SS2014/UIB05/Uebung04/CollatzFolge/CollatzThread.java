package TPE_SS2014.UIB05.Uebung04.CollatzFolge;

public class CollatzThread implements Runnable {
	
	private static int startwert = 1;
	
	@Override
	public void run() {
		while(getStartwert() < 1000000){
			Collatz c = new Collatz(this.getStartwert());
			System.out.println(c.getStartwert() + " ; " + c.size());
			setStartwert(startwert++);
		}
		
	}

	public synchronized int getStartwert(){
		return startwert;
	}
	
	public synchronized void setStartwert(int startwertNeu){
		startwert = startwertNeu;
	}
}
