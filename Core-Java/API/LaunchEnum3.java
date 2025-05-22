package API;

enum Result1{
    PASS, FAIL,NR;
}
public class LaunchEnum3 {
    public static void main(String[] args) {
        Result1 res = Result1.PASS;
        switch(res){
          case PASS: System.out.println("passed!");
          break;
          case FAIL: System.out.println("fail!");
          break;
          case NR: System.out.println("nr!");
        }
    }
}
