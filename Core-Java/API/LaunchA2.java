package API;
import java.lang.annotation.*;
@Target({ElementType.TYPE, ElementType.METHOD,ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@interface CricketPlayer{
          String country() default "India";
          int age() default 34;
    }
    @CricketPlayer()
    class Virat {
        @CricketPlayer()
        private int innings;
        private int runs;
    
       
        @CricketPlayer()
        public int getInnings(){
            return innings;
        }
        public int getRuns(){
            return runs;
        }
        public void setInnigns(int innings){
            this.innings = innings;
        }
        public void setRuns(int runs){
            this.runs = runs;
        }
    }
 public class LaunchA2 {
       public static void main(String[] args) {
       Virat v = new Virat();
       v.setInnigns(300);
       v.setRuns(2000);
       
       System.out.println(v.getInnings()+"\n"+v.getRuns());

       Class c = v.getClass();
       Annotation a =c.getAnnotation(CricketPlayer.class);
       CricketPlayer cp = (CricketPlayer)a;
       System.out.println(cp);

       String country = cp.country();
       int age =cp.age();
       System.out.println(country+"\n"+age);

   }
}

