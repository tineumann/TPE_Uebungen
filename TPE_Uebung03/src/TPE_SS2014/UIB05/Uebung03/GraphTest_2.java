package TPE_SS2014.UIB05.Uebung03;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class GraphTest_2 {

	@Test
	public void testTiefenSuche() {
	Node<String> a = new Node<String>("A", "A");
	Node<String> b = new Node<String>("B", "B");
	Node<String> c = new Node<String>("C", "C");
	Node<String> d = new Node<String>("D", "D");
	Node<String> e = new Node<String>("E", "E");
	Node<String> f = new Node<String>("F", "F");
	Node<String> g = new Node<String>("G", "G");
	Node<String> h = new Node<String>("H", "H");
	Node<String> i = new Node<String>("I", "I");
	Node<String> j = new Node<String>("J", "J");
	
	Graph<String> graph = new Graph<>(a);
	
	a.addChild(b);
	a.addChild(c);
	a.addChild(d);
	a.addChild(e);
	
	b.addChild(f);
	
	c.addChild(f);
	
	d.addChild(g);
	
	e.addChild(g);
	
	f.addChild(h);
	
	g.addChild(i);
	
	h.addChild(j);
	
	i.addChild(j);
	
	Tiefensuche<String> tiefensuche = new Tiefensuche<>();
	
	Node<String> tiefensucheErgebnis = graph.search("J", tiefensuche);
	
	ArrayList<Node<String>> tiefensucheListe = tiefensuche.getPath();
	String tiefensucheAusgabe = "[";
	for(Node<String> s : tiefensucheListe)
		tiefensucheAusgabe+= s.getName() + ",";
	tiefensucheAusgabe += "]";
	System.out.println("Tiefensuche: " + tiefensucheAusgabe);
	if(tiefensucheErgebnis != null)
		System.out.println("Ergebnis: " + tiefensucheErgebnis.getName());
	assertEquals("[A,B,F,H,J,C,D,G,I,E,]", tiefensucheAusgabe);		
	}
	
	@Test
	public void testBreitensuche(){
		Node<String> a = new Node<String>("A", "A");
		Node<String> b = new Node<String>("B", "B");
		Node<String> c = new Node<String>("C", "C");
		Node<String> d = new Node<String>("D", "D");
		Node<String> e = new Node<String>("E", "E");
		Node<String> f = new Node<String>("F", "F");
		Node<String> g = new Node<String>("G", "G");
		Node<String> h = new Node<String>("H", "H");
		Node<String> i = new Node<String>("I", "I");
		Node<String> j = new Node<String>("J", "J");
		
		a.addChild(b);
		a.addChild(c);
		a.addChild(d);
		a.addChild(e);
		b.addChild(f);
		c.addChild(f);
		d.addChild(g);
		e.addChild(g);
		f.addChild(h);
		g.addChild(i);
		h.addChild(j);
		i.addChild(j);
		
		Graph<String> graph = new Graph<>(a);
		
		Breitensuche<String> breitensuche = new Breitensuche<>();
		Node<String> breitensucheErgebnis = graph.search("J", breitensuche);
		ArrayList<Node<String>> breitensucheListe = breitensuche.getPath();
		String breitensucheAusgabe = "[";
		for(Node<String> s : breitensucheListe)
			breitensucheAusgabe +=s.getName() + ",";
		breitensucheAusgabe += "]";
		System.out.println("Breitensuche: " + breitensucheAusgabe);
		if(breitensucheErgebnis != null)
			System.out.println("Ergebnis: " + breitensucheErgebnis.getName());
		assertEquals("[A,B,C,D,E,F,G,H,I,J,]", breitensucheAusgabe);
		
		
	}
	
	@Test
	public void testABC(){
		Node<String> a = new Node<String>("A", "A");
		Node<String> b = new Node<String>("B", "B");
		Node<String> c = new Node<String>("C", "C");
		Node<String> d = new Node<String>("D", "D");
		Node<String> e = new Node<String>("E", "E");
		
		a.addChild(b);
		a.addChild(c);
		b.addChild(d);
		c.addChild(d);
		d.addChild(e);
		
		Graph<String> graph = new Graph<>(a);
		Tiefensuche<String> tiefensuche = new Tiefensuche();
		Node<String> tiefensucheErgebnis = graph.search("X", tiefensuche);
		ArrayList<Node<String>> tiefensucheListe = tiefensuche.getPath();
		String tiefensucheAusgabe = "[";
		for(Node<String> s : tiefensucheListe)
			tiefensucheAusgabe += s.getName() + ",";
		tiefensucheAusgabe += "]";
		System.out.println("Tiefensuche: " + tiefensucheAusgabe);
		if(tiefensucheErgebnis != null)
			System.out.println("Ergebnis: " + tiefensucheErgebnis);
		
		assertEquals("[A,B,D,E,C,]", tiefensucheAusgabe);
			
		
		
		
	}

}
