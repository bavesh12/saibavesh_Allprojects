package wrapperclass;

public class CheckDigit {
    public static void main(String[] args) {
        String r = "Sai23";
        int digitCount = 0;
        int charCount = 0;

        for (char c : r.toCharArray()) {
            if (Character.isDigit(c)) {
                System.out.println(c + " is a digit");
                digitCount++;
            } else {
                System.out.println(c + " is not a digit");
                charCount++;
            }
        }

        System.out.println("Total digits: " + digitCount);
        System.out.println("Total characters (non-digits): " + charCount);
    }
}
