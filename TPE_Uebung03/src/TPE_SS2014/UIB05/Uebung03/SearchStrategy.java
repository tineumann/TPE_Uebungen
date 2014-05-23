package TPE_SS2014.UIB05.Uebung03;


public interface SearchStrategy<T> {
	public Node<T> search(T value, Node<T> root);
	public String getPath();
}
