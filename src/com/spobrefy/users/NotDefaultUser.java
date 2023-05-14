package com.spobrefy.users;

import java.util.Scanner;

public class NotDefaultUser<T extends NotDefaultUser<T>> extends User {
    private String cpf;
    private int age;
    private String birthDate;

    public NotDefaultUser(String nickname, String email, String password, String cpf, String birthDate, int age) {
        super(nickname, email, password);
        this.cpf = cpf;
        this.birthDate = birthDate;
        this.age = age;
    }

    public String getCpf() {
        return cpf;
    }

    public int getAge() {
        return age;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void print() {
        String text = String.format("Id: %d\nNickname: %s\nPassword: %s\nEmail: %s\nIdade: %d anos\nCPF: %s\nData de Aniversário: %s", getId(), nickname, password, email, age, cpf, birthDate);
        System.out.println(text);
    }

    public static <T extends NotDefaultUser<T>> T create(Class<T> userType, Scanner scanner) {
        // necessário usar o scanner como parâmetro para ele não ser fechado podendo reaproveitar este método em outros métodos create()
        System.out.println("Qual seu nick?");
        String nick = scanner.nextLine();
        System.out.println("Qual seu email?");
        String email = scanner.nextLine();
        System.out.println("Qual sua senha?");
        String password = scanner.nextLine();
        System.out.println("Qual seu cpf?");
        String cpf = scanner.nextLine();
        System.out.println("Qual sua data de nascimento? dd/mm/aaaa");
        String birthDate = scanner.nextLine();
        System.out.println("Qual sua idade em anos?");
        Integer age = scanner.nextInt();

        try {
            return userType.getDeclaredConstructor(String.class, String.class, String.class, String.class, String.class, Integer.class)
                    .newInstance(nick, email, password, cpf, birthDate, age);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
