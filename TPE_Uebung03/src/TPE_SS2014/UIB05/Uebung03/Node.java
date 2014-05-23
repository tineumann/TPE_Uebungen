package TPE_SS2014.UIB05.Uebung03;

public class Node<T> {
	private String name;
	private T value;
	private NodeListImpl<T> children;
	
	public Node(){};
	
	public Node(String name, T value){
		this.name = name;
		this.value = value;
	}
	
	public void addChild(Node<T> node){
		this.children.add(node);
	}
	
	public boolean hasChildren(){
		if(this.children.size() > 0)
			return false;
		else return true;
	}
	
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
