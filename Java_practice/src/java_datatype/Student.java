package java_datatype;

public class Student {
	String name = "Sai bavesh";
	int rollno = 9;
	float per = 85.08f;
	short age = 23;
	String course = "Java Selenium";
	String collegename = "JVM";
	String address = "606 D,delhi";
	char div = 'B';

	public static void main(String[] args) {
		Student stud = new Student();
		System.out.println("Name " + "= " + stud.name);
		System.out.println("Rollno " + "= " + stud.rollno);
		System.out.println("Percentage " + "= " + stud.per);
		System.out.println("Age " + "= " + stud.age);
		System.out.println("Course " + "= " + stud.course);
		System.out.println("Collegename " + "= " + stud.collegename);
		System.out.println("Address " + "= " + stud.address);
		System.out.println("Division " + "= " + stud.div);
	}
}