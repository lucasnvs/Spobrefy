package com.spobrefy.users;

import java.util.Scanner;

public class Admin extends NotDefaultUser<Admin> {
    private String spobrefyToken;
    
    // token removido do construtor por incompatibilidade com o metodo create do NotDefaultUser e adicionado no método create local desta classe
    // depois será necessário uma verificação para criar o admin se seu token for válido.
    public Admin(String nickname, String email, String password, String cpf, String birthDate, Integer age) {
        super(nickname, email, password, cpf, birthDate, age);
    }

    public String getSpobrefyToken() {
        return spobrefyToken;
    }

    public static Admin create(Scanner scanner) {
        Admin admin = NotDefaultUser.create(Admin.class, scanner);
        System.out.println("Qual o token de acesso?");
        String token = scanner.next();
        System.out.println(token);   

        admin.spobrefyToken = token;
        return admin;
    }
}
    

