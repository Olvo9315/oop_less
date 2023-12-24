import java.time.LocalDate;
import java.util.List;

import Interfaces.Flyable;
import Interfaces.Goable;

public class Eagle extends Animal implements Goable, Flyable{

    public Eagle(String name, LocalDate birthDate, List<String> vaccinations, String illness, String owner) {
        super(name, birthDate, vaccinations, illness, owner);
    }

    @Override
    public double run() {
        System.out.printf("%s %s can run", type, name);
        return 3;
    }

    @Override
    public double fly() {
        System.out.printf("%s %s can fly", type, name);
        return 10;
    }


    
    
}
