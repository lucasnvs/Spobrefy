package com.spobrefy;
import java.util.Scanner;

import com.spobrefy.users.User;

public class Menu {
    // talvez mover as funções para o sistema e usar aq pelo parametro de sistema, deixando apenas os dialogs;
    public void init(Sistema sistema) {
        System.out.println("=======================================================================");
        System.out.println("Olá querido usuário, para acessar o sistema será necessário logar :(");
        if(!login(sistema)) return;
        // entra no sistema e faz as ações;
    }

    private void registerUser(Sistema sistema) {
        User user = User.create(sistema.scan);
        sistema.addUser(user);
        System.out.println("=======================================================================");
        System.out.println("CONTA REGISTRADA COM SUCESSO!");
        System.out.println("=======================================================================");
    }

    private Boolean login(Sistema sistema) {
        
        Integer aux;

        Scanner sc = sistema.scan;

        System.out.println("=======================================================================");
        System.out.println("Login de Usuário:");
        System.out.println("| 1 - Logar\n| 2 - Não possuo conta");
        aux = sc.nextInt();
        sc.nextLine();

        if(aux == 1) {
            System.out.println("=======================================================================");
            System.out.println("+ Qual o seu nickname?");
            String nick = sc.nextLine();
            System.out.println("+ Qual sua senha?");
            String pass = sc.nextLine();

            if(!sistema.loginVerify(nick, pass)) {
                System.out.println("=======================================================================");
                System.out.println("SENHA OU NICKNAME INCORRETOS!");
                System.out.println("=======================================================================");
                System.out.println("| Deseja tentar novamente?\n| 1 - Tentar novamente\n| 2 - Desistir...");
                System.out.println("=======================================================================");
                aux = sc.nextInt();

                if(aux == 1) login(sistema);
                return false;
            };
            System.out.println("=======================================================================");      
            System.out.println(String.format("LOGADO COM SUCESSO! SEJA BEM VINDO DE VOLTA %s", nick));
            System.out.println("=======================================================================");
            return true;
        }

        if(aux == 2) {
            registerUser(sistema);
            login(sistema);
        };

        return false;
    }
}
