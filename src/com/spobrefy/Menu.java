package com.spobrefy;
import java.util.Scanner;


public class Menu {
    public Scanner scan = new Scanner(System.in);

    public void init(Sistema sistema) {
        System.out.println("=======================================================================");
        System.out.println("Olá querido usuário, para acessar o sistema será necessário logar:");
        if(!dialogLogin(sistema)) return;
        // entra no sistema e faz as ações;
    }

    private Boolean dialogLogin(Sistema sistema) {
        Integer aux;
        Scanner sc = this.scan;
        System.out.println("| 1 - Logar\n| 2 - Não possuo conta");
        aux = sc.nextInt();
        sc.nextLine();

        if(aux == 1) {
            if(sistema.login()) return true;
        }

        if(aux == 2) {
            sistema.registerUser();
            if(sistema.login()) return true;   
        }

        return false;
    }
}
