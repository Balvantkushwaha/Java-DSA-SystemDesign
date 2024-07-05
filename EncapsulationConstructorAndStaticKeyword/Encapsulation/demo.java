package Encapsulation;

class student {
   private int age;
   private String name;

   public void setData() {
      age = 18;
      name = "balvant";
   }

   public void show() {
      System.out.println(name + " " + age);
   }
}

public class demo {
   public static void main(String[] args) {
      student obj = new student();
      obj.setData();
      // obj.age =19;
      // obj.name = "Balvant";
      obj.show();
   }
}
