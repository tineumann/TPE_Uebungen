package TPE_SS2014.UIB05.Uebung03;


public class Graph<T> {
	private Node<T> root;

	public Node<T> search(T value, SearchStrategy<T> strategy){
		return strategy.search(value, this.root);
	}

	public List<T> copyInto(List<T> list){
		return copyInto(list, this.root);
	}
	
	private List<T> copyInto(List<T> list, Node<T> node){
		list.add(node.getValue());
		for(Node<T> n : node.getChildren()){
			if(n.hasChildren()){
				return copyInto(list, n);
			}
		}
		return list;
	}
}
