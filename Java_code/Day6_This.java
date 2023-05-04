public class Day6_This {
      int num=23;
      public void fun() {
            int num=10;
            System.out.println(this.num);
      }
      public void fun2() {
            this.fun();
      }
      Day6_This(int num){
            this.num=num;
      }
      public static void main(String[] args) {
            Day6_This obj=new Day6_This(45);

            obj.fun2();
      }
}
