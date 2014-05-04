
public class Squad{
	private Kaempfer[] kaempfer;
	public Kaempfer[] getKaempfer() {
		return kaempfer;
	}

	public void setKaempfer(Kaempfer[] kaempfer) {
		this.kaempfer = kaempfer;
	}

	public String getName() {
		return name;
	}

	private String name;
	
	public Squad(String name, Kaempfer[] kaempfer){
		this.kaempfer = kaempfer;
		this.name = name;
	}
}
