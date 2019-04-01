package model;

import model.Enums.MediaType;
import model.Enums.MovieGenres;
import model.MediaItem;
import model.interfaces.Watchable;

import java.time.LocalDate;

public class Movie extends MediaItem implements Watchable {
    private MovieGenres movieGenres;

    public Movie(MediaType mediaType, String title, String author, LocalDate releaseDate, int lenght, MovieGenres movieGenres) {
        super(mediaType, title, author, releaseDate, lenght);
        this.movieGenres =  movieGenres;

    }

    @Override
    protected String displayLength() {
        return null;
    }


    @Override
    public void watch() {

    }
}
