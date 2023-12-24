import java.time.LocalDate;
import java.util.List;

import Interfaces.Swimable;

public class Fish extends Animal implements Swimable{

    public Fish(String name, LocalDate birthDate, List<String> vaccinations, String illness, String owner) {
        super(name, birthDate, vaccinations, illness, owner);
    }

    @Override
    public double swim() {
        System.out.printf("%s %s can swim", type, name);
        return 10;
    }



}
