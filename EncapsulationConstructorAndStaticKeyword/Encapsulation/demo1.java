package Encapsulation;

class student1{
      private  int age;
       private String name;
     
      public void setData1(int age){
       this. age= age;
    
     }
     public void setData2(String name ){
        this.name=name;
     }
     public void show()
  {
     System.out.println(name + " " + age);
  }    
}
 public class  demo1 {
     public static void main ( String[] args){
         student1 obj= new student1 ();
         student1 obj1= new student1  ();
         obj.setData1(18);
         obj1.setData1( 19);
         obj.setData2("balvant");
         obj1.setData2("ramkishan");
      //  obj.age =20;
      //  obj.name = "Balvantkushwaha";
        obj.show();
        obj1.show();
     }
 }
