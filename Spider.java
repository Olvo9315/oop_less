import java.time.LocalDate;
import java.util.List;

public class Spider extends Animal{

    public Spider(String name, LocalDate birthDate, List<String> vaccinations, String illness, String owner) {
        super(name, birthDate, vaccinations, illness, owner);
    }

    @Override
    public void swim() {
        System.out.println(getClass().getSimpleName() + " " + getName() + " can't swim");
    }

    @Override
    public void fly() {
        System.out.println(getClass().getSimpleName() + " " + getName() + " can't fly");
    }
    
}
