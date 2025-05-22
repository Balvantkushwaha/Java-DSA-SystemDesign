package API;

class Plane{
    public void planeFliesAtGoodHeight(){
        System.out.println("Plane is flying");
    }
}
class CargoPlane extends Plane{
  @Override // Annotation 
    public void planeFliesAtGoodHeight(){
           System.out.println("Cargoplang is low height ");
    }
}
public class LaunchAn {
    public static void main(String[] args) {
          Plane cp = new CargoPlane();
         cp.planeFliesAtGoodHeight();
    }
  
}
