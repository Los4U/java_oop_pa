package model;

import model.Enums.BookGenres;
import model.Enums.MediaType;

import java.io.IOException;
import java.nio.CharBuffer;
import java.time.LocalDate;

public class Book extends MediaItem implements Readable{
    private BookGenres bookGenres;

    public Book(MediaType mediaType, String title, String author, LocalDate releaseDate, int lenght, BookGenres novel) {
        super(mediaType, title, author, releaseDate, lenght);
        this.bookGenres = bookGenres;
    }

    @Override
    public int read(CharBuffer cb) throws IOException {
        return 0;
    }

    @Override
    protected String displayLength() {
        return null;
    }
}
