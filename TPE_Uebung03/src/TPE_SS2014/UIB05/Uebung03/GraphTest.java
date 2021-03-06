package TPE_SS2014.UIB05.Uebung03;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

/** 
 * Testet Graph.
 * 
 * @author Timo Neumann, 1312143
 * @author Constantin Schneider, 1315272
 * @param <T>
 */
public class GraphTest {

	@Test
	public void testTiefensuche() {
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
		Node<String> k = new Node<String>("K", "K");
		Node<String> l = new Node<String>("L", "L");
		Node<String> m = new Node<String>("M", "M");
		Node<String> n = new Node<String>("N", "N");
		Node<String> o = new Node<String>("O", "O");
		Node<String> p = new Node<String>("P", "P");
		
		Graph<String> graph = new Graph<>(a);
		
		a.addChild(b);
		a.addChild(c);
		a.addChild(d);
		
		b.addChild(e);
		b.addChild(f);
		b.addChild(g);
		
		e.addChild(h);
		e.addChild(i);
		
		f.addChild(j);
		f.addChild(k);
		
		c.addChild(l);
		c.addChild(m);
		
		m.addChild(n);
		
		d.addChild(o);
		d.addChild(p);
		
		Tiefensuche<String> tiefensuche = new Tiefensuche<>();

		
		Node<String> tiefensuche_ergebnis = graph.search("P", tiefensuche);

		
		ArrayList<Node<String>> tiefensuche_list = tiefensuche.getPath();
		String tiefensuche_ausgabe = "[";
		for(Node<String> s : tiefensuche_list){
			tiefensuche_ausgabe += s.getName() + ",";
		}
		tiefensuche_ausgabe += "]";
		System.out.println("Tiefensuche: " + tiefensuche_ausgabe);
		
		if(tiefensuche_ergebnis != null)
		System.out.println("Ergebnis: " + tiefensuche_ergebnis.getName());
		
		assertEquals("[A,B,E,H,I,F,J,K,G,C,L,M,N,D,O,P,]", tiefensuche_ausgabe);
	}
	
	@Test
	public void testBreitensuche() {
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
		Node<String> k = new Node<String>("K", "K");
		Node<String> l = new Node<String>("L", "L");
		Node<String> m = new Node<String>("M", "M");
		Node<String> n = new Node<String>("N", "N");
		Node<String> o = new Node<String>("O", "O");
		Node<String> p = new Node<String>("P", "P");
		
		Graph<String> graph = new Graph<>(a);
		
		a.addChild(b);
		a.addChild(c);
		a.addChild(d);
		
		b.addChild(e);
		b.addChild(f);
		b.addChild(g);
		
		e.addChild(h);
		e.addChild(i);
		
		f.addChild(j);
		f.addChild(k);
		
		c.addChild(l);
		c.addChild(m);
		
		m.addChild(n);
		
		d.addChild(o);
		d.addChild(p);
		
		Breitensuche<String> breitensuche = new Breitensuche<>();

		
		Node<String> suche_ergebnis = graph.search("P", breitensuche);

		
		ArrayList<Node<String>> suche_list = breitensuche.getPath();
		String suche_ausgabe = "[";
		for(Node<String> s : suche_list){
			suche_ausgabe += s.getName() + ",";
		}
		suche_ausgabe += "]";
		System.out.println("Tiefensuche: " + suche_ausgabe);
		
		if(suche_ergebnis != null)
		System.out.println("Ergebnis: " + suche_ergebnis.getName());
		
		assertEquals("[A,B,C,D,E,F,G,L,M,O,P,H,I,J,K,N,]", suche_ausgabe);
	}
	
	@Test
	public void testCopyInto(){
		Node<String> a = new Node<String>("A", "A");
		Node<String> b = new Node<String>("B", "B");
		Node<String> c = new Node<String>("C", "C");
		
		Graph<String> graph = new Graph<>(a);
		
		a.addChild(b);
		a.addChild(c);
		b.addChild(a);

		
		List<String> list = new ListImpl<String>();
		graph.copyInto(list);
		
		assertEquals(true, list.contains(a.getValue()));
		assertEquals(true, list.contains(b.getValue()));
		assertEquals(true, list.contains(c.getValue()));

		
	}

}
