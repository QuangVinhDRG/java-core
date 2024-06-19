package com.vti.frontend;

import constructor.Account;
import constructor.Group;

import java.time.LocalDate;

public class Program3 {
    public static void main(String[] args) {
        Account[] accounts = {
                new Account(1, "account1@gmail.com", "account1", "Nguyen", "Vinh"),
                new Account(2, "account2@gmail.com", "account2", "Nguyen", "Vinh"),
                new Account(3, "account3@gmail.com", "account3", "Nguyen", "Vinh")
        };
        Group group1 = new Group();
        Group group2 = new Group("group2", new Account(1, "account1@gmail.com", "account1", "Nguyen", "Vinh"), accounts, LocalDate.now());
        Group group3 = new Group();
    }
}
