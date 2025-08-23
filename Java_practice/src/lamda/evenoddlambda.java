package lamda;


interface Even {
    boolean iseven(int num);
}

public class evenoddlambda {
    public static void main(String[] args) {
        Even check = (num) -> num % 2 == 0;
        System.out.println(check.iseven(2));
        System.out.println(check.iseven(9));
    }
}