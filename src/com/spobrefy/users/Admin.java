package com.spobrefy.users;

import java.util.Scanner;

public class Admin extends NotDefaultUser<Admin> {
    private String spobrefyToken;
    
    public Admin(String spobrefyToken, String nickname, String email, String password, String cpf, String birthDate, Integer age) {
        super(nickname, email, password, cpf, birthDate, age);
        this.spobrefyToken = spobrefyToken;
    }

    public String getSpobrefyToken() {
        return spobrefyToken;
    }

    public static Admin create() {
        Admin admin = NotDefaultUser.create(Admin.class);
        Scanner sc = new Scanner(System.in);
        System.out.println("Qual o token de acesso?");
        String token = sc.nextLine();   
        sc.close();

        admin.spobrefyToken = token;
        return admin;
    }
}
    

