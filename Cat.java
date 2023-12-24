import java.time.LocalDate;
import java.util.List;

import Interfaces.Goable;

public class Cat extends Animal implements Goable{
    private int legsCount;
    public Cat(String name, LocalDate birthDate, List<String> vaccinations, String illness, String owner, int legsCount) {
        super(name, birthDate, vaccinations, illness, owner);
        this.legsCount = legsCount;
    }



    @Override
    public double run() {
        System.out.printf("%s %s can run", type, name);
        return 10;
    }
    
    
}
