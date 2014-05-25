package TPE_SS2014.UIB05.Uebung03;

import java.util.ArrayList;

/** 
 * Interface zur Suche in einem Graph
 * 
 * @author Timo Neumann, 1312143
 * @author Constantin Schneider, 1315272
 * @param <T>
 */
public interface SearchStrategy<T> {
	
	/**
	 * Sucht den gewünschten Knoten.
	 * @return gesuchten Knoten - wenn nicht gefunden, dann null.
	 */
	public Node<T> search(T value, Node<T> root);
	
	/**
	 * Gibt den Pfad der zuletzt ausgeführten Suche zurück.
	 * 
	 * @return Liste der Knoten, die durchsucht wurden.
	 */
	public ArrayList<Node<T>> getPath();
}
