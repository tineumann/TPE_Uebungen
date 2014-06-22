package TPE_SS2014.UIB05.Uebung04.CollatzFolge;

public class CollatzThread implements Runnable {

	private int startwert;
	private int endwert;
	private static Collatz laengsteFolge = new Collatz(1);

	public CollatzThread(int endwert) {
		this.startwert = endwert / 2;
		this.endwert = endwert;
	}

	@Override
	public void run() {
<<<<<<< HEAD
		while(getStartwert() <= 1000000000){
			Collatz c = new Collatz(this.getStartwert());
			this.erhoeheStartwert();			
			if(c.size() > getLaengsteFolge().size()){
				setLaengsteFolge(c);
			}
			
			
=======
		while (getStartwert() <= endwert) {
			if (getStartwert() % 3 != 0) {
				Collatz c = new Collatz(this.getStartwert());
				// System.out.println(c.toString());
				if (c.size() > getLaengsteFolge().size()) {
					setLaengsteFolge(c);
				}
			}
			this.erhoeheStartwert();
>>>>>>> FETCH_HEAD
		}

	}

<<<<<<< HEAD
	public static Collatz getLaengsteFolge(){
=======
	public static synchronized Collatz getLaengsteFolge() {
>>>>>>> FETCH_HEAD
		return laengsteFolge;
	}

	public static synchronized void setLaengsteFolge(Collatz c) {
		laengsteFolge = c;
	}
<<<<<<< HEAD
	
	public int getStartwert(){
=======

	public synchronized int getStartwert() {
>>>>>>> FETCH_HEAD
		return startwert;
	}

	public synchronized void erhoeheStartwert() {
		startwert++;
	}
}
