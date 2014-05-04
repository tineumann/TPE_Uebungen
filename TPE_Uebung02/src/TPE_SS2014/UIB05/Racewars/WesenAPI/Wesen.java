package TPE_SS2014.UIB05.Racewars.WesenAPI;

/**
 * Interface Wesen stellt Methoden bereit, die jedes Wesen ausführen muss.
 * 
 * @author Timo Neumann, 1312143
 * @author Constantin Schneider, 1315272
 */
public interface Wesen {

	/**
	 * Stellt fest, ob Wesen noch lebt.
	 * 
	 * @return boolscher Wert - true heißt lebendig, false heißt tot.
	 */
	public boolean isLebendig();

	/**
	 * Überschreibt die standardmäßige ToString()-Methode und gibt Wesenstyp,
	 * als auch Lebenspunkte in einem String aus.
	 * 
	 * @return
	 */
	@Override
	public String toString();

	/**
	 * Gibt die Anzahl der Lebenspunkte zurück.
	 * 
	 * @return double - Lebenspunkte
	 */
	public double getLebenspunkte();

	/**
	 * Setzt die Anzahl der Lebenspunkte auf den gewünschten Wert.
	 * 
	 * @param lebenspunkte
	 */
	public void setLebenspunkte(double lebenspunkte);

}
