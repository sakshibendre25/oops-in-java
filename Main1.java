//Encapsulation


class Student
{

private String name;
private int age;
private int roll_no;

public String getName(){
 return name;
}

public int getAge(){
   return age;
}

public int getRoll_no(){
  return roll_no;
}

public void setName(String name){
  this.name=name;
}

public void setAge(int age){
    this.age=age;
}

public void setRoll_no(int roll_no){
    this.roll_no = roll_no;
}

}




public class Main1 {
       public static void main(String []args)
{
       Student s1=new Student();
        s1.setName("Sakshi");
        s1.setAge(21);
        s1.setRoll_no(1);
        System.out.println(s1.getName());
        System.out.println(s1.getAge());
        System.out.println(s1.getRoll_no());


        s1.setName("Prerna");
        s1.setAge(22);
        s1.setRoll_no(2);
        System.out.println(s1.getName());
        System.out.println(s1.getAge());
        System.out.println(s1.getRoll_no());


        s1.setName("Shubham");
        s1.setAge(23);
        s1.setRoll_no(3);
        System.out.println(s1.getName());
        System.out.println(s1.getAge());
        System.out.println(s1.getRoll_no());
        
   }
}

