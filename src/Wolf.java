public class Wolf extends Carnivorous {
    String name;
    public Wolf (String str) {
        name = str;
    }

    @Override
    public String getName() {
        return name;
    }
}
