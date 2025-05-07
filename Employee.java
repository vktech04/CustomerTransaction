public class Employee {
    String name;
    int id;
    double salary;
    long  phoneno;
    public Employee(String name, int id, double salary,long phoneno){
        this.name = name;
        this.id = id;
        this.salary = salary;
        this.phoneno = phoneno;
    }
    public void displayInfo(){
        System.out.println("Employee ID : "+id);
        System.out.println("Employee Name : "+name);
        System.out.println("Salary : "+salary);
        System.out.println("Phone No : "+phoneno);
    }
    public static void main(String[] args) {
        Employee emp1 = new Employee("Vaishnavi",100,50000.30,636193050);
        emp1.displayInfo();
    }
}
