package data;

import controller.ManagerController;
import model.*;
import model.Enums.AlbumGenres;
import model.Enums.BookGenres;
import model.Enums.MediaType;
import model.Enums.MovieGenres;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.List;

class DataTest {

    Data data = new Data();
    private Manager manager;
    private User user;
    private ManagerController managerController;
    private List<MediaItem> mediaDatabase = data.getMediaDatabase();

    private MediaItem book = new Book(MediaType.BOOK,"Muminki" ,"Astrid Lindgren" , LocalDate.of(1985, 1 , 1 ),  33, BookGenres.NOVEL );
    private MediaItem album = new Album(MediaType.ALBUM,"Home by the sea mum" ,"Genesis" ,LocalDate.of(1983, 10 , 3 ) , 45, AlbumGenres.ROCK);
    private MediaItem itemThatWillBeRemoved = new Movie(MediaType.MOVIE,"Forest Gump" ,"Gorge Lucas" ,LocalDate.of(1990, 10 , 3 ), 112, MovieGenres.COMEDY);

    @BeforeEach
    void setUp() {


    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void getMediaDatabase() {
    }
}