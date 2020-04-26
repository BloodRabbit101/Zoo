public class Rabbit extends Herbivore {
    String name;
    public Rabbit (String str) {
        name = str;
    }

    @Override
    public String getName() {
        return name;
    }
}
