package Assignment25;

public class BackwardSequence implements CharSequence {
    private final String data;

    public BackwardSequence(String data) {
        this.data = data != null ? data : "";
    }

    @Override
    public int length() {
        return data.length();
    }

    @Override
    public char charAt(int index) {
        if (index < 0 || index >= data.length()) {
            throw new IndexOutOfBoundsException();
        }
        return data.charAt(data.length() - 1 - index);
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        if (start < 0 || end > data.length() || start > end) {
            throw new IndexOutOfBoundsException();
        }
        StringBuilder reversed = new StringBuilder();
        for (int i = data.length() - end; i < data.length() - start; i++) {
            reversed.append(data.charAt(i));
        }
        return new BackwardSequence(reversed.toString());
    }

    @Override
    public String toString() {
        return new StringBuilder(data).reverse().toString();
    }

    public static void main(String[] args) {
        BackwardSequence seq = new BackwardSequence("hello");
        System.out.println("Original: hello");
        System.out.println("Reversed: " + seq);
        System.out.println("Length: " + seq.length());
        System.out.println("Char at 1: " + seq.charAt(1));
        System.out.println("Subsequence (1,4): " + seq.subSequence(1, 4));
        try {
            seq.charAt(10); // Invalid index
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Error: Invalid index");
        }
    }
}