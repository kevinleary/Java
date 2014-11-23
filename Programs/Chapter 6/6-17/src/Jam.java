
public class Jam {
	
	private double j;
	private double totc;
	
	public Jam(double jars){
		j = jars;		//jars of slam jam
	}
	
	public double computeShippingCost(){
		
		double nCartons = (j + 9) / 10;		//price per carton is 1.44
		
		double totOz = (j * 5) + (nCartons * 9);
		
		double totLb = (totOz / 16) + j;			//per lb is 0.96
		
		totc = (nCartons * 1.44)  + (totLb * 0.96) + 3;

		//System.out.println(j + " " +totOz);	
		
		return totc;
	}

}
