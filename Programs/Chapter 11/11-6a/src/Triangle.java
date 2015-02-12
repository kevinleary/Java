/*

Kevin Leary
Period 2
Date: 2/10/14
Chapter: 11
Excercise: 6a

*/


public abstract class Triangle
{
  
  private double side;

  public Triangle(double a)
  {
    
    setSide(a);
  }

  public abstract double getPerimeter();	//abstract method stub


  public abstract double getArea();		//abstract method stub

  
  public double getRatio()
  {
    return getArea()/getPerimeter();
  }

public double getSide() {		//made a getter and a setter to obtain the value from side
	return side;
}

public void setSide(double side) {
	this.side = side;
}
  

}  
