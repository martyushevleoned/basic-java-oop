
import animals.*;
import figures.Circle;
import figures.Figure;
import figures.Rectangle;
import figures.Square;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
//Basic extend
        ArrayList<Figure> figures = new ArrayList<>();
        figures.add(new Circle(5));
        figures.add(new Rectangle(29, 1));
        figures.add(new Square(12));
//forEach print array
//        figures.forEach((figure -> System.out.println(figure)));
        figures.forEach(System.out::println);
        System.out.println();

//interface Comparable
        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(new Bird("C The Bird", 100));
        animals.add(new Tiger("B The Tiger", 300000));
        animals.add(new Penguin("A The Peng", 80000));

//Compare using comparator
        Collections.sort(animals);
        for (Animal a : animals)
            System.out.println(a.getName() + "\t" + a.getWeight());
        System.out.println();

//Compare using lambda
//        Collections.sort(animals, ((o1, o2) -> Float.compare(o1.getWeight(), o2.getWeight())));
        animals.sort(((o1, o2) -> Float.compare(o1.getWeight(), o2.getWeight())));
        for (Animal a : animals)
            System.out.println(a.getName() + "\t" + a.getWeight());
        System.out.println();

//Compare using ::
//        Collections.sort(animals, Comparator.comparing((Animal::getName)));
        animals.sort(Comparator.comparing((Animal::getName)));
        for (Animal a : animals)
            System.out.println(a.getName() + "\t" + a.getWeight());
        System.out.println();
    }
}