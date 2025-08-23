package Assignment24;


class Hospital {
    String hospitalName = "City Hospital";
    String location = "Downtown";

    void displayInfo() {
        System.out.println("Hospital: " + hospitalName + ", Location: " + location);
    }
}

class Patient extends Hospital {
    String patientName;

    Patient(String patientName) {
        this.patientName = patientName;
    }

    void showDetails() {
        System.out.println("Patient: " + patientName);
        displayInfo();
    }
}

public class HospitalPatient {
    public static void main(String[] args) {
        Patient patient = new Patient("John Doe");
        patient.showDetails();
    }
}
