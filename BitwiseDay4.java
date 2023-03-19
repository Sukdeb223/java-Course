public class BitwiseDay4 {
     public static void main(String[] args) {
        
      int a=25;//1 1 0 0 1                          0 0 = 0
      int b=15;// 0 1 1 1 1                          1  1 =1 
                                                                                                           
      int c=a | b;//1 1 1 1 1 // 31
      System.out.println(c);

      // int num=8;// 1 0 0 0 
      // int result=num << 2; // 1 0 0 0 0 0 // 32
      // System.out.println(result); 
      
      int num=8;// 1 0 0 0
      int result=num >> 2; // 1 0// 2 
      System.out.println(result); 
     } 
}
