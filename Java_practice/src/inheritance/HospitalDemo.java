package inheritance;

class Hospital {
	void hospitalInfo() {
		System.out.println("This is a Hospital.");
	}
}

// Doctor
class Doctor extends Hospital {
	void doctorRole() {
		System.out.println("Doctor provides medical treatment.");
	}
}

// Gynac
class Gynac extends Doctor {
	void gynacSpecialty() {
		System.out.println("Specialty: Gynecology.");
	}
}

// Endo
class Endo extends Doctor {
	void endoSpecialty() {
		System.out.println("Specialty: Endocrinology.");
	}
}

// Nurse
class Nurse extends Hospital {
	void nurseRole() {
		System.out.println("Nurse assists in patient care.");
	}
}

// Cardiac
class Cardiac extends Nurse {
	void cardiacRole() {
		System.out.println("Cardiac Nurse handles heart-related care.");
	}
}

// Operation
class Operation extends Cardiac {
	void operationTask() {
		System.out.println("Task: Assists in surgical operations.");
	}
}

// OPD
class OPD extends Cardiac {
	void opdTask() {
		System.out.println("Task: Manages Out-Patient Department.");
	}
}

//Accountant
class Accountant extends Hospital {
	void accountantRole() {
		System.out.println("Accountant manages financial records.");
	}
}

//Payments
class Payments extends Accountant {
	void paymentsTask() {
		System.out.println("Task: Handles patient payments.");
	}
}

//Documentation
class Documentation extends Accountant {
	void documentationTask() {
		System.out.println("Task: Manages documentation.");
	}
}

public class HospitalDemo {
	public static void main(String[] args) {
		Gynac gynac = new Gynac();
		gynac.hospitalInfo();
		gynac.doctorRole();
		gynac.gynacSpecialty();

		Endo endo = new Endo();
		endo.hospitalInfo();
		endo.doctorRole();
		endo.endoSpecialty();

		Operation operation = new Operation();
		operation.hospitalInfo();
		operation.nurseRole();
		operation.cardiacRole();
		operation.operationTask();

		OPD opd = new OPD();
		opd.hospitalInfo();
		opd.nurseRole();
		opd.cardiacRole();
		opd.opdTask();

		Payments payments = new Payments();
		payments.hospitalInfo();
		payments.accountantRole();
		payments.paymentsTask();

		Documentation documentation = new Documentation();
		documentation.hospitalInfo();
		documentation.accountantRole();
		documentation.documentationTask();
	}
}
