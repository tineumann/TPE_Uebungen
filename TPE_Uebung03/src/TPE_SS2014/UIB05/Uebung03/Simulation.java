package TPE_SS2014.UIB05.Uebung03;

import java.util.ArrayList;

public class Simulation {

	public static void main(String[] args) {
		
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
		Breitensuche<String> breitensuche = new Breitensuche<>();
		
		Node<String> tiefensuche_ergebnis = graph.search("P", tiefensuche);
		Node<String> breitensuche_ergebnis = graph.search("N", breitensuche);
		
		ArrayList<Node<String>> tiefensuche_list = tiefensuche.getPath();
		String tiefensuche_ausgabe = "[";
		for(Node<String> s : tiefensuche_list){
			tiefensuche_ausgabe += s.getName() + ",";
		}
		tiefensuche_ausgabe += "]";
		System.out.println("Tiefensuche: " + tiefensuche_ausgabe);
		
		if(tiefensuche_ergebnis != null)
		System.out.println("Ergebnis: " + tiefensuche_ergebnis.getName());
		
		ArrayList<Node<String>> breitensuche_list = breitensuche.getPath();
		String breitensuche_ausgabe = "[";
		for(Node<String> s : breitensuche_list){
			breitensuche_ausgabe += s.getName() + ",";
		}
		breitensuche_ausgabe += "]";
		System.out.println("Breitensuche: " + breitensuche_ausgabe);
		
		if(breitensuche_ergebnis != null)
		System.out.println("Ergebnis: " + breitensuche_ergebnis.getName());
	}

}
