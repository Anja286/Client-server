import java.io.IOException;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;


public class Server {
    public static void main (String[] args) throws IOException
    {
        int number;
        ServerSocket s1= new ServerSocket(1050);
        Socket ss= s1.accept();
        Scanner sc= new Scanner (ss.getInputStream());
        number= sc.nextInt();

        int temp = number * 3;

        PrintStream p= new PrintStream (ss.getOutputStream());
        p.println (temp);



    }
}
