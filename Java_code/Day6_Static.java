public class Day6_Static{
      
      String fName;
      String lname;
      int age;
      String sec;
     static String schoolName="XYZ HIGH SCHOOL";
@Override
public String toString() {
      return "Day6_Static [fName=" + fName + ", lname=" + lname + ", age=" + age + ", sec=" + sec + "]";
      
}
public static void displaySchoolname() {
      System.out.println(schoolName);
}
public Day6_Static(String fName, String lname, int age, String sec) {
      this.fName = fName;
      this.lname = lname;
      this.age = age;
      this.sec = sec;
}

public static void main(String[] args) {
      
        Day6_Static obj=new Day6_Static("ram", "das", 12, "A");
        System.out.println(obj.toString()); 
        System.out.println(Day6_Static.schoolName);
     }

   
}