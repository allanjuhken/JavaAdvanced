package abstractionExample;

import java.util.Arrays;

public class ZooTest {
    public static void main(String[] args) {
        Zoo germanZoo = new Zoo(4);

        // abstraction between tye of Animal and the actual animal
        Animal bingo = new Dog("bingo",3);
        Animal harry =  new Eagle("harry", 5);

        germanZoo.addAnimal(bingo);
        germanZoo.addAnimal(harry);

        System.out.println(Arrays.toString(germanZoo.getAnimals()));

        germanZoo.printAnimals();
    }
}
