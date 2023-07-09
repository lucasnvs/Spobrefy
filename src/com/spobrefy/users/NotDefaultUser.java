package com.spobrefy.users;

import java.util.Scanner;
import com.spobrefy.Util;

public class NotDefaultUser extends User {
    private String cpf;
    private String birthDate;

    protected NotDefaultUser(String nickname, String email, String password, String cpf, String birthDate) {
        super(nickname, email, password);
        this.cpf = cpf;
        this.birthDate = birthDate;
    }

    public String getCpf() {
        return cpf;
    }

    public int getAge() {
        return Util.findAge( birthDate, "dd/mm/aaaa");
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void print() {
        String text = String.format("Id: %d\nNickname: %s\nPassword: %s\nEmail: %s\nIdade: %d anos\nCPF: %s\nData de Aniversário: %s", getId(), nickname, password, email, getAge(), cpf, birthDate);
        System.out.println(text);
    }

    public static <T extends NotDefaultUser> T create(Class<T> userType, Scanner scanner) {
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

        try {
            return userType.getDeclaredConstructor(String.class, String.class, String.class, String.class, String.class)
                    .newInstance(nick, email, password, cpf, birthDate);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
