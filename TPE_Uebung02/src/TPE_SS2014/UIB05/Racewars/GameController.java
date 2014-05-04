package TPE_SS2014.UIB05.Racewars;

import TPE_SS2014.UIB05.Racewars.WesenAPI.Kaempfer;
import TPE_SS2014.UIB05.Racewars.WesenAPI.Wesen;


/**
 * Führt ein Spiel durch.
 * 
 * @author Timo Neumann, 1312143
 * @author Constantin Schneider, 1315272
 */
public class GameController {

	private int runde = 0;
	private int indexSpieler;
	private Spieler[] spieler = new Spieler[2];
	boolean spielBeendet = false;

	public GameController(Spieler spieler1, Spieler spieler2) {
		
		spieler[0] = spieler1;
		spieler[1] = spieler2;
	}

	public void rungame() {
		runde++;
		indexSpieler = 0;

		while (indexSpieler < spieler.length && !spielBeendet) {
			int indexSpieler1 = 0;
			int indexSpieler2 = 0;

			indexSpieler1 = (int) (Math.random() * spieler[0].squad.size() - 1);
			indexSpieler2 = (int) (Math.random() * spieler[1].squad.size() - 1);

			Kaempfer spieler1 = spieler[0].squad.get(indexSpieler1);
			Kaempfer spieler2 = spieler[1].squad.get(indexSpieler2);

			if (indexSpieler == 0) {
				spieler1.attack(spieler2);
				if (spieler2 instanceof Wesen) {
					boolean lebt = ((Wesen) spieler2).isLebendig();
					if (!lebt) {
						spieler[1].squad.remove(indexSpieler2);
					}
				}
			}
			
			if (indexSpieler == 1) {
				spieler2.attack(spieler1);
				if (spieler1 instanceof Wesen) {
					boolean lebt = ((Wesen) spieler1).isLebendig();
					if (!lebt) {
						spieler[0].squad.remove(indexSpieler1);
					}
				}
			}
			
			for(Spieler s : this.spieler){
				if(s.squad.size() == 0)
					this.spielBeendet = true;
			}
		}
	}

	public int getRunde() {
		return this.runde;
	}
	
	public Spieler[] getSpieler()
	{
		return this.spieler;
	}

}
