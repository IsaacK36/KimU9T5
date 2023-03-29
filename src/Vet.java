import java.util.ArrayList;

public class Vet {
    String name;
    ArrayList<Animal> clients;

    public Vet(String name) {
        this.name = name;
        clients = new ArrayList<Animal>();
    }
    public void addClient(Animal animal) {
        if (clients.indexOf(animal) == -1) {
            clients.add(animal);
            System.out.println("Welcome to " + name + "'s office, " + animal.getName());
        } else {
            System.out.println(animal + " is already a client of " + name);
        }
    }
}
