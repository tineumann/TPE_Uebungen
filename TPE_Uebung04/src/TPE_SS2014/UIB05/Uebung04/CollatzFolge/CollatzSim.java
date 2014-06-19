package TPE_SS2014.UIB05.Uebung04.CollatzFolge;

public class CollatzSim {
	public static void main(String[] args){
		Thread t1 = new Thread(new CollatzThread());
		Thread t2 = new Thread(new CollatzThread());
		Thread t3 = new Thread(new CollatzThread());
		Thread t4 = new Thread(new CollatzThread());
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
	}
}
