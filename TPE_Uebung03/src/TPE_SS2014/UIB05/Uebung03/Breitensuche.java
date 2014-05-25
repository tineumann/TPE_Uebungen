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
		this.path.clear();
		
		NodeListImpl<T> queue = new NodeListImpl<>();
		
		path.add(root);
		queue.addFirst(root);
		
		while(!queue.isEmpty()){
			Node<T> node = queue.removeFirst();
			if(node.getValue().equals(value)){
				foundNode = node;
				return foundNode;
			}

			for(Node<T> n : node.getChildren()){
				if(!path.contains(n)){
					path.add(n);
					queue.add(n);
				}
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
