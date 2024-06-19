package constructor;

import java.time.LocalDate;

public class Group {
    private int id;
    private String name;
    private Account creator;
    private LocalDate createDate;
    private Account[] accounts;
    private String[] usernames;

    public Group() {
    }

    public Group(String name, Account creator, Account[] accounts, LocalDate createDate) {
        this.name = name;
        this.creator = creator;
        this.accounts = accounts;
        this.createDate = createDate;
    }

    public Group(String name, Account creator, String[] usernames, LocalDate createDate) {
        this.name = name;
        this.creator = creator;
        this.createDate = createDate;
        Account[] listAccount = new Account[usernames.length];
        for (int i = 0; i < usernames.length; i++) {
            listAccount[i] = new Account(i, null, usernames[i], null, null);
        }
        this.accounts = listAccount;
    }
}
