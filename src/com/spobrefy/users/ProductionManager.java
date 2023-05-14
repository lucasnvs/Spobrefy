package com.spobrefy.users;

import java.util.Scanner;

public class ProductionManager extends NotDefaultUser<ProductionManager> {

    public ProductionManager(String nickname, String email, String password, String cpf, String birthDate, Integer age) {
        super(nickname, email, password, cpf, birthDate, age);
    }

    public static ProductionManager create() {
        Scanner scanner = new Scanner(System.in);
        return NotDefaultUser.create(ProductionManager.class, scanner);
    }
}
