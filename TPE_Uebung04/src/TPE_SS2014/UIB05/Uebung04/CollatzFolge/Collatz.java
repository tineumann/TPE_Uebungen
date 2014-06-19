package TPE_SS2014.UIB05.Uebung04.CollatzFolge;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Collatz implements Iterable<Long>{

	private long startwert;
	List<Long> folge = Collections.synchronizedList(new LinkedList<Long>());
	
	public Collatz(long startwert){
		this.startwert = startwert;
		long aktuellerWert = this.startwert;
		folge.add(this.startwert);
		while(aktuellerWert != 1){
			if(aktuellerWert % 2 == 0){
				aktuellerWert /= 2;
			} else {
				aktuellerWert = aktuellerWert * 3 + 1;
			}
			folge.add(aktuellerWert);
		}
	}
	
	public long getStartwert(){
		return this.startwert;
	}
	
	public int size(){
		return folge.size();
	}
	
	@Override
	public String toString(){
		String s = "";
		for(long l : folge){
			s += Long.toString(l) + "; ";
		}
		
		return s;
	}

	@Override
	public Iterator<Long> iterator() {
		return folge.iterator();
	}
}
