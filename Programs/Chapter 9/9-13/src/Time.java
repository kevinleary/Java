
public class Time {
	
	private int hours, mins;
	public Time(int h, int m){
		if (h >= 24)
			throw new IllegalArgumentException("Hours is greater than or is 24");
		hours = h;
		
		if (m >= 60)
			throw new IllegalArgumentException("Minutes is greater than or is 60");
		mins = m;
	}
	
	private int toMins(){
		
	}
	
	public boolean lessThan(Time t){
		
	}
	
	public elapsedSince(Time t){
		
	}
	
	public toString(){
		
	}
	
}
