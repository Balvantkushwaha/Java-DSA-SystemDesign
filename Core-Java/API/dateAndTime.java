package API;


public class dateAndTime {
    public static void main(String[] args) {
         java.util.Date dt = new  java.util.Date();
         System.out.println(dt); // curent time 
         long timeInMs = dt.getTime(); // current date 
         java.sql.Date dt1 = new java.sql.Date(timeInMs);
         System.out.println(dt1);

    }    
}
