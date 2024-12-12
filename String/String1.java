package String;
public class String1 {
     public static void main(String[] args) {
          String Brand = "Pw skills ";
          System.out.println(Brand);
          // Brand.concat("my india ");
          // System.out.println(Brand);
          StringBuilder brand = new StringBuilder("pw skills");
          System.out.println(brand);
          brand.append(" I Love my INDIA");
          System.out.println(brand); /// out put pw skills I Love my INDIA

          String no = new String("Youtag");
          System.out.println(no);
          no.concat(" bussiness");
          System.out.println(no); // output only Youtag
     }

}
