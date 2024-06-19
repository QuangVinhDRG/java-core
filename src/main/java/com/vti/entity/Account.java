package com.vti.entity;

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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public LocalDate getCreateDate() {
        return createDate;
    }

    public void setCreateDate(LocalDate createDate) {
        this.createDate = createDate;
    }
}
