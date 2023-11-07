package TenthHW;

import java.util.Objects;

public class User implements Cloneable {
    private final String NAME;
    private final String LASTNAME;
    private Password password;
    private final int ID;

    User(String name, String lastName, int id, Password password) {
        this.NAME = name;
        this.LASTNAME = lastName;
        this.ID = id;
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + NAME + '\'' +
                ", lastName='" + LASTNAME + '\'' +
                ", password='" + password + '\'' +
                ", id=" + ID +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return ID == user.ID && Objects.equals(NAME, user.NAME) && Objects.equals(LASTNAME, user.LASTNAME) && Objects.equals(password, user.password);
    }

    @Override
    public int hashCode() {
        return Objects.hash(NAME, LASTNAME, password, ID);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    protected User clone(boolean cloneType, int cloneId) throws CloneNotSupportedException {
        if (cloneType && cloneId == this.ID) {
            User cloneUser = (User) super.clone();
            cloneUser.password = (Password) this.password.clone();
            return cloneUser;
        } else
            return (User) super.clone();
    }
}