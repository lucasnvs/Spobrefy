package com.spobrefy.users;

import java.util.Scanner;

public class ProductionManager extends NotDefaultUser {

    private ProductionManager(String nickname, String email, String password, String cpf, String birthDate) {
        super(nickname, email, password, cpf, birthDate);
    }

    public static ProductionManager create(Scanner scanner) {
        return NotDefaultUser.create(ProductionManager.class, scanner);
    }
}
