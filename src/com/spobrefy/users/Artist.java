package com.spobrefy.users;

import java.util.Scanner;

public class Artist extends NotDefaultUser<Artist>{

    public Artist(String nickname, String email, String password, String cpf, String birthDate, Integer age) {
        super(nickname, email, password, cpf, birthDate, age);
    }

    public static Artist create(Scanner scanner) {
        return NotDefaultUser.create(Artist.class, scanner);
    }
}
