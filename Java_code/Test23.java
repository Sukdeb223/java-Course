public class Test23 {
      
      public static void main(String[] args) {
            
            Std ram=new Std();
            ram.user_address.pincode="721151";
            ram.user_address.street2="Kolaghat";
            System.out.println(ram.toString());

            Std sam=new Std();

            sam.user_address.pincode="721151";
            sam.user_address.street2="Kolkata";
            System.out.println();
            System.out.println(sam.toString());
      }
}
