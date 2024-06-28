//Method overloading



class Demo
{
 void sum(int a,int b)
{
  System.out.println(a+b);
 }

 void sum(int a, int b, int c)
{
  System.out.println(a+b+c);
 }

void sum(String a, String b)
{
  System.out.println(a+b);
 }
}

class Overloading
 {
   public static void main(String []args)
{
 Demo d1=new Demo();
 d1.sum(5,7);
 d1.sum(4,8,9);
 d1.sum("sakshi","bendre");
  }
}