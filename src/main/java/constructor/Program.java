package constructor;

import java.time.LocalDate;

public class Program {
    public static void main(String[] args) {
        // Question 1
        Department department1 = new Department();
        Department department2 = new Department("Sale");

        // Question 2
        Account account1 = new Account();
        Account account2 = new Account(1, "account@gmail.com", "account2", "Nguyen", "Vinh");
        Account account3 = new Account(2, "account@gmail.com", "account3", new Position(1, "Dev"), "Nguyen", "Vinh");
        Account account4 = new Account(3, "account@gmail.com", "account4", new Position(2, "PM"), LocalDate.now(), "Nguyen", "Vinh");

        // Question 3
        Account[] accounts = {
                new Account(1, "account1@gmail.com", "account1", "Nguyen", "Vinh"),
                new Account(2, "account2@gmail.com", "account2", "Nguyen", "Vinh"),
                new Account(3, "account3@gmail.com", "account3", "Nguyen", "Vinh")
        };
        Group group1 = new Group();
        Group group2 = new Group("group2", new Account(1, "account1@gmail.com", "account1", "Nguyen", "Vinh"), accounts, LocalDate.now());
        String[] usernames = {"account1", "account2", "account3", "account4", "account5", "account6"};
        Group group3 = new Group("group1", new Account(1, "account@gmail.com", "account1", "Nguyen", "Vinh"), usernames, LocalDate.now());
    }
}
