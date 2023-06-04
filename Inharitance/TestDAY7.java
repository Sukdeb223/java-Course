class Person{
    String name;
    int age;
    long phone;

    public void name() {
      System.out.println("This is class Person");
    }
}

class Student extends Person{
    
      int roll;

      @Override
      public void name() {
            super.name();
            System.out.println("This is class Student");
      }
   
}
class Engineer extends Student{
      
      int salary;
      int EMPCODE;
      @Override
      public void name() {
            super.name();
            System.out.println("This is Class engineer");
      }
}
public class TestDAY7 {
      public static void main(String[] args) {
            
            Engineer obj=new Engineer();

            obj.name="Payal";
            obj.roll=1;
            obj.EMPCODE=131;
            obj.name();
            System.out.println(obj.name);
            System.out.println(obj.roll);
            System.out.println(obj.EMPCODE);
    
      }
     

}
