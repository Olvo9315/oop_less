import java.time.LocalDate;
import java.util.List;

import Interfaces.Goable;

public class Spider extends Animal implements Goable {

    public Spider(String name, LocalDate birthDate, List<String> vaccinations, String illness, String owner) {
        super(name, birthDate, vaccinations, illness, owner);
    }

    @Override
    public double run() {
        System.out.printf("%s %s can run", type, name);
        return 1;
    }


    
}
