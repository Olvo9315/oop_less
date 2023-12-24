import java.time.LocalDate;
import java.util.List;

import Interfaces.Flyable;
import Interfaces.Goable;
import Interfaces.Swimable;

public class Duck extends Animal implements Goable, Swimable, Flyable{

    public Duck(String name, LocalDate birthDate, List<String> vaccinations, String illness, String owner) {
        super(name, birthDate, vaccinations, illness, owner);
    }

    @Override
    public double run() {
        System.out.printf("%s %s can run", type, name);
        return 2;
    }

    @Override
    public double swim() {
        System.out.printf("%s %s can swim", type, name);
        return 4;
    }

    @Override
    public double fly() {
        System.out.printf("%s %s can fly", type, name);
        return 8;
    }

    
}
