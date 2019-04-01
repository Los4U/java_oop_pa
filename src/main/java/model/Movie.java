package model;

import model.Enums.MediaType;
import model.MediaItem;
import model.interfaces.Watchable;

import java.time.LocalDate;

public class Movie extends MediaItem implements Watchable {

    public Movie(MediaType mediaType, String title, String author, LocalDate releaseDate, int lenght) {
        super(mediaType, title, author, releaseDate, lenght);
    }

    @Override
    protected String displayLength() {
        return null;
    }


    @Override
    public void watch() {

    }
}
