package com.spobrefy;
import java.util.Scanner;

import com.spobrefy.content.Music;
import com.spobrefy.dao.ArtistsDAO;
import com.spobrefy.dao.MusicsDAO;
import com.spobrefy.dao.UsersDAO;
import com.spobrefy.users.*;

public class Sistema {
    private String sysName;
    private User loggedUser;
    private Scanner scan = new Scanner(System.in); 
    private UsersDAO allUsers = UsersDAO.getInstance();
    private ArtistsDAO allArtists = ArtistsDAO.getInstance();
    private MusicsDAO allMusics = MusicsDAO.getInstance();

    public Sistema(String sysName) {
        this.sysName = sysName;
    }

    public User getLoggedUser() {
        return loggedUser;
    }

    public void showArtists() { 
        System.out.println("| ARTISTAS DO "+sysName.toUpperCase());
        System.out.println("|");
        for(Artist artist : allArtists.findAll()) {
            System.out.println("|::ID: "+artist.getId()+" ::NOME: "+artist.getNickname()+" ::MÚSICAS POSTADAS: "+ artist.getAuthoredPlaylist().size());
        }
    }

    public void showMusics() {
        System.out.println("| MÚSICAS DO "+sysName.toUpperCase());
        System.out.println("|");
        for( Music music : allMusics.findAll()) {
            System.out.println("|::ID: "+music.getId()+" ::NOME: "+music.getName()+" ::AUTHOR: "+music.getAuthor().getNickname());
        }
    }
    public void registerUser() {
        User user = User.create(this.scan);
        this.allUsers.save(user);

        System.out.println("=======================================================================");
        System.out.println("CONTA REGISTRADA COM SUCESSO!");
        System.out.println("=======================================================================");
    }

    private boolean loginVerify(String nick, String pass) {
        for (User user : allUsers.findAll()) {
            if (user.getNickname().equals(nick) && user.getPassword().equals(pass)) {
                loggedUser = user;
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