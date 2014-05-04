import static org.junit.Assert.assertTrue;


public class test {

	public static void main(String[] args) {
		Mensch m3 = new Mensch();
		Untoter u1 = new Untoter();
		u1.attack(m3);
		System.out.println(m3.getLebenspunkte());
		

	}

}
