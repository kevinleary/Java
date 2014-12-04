/*

Kevin Leary
Period 2
Date: 12/1/14
Chapter: 9
Excercise: 6

*/

public class TestFractions
{
  public static void testConstructors()
  {
    Fraction f1 = new Fraction();
    Fraction f2 = new Fraction(7);
    Fraction f3 = new Fraction(12, -20);
    Fraction f4 = new Fraction(f3);

    System.out.println("f1 = " + f1);
    System.out.println("f2 = " + f2);
    System.out.println("f3 = " + f3);
    System.out.println("f4 = " + f4);
    System.out.println();
  }

  public static void testArithmetic()
  {
    Fraction f1 = new Fraction(1, 2);
    Fraction f2 = new Fraction(1, 3);

    Fraction sum = f1.add(f2);
    System.out.println(f1 + " + " + f2 + " = " + sum);

    Fraction product = f1.multiply(f2);
    System.out.println(f1 + " * " + f2 + " = " + product);
    //new instances 
    Fraction diff = f1.sub(f2);
    System.out.println(f1 + " - " + f2 + " = " + diff);
    
    Fraction quotient = f1.divide(f2);
    System.out.println(f1 + " / " + f2 + " = " + quotient);
    
    //add um here 
    System.out.println();
  }

  public static void testValues()
  {
    Fraction f = new Fraction(2, 3);
    System.out.println(f + " = " + f.getValue());
    System.out.println();
  }

  public static void main(String[] args)
  {
    testConstructors();
    testArithmetic();
    testValues();
  }
}
