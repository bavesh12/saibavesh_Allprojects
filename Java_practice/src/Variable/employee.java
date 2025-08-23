package Variable;

public class employee {
	int empId, age;
	float salary;
	String name;
	static String companyName = "Wipro";
	static String location = "Hyderabad";

	void details(int empId1, int age1, String name1, float salary1) // local variables
	{
		empId = empId1;
		age = age1;
		salary = salary1;
		name = name1;

		System.out.println("Emp ID = " + empId);
		System.out.println("Age = " + age);
		System.out.println("Salary = " + salary);
		System.out.println("Name = " + name);
		System.out.println("Company Name = " + companyName);
		System.out.println("Location = " + location);

	}

	public static void main(String[] args) {
		employee emp = new employee();
		System.out.println("************** 1st Employee ***************");
		emp.details(1, 30, "Rahul", 30000.10f);
		System.out.println("************** 2nd Employee ***************");
		emp.details(2, 23, "Sai", 35000.20f);
		System.out.println("************** 3rd Employee ***************");
		emp.details(3, 26, "Rithwik", 40000.50f);
		System.out.println("************** 4th Employee ***************");
		emp.details(4, 24, "charan", 55000.50f);
		System.out.println("************** 5th Employee ***************");
		emp.details(5, 28, "Revanth", 60000.70f);
	}
}
