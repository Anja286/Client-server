import java.io.IOException;
import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main (String[] args) throws IOException {
        Socket s;
        int number;
        Scanner sc1;
        try (Scanner sc = new Scanner(System.in)) {
            s = new Socket("127.0.0.1", 1050);
            sc1 = new Scanner(s.getInputStream());
            System.out.println("Enter any number");
            number = sc.nextInt();
        }
        PrintStream p= new PrintStream (s.getOutputStream());
        p.println(number);
        int temp = sc1.nextInt();
        System.out.println(temp);

    }
}
