public class Test {
  
  public static void main(String[] args) {
    Student payel=new Student("Payal",3,18);
    Student Rahul=new Student("Rahul",2,23,"0987876545");
    Student Priyanka=new Student("Priyanka",3,56,"2345679876","BCA","C");

   System.out.println(payel.toString());
   System.out.println(Rahul.toString());
   System.out.println(Priyanka.toString());
    
   payel.displayUserdata();

  int a=10,b=5;
    System.out.println(a<b);
  }
}
