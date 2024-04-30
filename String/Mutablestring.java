
public class Mutablestring {
  /**
   * @param args
   */
  public static void main(String[] args) {
    StringBuffer sb = new StringBuffer();
    System.out.println(sb.capacity());
    sb.append("abcdefghijklmnop");
    System.out.println(sb.capacity());
    System.out.println(sb.length());
    sb.append("n");
    System.out.println(sb.capacity());
    System.out.println(sb.length());

    StringBuffer sb2 = new StringBuffer("sachin");
    System.out.println(sb2);
    System.out.println(sb2.capacity());
    System.out.println(sb2.charAt(1));
    /// System.out.println(sb2.setCharAt(1, "A"));

    StringBuilder sb3 = new StringBuilder(150);
    System.out.println(sb3.capacity());
    sb3.append("java");
    System.out.println(sb3);
    sb3.trimToSize();
    System.out.println(sb3.capacity());

    StringBuilder sb4 = new StringBuilder("pw java");
    System.out.println(sb4);
    System.out.println(sb4.reverse());
  }

}
