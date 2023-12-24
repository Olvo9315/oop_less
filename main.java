import java.net.DatagramSocketImpl;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args) {
        Cat cat1 =  new Cat("Barsik", LocalDate.of(2019, 1, 1), new ArrayList<>(), "Chumka", "Boss", 4);
        Eagle eagle1 = new Eagle("Kesha", LocalDate.of(2009, 3, 4), new ArrayList<>(), "Chumka", "Boss");
        Duck duck1 = new Duck("Donald", LocalDate.of(2019, 3, 4), new ArrayList<>(), "Chumka", "Boss");
        Fish fish1 = new Fish("Doris", LocalDate.of(2021, 2, 2), new ArrayList<>(), "Chumka", "Boss");
        Snake snake1 = new Snake("Severus", LocalDate.of(2011, 3, 13), new ArrayList<>(), "Chumka", "Boss");
        Spider spider1 = new Spider("Man", LocalDate.of(1994, 2, 27), new ArrayList<>(), "Chumka", "Boss");

        // List<Animal> animals = new ArrayList<>();
        // animals.add(cat1);
        // animals.add(eagle1);
        // animals.add(duck1);
        // animals.add(fish1);
        // animals.add(snake1);
        // animals.add(spider1);
        // for (Animal animal : animals) {
        //     System.out.println(animal);
        // }
        // // System.out.println(animals);
        // System.out.println("-----------------------------------------");

        // // cat1.run();

        VeterinaryClinic clinic = new VeterinaryClinic();
        clinic.addPatients(cat1, eagle1, duck1, fish1, snake1, spider1);
        System.out.println("All patients: \n" + clinic.getPatients());
        System.out.println("Goables patients: \n" + clinic.getGoables());
        System.out.println("Swimable patients: \n" + clinic.getSwimables());
        System.out.println("Flyable patients: \n" + clinic.getFlyables());

        // Barsik.lifeCycle();

        System.out.println("-----------------------------------------");

        Staff doctor1 = new Doctor("Daria", LocalDate.of(1996,9,8), 100000.0, 123456789, 1, "GP");
        Staff doctor2 = new Doctor("Alex", LocalDate.of(1993,5,1), 120000.0, 123451189, 1, "GP");
        Staff nurse1 = new Nurse("Yuliana", LocalDate.of(2001,1,21), 60000.0, 123431212);
        Staff nurse2 = new Nurse("Tatiana", LocalDate.of(1989,3,1), 90000.0, 199831212);

        clinic.addStaffs(doctor1, doctor2, nurse1, nurse2);
        System.out.println("All staff: \n" + clinic.getStaffs());

        ((Doctor) doctor1).assignNurse((Nurse) nurse1);

        clinic.printNurseForDoctor((Doctor) doctor1);
        clinic.printNurseForDoctor((Doctor) doctor2);
        
        
    }
}
