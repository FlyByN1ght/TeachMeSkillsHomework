package ThirteenthHW;

public class WrongPasswordException extends Exception {
    private final String PASSWORD;

    public WrongPasswordException(String password) {
        this.PASSWORD = password;
    }

    @Override
    public String toString() {
        return "Wrong password: " + PASSWORD;
    }
}
