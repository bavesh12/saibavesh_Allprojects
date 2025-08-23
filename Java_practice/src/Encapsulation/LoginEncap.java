package Encapsulation;

public class LoginEncap {
    String username = "sai bavesh";
    private String pass;

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getPass() {
        return pass;
    }

    public static void main(String[] args) {
        LoginEncap account = new LoginEncap();
        account.setPass("Sai@12");
        System.out.println("Username: " + account.username);
        System.out.println("Pass: " + account.getPass());
    }
}
