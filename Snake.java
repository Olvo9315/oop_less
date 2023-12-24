import java.time.LocalDate;
import java.util.List;

import Interfaces.Goable;
import Interfaces.Swimable;

public class Snake extends Animal implements Goable, Swimable{

    public Snake(String name, LocalDate birthDate, List<String> vaccinations, String illness, String owner) {
        super(name, birthDate, vaccinations, illness, owner);
    }

    @Override
    public double run() {
        System.out.printf("%s %s can run", type, name);
        return 3;
    }

    @Override
    public double swim() {
        System.out.printf("%s %s can swim", type, name);
        return 5;
    }


    
}
