package lesson1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
1. Написать метод, который меняет два элемента массива местами (массив может быть любого
ссылочного типа);
2. Написать метод, который преобразует массив в ArrayList;
+3. Задача:
+a. Даны классы Fruit, Apple extends Fruit, Orange extends Fruit;
+b. Класс Box, в который можно складывать фрукты. Коробки условно сортируются по типу
фрукта, поэтому в одну коробку нельзя сложить и яблоки, и апельсины;
+c. Для хранения фруктов внутри коробки можно использовать ArrayList;
+d. Сделать метод getWeight(), который высчитывает вес коробки, зная вес одного фрукта
и их количество: вес яблока – 1.0f, апельсина – 1.5f (единицы измерения не важны);
+e. Внутри класса Box сделать метод compare(), который позволяет сравнить текущую
коробку с той, которую подадут в compare() в качестве параметра. true – если их массы
равны, false в противоположном случае. Можно сравнивать коробки с яблоками и
апельсинами;
+f. Написать метод, который позволяет пересыпать фрукты из текущей коробки в другую.
Помним про сортировку фруктов: нельзя яблоки высыпать в коробку с апельсинами.
Соответственно, в текущей коробке фруктов не остается, а в другую перекидываются
объекты, которые были в первой;
+g. Не забываем про метод добавления фрукта в коробку.
 */
public class Main {
    public static void main(String[] args) {
        Apple apple = new Apple();
        Orange orange = new Orange();

        Box<Apple> appleBox = new Box<>();
        appleBox.addFruit(apple);
        appleBox.addFruit(apple);
        appleBox.addFruit(apple);

        Box<Orange> orangeBox = new Box<>();
        orangeBox.addFruit(orange);
        orangeBox.addFruit(orange);
        orangeBox.addFruit(orange);

        System.out.println(appleBox.getBoxWeight());
        System.out.println(orangeBox.getBoxWeight());
        System.out.println(apple.getWeight());
        System.out.println(orange.getWeight());


    }

    ///////////////////////////Первое задание////////////////////////
    public static Object swap(Object[] arr) {
        Object f = arr[0];
        arr[0] = arr[1];
        arr[1] = f;
        return arr;
    }

    //////////////////////////Конец первого задания/////////////////
    //////////////////////////Второе задание////////////////////////
    public static List arrayAsList(Object[] arr) {
        List<?> list = Arrays.asList(arr);
        System.out.println(list);
        return list;
    }
    //////////////////////////Конец второго задания/////////////////
}
