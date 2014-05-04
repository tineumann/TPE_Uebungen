package TPE_SS2014.UIB05.Racewars;

import static org.junit.Assert.assertEquals;
import TPE_SS2014.UIB05.Racewars.*;
import TPE_SS2014.UIB05.Racewars.WesenImpl.Mensch;
import TPE_SS2014.UIB05.Racewars.WesenImpl.Nachtelf;

public class main_test {

	public static void main(String[] args) {
		Mensch m1 = new Mensch();
		Nachtelf n1 = new Nachtelf();
		m1.attack(n1);
		System.out.println(m1.getDamage(n1));
		System.out.println(n1.getLebenspunkte());
		System.out.println(n1.isLebendig());
	}
	
	

}
