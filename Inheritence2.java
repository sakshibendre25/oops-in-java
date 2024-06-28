
//Multilevel inheritence

class A
{
  void methodA()
{
  System.out.println(x: "Method of A class");
 }
}


class B extends A
  void methodB()
{
 System.out.println(x: "Method of B class");
  }
}


class C extends B
{
void methodC()
{
  System.out.println(x: "Method of  C class");
  }
}


public class Inheritence2
{
  public static void main(String []args)
{
  C c1= new C();
  c1.methodC();
  c1.methodB();
  c1.method A();
  }
}

