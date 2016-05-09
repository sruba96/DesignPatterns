package Adapter;

/**
 * Created by pawel on 09.05.16.
 */
public class Client {

    NewStandard newStandard;
    public Client() {
        newStandard = new Adapter();
        newStandard.buildFutureBuildings();
    }

    public static void main(String[] args) {
        Client client = new Client();
    }
}
