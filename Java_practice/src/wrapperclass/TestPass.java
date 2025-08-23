package wrapperclass;

public class TestPass {

    public static void changepassword(String password) {
        password = "NewPassword";
    }

    public static void main(String[] args) {
        String password = "OldPassword";
        changepassword(password); // pass reference (actually pass-by-value of reference)
        System.out.println("Password method = " + password);
    }
}

