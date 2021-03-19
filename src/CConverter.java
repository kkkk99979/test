
public class CConverter {
	
	   public static double rate;
	    
	    public static void setRate(double r){
	       rate = r;
	    }
	    
	    public static double toDoller(double won){
	        return won / rate;
	    }

	    public static double toKRW(double dollar){
	    	return dollar * rate;
	    }
	    
}
