import java.time.LocalDate;
import java.time.Period;

public class Student {
    String name;
    LocalDate dob;

    public Student(String name, String dobStr) {
        this.name = name;
        this.dob = LocalDate.parse(dobStr);
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        int age = Period.between(dob, LocalDate.now()).getYears();
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {
        Student std = new Student("Vaishnavi", "2004-07-04");
        std.displayInfo();
    }
}