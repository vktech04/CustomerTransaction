public class Employee {
    String name;
    int id;
    double salary;
    public Employee(String name, int id, double salary){
        this.name = name;
        this.id = id;
        this.salary = salary;
    }
    public void displayInfo(){
        System.out.println("Employee ID : "+id);
        System.out.println("Employee Name : "+name);
        System.out.println("Salary : "+salary);
    }
    public static void main(String[] args) {
        Employee emp1 = new Employee("Vaishnavi",100,50000.30);
        emp1.displayInfo();
    }
}
