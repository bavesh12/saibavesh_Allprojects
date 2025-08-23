package oops;

class student2 {
	void details(int rollno) {
		System.out.println("Rollno=" + rollno);
	}

	void details(int rollno, String name) {
		System.out.println("Rollno=" + rollno);
		System.out.println("Name=" + name);
	}

	void details(String name, int rollno) {
		System.out.println("Name=" + name);
		System.out.println("Rollno=" + rollno);
	}

	void details(int rollno, String name, float per) {
		System.out.println("Rollno=" + rollno);
		System.out.println("Name=" + name);
		System.out.println("Percentage=" + per);
	}

	public static void main(String[] args) {
		student2 stud = new student2();
		System.out.println("****student  rollno******");
		stud.details(101);

		System.out.println("****student  rollno and name******");
		stud.details(102, "Neeva sharma");
		System.out.println("****student  name and rollno******");
		stud.details("reeva sharma", 103);
		System.out.println("****student  rollno and name and percentage******");
		stud.details(103, "Sai", 80);

	}

}
