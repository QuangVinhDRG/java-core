package constructor;

import java.time.LocalDate;

public class Account {
    private int id;
    private String email;
    private String userName;
    private String fullName;
    private Department department;
    private Position position;
    private LocalDate dateCreate;

    public Account() {
    }

    public Account(int id, String email, String firstName, String lastName) {
        this.id = id;
        this.email = email;
        
    }
}
