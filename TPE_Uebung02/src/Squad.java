import java.util.*;
public class Squad extends ArrayList<Kaempfer>{
	
	private static final long serialVersionUID = 1L;
	
	private String name;
	
	public void add(Kaempfer[] kaempfer){
		for(Kaempfer k : kaempfer){
			this.add(k);
		}
	}

	public String getName() {
		return name;
	}
	
	public Squad(String name){
		this.name = name;
	}
}
