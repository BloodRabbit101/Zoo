import java.io.IOException;

public class Zoo {
    Animal wolf = new Wolf("волк");
    Animal tiger = new Tiger("тигр");
    Animal rabbit = new Rabbit("кролик");
    Animal goat = new Goat("козел");
    Food grass = new Grass();
    Food meat = new Meat();
    Enclosure e1Wolves = new Enclosure(5);
    Enclosure e2Tigers = new Enclosure(1);
    Enclosure e3TRabbits = new Enclosure(10);
    Enclosure e4Goats = new Enclosure(3);

    public void work()   throws IOException {
        char choice, ignore;

        for (; ; ) {
            do {
                System.out.println("Выбери вольер:");
                System.out.println("  1. Для волков");
                System.out.println("  2. Для тигров");
                System.out.println("  3. Для кроликов");
                System.out.println("  4. Для козлов");
                System.out.println("для выхода нажми q");

                choice = (char) System.in.read();

                do {
                    ignore = (char) System.in.read();
                } while (ignore != '\n');
            } while (choice < '1' | choice > '4' & choice != 'q');

            if (choice == 'q') break;

            System.out.println("\n");

            switch (choice) {
                case '1':
                {
                    char choiceIn, ignoreIn;

                    for (; ; ) {
                        do {
                            e1Wolves.enclosureSize();
                            System.out.println("Действия:");
                            System.out.println("  1. Добавить животное");
                            System.out.println("  2. Удалить животное");
                            System.out.println("  3. Узнать кто в вольере");
                            System.out.println("  4. Дать мяса");
                            System.out.println("  5. Дать травы");
                            System.out.println("для выхода в предыдущее меню нажми b");

                            choiceIn = (char) System.in.read();

                            do {
                                ignoreIn = (char) System.in.read();
                            } while (ignoreIn != '\n');
                        } while (choiceIn < '1' | choiceIn > '5' & choiceIn != 'b');

                        if (choiceIn == 'b') break;

                        System.out.println("\n");
                        switch (choiceIn) {
                            case '1':
                                e1Wolves.addAnimal(wolf);
                                break;
                            case '2':
                                e1Wolves.removeAnimal();
                                break;
                            case '3':
                                e1Wolves.displayAnimals();
                                break;
                            case '4':
                                if (e1Wolves.empty()) {
                                    System.out.println("Кормить некого, вольер пуст");
                                } else {wolf.eat(meat);}
                                break;
                            case '5':
                                if (e1Wolves.empty()) {
                                    System.out.println("Кормить некого, вольер пуст");
                                } else {wolf.eat(grass);}
                                break;
                        }
                        System.out.println();
                    }
                }
                    break;
                case '2':
                {
                    char choiceIn, ignoreIn;

                    for (; ; ) {
                        do {
                            e2Tigers.enclosureSize();
                            System.out.println("Действия:");
                            System.out.println("  1. Добавить животное");
                            System.out.println("  2. Удалить животное");
                            System.out.println("  3. Узнать кто в вольере");
                            System.out.println("  4. Дать мяса");
                            System.out.println("  5. Дать травы");
                            System.out.println("для выхода в предыдущее меню нажми b");

                            choiceIn = (char) System.in.read();

                            do {
                                ignoreIn = (char) System.in.read();
                            } while (ignoreIn != '\n');
                        } while (choiceIn < '1' | choiceIn > '5' & choiceIn != 'b');

                        if (choiceIn == 'b') break;

                        System.out.println("\n");
                        switch (choiceIn) {
                            case '1':
                                e2Tigers.addAnimal(wolf);
                                break;
                            case '2':
                                e2Tigers.removeAnimal();
                                break;
                            case '3':
                                e2Tigers.displayAnimals();
                                break;
                            case '4':
                                if (e2Tigers.empty()) {
                                    System.out.println("Кормить некого, вольер пуст");
                                } else {tiger.eat(meat);}
                                break;
                            case '5':
                                if (e2Tigers.empty()) {
                                    System.out.println("Кормить некого, вольер пуст");
                                } else {tiger.eat(grass);}
                                break;
                        }
                        System.out.println();
                    }
                }
                    break;
                case '3':
                {
                    char choiceIn, ignoreIn;

                    for (; ; ) {
                        do {
                            e3TRabbits.enclosureSize();
                            System.out.println("Действия:");
                            System.out.println("  1. Добавить животное");
                            System.out.println("  2. Удалить животное");
                            System.out.println("  3. Узнать кто в вольере");
                            System.out.println("  4. Дать мяса");
                            System.out.println("  5. Дать травы");
                            System.out.println("для выхода в предыдущее меню нажми b");

                            choiceIn = (char) System.in.read();

                            do {
                                ignoreIn = (char) System.in.read();
                            } while (ignoreIn != '\n');
                        } while (choiceIn < '1' | choiceIn > '5' & choiceIn != 'b');

                        if (choiceIn == 'b') break;

                        System.out.println("\n");
                        switch (choiceIn) {
                            case '1':
                                e3TRabbits.addAnimal(wolf);
                                break;
                            case '2':
                                e3TRabbits.removeAnimal();
                                break;
                            case '3':
                                e3TRabbits.displayAnimals();
                                break;
                            case '4':
                                if (e3TRabbits.empty()) {
                                    System.out.println("Кормить некого, вольер пуст");
                                } else {rabbit.eat(meat);}
                                break;
                            case '5':
                                if (e3TRabbits.empty()) {
                                    System.out.println("Кормить некого, вольер пуст");
                                } else {rabbit.eat(grass);}
                                break;
                        }
                        System.out.println();
                    }
                }
                    break;
                case '4':
                {
                    char choiceIn, ignoreIn;

                    for (; ; ) {
                        do {
                            e4Goats.enclosureSize();
                            System.out.println("Действия:");
                            System.out.println("  1. Добавить животное");
                            System.out.println("  2. Удалить животное");
                            System.out.println("  3. Узнать кто в вольере");
                            System.out.println("  4. Дать мяса");
                            System.out.println("  5. Дать травы");
                            System.out.println("для выхода в предыдущее меню нажми b");

                            choiceIn = (char) System.in.read();

                            do {
                                ignoreIn = (char) System.in.read();
                            } while (ignoreIn != '\n');
                        } while (choiceIn < '1' | choiceIn > '5' & choiceIn != 'b');

                        if (choiceIn == 'b') break;

                        System.out.println("\n");
                        switch (choiceIn) {
                            case '1':
                                e4Goats.addAnimal(wolf);
                                break;
                            case '2':
                                e4Goats.removeAnimal();
                                break;
                            case '3':
                                e4Goats.displayAnimals();
                                break;
                            case '4':
                                if (e4Goats.empty()) {
                                    System.out.println("Кормить некого, вольер пуст");
                                } else {goat.eat(meat);}
                                break;
                            case '5':
                                if (e4Goats.empty()) {
                                    System.out.println("Кормить некого, вольер пуст");
                                } else {goat.eat(grass);}
                                break;
                        }
                        System.out.println();
                    }
                }
                    break;
            }
            System.out.println();
        }


    }
}