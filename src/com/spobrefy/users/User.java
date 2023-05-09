package com.spobrefy.users;

public class User {
    protected String nickname;
    protected String email;
    protected String password;
    protected int idUser;
    private static int count = 0;

    public User(String nick, String email, String password) {
        this.nickname = nick;
        this.email = email;
        this.password = password;
        idUser = ++count;
    }

    public String getNickname() {
        return nickname;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }
    
    public int getId() {
        return idUser;
    }

    public void imprimir() {
        String text = String.format("Id: %d\nNickname: %s\nPassword: %s\nEmail: %s", idUser, nickname, password, email);
        System.out.println(text);
    }
}