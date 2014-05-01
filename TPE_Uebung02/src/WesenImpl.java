public class WesenImpl implements Wesen {
	
	 public boolean isLebendig(){
		 if(this.lebenspunkte > 0)
			 return true;
		 else
			 return false;
		 }
	 
}
