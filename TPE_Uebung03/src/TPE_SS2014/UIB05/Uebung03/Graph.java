package TPE_SS2014.UIB05.Uebung03;

import java.util.ArrayList;

/** 
 * Implementiert einen Graph
 * 
 * @author Timo Neumann, 1312143
 * @author Constantin Schneider, 1315272
 * @param <T>
 */
public class Graph<T> {
	private Node<T> root;
	
	public Graph(Node<T> firstNode){
		this.root = firstNode;
	}
	
	/**
	 * Sucht einen gewünschten Knoten
	 * @param value
	 * @param strategy
	 * @return Knoten, der gefunden wurde
	 */
	public Node<T> search(T value, SearchStrategy<T> strategy){
		return strategy.search(value, this.root);
	}
	
	/**
	 * Kopiert alle Knoten in eine Liste.
	 * @param list
	 * @return Liste mit allen Knoten
	 */
	public List<T> copyInto(List<T> list){
		ArrayList<Node<T>> path = new ArrayList<>();
		NodeListImpl<T> queue = new NodeListImpl<>();
		
		path.add(root);
		list.add(root.getValue());
		queue.addFirst(root);
		
		while(!queue.isEmpty()){
			Node<T> node = queue.removeFirst();

			for(Node<T> n : node.getChildren()){
				if(!path.contains(n)){
					path.add(n);
					queue.add(n);
					list.add(n.getValue());
				}
			}
		}
		
		return list;
	}
	

}
