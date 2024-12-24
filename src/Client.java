import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
public class Client {
    Scanner scanner = new Scanner(System.in);


    static int id = 0;

    private String name;
    private int client_id;
    public float money;
    private int password;


    Client(String name, int id)
    {
        this.name = name;
        this.id = id;
        this.password = 0;
        this.money = 0;
    }

    int setId(int id){
        client_id = id;
        id++;
        return id;
    }

    int setPassword()
    {
      this.password = scanner.nextInt();
      return password;
    }
}
