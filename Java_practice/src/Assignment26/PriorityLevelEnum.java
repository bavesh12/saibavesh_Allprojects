package Assignment26;

enum PriorityLevel {
    LOW(1), MEDIUM(5), HIGH(8), CRITICAL(10);

    private final int severity;

    PriorityLevel(int severity) {
        this.severity = severity;
    }

    public int getSeverity() {
        return severity;
    }

    public boolean isUrgent() {
        return severity >= 8;
    }
}

public class PriorityLevelEnum {
    public static void main(String[] args) {
        for (PriorityLevel level : PriorityLevel.values()) {
            System.out.printf("Priority: %s, Severity: %d, Urgent: %b%n",
                    level, level.getSeverity(), level.isUrgent());
        }
    }
}
