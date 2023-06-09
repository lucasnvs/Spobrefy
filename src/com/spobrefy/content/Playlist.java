package com.spobrefy.content;

import java.util.ArrayList;

import com.spobrefy.users.User;

public class Playlist {
    private User owner;
    private String name;
    private ArrayList<Music> musics;  

    public Playlist(User owner, String name, ArrayList<Music> musics) { // criar uma lista vazia independente do contrutor e add musicas pelo metodo
        this.owner = owner;
        this.name = name;
        this.musics = musics;
    }

    public User getOwner() {
        return owner;
    }
    
    public String getName() {
        return name;
    }
    public ArrayList<Music> getMusics() {
        return musics;
    }

    public void addMusic() {
        // adicionar música;
    }

    public void print() {
        String txt = "";
        for (Music music : musics) {
            txt += "-- "+music.getName()+" --\n";
        }

        String text = String.format("Dono: %s\nNome da Playlist: %s\nMusicas: \n  %s", owner.getNickname(), name, txt);
        System.out.println(text);
    }
}
