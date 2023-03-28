import java.util.Scanner;

public class SwitchJava {
      public static void main(String args[]) {
            System.out.println("Enter Any number within 3");
            Scanner input = new Scanner(System.in);
            int ch = input.nextInt();
            switch (ch) {
                  case 1:
                        System.out.println(" this is Case 1");
                        break;
                  case 2:
                        System.out.println("this is Case 2");
                        break;
                  case 3:
                        System.out.println("This is Case 3");
                        break;

                  default:
                        System.out.println("Invalid choice!!!!");
                        break;
            }
      }
}
