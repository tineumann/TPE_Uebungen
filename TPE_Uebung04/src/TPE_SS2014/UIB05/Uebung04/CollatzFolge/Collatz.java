package TPE_SS2014.UIB05.Uebung04.CollatzFolge;

import java.util.ArrayList;

public class Collatz{

	private int startwert;
	public ArrayList<Integer> zahlen = new ArrayList<>();
	public Collatz(int startwert){
		this.startwert = startwert;
		int aktuellerWert = this.startwert;
		while(startwert != 1){
			if(aktuellerWert % 2 == 0){
				aktuellerWert /= 2;
			} else {
				aktuellerWert = aktuellerWert * 3 + 1;
			}
			
			zahlen.add(aktuellerWert);
		}
	}
}
