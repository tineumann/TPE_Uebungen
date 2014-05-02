public interface Wesen {
	public double getSpezialattribut();
	public int getSchaden();
	public int getRuestung();
	public int getLebenspunkte();
	public void setLebenspunkte(int lebenspunkte);
	public boolean isLebendig();	
	public void attack(Squad s);
}
