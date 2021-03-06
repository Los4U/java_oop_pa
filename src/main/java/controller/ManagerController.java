package controller;

import model.Manager;
import model.MediaItem;

import java.util.List;

public class ManagerController {


    public String addMediaItemToDatabase(List<MediaItem> mediaDatabase, MediaItem mediaItemToAdd, Manager manager) {
        return manager.addMediaItemToDatabase(mediaDatabase, mediaItemToAdd);
    }

    public String removeMediaItemFromDatabase(List<MediaItem> mediaDatabase, int itemNumberThatWillBeRemoved, Manager manager) {
    return manager.removeMediaItemFromDatabase(mediaDatabase, itemNumberThatWillBeRemoved);
    }
}
