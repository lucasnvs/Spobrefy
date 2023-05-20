package com.spobrefy.users;

import java.util.ArrayList;
import java.util.Scanner;

import com.spobrefy.content.Playlist;

public class User {
    protected int idUser;
    private static int count = 0;
    protected String nickname;
    protected String email;
    protected String password;
    private ArrayList<Playlist> allPlaylists;

    public User(String nick, String email, String password) {
        this.nickname = nick;
        this.email = email;
        this.password = password;
        this.allPlaylists = new ArrayList<>();
        idUser = ++count;
    }

    public void addPlaylist(Playlist playlist) {
        this.allPlaylists.add(playlist);
    }

    public String getNickname() {
        return nickname;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }
    
    public int getId() {
        return idUser;
    }

    public void print() {
        String txt = "";
        for (Playlist playlist : allPlaylists) {
            txt += "-- "+playlist.getName()+" --\n";
        }

        String text = String.format("Id: %d\nNickname: %s\nPassword: %s\nEmail: %s\nPlaylists do usuário: \n %s", idUser, nickname, password, email, txt);
        System.out.println(text);
    }

    public static User create(Scanner scanner) {
        System.out.println("Qual seu nick?");
        String nick = scanner.nextLine();
        System.out.println("Qual seu email?");
        String email = scanner.nextLine();
        System.out.println("Qual sua senha?");
        String password = scanner.nextLine();
        User usuario = new User(nick, email, password);
        return usuario;
    }

}

