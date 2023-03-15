package abstractionExample;

import java.util.ArrayList;
import java.util.List;

public class ListAnimals {
    private List<Animal> animals;

    public ListAnimals() {
        this.animals = new ArrayList<>();
    }

    public void addAnimal(Animal animal){
        animals.add(animal);
    }

    public void printAnimals(){
        for (int i = 0; i< animals.size(); i++){
            Animal animal = animals.get(i);
            System.out.println(animals.get(i).getType()
                    + " - " + animals.get(i).getName()
                    + ", " + animals.get(i).getAge()
                    + " years old");
        }
    }
}
