import java.time.LocalDate;
import java.util.List;

public class Fish extends Animal{

    public Fish(String name, LocalDate birthDate, List<String> vaccinations, String illness, String owner) {
        super(name, birthDate, vaccinations, illness, owner);
    }

    @Override
    public void fly() {
        System.out.println(getClass().getSimpleName() + " " + getName() + " can't fly");
    }

    @Override
    public void toGo() {
        System.out.println(getClass().getSimpleName() + " " + getName() + " can't walk");
    }

}
