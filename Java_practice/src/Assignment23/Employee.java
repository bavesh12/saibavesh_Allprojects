package Assignment23;

public class Employee {
	String name = "Obulesh";
	int id = 12;
	String Department = "MBBS";
	short age = 25;
	float salary = 45000.00f;

	public static void main(String[] args) {
		Employee emp = new Employee();
		System.out.println("Name " + "= " + emp.name);
		System.out.println("id " + "= " + emp.id);
		System.out.println("Department " + "= " + emp.Department);
		System.out.println("Age " + "= " + emp.age);
		System.out.println("Salary " + "= " + emp.salary);
	}
}
