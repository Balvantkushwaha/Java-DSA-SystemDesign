package API;

 enum week{
    MON, TUE , WEB, THU ,FRI , SAT, SUN ;
 }
public class Enum1 {
    enum Result {
        PASS, FAIL ,SUBLI
    }
    public static void main(String[] args) {
         week w = week.MON;
         System.out.println(w);
         System.out.println(Result.FAIL);

         int index  = week.MON.ordinal();
         System.out.println(index);

         System.out.println("==========");

         week[] wr = week.values();
         for(week w1:wr){
            System.out.println(w1+":"+w1.ordinal());
         }
    }
}
