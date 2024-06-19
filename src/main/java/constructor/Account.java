package constructor;

import java.time.LocalDate;

public class Account {
    private int id;
    private String email;
    private String userName;
    private String fullName;
    private Department department;
    private Position position;
    private LocalDate createDate;

    public Account() {
    }

    public Account(int id, String email, String userName, String firstName, String lastName) {
        this.id = id;
        this.email = email;
        this.userName = userName;
        this.fullName = firstName.concat(lastName);
    }

    public Account(int id, String email, String userName, Position position, String firstName, String lastName) {
        this.id = id;
        this.email = email;
        this.userName = userName;
        this.position = position;
        this.fullName = firstName.concat(lastName);
        this.createDate = LocalDate.now();
    }

    public Account(int id, String email, String userName, Position position, LocalDate createDate, String firstName, String lastName) {
        this.id = id;
        this.email = email;
        this.userName = userName;
        this.position = position;
        this.createDate = createDate;
        this.fullName = firstName.concat(lastName);
    }
}