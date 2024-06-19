package com.vti.frontend;

import constructor.Account;
import constructor.Position;

import java.time.LocalDate;

public class Program2 {
    public static void main(String[] args) {
        Account account1 = new Account();
        Account account2 = new Account(1, "account@gmail.com", "account2", "Nguyen", "Vinh");
        Account account3 = new Account(2, "account@gmail.com", "account3", new Position(1, "Dev"), "Nguyen", "Vinh");
        Account account4 = new Account(3, "account@gmail.com", "account4", new Position(2, "PM"), LocalDate.now(), "Nguyen", "Vinh");
    }
}
