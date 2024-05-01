package EncapsulationConstructorAndStaticKeyword.constructor;

class student {
   private String name;
   private int age;

   student(String name, int age)

   {
      this.name = name;
      this.age = age;

   }

   public String getName() {
      return name;
   }

   public int getAge() {
      return age;
   }

}

public class Launch1 {
   public static void main(String[] args) {
      student st = new student("balvnt", 19);
      System.out.println(st);
   }

}
