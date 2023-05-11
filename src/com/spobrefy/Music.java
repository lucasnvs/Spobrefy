package com.spobrefy;
import com.spobrefy.users.Artist;

public class Music {
    private static int count = 0;
    private int idMusic;
    private String name;
    private Artist author;
    private Double rating;

    public Music(String name, Artist author, Double rating){
        this.name = name;
        this.author = author;
        this.rating = rating;
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

}
