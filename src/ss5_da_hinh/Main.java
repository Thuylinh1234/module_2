package ss5_da_hinh;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(new Cat());
        animals.add(new Bird());

        for (Animal animal : animals){
            animal.tiengKeu();
            if (animal instanceof Bird){
                ((Bird)animal).tiengKeu();
            }
        }
    }
}
