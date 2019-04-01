package model;

import model.Enums.MediaType;
import model.interfaces.Listenable;

import java.time.LocalDate;

public class Album extends MediaItem implements Listenable {
    public Album(MediaType mediaType, String title, String author, LocalDate releaseDate, int lenght) {
        super(mediaType, title, author, releaseDate, lenght);
    }

    @Override
    protected String displayLength() {
        return null;
    }

    @Override
    public void listenTo() {

    }
}
