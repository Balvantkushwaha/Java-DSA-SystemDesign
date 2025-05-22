package FileHandling;
import java.io.*;
public class LaunchFile2 {
    public static void main(String[] args) throws IOException {
        //  File dir = new File("PWJAVA");
        //  System.out.println(dir.isDirectory()); // true ya false
        //  dir.mkdir();
        //  System.out.println("dir is refering to directory PWJAVA:"+dir.isDirectory());
        //  File file2 = new File(dir ,"pws");
        //  file2.createNewFile();
        //  System.out.println("file is refering to pwskill.txt"+ file2.isFile());

        int count = 0;
        //String s ="IO";
        File f = new File("pwjava");
        String str[] = f.list();
        for(String name:str){
            count++;
            System.out.println(name);
        }
        System.out.println("no of files are"+ count);
    }
}
