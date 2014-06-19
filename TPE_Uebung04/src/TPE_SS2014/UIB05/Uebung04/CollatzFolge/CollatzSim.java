package TPE_SS2014.UIB05.Uebung04.CollatzFolge;

public class CollatzSim {

	public static void main(String[] args) {
		collatzMultiThread();
		collatzSingleThread();
	}

	public static void collatzMultiThread() {
		CollatzThread ct = new CollatzThread();

		Thread t1 = new Thread(ct);
		Thread t2 = new Thread(ct);
		Thread t3 = new Thread(ct);
		Thread t4 = new Thread(ct);

		t1.start();
		t2.start();
		t3.start();
		t4.start();

		try {
			t1.join();
			t2.join();
			t3.join();
			t4.join();
		} catch (InterruptedException e) {
			System.out.println("Thread wurde unterbrochen.");
		}
		
		System.out.println("Laengste Folge:" + "(Laenge:"
					+ CollatzThread.getLaengsteFolge().size() + "; Startwert: "
					+ CollatzThread.getLaengsteFolge().getStartwert() + ")");
			System.out.println(CollatzThread.getLaengsteFolge().toString());
	}

	public static void collatzSingleThread() {
		long startwert = 2;
		Collatz laengste = new Collatz(1);

		while (startwert <= 1000000) {
			Collatz c = new Collatz(startwert);

			if (c.size() > laengste.size()) {
				laengste = c;
			}

			startwert++;
		}

		System.out.println("Laengste Folge:" + "(Laenge:" + laengste.size()
				+ "; Startwert: " + laengste.getStartwert() + ")");
		System.out.println(laengste.toString());
	}
}
