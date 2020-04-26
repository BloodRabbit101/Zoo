import java.util.ArrayList;
import java.util.List;

public class Enclosure {

    List<Animal> enclosure;

    int size;

    public Enclosure(int size) {
        this.size = size;

        enclosure = new ArrayList<Animal>(size);
    }

    public void addAnimal(Animal a) {
        if (enclosure.size() == size) {
            System.out.println("Попытка добавить животное не удалась, вольер заполнен");
            return;
        }
        enclosure.add(a);
        System.out.println("Животное добавлено в вольер");
    }

    public void removeAnimal() {
        if (enclosure.isEmpty()) {
            System.out.println("Попытка удалить животное не удалась, вольер пуст");
            return;
        }
        enclosure.remove(0);
        System.out.println("Животное удалено из вольера");
    }

    public void displayAnimals() {
        if (enclosure.isEmpty()) {
            System.out.println("Вольер пуст");
            return;
        } else {
            System.out.println("В вольере:");
            for (int i = 0; i < enclosure.size(); i++) {
                System.out.println(enclosure.get(i).getName());
            }
        }
    }

    public void enclosureSize() {
        System.out.println("Максимальное число животных в данном вольере: " + size);
    }

    public boolean empty() {
        if (enclosure.isEmpty()) {
            return true;
        }
        return false;
    }
}
