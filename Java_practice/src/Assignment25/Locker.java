package Assignment25;

public class Locker {
    private final String lockerId;
    private boolean isLocked;
    private final String passcode;
    private final SecurityManager security;

    private class SecurityManager {
        private boolean verifyPasscode(String input) {
            return passcode.equals(input);
        }
    }

    public Locker(String lockerId, String passcode) {
        this.lockerId = lockerId != null ? lockerId : "";
        this.passcode = passcode != null ? passcode : "0000";
        this.isLocked = true;
        this.security = new SecurityManager();
    }

    public boolean lock() {
        isLocked = true;
        return true;
    }

    public boolean unlock(String code) {
        if (security.verifyPasscode(code)) {
            isLocked = false;
            return true;
        }
        return false;
    }

    public boolean isLocked() {
        return isLocked;
    }

    public String getLockerId() {
        return lockerId;
    }

    public static void main(String[] args) {
        Locker locker = new Locker("L001", "1234");
        System.out.println("Locker ID: " + locker.getLockerId() + ", Locked: " + locker.isLocked());
        System.out.println("Attempt unlock with wrong code: " + locker.unlock("4321"));
        System.out.println("Locked: " + locker.isLocked());
        System.out.println("Attempt unlock with correct code: " + locker.unlock("1234"));
        System.out.println("Locked: " + locker.isLocked());
        locker.lock();
        System.out.println("After locking again: Locked: " + locker.isLocked());
    }
}