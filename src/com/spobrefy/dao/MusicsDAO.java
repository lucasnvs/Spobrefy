package com.spobrefy.dao;

import java.util.List;

import com.spobrefy.content.Music;

public class MusicsDAO implements DaoInterface<Music> {
    private static final MusicsDAO instance = new MusicsDAO();
    private List<Music> musicList;

    public static MusicsDAO getInstance() {
        return instance;
    }

    @Override
    public Music findById(int id) {
        for (Music music : musicList) {
            if (music.getId() == id) {
                return music;
            }
        }
        return null;
    }

    @Override
    public List<Music> findAll() {
        return musicList;
    }

    @Override
    public void save(Music object) {
        musicList.add(object);
    }

    @Override
    public void update(Music object) {
        // todo implementation
    }

    @Override
    public void delete(Music object) {
        musicList.remove(object);
    }
}
