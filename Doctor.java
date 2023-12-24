import java.time.LocalDate;

public class Doctor extends Staff {
    private int office;
    private String specialization;
    private Nurse nurse;

    public Doctor(String name, LocalDate birthDate, Double salary, Integer phoneNumber, Integer office, String specialization) {
        super(name, birthDate, salary, phoneNumber);
        this.office = office;
        this.specialization = specialization;
        this.nurse = null;
    }

    public Doctor(String name, LocalDate birthDate, Double salary, Integer phoneNumber, Integer office, String specialization, Nurse nurse) {
        super(name, birthDate, salary, phoneNumber);
        this.office = office;
        this.specialization = specialization;
        this.nurse = nurse;
    }

    public int getOffice() {
        return office;
    }

    public String getSpecialization() {
        return specialization;
    }

    public Nurse getNurse() {
        return nurse;
    }
    
    public void assignNurse(Nurse nurse) {
        this.nurse = nurse;
    }

}
