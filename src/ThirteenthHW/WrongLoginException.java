package ThirteenthHW;

public class WrongLoginException extends Exception {
    private final String LOGIN;

    public WrongLoginException(String login) {
        this.LOGIN = login;
    }

    @Override
    public String toString() {
        return "Wrong login: " + LOGIN;
    }
}
