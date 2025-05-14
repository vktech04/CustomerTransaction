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

class TransactionHistory {
    String transactionId;
    String senderName;
    String receiverName;
    double amount;
    String status;
    String date;

    TransactionHistory(String transactionId, String senderName, String receiverName, double amount, String status, String date) {
        this.transactionId = transactionId;
        this.senderName = senderName;
        this.receiverName = receiverName;
        this.amount = amount;
        this.status = status;
        this.date = date;
    }

    void display() {
        System.out.println("Transaction ID: " + transactionId);
        System.out.println("Sender Name: " + senderName);
        System.out.println("Receiver Name: " + receiverName);
        System.out.println("Amount: $" + amount);
        System.out.println("Status: " + status);
        System.out.println("Date: " + date);
        System.out.println("---------------------------");
    }
}


public class CustomerTransaction {
    public static void main(String[] args) {
        BankCustomer customer = new BankCustomer("Vaishnavi", "Sa237", 21);
        customer.display();

        TransactionHistory t1 = new TransactionHistory("T1001", "Vaishnavi", "Usha", 5000.0, "Successful", "10-05-2025");
        t1.display();

        TransactionHistory t2 = new TransactionHistory("T2002", "Usha", "Vaishnavi", 2000.0, "Failed", "11-05-2025");
        t2.display();
    }
}