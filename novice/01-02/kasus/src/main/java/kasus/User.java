package kasus;

public class User {

    String username, password;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String setUsername(String username_baru) {
        username = username_baru;
        return username;
    }

    public String getUsername() {
        return username;
    }

    public String setPassword(String password_baru) {
        password = password_baru;
        return password;
    }

    public String getPassword() {
        return password;
    }
}