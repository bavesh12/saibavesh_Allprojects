package Variable;

public class Student {
	int rollno, age;
	float per;
	String name; // instance variable / global variable
	static String collegeName = "JVM"; // static variable common data

	void details(int rollno1, int age1, String name1, float per1) // local variables
	{
		rollno = rollno1;
		age = age1;
		per = per1;
		name = name1;

		System.out.println("Rollno=" + rollno);
		System.out.println("Age=" + age);
		System.out.println("Percentage=" + per);
		System.out.println("Name=" + name);
		System.out.println("Collegename=" + collegeName);
	}

	public static void main(String[] args) {
		Student stud = new Student();
		System.out.println("**************1st student***************");
		stud.details(9, 20, "Neeva Sharma", 98.8f); // for 1 student
		System.out.println("**************1st student***************");
		stud.details(10, 20, "jeeva roy", 78.6f); // for 1 student
		System.out.println("**************1st student***************");
		stud.details(11, 20, "rithwik", 86.8f); // for 1 student
		System.out.println("**************1st student***************");
		stud.details(12, 20, "Sai", 83.3f); // for 1 student
		System.out.println("**************1st student***************");
		stud.details(14, 20, "charan", 90.1f); // for 1 student
	}
}
