class BankCustomer {
    String customerName;
    String accountNumber;
    int age;

    BankCustomer(String customerName, String accountNumber, int age) {
        this.customerName = customerName;
        this.accountNumber = accountNumber;
        this.age = age;
    }

    void display() {
        System.out.println("Customer Name: " + customerName);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Customer Age: " + age);
        System.out.println("---------------------------");
    }
}

public class CustomerTransaction {
    public static void main(String[] args) {
        BankCustomer customer = new BankCustomer("Vaishnavi", "Sa237", 21);
        customer.display();

    }
}