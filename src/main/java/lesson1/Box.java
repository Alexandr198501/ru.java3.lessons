package lesson1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Box<T extends Fruit> {
    private List<T> fruits;
    private float weight;


    public Box(T... items) {
        this.fruits = new ArrayList<>(Arrays.asList(items));
    }

    public float getBoxWeight() {
        weight = 0.0f;
        for (int i = 0; i < fruits.size(); i++) {
            weight += fruits.get(i).getWeight();
        }
        return weight;
    }

    public boolean compare(Box<?> another) {
        return Math.abs(this.weight - another.weight) < 0.0001;
    }

    public void addFruit(T fruit) {
        fruits.add(fruit);
    }

    public void transferFruits(Box<T> another) {
        if (this == another) {
            return;
        }
        for (int i = 0; i < this.fruits.size(); i++) {
            another.addFruit(this.fruits.get(i));
        }
        this.fruits.clear();
    }


}
