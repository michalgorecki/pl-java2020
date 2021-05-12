package proxy;

import java.util.List;

import static java.util.Arrays.asList;

public class Main {
    public static void main(String[] args) {
        Client bruce = new Client("Bruce", "Lee", "bruce@lee.com");
        Client david = new Client("David", "Hasselhoff", "david@hasselhoff.com");
        Client michael = new Client("Michael", "Douglas", "michael@douglas.com");
        Client tomasz = new Client("Tomasz", "Karolak", "t@k.com");
        List<Client> clientList = asList(bruce, david, michael, tomasz);

        DatabaseWriter database = new DatabaseWriter();

        database.save(clientList);


    }
}
