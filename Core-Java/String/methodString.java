package String;

public class methodString {
    public static void main(String[] args) {
        // 1. public int charAt( int index)
        String sc = "sachin";
        System.out.print(sc.charAt(0));// s
        // System.out.print(sc.charAt(-1));// StringArrayIndexOutOfBoundsException
        // System.out.print(sc.charAt(10));// StringArrayIndexOutOfBoundsException

        // 2 . public String concat(String str)
        String s = "sachin";
        System.out.println(s.concat("tendulkar")); // ssvhinyrnfulkar
        s += "IND"; // sachinIND
        System.out.println(s);

        // 3 .public String substrig(int beginInndex )
        String str = "iNeuron";
        System.out.println(str.substring(2)); // output euron
        // searching from 2 to end of the string

        // 4. public String substring(int beginIndex , int endIndex)
        String s1 = "INeuron";
        System.out.println(s1.substring(2, 6));// output euro
        // searching from 2 to 5 will happen

        // 5. public int length()
        String s2 = "INeuron";
        System.out.println(s2.length());// 7
        // System.out.print(s.length);//Compile time error

        // 6 . public String replace(String oldChar , String newChar)
        String s3 = "ababab";
        System.out.println(s3.replace('a', 'b')); // bbbbbb

        // 7. public int indexOf(char ch)
        String s4 = "sachinramesh";
        System.out.println(s4.indexOf('i'));// 4
        System.out.println(s4.indexOf('z'));// -1
        // 8. public int lastIndexOf(char ch)
        String s5 = "sachinramesh";
        System.out.println(s5.lastIndexOf('a'));// 7
        System.out.println(s5.lastIndexOf('z'));// -1

        // 9. public String toLowerCase()
        // 10. public String toUpperCase()
        // 11. public String trim()
        String s6 = "Balvant";
        System.out.println(s6.toLowerCase());
        System.out.println(s6.toUpperCase());
        System.out.println(s6.trim());

        String s7 = "sachin";
        String s8 = s7.toUpperCase();
        String s9 = s7.toLowerCase();
        System.out.println(s7 == s8);// false
        System.out.println(s7 == s9);// true

        String s10 = new String("sachin");
        String s11 = s10.toString();
        System.out.println(s11);

    }
}