
import animals.*;
import figures.Circle;
import figures.Figure;
import figures.Rectangle;
import figures.Square;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Optional;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
//Basic extend
        ArrayList<Figure> figures = new ArrayList<>();
        figures.add(new Circle(5));
        figures.add(new Square(5));
        figures.add(new Rectangle(29, 1));
        figures.add(new Rectangle(5, 6));
        figures.add(new Circle(15));
        figures.add(new Square(12));

//forEach print array
        figures.forEach((figure -> System.out.println(figure + "\t" + figure.getSquare())));
        System.out.println();

//======================================================================================================================
//Streams
        figures.stream().sorted(Comparator.comparing(Figure::getSquare)).forEach((figure -> System.out.println(figure + "\t" + figure.getSquare())));
        System.out.println();

        Optional<Figure> optional = figures.stream().max(Comparator.comparing(Figure::getSquare));
        optional.ifPresent(System.out::println);
        System.out.println();

        //сумма всех площадей больше 100
        figures.stream().map(Figure::getSquare).filter(f -> f > 100).reduce((f1, f2) -> f1 + f2).ifPresent(System.out::println);
        System.out.println();

        figures.stream().filter(figure -> figure.getSquare() > 100).forEach(System.out::println);
        System.out.println();

        Stream<Integer> numbers = Stream.of(23, 1, 54, 12, 5, 1, 5, 1, 3, 4, 561, 5, 1, 45, 52, 4, 2);
        numbers.filter(n -> n % 2 == 0).forEach(n -> System.out.print(n + "\t"));
        System.out.println();
        System.out.println();

//======================================================================================================================
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