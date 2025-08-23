package oops;

class softwaretesting {
	void syllabus() {
		System.out.println("Software testing course details");
		System.out.println("Manual testing,core java, selenium webdriver, Jira(Project Managmement");
		System.out.println("50000");
	}
}

class Manual extends softwaretesting {
	void manual_testing() {
		super.syllabus();
		System.out.println(
				"If it is manual testing only \nthen it includes Manual testing,core java, selenium webdriver, Jira(Project Managmement");
	}
}

class Automation extends softwaretesting {
	void automation_testing() {
		super.syllabus();
		System.out.println(
				"If it is Automation testing only \nthen it includes Manual testing,core java, selenium webdriver, Jira(Project Managmement");
	}
}

public class oops3 {
	public static void main(String[] args) {
		System.out.println("*********Manual testing******");
		Manual mn = new Manual();
		mn.manual_testing();
	}
}
