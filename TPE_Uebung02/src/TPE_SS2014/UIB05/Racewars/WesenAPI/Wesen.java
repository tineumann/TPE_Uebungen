package TPE_SS2014.UIB05.Racewars.WesenAPI;

public interface Wesen{
	
	public boolean isLebendig();
	
	@Override
	public String toString();
	
	public double getLebenspunkte();
	
	public void setLebenspunkte(double lebenspunkte);
	
}
