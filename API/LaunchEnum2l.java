package API;
enum Result {
    PASS,   // public static final Result pass = new Result();
    FAIL,   // public static final Result FAIL = new Result();
    NR;    // public static final Result NR = new Result(); 
    int marks;
    Result(){
        System.out.println("constructor in enum()");

    }
    public void setMarks(int marks){
        this.marks=marks;
    }
    public int getMarks(){
        return marks;
    }
}
public class LaunchEnum2l {
    public static void main(String[] args) {
         Result.PASS.setMarks(50);
         int m1 = Result.PASS.getMarks();
         System.out.println(m1);

         int m2 = Result.PASS.getMarks();
         System.out.println(m2);
    }
}
