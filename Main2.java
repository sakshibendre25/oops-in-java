
//Abstraction


abstract class Car
{
abstract public void fueltype();
 public void color()
{
  System.out.println("Black Color");
  }
}

class tata extends Car 
{
   public void fueltype()
{
   System.out.println("Diesel");
  }
}


public class Main2 
{
  public static void main(String []args)
{
  tata t1 = new tata();
   t1.fueltype();
   t1.color();
  }
}