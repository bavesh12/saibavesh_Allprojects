package Interface;

interface Doctor {
    void operation();
    void OPD();
}

interface Nurse {
    void dailycheck();
    void documentation();
}

interface Accountant {
    void payment();
    void query();
}

class DoctorImpl implements Doctor {
    public void operation() {
        System.out.println("patient visited which doctor for op");
    }
    
    public void OPD() {
        System.out.println("patient visited which doctor for opd");
    }
}

class NurseImpl implements Nurse {
    public void dailycheck() {
        System.out.println("patient visited which nurse for daily checkup");
    }
    
    public void documentation() {
        System.out.println("patient visited which nurse for daily doc");
    }
}

class AccountantImpl implements Accountant {
    public void payment() {
        System.out.println("patient visited which accountant for payment");
    }
    
    public void query() {
        System.out.println("patient visited which accountant for query");
    }
}

public class Hospitaldemo {
    public static void main(String[] args) {
        // Create instances of each class
        Doctor doctor = new DoctorImpl();
        Nurse nurse = new NurseImpl();
        Accountant accountant = new AccountantImpl();
        
        // Demonstrate functionalities
        System.out.println("patients implement Doctor, Nurse, Accountant");
        doctor.operation();
        doctor.OPD();
        
        // Demonstrate Nurse functionalities
        nurse.dailycheck();
        nurse.documentation();
        
        // Demonstrate Accountant functionalities
        accountant.payment();
        accountant.query();
    }
}