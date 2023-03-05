import java.util.Scanner;

public class AriOpe {
      public static void main(String[] args) {

            int num1,num2;
            Scanner input=new Scanner(System.in);

            System.out.println("Enter Two number");
            num1=input.nextInt();

            num2=input.nextInt();
            int res=num1%num2;

            System.out.println(res);
      }
}
