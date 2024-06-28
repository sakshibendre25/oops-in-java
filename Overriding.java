//Method overriding


class Bank
{
 void RateOfInterest()
  {
   System.out.println("rate of interest of bank is 5%");
  }
}

class SBI extends Bank
{
 void RateOfInterest()
{
  System.out.println("rate of interest of SBI is 6%");
 }
}


class BOI extends Bank 
{
 void RateOfInterest()
{
 System.out.println("rate of interest of SBI is 5.5%");
 }
}


class Overriding
{
 public static void main(String []args)
{
  Bank b1=new Bank();
  BOI bo1=new BOI();
  SBI s1=new SBI ();
  b1.RateOfInterest();
  bo1.RateOfInterest();
  s1.RateOfInterest();
 }
}
 