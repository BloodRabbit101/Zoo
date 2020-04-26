public abstract class Carnivorous extends Animal {

    @Override
    public void eat(Food food) {
        if (food.getType().compareTo("Растительная пища") == 0){
            System.out.println("Хищник не ест траву, дай мяса");
        } else if (food.getType().compareTo("Животная пища") == 0){
            System.out.println("Мясо! Ням ням");
        }
    }
}
