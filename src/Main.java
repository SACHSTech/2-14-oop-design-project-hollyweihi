import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Please Enter your Student/Employee ID: ");
        int studentId = Integer.parseInt(keyboard.readLine());

        System.out.println("Please Enter your Name: ");
        String name = keyboard.readLine();

        
    }
}
