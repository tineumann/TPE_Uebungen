package TPE_SS2014.UIB05.Uebung04.Kinoprogramm;

import java.util.Comparator;

public class FilmComparator implements Comparator<Film>{
	
	public int compare(Film f1, Film f2){
		
		if(f1.getStartzeit().toString() == null && f2.getStartzeit().toString() == null){
			return 0;
		}
		if(f1.getStartzeit().toString() == null){
			return 1;
		}
		if(f2.getStartzeit().toString() == null) {
			return -1;
		}
		return f1.getStartzeit().toString().compareTo(f2.getStartzeit().toString());
	}
}