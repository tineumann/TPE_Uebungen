package TPE_SS2014.UIB05.Uebung03;

/** 
 * Knoten eines Graphs
 * 
 * @author Timo Neumann, 1312143
 * @author Constantin Schneider, 1315272
 * @param <T>
 */
public class Node<T> {
	private String name;
	private T value;
	private NodeListImpl<T> children = new NodeListImpl<T>();
	
	public Node(String name, T value){
		this.name = name;
		this.value = value;
	}
	
	/**
	 * Fügt dem Knoten ein Kind hinzu.
	 * @param node
	 */
	public void addChild(Node<T> node){
		this.children.add(node);
	}
	
	/**
	 * Gibt einen Wert zurück, ob der Knoten Kinder besitzt.
	 * @return boolscher Wert
	 */
	public boolean hasChildren(){
		if(this.children.size() > 0)
			return true;
		else return false;
	}
	
	/**
	 * Gibt die Liste aller Kinder zurück.
	 * @return Alle Kinder des Knotens
	 */
	public NodeListImpl<T> getChildren(){
		return this.children;
	}
	
	public String getName(){
		return this.name;
	}
	
	public T getValue(){
		return this.value;
	}
	
	@Override
	public String toString(){
		return (String)(this.name + ", " + value.toString());
	}
}
