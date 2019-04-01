package controller;

import model.MediaItem;
import model.User;

import java.util.List;

public class UserController {
    public String rentMediaItemByInventoryNumber(List<MediaItem> mediaDatabase, int inventoryNumberOfMediaItemToRent, User user) {
        return user.rentMediaItem(mediaDatabase, inventoryNumberOfMediaItemToRent);

    }

    public String returnMediaItemByInventoryNumber(List<MediaItem> mediaDatabase, int inventoryNumberOfMediaItemToReturn, User user) {
        return user.returnMediaItemByInventoryNumber(mediaDatabase, inventoryNumberOfMediaItemToReturn );
    }
}
