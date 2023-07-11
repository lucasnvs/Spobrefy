package com.spobrefy;
import java.util.Scanner;

import com.spobrefy.dao.ArtistsDAO;
import com.spobrefy.dao.UsersDAO;
import com.spobrefy.users.*;

public class Sistema {
    private String sysName;
    private Scanner scan = new Scanner(System.in); 
    private UsersDAO allUsers = UsersDAO.getInstance();
    private ArtistsDAO allArtists = ArtistsDAO.getInstance();

    public Sistema(String sysName) {
        this.sysName = sysName;
    }

    private void addUser(User user) {
        this.allUsers.save(user);
    }

    public void showArtists() { // temporario
        System.out.println("| ARTISTAS DO "+sysName.toUpperCase());
        System.out.println();
        for(Artist artist : allArtists.findAll()) {
            System.out.println(":: Id: "+artist.getId()+" :: Nome: "+artist.getNickname()+" :: Email: "+artist.getEmail());
        }
    }

    public void registerUser() {
        User user = User.create(this.scan);
        this.addUser(user);
        System.out.println("=======================================================================");
        System.out.println("CONTA REGISTRADA COM SUCESSO!");
        System.out.println("=======================================================================");
    }

    private boolean loginVerify(String nick, String pass) {
        for (User user : allUsers.findAll()) {
            if (user.getNickname().equals(nick) && user.getPassword().equals(pass)) {
                return true;
            }
        }
        return false;
    }

    public Boolean login() {
            Integer aux;
            System.out.println("LOGIN DE USUÁRIO:");
            System.out.println("=======================================================================");
            System.out.println("+ Qual o seu nickname?");
            String nick = this.scan.nextLine();
            System.out.println("+ Qual sua senha?");
            String pass = this.scan.nextLine();

            if(!loginVerify(nick, pass)) {
                System.out.println("=======================================================================");
                System.out.println("SENHA OU NICKNAME INCORRETOS!");
                System.out.println("=======================================================================");
                System.out.println("| Deseja tentar novamente?\n| 1 - Tentar novamente\n| 2 - Desistir...");
                System.out.println("=======================================================================");
                aux = this.scan.nextInt();

                if(aux == 1) {
                    this.scan.nextLine();
                    login();
                }
                return false;
            }
            
            System.out.println("=======================================================================");      
            System.out.println(String.format("LOGADO COM SUCESSO! SEJA BEM VINDO DE VOLTA %s", nick));
            System.out.println("=======================================================================");
            return true;
    }
}