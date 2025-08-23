package hosipital_db;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws SQLException {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Username: ");
        String username = sc.nextLine();
        System.out.print("Password: ");
        String password = sc.nextLine();

        if (!LoginService.login(username, password)) {
            System.out.println("Login failed. Exiting...");
            return;
        }

        // Initialize services with connection
        try {
            Connection conn = Modules.getConnection();
            PatientService.init(conn);
            AppointmentService.init(conn);
            BillingService.init(conn);
            ReportService.init(conn);
            
            while (true) {
                printMainMenu();
                int choice = getIntInput(sc, "Choose option: ");
                
                switch (choice) {
                    case 1 -> PatientService.registerPatient(sc);
                    case 2 -> PatientService.viewPatients();
                    case 3 -> AppointmentService.bookAppointment(sc);
                    case 4 -> BillingService.generateBill(sc);
                    case 5 -> handleReportsMenu(sc);
                    case 6 -> {
                        System.out.println("Goodbye!");
                        conn.close(); // Close connection before exit
                        return;
                    }
                    default -> System.out.println("Invalid option");
                }
            }
        } catch (Exception e) {
            System.err.println("Database connection error:");
            e.printStackTrace();
        }
    }
    
    private static void printMainMenu() {
        System.out.println("\n=== Hospital Management System ===");
        System.out.println("1. Register Patient");
        System.out.println("2. View Patients");
        System.out.println("3. Book Appointment");
        System.out.println("4. Generate Bill");
        System.out.println("5. Reports");
        System.out.println("6. Exit");
    }

    private static void handleReportsMenu(Scanner sc) throws SQLException {
        while (true) {
            System.out.println("\n=== Report Options ===");
            System.out.println("1. Average Patient Count");
            System.out.println("2. Patients by Ward");
            System.out.println("3. Patients by Admission Date");
            System.out.println("4. Return to Main Menu");
            
            int reportChoice = getIntInput(sc, "Select report type: ");
            
            switch (reportChoice) {
                case 1 -> ReportService.showAveragePatientCount();
                case 2 -> {
                    sc.nextLine(); // Clear buffer
                    String ward = getStringInput(sc, "Enter ward name: ");
                    ReportService.showPatientsByWard(ward);
                }
                case 3 -> ReportService.showPatientsByAdmissionDate();
                case 4 -> { return; }
                default -> System.out.println("Invalid report choice!");
            }
        }
    }

    private static int getIntInput(Scanner sc, String prompt) {
        System.out.print(prompt);
        while (!sc.hasNextInt()) {
            sc.next(); // Discard invalid input
            System.out.print("Please enter a number: ");
        }
        int input = sc.nextInt();
        sc.nextLine(); // Consume newline
        return input;
    }

    private static String getStringInput(Scanner sc, String prompt) {
        System.out.print(prompt);
        return sc.nextLine();
    }
}