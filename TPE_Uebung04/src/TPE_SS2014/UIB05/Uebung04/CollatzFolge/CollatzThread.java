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
		while (getStartwert() < endwert) {
			if (getStartwert() % 3 != 0) {
				Collatz c = new Collatz(this.getStartwert());
				// System.out.println(c.toString());
				if (c.size() > getLaengsteFolge().size()) {
					setLaengsteFolge(c);
				}
			}
			this.erhoeheStartwert();
		}

	}

	public static synchronized Collatz getLaengsteFolge() {
		return laengsteFolge;
	}

	public static synchronized void setLaengsteFolge(Collatz c) {
		laengsteFolge = c;
	}

	public synchronized int getStartwert() {
		return startwert;
	}

	public synchronized void erhoeheStartwert() {
		startwert++;
	}
}
