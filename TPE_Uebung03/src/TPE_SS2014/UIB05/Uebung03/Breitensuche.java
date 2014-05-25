package TPE_SS2014.UIB05.Uebung03;

import java.util.ArrayList;

/** 
 * Implementiert die Suche in einem Graph nach dem Prinzip der Breitensuche.
 * 
 * @author Timo Neumann, 1312143
 * @author Constantin Schneider, 1315272
 * @param <T>
 */
public class Breitensuche<T> implements SearchStrategy<T> {

	private ArrayList<Node<T>> path = new ArrayList<>();
	private Node<T> foundNode;
	
	/**
	 * Sucht den gewünschten Knoten.
	 * @return gesuchten Knoten - wenn nicht gefunden, dann null.
	 */
	@Override
	public Node<T> search(T value, Node<T> root) {
		if(!path.contains(root))
			path.add(root);
		
		if(root.hasChildren()){
			for(Node<T> n : root.getChildren()){
				if(!path.contains(n)){
					path.add(n);
				}
				
				if(n.getValue().equals(value)){
					foundNode = n;
					return foundNode;
				}
			}
			
			for(Node<T> n : root.getChildren()){
				return search(value, n);
			}
		}
		

		return foundNode;
	}
	
	/**
	 * Gibt den Pfad der zuletzt ausgeführten Suche zurück.
	 * 
	 * @return Liste der Knoten, die durchsucht wurden.
	 */
	@Override
	public ArrayList<Node<T>> getPath() {
		return this.path;
	}
}
