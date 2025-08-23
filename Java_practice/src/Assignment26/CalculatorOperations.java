package Assignment26;

enum OperationSwitch {
    PLUS, MINUS, TIMES, DIVIDE;

    public double eval(double a, double b) {
        switch (this) {
            case PLUS:
                return a + b;
            case MINUS:
                return a - b;
            case TIMES:
                return a * b;
            case DIVIDE:
                if (b == 0) throw new ArithmeticException("Division by zero");
                return a / b;
            default:
                throw new IllegalStateException("Unknown operation");
        }
    }
}

enum OperationOverride {
    PLUS {
        @Override
        double eval(double a, double b) {
            return a + b;
        }
    },
    MINUS {
        @Override
        double eval(double a, double b) {
            return a - b;
        }
    },
    TIMES {
        @Override
        double eval(double a, double b) {
            return a * b;
        }
    },
    DIVIDE {
        @Override
        double eval(double a, double b) {
            if (b == 0) throw new ArithmeticException("Division by zero");
            return a / b;
        }
    };

    abstract double eval(double a, double b);
}

public class CalculatorOperations {
    public static void main(String[] args) {
        // Test switch-based version
        System.out.println("Switch-based Operations:");
        System.out.printf("PLUS: %.2f%n", OperationSwitch.PLUS.eval(10, 5));
        System.out.printf("MINUS: %.2f%n", OperationSwitch.MINUS.eval(10, 5));
        System.out.printf("TIMES: %.2f%n", OperationSwitch.TIMES.eval(10, 5));
        try {
            System.out.printf("DIVIDE: %.2f%n", OperationSwitch.DIVIDE.eval(10, 0));
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }

        // Test override-based version
        System.out.println("\nOverride-based Operations:");
        System.out.printf("PLUS: %.2f%n", OperationOverride.PLUS.eval(10, 5));
        System.out.printf("MINUS: %.2f%n", OperationOverride.MINUS.eval(10, 5));
        System.out.printf("TIMES: %.2f%n", OperationOverride.TIMES.eval(10, 5));
        try {
            System.out.printf("DIVIDE: %.2f%n", OperationOverride.DIVIDE.eval(10, 0));
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}