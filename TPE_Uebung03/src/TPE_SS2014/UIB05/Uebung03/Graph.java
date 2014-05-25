package TPE_SS2014.UIB05.Uebung03;

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
		return copyInto(list, this.root);
	}
	
	private List<T> copyInto(List<T> list, Node<T> node){
		if(!list.contains(node.getValue())){
			list.add(node.getValue());
		}
		for(Node<T> n : node.getChildren()){
			if(n.hasChildren()){
				return copyInto(list, n);
			}
		}
		
		return list;
	}
}
