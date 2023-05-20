package com.spobrefy.content;

import java.util.List;
import java.util.Scanner;

import com.spobrefy.users.Artist;

public class Music {
    private static int count = 0;
    private int idMusic;
    private String name;
    private Artist author;
    private Double rating;

    // rating é adicionado depois de acordo com aceitação do publico

    // necessario rever este metodo e o funcionamento junto com os parametros do metodo create
    public Music(String name, Artist author) {
        this.name = name;
        this.author = author;
        idMusic = ++count;
    }

    public int getId() {
        return idMusic;
    }

    public String getName() {
        return name;
    }

    public Artist getAuthor() {
        return author;
    }

    public Double getRating() {
        return rating;
    }

    private static Artist findAuthor(List<Artist> list, String authorName) {
        for (Artist artist : list) {
            if (artist.getNickname().equals(authorName)) {
                return artist;
            }
        }
        return null;
    }

    public static Music create(List<Artist> list, Scanner scanner) {
        // nao consegui consertar o bug
        System.out.println("Qual o título?");
        String title = scanner.nextLine();
        System.out.println("Qual o nome do autor?");
        String authorName = scanner.nextLine();

        Artist author = findAuthor(list, authorName);
        Music music = new Music(title, author);
        return music;
    }

    public void print() {
        String text = String.format("Id: %d\nTítulo: %s\nAutor: %s\nRating: %2.1f", idMusic, name, author.getNickname(),
                rating);
        System.out.println(text);
    }

}
