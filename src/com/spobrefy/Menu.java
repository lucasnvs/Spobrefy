package com.spobrefy;
import java.util.Scanner;


public class Menu {
    public Scanner scan = new Scanner(System.in);
    private Sistema sistema;

    public Menu(Sistema sistema) {
        this.sistema = sistema;
    }

    public void init() {
        System.out.println("=======================================================================");
        System.out.println("Olá querido usuário, para acessar o sistema será necessário logar:");
        if(!dialogLogin()) return;

        dialogChoice();
    }

    private Boolean dialogLogin() {
        Integer aux;
        System.out.println("| 1 - Logar\n| 2 - Não possuo conta");
        aux = scan.nextInt();
        scan.nextLine();

        if(aux == 1) {
            if(sistema.login()) return true;
        }

        if(aux == 2) {
            sistema.registerUser();
            if(sistema.login()) return true;   
        }

        return false;
    }

    private void dialogChoice() {
        System.out.println("+ Oque deseja fazer?\n| 1 - Ver Músicas\n| 2 - Ver Artistas\n| 3 - Ir para o perfil\n| 4 - Deslogar");
        Integer aux = scan.nextInt();
        scan.nextLine();
        System.out.println("=======================================================================");
        if(aux == 1) {
            sistema.showMusics();
            System.out.println("|");
            System.out.println("+ Deseja fazer algumas das seguintes ações com uma música de sua escolha?");
        }
        if(aux == 2) {
            sistema.showArtists();
        }
        if(aux == 3) {
            sistema.getLoggedUser().print();
        }
    }
}
