import java.util.Scanner;

public class UserInput {
      public static void main(String[] args) {
      Scanner input=new Scanner(System.in);   
      Scanner input1=new Scanner(System.in);   
      System.out.println("Enter any Number:");   

      //for int Data Type...
      int num=input.nextInt();//taking user input using nextint function...
      System.out.println("int :"+num);   

      //float 
      System.out.println("Enter Any Float Value");
      float num1=input.nextFloat();
      System.out.println("Float"+num1); 

      //double
      System.out.println("Enter Any Double Value");
      double num2=input.nextDouble();
      System.out.println("double"+num2);  

      // char
      System.out.println("Enter any Character");
      char c =input.next().charAt(0);
      System.out.println("char :"+c);             

      //String
      System.out.println("Enter Any String Value");
      String name=input1.nextLine();
      System.out.println("String "+ name);

      
      }
}
