import java.time.LocalDate;

public class Staff {
    protected String name;
    protected LocalDate birthDate;
    protected String position;
    protected double salary;
    protected int phoneNumber;

    
    public Staff(String name, LocalDate birthDate, Double salary, Integer phoneNumber) {
        this.name = name;
        this.birthDate = birthDate;
        this.position = getClass().getSimpleName();
        this.salary = salary;
        this.phoneNumber = phoneNumber;
    }


    public String getName() {
        return name;
    }


    public int getPhoneNumber() {
        return phoneNumber;
    }


    public LocalDate getBirthDate() {
        return birthDate;
    }


    public String getPosition() {
        return position;
    }


    public double getSalary() {
        return salary;
    }


    @Override
    public String toString() {
        return position + " [name=" + name + ", birthDate=" + birthDate + ", salary=" + salary
                + ", phoneNumber=" + phoneNumber + "]";
    }


}
