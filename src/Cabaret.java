import java.util.ArrayList;

public class Cabaret {
    String name;
    ArrayList<Performer> performers;

    public Cabaret(String name) {
        this.name = name;
        performers = new ArrayList<Performer>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Performer> getPerformers() {
        return performers;
    }

    public boolean addPerformer(Performer performer) {
        if (!performers.contains(performer)) {
            performers.add(performer);
            return true;
        } else {
            return false;
        }
    }

    public boolean removePerformer(Performer performer) {
        if (performers.contains(performer)) {
            performers.remove(performer);
            return true;
        } else {
            return false;
        }
    }

    public double averagePerformerAge() {
        double total = 0.0;
        for (Performer performer : performers) {
            total += performer.getAge();
        }
        return total / performers.size();
    }

    public ArrayList<Performer> performersOverAge(int age) {
        ArrayList<Performer> agedPerformers = new ArrayList<Performer>();
        for (Performer performer : performers) {
            if (performer.getAge() >= age) {
                agedPerformers.add(performer);
            }
        }
        return agedPerformers;
    }

    public void groupRehearsal() {
        for (Performer performer : performers) {
            System.out.println("REHEARSAL CALL!");
            if (performer instanceof Comedian) {
                Comedian temp = (Comedian) performer;
                temp.rehearse(false);
            } else {
                performer.rehearse();
            }
        }
    }

    public void cabaretShow() {
        for (Performer performer : performers) {
            System.out.println("Welcome to the cabaret! Next act up... " + performer.getName());
            if (performer instanceof Dancer) {
                Dancer temp = (Dancer) performer;
                temp.pirouette(2);
            }
            performer.perform();
        }
    }
}
