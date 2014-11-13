import java.lang.Math.*;

public class Departed {

	private int ch, cm, dh, dm;
	
	public Departed( int curHour, int curMin, int depHour, int depMin){
		ch = curHour;
		cm = curMin;
		dh = depHour;
		dm = depMin;
	}
	public void calculateDepTime(){
		
		
		if (dm == 0) {
			dh--;
			dm+=60;
		}
		int totH = (dh - ch);

		int totM = (cm - dm); 
		
		if (totM < 0)
			totM = Math.abs(totM);
		
		System.out.println("The time till your departure is " + totH + ": " + totM);
	}
}
