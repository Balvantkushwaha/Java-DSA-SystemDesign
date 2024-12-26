package FileHandling;
import java.io.*;
public class LaunchBWFW {
    public static void main(String[] args) throws Exception {
        File dir = new File("pw");
        File file = new File(dir,"pw.txt");
        FileWriter fw = new FileWriter(file ,true);
        BufferedWriter bw = new BufferedWriter(fw);

        bw.write("java");
        bw.newLine();
        bw.write(65);
        bw.newLine();
        char ch[] = {'p','w','s','j'};
        bw.write(ch);
        bw.close();
        System.out.println("successful write in file");

    }
}