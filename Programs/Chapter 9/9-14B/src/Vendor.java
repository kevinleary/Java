/*
   This class implements a vendor that sells one kind of items.
   A vendor carries out sales transactions.
*/

public class Vendor
{
  
	private int iprice, inum, depamt;

  //  Constructor
  //  Parameters:
  //    int price of a single item in cents
  //    int number of items to place in stock
	
	public Vendor(int price, int fullStock) {
		iprice = price;
		inum = fullStock;
	}

  //  Sets the quantity of items in stock.
  //  Parameters:
  //    int number of items to place in stock
  //  Return:
  //    None
	public void setStock(int fullStock) {
		
		this.setStock(fullStock);
	}

  //  Returns the number of items currently in stock.
  //  Parameters:
  //    None
  //  Return:
  //    int number of items currently in stock
	public int getStock() {
		
		return inum;
	}

  //  Adds a specified amount (in cents) to the deposited amount.
  //  Parameters:
  //    int number of cents to add to the deposit
  //  Return:
  //    None
	public void addMoney(int i) {
		
		depamt = i + depamt;
		
	}

  //  Returns the currently deposited amount (in cents).
  //  Parameters:
  //    None
  //  Return:
  //    int number of cents in the current deposit
	public String getDeposit() {
		
		return String.valueOf(depamt);
	}

  //  Implements a sale.  If there are items in stock and
  //  the deposited amount is greater than or equal to
  //  the single item price, then adjusts the stock
  //  and calculates and sets change and returns true;
  //  otherwise refunds the whole deposit (moves it into change)
  //  and returns false.
  //  Parameters:
  //    None
  //  Return:
  //    boolean successful sale (true) or failure (false)
	public boolean makeSale() {
		
		if (inum > 0 && depamt >= iprice){
			inum--;
			depamt = depamt - iprice;
		}
		else {
			
			iprice = depamt;
			depamt = iprice;
			return false;
		}
		return false;
		
	}

  //  Returns and zeroes out the amount of change (from the last
  //  sale or refund).
  //  Parameters:
  //    None
  //  Return:
  //    int number of cents in the current change
	public int getChange() {
		
		
		return depamt;
	}

}
