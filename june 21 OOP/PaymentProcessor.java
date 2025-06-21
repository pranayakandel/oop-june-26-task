// Abstract Payment class
abstract class Payment {
    // Abstract methods
    abstract boolean validate();
    abstract void processTransaction();
}

// Credit Card Payment
class CreditCardPayment extends Payment {
    String cardNumber;
    String cardHolder;
    String expiry;

    CreditCardPayment(String cardNumber, String cardHolder, String expiry) {
        this.cardNumber = cardNumber;
        this.cardHolder = cardHolder;
        this.expiry = expiry;
    }

    @Override
    boolean validate() {
        System.out.println("Validating credit card: " + cardNumber);
        return cardNumber.length() == 16;  // Simple validation
    }

    @Override
    void processTransaction() {
        System.out.println("Processing credit card transaction for " + cardHolder);
    }
}

// PayPal Payment
class PayPalPayment extends Payment {
    String email;

    PayPalPayment(String email) {
        this.email = email;
    }

    @Override
    boolean validate() {
        System.out.println("Validating PayPal account: " + email);
        return email.contains("@");
    }

    @Override
    void processTransaction() {
        System.out.println("Processing PayPal transaction for " + email);
    }
}

// Bank Transfer Payment
class BankTransferPayment extends Payment {
    String accountNumber;
    String bankCode;

    BankTransferPayment(String accountNumber, String bankCode) {
        this.accountNumber = accountNumber;
        this.bankCode = bankCode;
    }

    @Override
    boolean validate() {
        System.out.println("Validating bank account: " + accountNumber);
        return accountNumber.length() == 10;
    }

    @Override
    void processTransaction() {
        System.out.println("Processing bank transfer to account " + accountNumber);
    }
}

// Main class to demonstrate polymorphism
public class PaymentProcessor {
    public static void main(String[] args) {
        Payment[] payments = {
            new CreditCardPayment("1234567890123456", "Alice", "12/25"),
            new PayPalPayment("bob@example.com"),
            new BankTransferPayment("9876543210", "BK001")
        };

        for (Payment p : payments) {
            if (p.validate()) {
                p.processTransaction();
            } else {
                System.out.println("Validation failed. Cannot process transaction.\n");
            }
            System.out.println();
        }
    }
}