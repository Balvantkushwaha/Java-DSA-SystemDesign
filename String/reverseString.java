package String;
public class reverseString {

    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("HelloWorld");
        for (int i = 0; i < str.length() / 2; i++) {
            int fornt = i;
            int back = str.length() - 1 - i;
            char forntChar = str.charAt(fornt);
            char backChar = str.charAt(back);
            str.setCharAt(fornt, backChar);
            str.setCharAt(back, forntChar);
        }
        System.out.println(str); // dlrWolleH

    }
}
