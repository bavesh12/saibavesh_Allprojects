package Encapsulation;


public class Student {
	private String name = "Navin Yadav";
	private int age = 29;
	private String username = "navin29";
	private String password = "securePass123";

	// Getter methods (accessors)
	public String setName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public String getUsername() {
		return username;
	}

	// For security, do NOT create a getPassword() method in real applications

	// Setter methods (mutators)
	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	// Display method
	public void showStudentInfo() {
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
		System.out.println("Username: " + username);
		// Don't print password in real apps
		System.out.println("Password: " + password); // Only for practice
	}

	public static void main(String[] args) {
		Student s = new Student();

		// Setting new values
		s.setName("Sai Bavesh");
		s.setAge(22);
		s.setUsername("bavesh22");
		s.setPassword("myGamePass");

		// Display all info
		s.showStudentInfo();
	}
}

