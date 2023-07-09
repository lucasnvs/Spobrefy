package com.spobrefy.users;

import java.util.Scanner;

public class Artist extends NotDefaultUser{

    public Artist(String nickname, String email, String password, String cpf, String birthDate) {
        super(nickname, email, password, cpf, birthDate);
    }

    public static Artist create(Scanner scanner) {
        return NotDefaultUser.create(Artist.class, scanner);
    }
}
