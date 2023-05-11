package com.spobrefy.users;

public class Artist extends User{
    String cpf;
    int age;
    String birthDate;
    
    public Artist(String nickname, String email, String password, String cpf, String birthDate, int age) {
        super(nickname, email, password);
        this.cpf = cpf;
        this.birthDate = birthDate;
        this.age = age;
    }

    public void imprimir() {
        String text = String.format("Id: %d\nNickname: %s\nPassword: %s\nEmail: %s\nIdade: %d anos\nCPF: %s\nData de Aniversário: %s", getIdUser(), nickname, password, email, age, cpf, birthDate);
        System.out.println(text);
    }
    //public static Artist create() {

    //}
}
