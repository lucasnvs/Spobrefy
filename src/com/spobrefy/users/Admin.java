package com.spobrefy.users;

public class Admin extends User {
    String cpf;
    int age;
    String birthDate;
    String spobrefyToken;
    
    public Admin(String spobrefyToken, String nickname, String email, String password, String cpf, String birthDate, int age) {
        super(nickname, email, password);
        this.spobrefyToken = spobrefyToken;
        this.cpf = cpf;
        this.birthDate = birthDate;
        this.age = age;
    }

    public void imprimir() {
        String text = String.format("Id: %d\nNickname: %s\nPassword: %s\nEmail: %s\nIdade: %d anos\nCPF: %s\nData de Aniversário: %s", getIdUser(), nickname, password, email, age, cpf, birthDate);
        System.out.println(text);
    }
}
    

