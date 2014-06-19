package TPE_SS2014.UIB05.Uebung04.Kinoprogramm;
/**
 * Beinhaltet einen Film mit Startzeit
 * 
 * @author Constantin Schneider, 1315272
 * @author Timo Neumann, 1312143
 */
public class Vorstellung {

	private Zeit zeit;
	private Film film;

	public Vorstellung(Zeit zeit, Film film) {
		this.zeit = zeit;
		this.film = film;
	}

	public Zeit getZeit() {
		return zeit;
	}

	public void setZeit(Zeit zeit) {
		this.zeit = zeit;
	}

	public Film getFilm() {
		return film;
	}

	public void setFilm(Film film) {
		this.film = film;
	}

	@Override
	public String toString() {
		return getZeit().getZeitAsString() + " -- " + this.getFilm().toString();
	}
}
