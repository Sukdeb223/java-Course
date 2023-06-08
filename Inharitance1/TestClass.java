package Inharitance1;

class Student{
       
      String name;

      public Student(String name) {
            System.out.println("Student Class::???>>>");
            this.name = name;
      }

}
class Doctor extends Student{
 
      int Id;

      public Doctor(String name, int id) {
            super(name);
            Id = id;
            System.out.println("This is class Doctor:::??>>>");
      }
}
class Engineer extends Student{
       
      public Engineer(String name, int id) {
            super(name);
            this.id = id;
            System.out.println("This is Engineer Class:::??>>>");
      }

      int id;
}

public class TestClass {
       
      public static void main(String[] args) {
            
      //     Doctor obj=new Doctor("payal", 1);
      //     System.out.println("Doctor id"+obj.Id+"Doctor Name"+obj.name);

          Engineer obj1=new Engineer("Sandip", 2);
          System.out.println("Engineer Name>>"+obj1.name+"Engineer Id"+obj1.id);
          
      }
}
