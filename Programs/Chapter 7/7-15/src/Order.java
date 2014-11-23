
public class Order {
	
	public static double getOrderTotal(int bp, int nb){
		
		double bpPrice = 18.95;
		double nbPrice = 21.95;
		double apPrice = 37.95; 	//if both of the books are chosen the apzone.com price
		double threePrice = 15.95;  //if any combo of 3 or more books are boughten
		double twelvePrice = 14;	//if 12 or more books are boughten
		
		if (bp == 1 && nb ==0){
			return bpPrice;
		}
		
		else if (nb == 1 && bp == 1){
			return  apPrice;
		}
		
		else if (nb == 1 && bp ==0){
			return nbPrice;
		}
		
		else if (nb == 2 && bp == 0){
			return (nbPrice * 2);
		}
		
		else if (nb == 0 && bp == 2){
			return (bpPrice * 2);
		}
		
		else if ((nb + bp) >= 3 && (nb + bp) < 12){
			return (threePrice * (nb + bp));
		}
		
		else if ((nb + bp) >= 12){
			return (twelvePrice * (nb + bp));
		}
		
		else 
			return 0;
		
	}
}
