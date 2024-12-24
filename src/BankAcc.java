import java.util.ArrayList;

public class BankAcc {
    static float bankReserves = 1200000;
    ArrayList<Client> allClients = new ArrayList();
    void investMoney(Client client, float sumOfMoney){
        client.money += sumOfMoney;
        bankReserves+=sumOfMoney;
    }
    void cashMoney(Client client, float sumOfMoney)
    {
        if(client.money <= 0){
            System.out.println("Недостаточно средств...");
        }
        else{

        }
    }
}
