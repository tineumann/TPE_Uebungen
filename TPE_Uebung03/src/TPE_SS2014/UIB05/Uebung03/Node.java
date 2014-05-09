package TPE_SS2014.UIB05.Uebung03;

import java.util.ArrayList;

public class Node<T> {
	private String name;
	private T value;
	private ArrayList<Node<T>> children;
	
	public Node(String name, T value){
		this.name = name;
		this.value = value;
	}
	
	public void addChild(Node<T> node){
		this.children.add(node);
	}
	
	public T[] getChildren(){
		T[] a = new T[children.size()];
		return this.children.toArray(a);
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
