// Parent class Bank
class Bank {
    double interestRate() {
        return 0;
    }

    void printInterest() {
        System.out.println("Interest Rate: " + interestRate() + "%");
    }
}

// SBI - 7%
class SBI extends Bank {
    @Override
    double interestRate() {
        return 7;
    }
}

// HDFC - 10%
class HDFC extends Bank {
    @Override
    double interestRate() {
        return 10;
    }
}

// ICICI - let's say 8.5%
class ICICI extends Bank {
    @Override
    double interestRate() {
        return 8.5;
    }
}

public class BankSystem {
    public static void main(String[] args) {

        // Parent class reference → child class objects (Runtime Polymorphism)
        Bank b;

        b = new SBI();
        System.out.println("--- SBI ---");
        b.printInterest();

        b = new HDFC();
        System.out.println("--- HDFC ---");
        b.printInterest();

        b = new ICICI();
        System.out.println("--- ICICI ---");
        b.printInterest();
    }
}
