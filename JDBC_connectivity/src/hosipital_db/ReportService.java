package hosipital_db;

import java.sql.*;

public class ReportService {

    // Initialize with connection from Modules
    private static Connection conn;

    public static void init(Connection connection) {
        conn = connection;
    }

    public static void showAveragePatientCount() {
        try (CallableStatement stmt = conn.prepareCall("{CALL GetAveragePatientCount()}")) {
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                System.out.printf("\nAverage patients per day: %.1f\n\n", 
                    rs.getDouble("avg_per_day"));
            }
        } catch (SQLException e) {
            System.err.println("Error in average patient count:");
            e.printStackTrace();
        }
    }

    public static void showPatientsByWard(String wardName) {
        try (CallableStatement stmt = conn.prepareCall("{CALL GetPatientsByWard(?)}")) {
            stmt.setString(1, wardName);
            ResultSet rs = stmt.executeQuery();
            
            System.out.println("\nPatients in " + wardName + " ward:");
            System.out.println("ID\tName\t\tAge\tGender");
            System.out.println("----------------------------------");
            while (rs.next()) {
                System.out.printf("%d\t%-15s\t%d\t%s\n",
                    rs.getInt("patient_id"),
                    rs.getString("name"),
                    rs.getInt("age"),
                    rs.getString("gender"));
            }
            System.out.println();
        } catch (SQLException e) {
            System.err.println("Error fetching patients by ward:");
            e.printStackTrace();
        }
    }

    public static void showPatientsByAdmissionDate() {
        try (CallableStatement stmt = conn.prepareCall("{CALL GetPatientsByAdmissionDate()}")) {
            ResultSet rs = stmt.executeQuery();
            
            System.out.println("\nPatients by Admission Date:");
            System.out.println("ID\tName\t\tAdmission Date");
            System.out.println("----------------------------------");
            while (rs.next()) {
                System.out.printf("%d\t%-15s\t%s\n",
                    rs.getInt("patient_id"),
                    rs.getString("name"),
                    rs.getDate("admission_date"));
            }
            System.out.println();
        } catch (SQLException e) {
            System.err.println("Error fetching patients by admission date:");
            e.printStackTrace();
        }
    }

    public static void close() {
        try {
            if (conn != null && !conn.isClosed()) {
                conn.close();
            }
        } catch (SQLException e) {
            System.err.println("Error closing connection:");
            e.printStackTrace();
        }
    }
    
}