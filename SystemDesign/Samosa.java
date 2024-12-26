public class Samosa {
    private static Samosa samosaObj = new Samosa();
    // Eager way of creating Sigletor object
    public static Samosa getSamosa(){
        return samosaObj;
    }
}
