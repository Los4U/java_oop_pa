package model;

import model.Enums.AlbumGenres;
import model.Enums.MediaType;
import model.interfaces.Listenable;

import java.time.LocalDate;

public class Album extends MediaItem implements Listenable {
    private AlbumGenres albumGenres;

    public Album(MediaType mediaType, String title, String author, LocalDate releaseDate, int lenght, AlbumGenres albumGenres) {
        super(mediaType, title, author, releaseDate, lenght);
        this.albumGenres = albumGenres;
    }

    @Override
    protected String displayLength() {
        return null;
    }

    @Override
    public void listenTo() {

    }
}
