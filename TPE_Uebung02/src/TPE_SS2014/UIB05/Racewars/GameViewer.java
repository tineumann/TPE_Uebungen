package TPE_SS2014.UIB05.Racewars;

import java.util.ArrayList;

import TPE_SS2014.UIB05.Racewars.WesenAPI.Kaempfer;
import TPE_SS2014.UIB05.Racewars.WesenAPI.Wesen;

/**
 * Gibt den Zwischenstand als String-Array aus.
 * 
 * @author Timo Neumann, 1312143
 * @author Constantin Schneider, 1315272
 */
public class GameViewer {

	public static ArrayList<String> printgame(GameController gc){
		ArrayList<String> messages = new ArrayList<String>();
		messages.add("Zwischenstand nach Runde " + Integer.toString(gc.getRunde()));
		for(Spieler s : gc.getSpieler()){
			messages.add("Squad " +  s.squad.getName());
			for(Kaempfer k : s.squad){
				if(k instanceof Wesen){
					messages.add(((Wesen)k).toString());
				}
			}
		}
		
		if(gc.spielBeendet)
		{
			for(Spieler s: gc.getSpieler()){
				if(s.squad.size() == 0){
					messages.add(s.squad.getName() + " hat verloren!");
				}
			}
		}
		
		return messages;
	}
}
