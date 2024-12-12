package PwskillJava.String;
public class String3 {
  public static void main(String[] args) {
    String s1 = "pw java";
    String s2 = "pw java";
    String s3 = " pw JAVA";
    System.out.println(s1 == s2); // ture
    System.out.println(s1 == s3); // false
    System.out.println(s1.equals(s2)); // ture
    System.out.println(s1.equals(s3)); // false

    // String s1 = "Pw skill";
    // String s2 = new String("Pw skill");
    // String s3 = new String("pw skill");
    // System.out.println(s1 == s2); // false
    // System.out.println(s1 == s3); // false
    // System.out.println(s2 == s3); // false
    // System.out.println(s1.equalsIgnoreCase(s2)); // true

  }
}