
public class String2 {

      public static void main(String[] args) {
            String s1 = "pw";
            String s2 = "pw";
            System.out.println(s1 == s2); // true
            String s3 = new String("pw skills");
            String s4 = new String("pw skills");
            System.out.println(s3 == s4); // false

      }
}
