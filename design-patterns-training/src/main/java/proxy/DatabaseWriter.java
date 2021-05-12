package proxy;

import java.util.ArrayList;
import java.util.List;

public class DatabaseWriter {

    private List<Client> clientDatabase = new ArrayList<>();

    public void save(final List<Client> clients) {
        clientDatabase.addAll(clients);
    }

    public List<Client> getAllClients() {
        //TODO fetch all clients from DB, let's assume
        // this operation costs quite a lot

        return clientDatabase;
    }

}
