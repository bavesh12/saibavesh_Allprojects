package wrapperclass;

public class Auto_demo {
    public static void main(String[] args) {

        // Autoboxing (Convert Primitive to wrapper classes)
        int num = 10;
        System.out.println("Primitive type of data = " + num); // memory allocation for 4 byte
        Integer num1 = num; // Convert Primitive int to Object Integer
        System.out.println("Wrap data = " + num1);

        // Unboxing (Convert wrappers to primitive)
        Integer a = 20;
        System.out.println("For object = " + a);
        int b = a; // Unboxing (Object to primitive)
        System.out.println("For primitive data type in = " + b);

        // String to int conversion
        String str = "12345";
        int ab = Integer.parseInt(str);
        System.out.println(ab);

        // int to String conversion
        String n = Integer.toString(num);
        System.out.println(n);
        
        char c = '5';
        int num11 = Character.getNumericValue(c);
        System.out.println(num11); // Output: 5
        
        
        String r = "bavesh12";
        for (char c1 : r.toCharArray()) {
            if (Character.isDigit(c1)) {
                System.out.println(c1 + " is a digit");
            } else {
                System.out.println(c1 + " is not a digit");
            }
        }
    }

}

