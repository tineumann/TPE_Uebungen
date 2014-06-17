package TPE_SS2014.UIB05.Uebung04.Kinoprogramm;

import java.util.Collections;
import java.util.LinkedList;

public class KinoBeispiel {
	
	
	public static void main(String[] args) throws NumberFormatException, IllegalTimeException{

		Kino kino1 = new Kino("Cinemaxx", "Mannheim", new LinkedList<Saal>() );
		kino1.saeleHinzufuegen("Blauer Saal", 250, new LinkedList<Film>());
		kino1.saeleHinzufuegen("Grüner Saal", 200, new LinkedList<Film>());
		kino1.saeleHinzufuegen("Studio", 150, new LinkedList<Film>());
		kino1.saeleHinzufuegen("Kellerloch", 30, new LinkedList<Film>());
		
		kino1.getSaele().peek().filmHinzufuegen("Batman Begins", 134, Altersfreigabe.ABZWOELFJAHRE, new Zeit("14:00"));
		kino1.getSaele().peek().filmHinzufuegen("Batman Begins", 134, Altersfreigabe.ABZWOELFJAHRE, new Zeit("17:00"));
		kino1.getSaele().peek().filmHinzufuegen("Batman Begins", 134, Altersfreigabe.ABZWOELFJAHRE, new Zeit("21:00"));
		kino1.getSaele().peek().filmHinzufuegen("Batman Begins", 134, Altersfreigabe.ABZWOELFJAHRE, new Zeit("23:00"));
		
		
		kino1.getSaele().peek().filmHinzufuegen("Barbie - Die Prinzessinnen-Akademie", 81, Altersfreigabe.OHNEALTERSBESCHRAENKUNG, new Zeit("15:00"));
		kino1.getSaele().peek().filmHinzufuegen("Ice Age 3", 90, Altersfreigabe.OHNEALTERSBESCHRAENKUNG, new Zeit("17:00"));
		kino1.getSaele().peek().filmHinzufuegen("Ice Age 3", 90, Altersfreigabe.OHNEALTERSBESCHRAENKUNG, new Zeit("19:00"));
		/*kino1.getSaele().peek().filmHinzufuegen("Machete", 100, Altersfreigabe.OHNEJUGENDFREIGABE, new Zeit("21:00"));*/
		
		
		//System.out.println(kino1.toString());
		// System.out.println(kino1.getSaele().peekFirst().toString());
		//System.out.println(kino1.getSaele().peekFirst().getProgramm().peek().toString());
		//for(Saal s : kino1.getSaele()){
		//	for(Film f : s.getProgramm()){
		//		System.out.println(f.toString());
				
		//	}
	//	}
		
		/*for(int i =0; i< kino1.getAlleFilme().length; i++){
			System.out.println(kino1.getAlleFilme());
		}*/
		
		System.out.println(kino1.getAlleFilmeMitZeiten().length);
		

	}
}
