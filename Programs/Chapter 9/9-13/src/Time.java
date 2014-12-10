
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
		if (hours == 0)
			return mins;
		
		else 
			return (hours * 60) + mins;
		
	}
	
	public boolean lessThan(Time t){
		if (this.toMins() <= t.toMins())
			return true;
		
		else
			return false;
	}
	
	public int elapsedSince(Time t){
			
		int etime = this.toMins() - t.toMins();
		
		return etime;
	}
	
	@Override
	public String toString(){
		
		return "" + elapsedSince(null);		//doesnt give me errors in the program but does give me a null pointer exception
											// im almost positive because of null being passed to elapsed since
											// i dont really understand how else to get it to work
	}
	
}
