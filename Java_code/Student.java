public class Student {

      String name;
      int id;
      int age;
      String phone;
      String clsss;
      String sec;

       static int abc;
      public Student(String name, int id, int age, String phone, String clsss, String sec) {
            this.name = name;
            this.id = id;
            this.age = age;
            this.phone = phone;
            this.clsss = clsss;
            this.sec = sec;
      }

      public Student(String name, int id, int age) {
            this.name = name;
            this.id = id;
            this.age = age;
      }
      
      public Student(String name, int id, int age, String phone) {
            this.name = name;
            this.id = id;
            this.age = age;
            this.phone = phone;
      }
      public void displayUserdata() {
            System.out.println(name +":-"+"Age"+" "+age);
      }


      @Override
      public String toString() {
            return "Student [name=" + name + ", id=" + id + ", age=" + age + ", phone=" + phone + ", clsss=" + clsss
                        + ", sec=" + sec + "]";
      }

 
}
