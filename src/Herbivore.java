public abstract class Herbivore extends Animal {

    @Override
    public void eat(Food food) {
        if (food.getType().compareTo("Животная пища") == 0){
            System.out.println("Травоядное не ест мясо, дай траву");
        } else if (food.getType().compareTo("Растительная пища") == 0){
            System.out.println("Растение! Ням ням");
        }
    }
}
