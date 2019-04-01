package data;

import controller.ManagerController;
import model.*;
import model.Enums.AlbumGenres;
import model.Enums.BookGenres;
import model.Enums.MediaType;
import model.Enums.MovieGenres;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DataTest {

    Data data = new Data();
    private Manager manager;
    private User user;
    private ManagerController managerController;
    private List<MediaItem> mediaDatabase = data.getMediaDatabase();

    private MediaItem book = new Book(MediaType.BOOK,"Muminki" ,"Astrid Lindgren" , LocalDate.of(1985, 1 , 1 ),  33, BookGenres.NOVEL );
    private MediaItem album = new Album(MediaType.ALBUM,"Home by the sea mum" ,"Genesis" ,LocalDate.of(1983, 10 , 3 ) , 45, AlbumGenres.ROCK);
    private MediaItem movie = new Movie(MediaType.MOVIE,"Forest Gump" ,"Gorge Lucas" ,LocalDate.of(1990, 10 , 3 ), 112, MovieGenres.COMEDY);

    @BeforeEach
    void setUp() {
        mediaDatabase.add(book);
        mediaDatabase.add(album);
        mediaDatabase.add(movie);

        manager = new Manager("Matheo");
        managerController =  new ManagerController();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    @DisplayName("Test database, is it return correct size")
    void getMediaDatabase() {
        mediaDatabase = data.getMediaDatabase();
        assertEquals(3, mediaDatabase.size(), "Wrong emptydatabase size");
    }

    @Test
    @DisplayName("Test adding MediaItems to library by Manager")
    void testAddingProperMediaItems() {
        MediaItem mediaItemToAdd =  new Book(MediaType.BOOK, "Encyklopedia PWN", "PWN", LocalDate.of(2011, 11, 4), 450, BookGenres.ENCYCLOPEDIA);
        String message = managerController.addMediaItemToDatabase(mediaDatabase, mediaItemToAdd, manager);
        assertEquals(4,  data.getMediaDatabase().size());
        assertEquals(mediaItemToAdd.getTitle() + " added SUCSSESFULLY" , message);
    }

    @Test
    @DisplayName("Test adding MediaItems to library by Manager NULL values")
    void testAddingMediaItemsWithNULL() {
        MediaItem mediaItemToAdd =  new Book(MediaType.BOOK, "Encyklopedia PWN", null, LocalDate.of(2011, 11, 4), 450, BookGenres.ENCYCLOPEDIA);
        String message = managerController.addMediaItemToDatabase(mediaDatabase, mediaItemToAdd, manager);
        assertEquals(3,  data.getMediaDatabase().size());
        assertEquals("Check the submitted date, lack of something." , message);
    }
}