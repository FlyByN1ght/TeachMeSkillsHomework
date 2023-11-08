package TenthHW;

import lombok.Getter;
import lombok.Setter;

import java.util.Objects;

@Getter
@Setter
public class User implements Cloneable {
    private final String NAME;
    private final String LASTNAME;
    private Password password;
    private int id;

    User(String name, String lastName, int id, Password password) {
        this.NAME = name;
        this.LASTNAME = lastName;
        this.id = id;
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + NAME + '\'' +
                ", lastName='" + LASTNAME + '\'' +
                ", password='" + password + '\'' +
                ", id=" + id +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return id == user.id && Objects.equals(NAME, user.NAME) && Objects.equals(LASTNAME, user.LASTNAME) && Objects.equals(password, user.password);
    }

    @Override
    public int hashCode() {
        return Objects.hash(NAME, LASTNAME, password, id);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    protected User clone(boolean cloneType, int cloneId, User... users) throws CloneNotSupportedException {
        for (User user : users) {
            if (cloneType && cloneId == user.getId()) {
                User cloneUser = (User) super.clone();
                cloneUser.id = user.id;
                cloneUser.password = (Password) this.password.clone();
                return cloneUser;
            }
        }
        return (User) super.clone();
    }
}