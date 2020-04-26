public class Goat extends Herbivore {
    String name;
    public Goat (String str) {
        name = str;
    }

    @Override
    public String getName() {
        return name;
    }
}
