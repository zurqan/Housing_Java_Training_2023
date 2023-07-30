package basic.session8;

public enum UserStatus {
    ACTIVE(0),
    INACTIVE(1),
    BLOCKED(2),
    PENDING_REGISTRATION(3);

    private final int intStatus;

    UserStatus(int intStatus) {
        this.intStatus = intStatus;
    }

    public int getIntStatus() {
        return intStatus;
    }
}
