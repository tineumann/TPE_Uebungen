import java.util.*;
public class Squad{
	Stack<Kaempfer> squad = new Stack<Kaempfer>();
	
	public Squad(){}

	public void add(Kaempfer r){
		this.squad.push(r);
	}
	
	public Kaempfer getNext(){
		return this.squad.pop();
	}
}
