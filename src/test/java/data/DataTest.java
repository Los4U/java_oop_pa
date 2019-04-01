package data;

import controller.ManagerController;
import model.Manager;
import model.MediaItem;
import model.User;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class DataTest {

    Data data = new Data();
    private Manager manager;
    private User user;
    private ManagerController managerController;
    private List<MediaItem> mediaDatabase = data.getMediaDatabase();

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