package TenthHW;

import java.util.Objects;

public class Password implements Cloneable{
    private final String PASSWORD;

    public Password(String password) {
        PASSWORD = password;
    }

    @Override
    public String toString() {
        return "Password{" +
                "PASSWORD='" + PASSWORD + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Password password = (Password) o;
        return Objects.equals(PASSWORD, password.PASSWORD);
    }

    @Override
    public int hashCode() {
        return Objects.hash(PASSWORD);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
