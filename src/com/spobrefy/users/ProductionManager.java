package com.spobrefy.users;

public class ProductionManager extends NotDefaultUser<ProductionManager> {

    public ProductionManager(String nickname, String email, String password, String cpf, String birthDate, int age) {
        super(nickname, email, password, cpf, birthDate, age);
    }

    public static ProductionManager create() {
        return NotDefaultUser.create(ProductionManager.class);
    }
}
