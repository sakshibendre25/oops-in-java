//Single inheritence

class Employee
{
   void salary()
{
  System.out.println(x:"Salary = 70000");
  }
}

class Hr  extends Employee
{
  void bonus()
{
    System.out.println(x: "Bonus = 20000");
    }
}

class Ineritence1
{
    public static void main(String []args)
{
 Hr h1 = new Hr();
 h1.salary();
 System.out.println();
 h1.bonus();
  }
}