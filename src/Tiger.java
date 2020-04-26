public class Tiger extends Carnivorous {
    String name;
    public Tiger (String str) {
        name = str;
    }

    @Override
    public String getName() {
        return name;
    }
}
