public class Jalebi{
    private static Jalebi jalebiObj ;
    // constructor used to create object
     private Jalebi(){
        // constructor 
     }
     // lazy way of crating singeton object 
     public static Jalebi getJalebi(){

        synchronized(Jalebi.class){
           if(jalebiObj == null){
                 jalebiObj = new Jalebi();
             }
        }
        
        
        return jalebiObj;
     }

}