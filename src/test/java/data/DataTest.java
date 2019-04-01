package data;

import controller.ManagerController;
import controller.UserController;
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
    private UserController userController;
    private List<MediaItem> mediaDatabase = data.getMediaDatabase();

    private MediaItem book = new Book(MediaType.BOOK,"Muminki" ,"Astrid Lindgren" , LocalDate.of(1985, 1 , 1 ),  33, BookGenres.NOVEL );
    private MediaItem album = new Album(MediaType.ALBUM,"Home by the sea mum" ,"Genesis" ,LocalDate.of(1983, 10 , 3 ) , 45, AlbumGenres.ROCK);
    private MediaItem itemThatWillBeRemoved = new Movie(MediaType.MOVIE,"Forest Gump" ,"Gorge Lucas" ,LocalDate.of(1990, 10 , 3 ), 112, MovieGenres.COMEDY);

    @BeforeEach
    void setUp() {
        mediaDatabase.clear();
        mediaDatabase.add(book);
        mediaDatabase.add(album);
        mediaDatabase.add(itemThatWillBeRemoved);

        manager = new Manager("Matheo");
        user = new User("Bob");
        managerController =  new ManagerController();
        userController =  new UserController();
    }

    @AfterEach
    void tearDown() {
        MediaItem.counter = 0;
    }

    @Test
    @DisplayName("Test DATABASE, is it return correct size")
    void getMediaDatabase() {
        mediaDatabase = data.getMediaDatabase();
        assertEquals(3, mediaDatabase.size(), "Wrong emptydatabase size");
    }

    @Test
    @DisplayName("Test ADDING MediaItems to library by Manager")
    void testAddingProperMediaItems() {
        MediaItem mediaItemToAdd =  new Book(MediaType.BOOK, "Encyklopedia PWN", "PWN", LocalDate.of(2011, 11, 4), 450, BookGenres.ENCYCLOPEDIA);
        String message = managerController.addMediaItemToDatabase(mediaDatabase, mediaItemToAdd, manager);
        assertEquals(4,  data.getMediaDatabase().size());
        assertEquals(mediaItemToAdd.getTitle() + " added SUCSSESFULLY" , message);
    }

    @Test
    @DisplayName("Test ADDING MediaItems to library by Manager NULL values")
    void testAddingMediaItemsWithNULL() {
        MediaItem mediaItemToAdd =  new Book(MediaType.BOOK, "Encyklopedia PWN", null, LocalDate.of(2011, 11, 4), 450, BookGenres.ENCYCLOPEDIA);
        String message = managerController.addMediaItemToDatabase(mediaDatabase, mediaItemToAdd, manager);
        assertEquals(3,  data.getMediaDatabase().size());
        assertEquals("Check the submitted date, lack of something." , message);
    }

    @Test
    @DisplayName("Test DELETING mediaItem by manager from database")
    public void removeItemFromMediatheq() {
        int itemNumberThatWillBeRemoved = 3;
        showAllDatabase(mediaDatabase);
        String message = managerController.removeMediaItemFromDatabase(mediaDatabase, itemNumberThatWillBeRemoved, manager);
        showAllDatabase(mediaDatabase);

        assertEquals(2, mediaDatabase.size() , "NO");
        assertEquals(itemThatWillBeRemoved.getTitle() + " removed SUCSSESFULLY", message , "NO");
    }

    @Test
    @DisplayName("Test DELETING mediaItem by manager from database _BAD_ID")
    public void removeItemFromMediatheq_BAD_ID() {
        int itemNumberThatWillBeRemoved = 14;
        showAllDatabase(mediaDatabase);
        String message = managerController.removeMediaItemFromDatabase(mediaDatabase, itemNumberThatWillBeRemoved, manager);
        showAllDatabase(mediaDatabase);

        assertEquals(3, mediaDatabase.size() , "Wrong database size");

    }


    @Test
    @DisplayName("Test of RENTING the mediItems from the librabry by the User")
    public void testOfrentingMediaItem(){
        int inventoryNumberOfMediaItemToRent = 2;
        showAllDatabase(mediaDatabase);
        String message = userController.rentMediaItemByInventoryNumber(mediaDatabase, inventoryNumberOfMediaItemToRent, user);
        showAllDatabase(mediaDatabase);
        showAllDatabase(user.getRentedMediaItems());
        assertEquals(1, user.getRentedMediaItems().size());
        assertEquals("Home by the sea mum rented SUCCESFULLY", message, "renting error");

    }

    @Test
    @DisplayName("Test of RETURNING the mediItems to the librabry by the User")
    public void testOfreturningMediaItem(){
        int inventoryNumberOfMediaItemToReturn = 2;
        showAllDatabase(mediaDatabase);
        String message = userController.returnMediaItemByInventoryNumber(mediaDatabase, inventoryNumberOfMediaItemToReturn, user);
        //TODO implement

    }








    private void showAllDatabase(List<MediaItem> mediaDatabase){
        System.out.println("------------------------------");
        for(MediaItem mediaItem: mediaDatabase){
            System.out.println(mediaItem.toString());
        }
    }








}