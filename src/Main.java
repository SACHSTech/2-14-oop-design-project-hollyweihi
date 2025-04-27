import java.io.*;
import java.util.List;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Please Enter your Student/Employee ID: ");
        int studentId = Integer.parseInt(keyboard.readLine());

        System.out.println("Please Enter your Name: ");
        String name = keyboard.readLine();

        System.out.println("Please Enter the number of your absend Day: ");
        int absend = Integer.parseInt(keyboard.readLine());

        List <Grade> grades = new ArrayList();
    }
}
