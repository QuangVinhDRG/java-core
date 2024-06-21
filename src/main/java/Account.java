import java.io.Serializable;

public class Account implements Serializable {
    private int id;
    private String username;
    private transient String password; // transient: không lưu thuộc tính này trong file

    public Account(int id, String username, String password) {
        this.id = id;
        this.username = username;
        this.password = password;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
