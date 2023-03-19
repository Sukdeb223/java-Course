public class Day4Con {
      public static void main(String[] args) {

            // if (age > 19) {
            // System.out.println("You can register");
            // } else if (age == 19) {
            // System.out.println("Your age is 18");
            // } else {
            // System.out.println("You can`t register");
            // }
            int age = 12;
            ++age;// 13
            --age;// 12
            if (age >= 18) {
                  if (age >= 25) {
                        System.out.println("You can vote");
                  } else if (age == 25) {
                        System.out.println("You age now :25");
                  } else if (age >= 35) {
                        System.out.println("you are now above: 30");
                  } else {
                        System.out.println("You can`t vote");
                  }
            } else if (age >= 12) {
                  System.out.println("Your age is : 12");
            } else {
                  System.out.println("Outsite of if block else");
            }
      }
}
