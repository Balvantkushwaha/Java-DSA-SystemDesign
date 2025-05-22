package Encapsulation;


class student4 {
    private String name;
    private int id;
    private String Address;

    // student(String name,int id , String Address){

    // }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    

    public void setAddress(String address) {
        Address = address;
    }
    public String getAddress() {
        return Address;
    }

    public void show() {
        System.out.println(name +" " + id+ " "+Address);
        // System.out.println("id:" + id);
        // System.out.println("Address :" + Address);
    }
}

public class demo4 {
    public static void main(String[] args) {

        student4 obj1 = new student4();
    
        obj1.setName("balvant kushwaha");
        obj1.setId(132);
        obj1.setAddress("chhatarpur");

        String studentname = obj1.getName();
        System.out.println(studentname);

        int studentid = obj1.getId();
        System.out.println(studentid);

        String studentaddress = obj1.getAddress();
        System.out.println(studentaddress);
        
      
    }

}
