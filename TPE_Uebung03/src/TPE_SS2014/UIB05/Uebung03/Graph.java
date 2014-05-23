package TPE_SS2014.UIB05.Uebung03;

//TODO: Timo
public class Graph<T> {
	private Node<T> root;

	public Node<T> search(T value, SearchStrategy<T> strategy){
		return strategy.search(value, this.root);
	}

	public List<T> copyInto(List<T> list){
		
	}
}
