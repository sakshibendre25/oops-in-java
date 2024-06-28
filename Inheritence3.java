
//Hierachical inheritence

class A
{
 public void print()
{
 System.out.println(x:"class A method");
  }
}


class B extends A
{
 public void printB()
{
 System.out.println(x:"class B method");
  }
}

class C extends A
{
 public void printC()
{
 System.out.println(x:"class C method");
  }
}

public class Inheritence3
{
 public static void main(String []args)
{
 B b1=new B();
 C c1=new C();
 b1.print();
 c1.print();
 }
}



