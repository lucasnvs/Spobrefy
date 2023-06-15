package com.spobrefy.dao;

import java.util.ArrayList;
import java.util.List;

import com.spobrefy.users.Artist;

public class ArtistsDAO implements DaoInterface<Artist> {
    private static final ArtistsDAO instance = new ArtistsDAO();
    private List<Artist> artistsList;

    private ArtistsDAO() {
        artistsList = new ArrayList<>();
    }

    public static ArtistsDAO getInstance() {
        return instance;
    }

    @Override
    public Artist findById(int id) {
        for (Artist artist : artistsList) {
            if (artist.getId() == id) {
                return artist;
            }
        }
        return null;
    }

    @Override
    public List<Artist> findAll() {
        return artistsList;
    }

    @Override
    public void save(Artist artist) {
        artistsList.add(artist);
    }

    @Override
    public void update(Artist artist) {
        // Implementação da lógica de atualização do artista
    }

    @Override
    public void delete(Artist artist) {
        artistsList.remove(artist);
    }
}
