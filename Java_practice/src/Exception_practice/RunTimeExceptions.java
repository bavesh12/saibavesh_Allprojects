package Exception_practice;

public class RunTimeExceptions {
    public static void main(String[] args) {

        try {
            String message = null;
            System.out.println(message.length());
        } catch (NullPointerException npe) {
            System.out.println("NullPointerException: " + npe.getMessage());
        }

        try {
            Object number = 10;
            String text = (String) number;
        } catch (ClassCastException cce) {
            System.out.println("ClassCastException: " + cce.getMessage());
        }

        try {
            Class.forName("com.unknown.ClassName");
        } catch (ClassNotFoundException cnfe) {
            System.out.println("ClassNotFoundException: " + cnfe.getMessage());
        }

        try {
            System.out.printf("%d", "Hello");
        } catch (java.util.IllegalFormatException ife) {
            System.out.println("IllegalFormatException: " + ife.getMessage());
        }

        try {
            int value = Integer.parseInt("xyz");
        } catch (NumberFormatException nfe) {
            System.out.println("NumberFormatException: " + nfe.getMessage());
        }
    }
}
