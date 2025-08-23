package loops;

public class while2 {
	public static void main(String[] args) {
		char ch = 'a';
		while (ch <= 'z') {
			System.out.println(ch + "=" + (int) ch);
			ch++;
		}
	}

}

/*
 * char ch = 'a'; while(ch<='z') { System.out.println(ch); ch++; } output :
 * gives alphabets
 */