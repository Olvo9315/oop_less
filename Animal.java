import java.time.LocalDate;
import java.util.List;

public class Animal {
    protected String name;
    protected LocalDate birthDate;
    protected List<String> vaccinations;
    protected String illness;
    protected String owner;
    protected String type;

    
    public Animal(String name, LocalDate birthDate, List<String> vaccinations, String illness, String owner) {
        this.name = name;
        this.birthDate = birthDate;
        this.vaccinations = vaccinations;
        this.illness = illness;
        this.owner = owner;
        this.type = getClass().getSimpleName();
    }


    public String getName() {
        return name;
    }


    public LocalDate getBirthDate() {
        return birthDate;
    }


    public List<String> getVaccinations() {
        return vaccinations;
    }


    public String getIllness() {
        return illness;
    }


    public String getOwner() {
        return owner;
    }


    private void wakeup() {
        System.out.println(getName() + " is wakeup");
    }
    
    private void wakeup(int time) {
        System.out.println(getName() + " is wakeup in " + time);
    }

    private void eat() {
        System.out.println(getName() + "  ate");
    }
    
    private void sleep() {
        System.out.println(getName() + " sleeping");
    }

    public void lifeCycle() {
        wakeup();
        eat();
        sleep();
    }



    @Override
    public String toString() {
        return getClass().getSimpleName() +" [name=" + name + ", birthDate=" + birthDate + ", vaccinations=" + vaccinations + ", illness="
                + illness + ", owner=" + owner + "]";
    }


    
}
