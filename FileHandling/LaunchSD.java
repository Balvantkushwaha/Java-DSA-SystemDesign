package FileHandling;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.Serializable;
import java.io.*;
class Cricketer implements Serializable
{
    private String name ;
    transient private int age;
    private int runs;


public Cricketer(String name , int age ,int runs){
    this.name = name;
    this.age = age;
    this.runs = runs;
  }

public String toString(){
    return " "+name +" "+age+" "+runs;
 }
}
public class LaunchSD {

    public static void main(String[] args) throws Exception {

        // Cricketer c = new Cricketer("Balvant kushwaha", 21, 300);
        // System.out.println(c);
        // FileOutputStream fos = new FileOutputStream("pw.txt");
        // BufferedOutputStream bos = new BufferedOutputStream(fos);
        // ObjectOutputStream oos = new ObjectOutputStream(bos);

        // oos.writeObject(c);
        // oos.flush();
        // oos.close();
        System.out.println("file data update");
        FileInputStream fis = new FileInputStream("pw.txt");
        BufferedInputStream bis = new BufferedInputStream(fis);
        ObjectInputStream ois = new ObjectInputStream(bis);

        Cricketer cr = (Cricketer)ois.readObject();
        System.out.println(cr);
        
        System.out.println("successful object");
        
        
    }
}
