package TenthHW;

import lombok.Getter;
import lombok.Setter;

import java.util.Objects;

@Getter
@Setter
public class User implements Cloneable {
    private String name;
    private String lastName;
    private Password password;
    private int id;

    User(String name, String lastName, int id, Password password) {
        this.name = name;
        this.lastName = lastName;
        this.id = id;
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", password='" + password + '\'' +
                ", id=" + id +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return id == user.id && Objects.equals(name, user.name) && Objects.equals(lastName, user.lastName) && Objects.equals(password, user.password);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, lastName, password, id);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    protected User clone(boolean cloneType, int cloneId, User... users) throws CloneNotSupportedException {
        for (User user : users) {
            if (cloneType && cloneId == user.getId()) {
                user.password = (Password) this.password.clone();
                return user;
            }
        }
        return (User) super.clone();
    }
}