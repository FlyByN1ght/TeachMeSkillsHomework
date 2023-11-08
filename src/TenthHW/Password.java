package TenthHW;

import java.util.Objects;

public class Password implements Cloneable{
    private String password;

    public Password(String password) {
        Password.this.password = password;
    }

    @Override
    public String toString() {
        return "Password{" +
                "PASSWORD='" + password + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Password password = (Password) o;
        return Objects.equals(Password.this.password, password.password);
    }

    @Override
    public int hashCode() {
        return Objects.hash(password);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
