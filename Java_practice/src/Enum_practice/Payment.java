package Enum_practice;

interface PaymentProcessor {
    String processPayment(double amount);
}

enum PaymentType implements PaymentProcessor {
    CREDIT_CARD {
        @Override
        public String processPayment(double amount) {
            return "Processing credit card payment of $" + amount;
        }
    },
    PAYPAL {
        @Override
        public String processPayment(double amount) {
            return "Processing PayPal payment of $" + amount;
        }
    },
    BANK_TRANSFER {
        @Override
        public String processPayment(double amount) {
            return "Processing bank transfer of $" + amount;
        }
    };
}

public class Payment {
    public static void main(String[] args) {
        double[] amounts = {120.0,50.0,170.0};
        int index = 0;
        for (PaymentType type : PaymentType.values()) {
            System.out.println(type.processPayment(amounts[index]));
            index++;
        }
    }
}