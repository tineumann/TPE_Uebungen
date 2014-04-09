package tpe.uib._05;

/**
 * Gibt 3 verschiedene Annuitätendarlehen aus. Die Klassen Darlehen und 
 * Festkommazahl werden benötigt.
 * 
 * @author Timo Neumann, 1312143
 * @author Constantin Schneider, 13152720
 */
public class DarlehenPrinter {
	public static void main(String[] args) {
		Festkommazahl[][] darlehen1 = new Darlehen(new Festkommazahl(200000, 0, 2), 
											3.5d, 1.5d).jahresDaten(10);
		
		Festkommazahl[][] darlehen2 = new Darlehen(new Festkommazahl(100000, 0, 2), 
				5.5d, 3.0d).jahresDaten(10);
		
		Festkommazahl[][] darlehen3 = new Darlehen(new Festkommazahl(300000, 0, 2), 
				6d, 2.5d).jahresDaten(10);
		
		
		for(int i = 0; i < darlehen1.length; i++){
			System.out.println(darlehen1[i][0].toString() + " " 
		+ darlehen1[i][1].toString() + " " + darlehen1[i][2].toString());
		}
		
		System.out.println();
		
		for(int i = 0; i < darlehen2.length; i++){
			System.out.println(darlehen2[i][0].toString() + " " 
		+ darlehen2[i][1].toString() + " " + darlehen2[i][2].toString());
		}
		
		System.out.println();
		
		for(int i = 0; i < darlehen3.length; i++){
			System.out.println(darlehen3[i][0].toString() + " " 
		+ darlehen3[i][1].toString() + " " + darlehen3[i][2].toString());
		}
	}
}
