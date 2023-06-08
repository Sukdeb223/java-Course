package Inharitance1;

class Teacher {
   public void display() {
      System.out.println("Hello sir");
   }
}

class Student extends Teacher {
   public void area() {
      System.out.println("Hello student");
   }
}

public class Ram {
   public static void main(String[] args) {
      Student r = new Student();
      r.display();
      r.area();
   }
}
