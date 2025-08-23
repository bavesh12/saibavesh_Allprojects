package oops;

class School {
	School() {
		System.out.println("One particular format uniform");
		System.out.println("Fixed syllabus");
		System.out.println("Follow timing for is between 7 to 5");
	}
}

class SNBP extends School {
	SNBP() {
		super();
		System.out.println("Pattern of Study like 70% study 30% Sports");
	}
}

public class School_demo {
	public static void main(String[] args) {
		SNBP snbp = new SNBP();
	}
}
