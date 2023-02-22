package ru.glebova.test;

public class User {
    private String login;

    private String email;


    public User(String login, String email) {
        this.email = email;
        this.login = login;
    }

    public User() {
    }

    public String getEmail() {
        return email;
    }

    public String getLogin() {
        return login;
    }
}
