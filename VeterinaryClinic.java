import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import Interfaces.Flyable;
import Interfaces.Goable;
import Interfaces.Swimable;

public class VeterinaryClinic {
    private List<Animal> patients = new ArrayList<>();

    public void addPatient(Animal animal) {
        patients.add(animal);
    }

    public void addPatients(Animal ... animals) {
        Collections.addAll(patients, animals);
    }

    public List<Goable> getGoables() {
        List<Goable> result = new ArrayList<>(patients.size());
        for (Animal animal:patients) {
            if(animal instanceof Goable) result.add((Goable) animal);
        }
        return result;
    }

    public List<Swimable> getSwimables() {
        List<Swimable> result = new ArrayList<>(patients.size());
        for (Animal animal:patients) {
            if(animal instanceof Swimable) result.add((Swimable) animal);
        }
        return result;
    }

    public List<Flyable> getFlyables() {
        List<Flyable> result = new ArrayList<>(patients.size());
        for (Animal animal:patients) {
            if(animal instanceof Flyable) result.add((Flyable) animal);
        }
        return result;
    }

    public List<Animal> getPatients() {
        return patients;
    }
//// Staff
    private List<Staff> staffs = new ArrayList<>();

    public void addStaff(Staff staff) {
        staffs.add(staff);
    }

    public void addStaffs(Staff ... staff) {
        Collections.addAll(staffs, staff);
    }
    
    public List<Staff> getStaffs() {
        return staffs;
    }
///// Print Nurse for Doctor
    public void printNurseForDoctor(Doctor doctor) {
        if (doctor.getNurse() != null) {
            System.out.println("Nurse assigned to Doctor " + doctor.getName() + ": " + doctor.getNurse().getName());
        } else {
            System.out.println("No nurse assigned to Doctor " + doctor.getName() + ".");
        }
    }
    
}
