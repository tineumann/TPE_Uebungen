package TPE_SS2014.UIB05.Uebung04.CollatzFolge;

public class CollatzSim {
	public static void main(String[] args){
		Collatz c = new Collatz(13);
		for(int i : c.zahlen){
			System.out.println(i);
		}
	}
}
