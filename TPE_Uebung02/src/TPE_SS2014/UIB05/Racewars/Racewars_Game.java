package TPE_SS2014.UIB05.Racewars;

import java.util.ArrayList;

import TPE_SS2014.UIB05.Racewars.WesenAPI.Kaempfer;
import TPE_SS2014.UIB05.Racewars.WesenAPI.WesenFactory;

public class Racewars_Game {

	public static void main(String[] args) {
		Squad s1 = new Squad("Spieler1");
		Kaempfer[] k_spieler1 = WesenFactory.kaufeMensch(2000);
		s1.add(k_spieler1);

		Squad s2 = new Squad("Spieler2");
		Kaempfer[] k_spieler2 = WesenFactory.kaufeOrk(2000);
		s2.add(k_spieler2);
		
		
		GameController gc = new GameController(new Spieler(s1), new Spieler(s2));
		while (!gc.spielBeendet){
			gc.rungame();
			
			ArrayList<String> messages = GameViewer.printgame(gc);
			
			for(String s : messages){
				System.out.println(s);
			}
		}
	}

}
