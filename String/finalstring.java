package PwskillJava.String;
public class finalstring {
    public static void main(String[] args) {
        // final int a=10;
        // a=20;
        // System.out.println(a);
        String S = new String("virat");
        S.concat("kohli");
        System.out.println(S);

        final StringBuffer sb = new StringBuffer("virat");
        sb.append(" kohli");
        System.out.println(sb);
        //sb=new StringBuffer("sachin");

    }
}
