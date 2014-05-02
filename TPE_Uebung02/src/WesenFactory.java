
public class WesenFactory {

	public static Kaempfer createWesen(Rasse rasse){
		switch(rasse){
		case MENSCH: return createMensch();
		case ORK: return createOrk();
		case NACHTELF: return createNachtelf();
		case UNTOTER: return createUntoter();
		default: return null;
		}
		
	}

	private static Kaempfer createOrk(){
		return null;
	}
	
	private static Kaempfer createMensch(){
		return null;
	}
	
	private static Kaempfer createNachtelf(){
		return null;
	}
	
	private static Kaempfer createUntoter(){
		return null;
	}
}
