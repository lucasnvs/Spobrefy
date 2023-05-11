package com.spobrefy.users;

public class Admin extends NotDefaultUser<Admin> {
    private String spobrefyToken;
    
    public Admin(String spobrefyToken, String nickname, String email, String password, String cpf, String birthDate, int age) {
        super(nickname, email, password, cpf, birthDate, age);
        this.spobrefyToken = spobrefyToken;
    }

    public String getSpobrefyToken() {
        return spobrefyToken;
    }

    public static Admin create() {
        return NotDefaultUser.create(Admin.class);
    }
}
    

