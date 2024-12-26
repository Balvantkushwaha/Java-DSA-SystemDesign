package FileHandling;
import java.io.*;
public class LaunchPW {

    public static void main(String[] args) throws Exception{
        File dir = new File("pw");
        File file = new File(dir,"pw.txt");

        FileWriter fw = new FileWriter(file);
        PrintWriter pw = new PrintWriter((fw));
        pw.write(95);
        pw.write("\n");

        pw.print("java");
        pw.println(100);
        pw.print('a');
        pw.print(true);
        pw.print(50.345);
        pw.close();
    }
}