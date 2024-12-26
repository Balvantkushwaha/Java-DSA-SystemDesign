package FileHandling;
import java.io.*;
public class LaunchFW {
    public static void main(String[] args) throws IOException {
        File dir = new File("pw");
        File file = new File(dir,"pw.txt");
        file.createNewFile();
       
        FileWriter fw = new FileWriter(file, true);
        fw.write("skill\n");
        fw.write(65);
        fw.write("\n");
        char ch[] = {'j','a','v','a'};
        fw.write(ch);
        //fw.close();
        fw.flush();
        
    }
}
