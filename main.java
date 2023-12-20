import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args) {
        Cat cat1 =  new Cat("Barsik", LocalDate.of(2019, 1, 1), new ArrayList<>(), "Chumka", "Boss", 4);
        Eagle eagle1 = new Eagle("Kesha", LocalDate.of(2009, 3, 4), new ArrayList<>(), "Chumka", "Boss");
        Duck duck1 = new Duck("Donald", LocalDate.of(2019, 3, 4), new ArrayList<>(), "Chumka", "Boss");
        Fish fish1 = new Fish("Doris", LocalDate.of(2021, 2, 2), new ArrayList<>(), "Chumka", "Boss");
        Snake snake1 = new Snake("Severus", LocalDate.of(2011, 3, 13), new ArrayList<>(), "Chumka", "Boss");
        Spider spider1 = new Spider("Man", LocalDate.of(1994, 2, 27), new ArrayList<>(), "Chumka", "Boss");

        List<Animal> animals = new ArrayList<>();
        animals.add(cat1);
        animals.add(eagle1);
        animals.add(duck1);
        animals.add(fish1);
        animals.add(snake1);
        animals.add(spider1);
        for (Animal animal : animals) {
            System.out.println(animal);
        }
        // System.out.println(animals);
        System.out.println("-----------------------------------------");

        cat1.toGo();
        cat1.fly();
        cat1.swim();
        duck1.toGo();
        duck1.fly();
        duck1.swim();
        fish1.toGo();
        fish1.fly();
        fish1.swim();
        snake1.toGo();
        snake1.fly();
        snake1.swim();
        spider1.toGo();
        spider1.fly();
        spider1.swim();

        // Barsik.lifeCycle();
    }
}
