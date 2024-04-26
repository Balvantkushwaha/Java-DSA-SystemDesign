package PwskillJava.InterfaceLambdaExpressionExceptionHanling;

// checked excpetion and unchecked excpetion. 
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HierachyException {
    public static void main(String[] args) {
        int result = 7 / 0; // it your chouse
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            String str = br.readLine();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
}
