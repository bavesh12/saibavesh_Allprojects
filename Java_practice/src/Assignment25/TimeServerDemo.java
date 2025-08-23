package Assignment25;

import java.time.LocalDateTime;
import java.util.*;

class TimeServer {
    public static interface Client {
        void updateTime(LocalDateTime now);
    }

    private final List<Client> clients;

    public TimeServer() {
        this.clients = new ArrayList<>();
    }

    public void registerClient(Client client) {
        if (client != null) {
            clients.add(client);
        }
    }

    public void notifyClients() {
        LocalDateTime now = LocalDateTime.now();
        for (Client client : clients) {
            client.updateTime(now);
        }
    }
}

class DigitalClock implements TimeServer.Client {
    @Override
    public void updateTime(LocalDateTime now) {
        System.out.println("Digital Clock updated: " + now);
    }
}

class AnalogClock implements TimeServer.Client {
    @Override
    public void updateTime(LocalDateTime now) {
        System.out.println("Analog Clock updated: " + now);
    }
}

public class TimeServerDemo {
    public static void main(String[] args) {
        TimeServer server = new TimeServer();
        server.registerClient(new DigitalClock());
        server.registerClient(new AnalogClock());
        
        server.notifyClients();
    }
}