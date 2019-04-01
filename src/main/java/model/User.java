package model;

import java.util.ArrayList;
import java.util.List;


public class User {
        private static int conunter = 1;

        private String name;
        private int userId;

    public ArrayList<MediaItem> getRentedMediaItems() {
        return rentedMediaItems;
    }

    ArrayList<MediaItem> rentedMediaItems;

        public User(String name) {
            this.name = name;
            this.userId = conunter++;
            rentedMediaItems =  new ArrayList<>();
        }

    public String rentMediaItem(List<MediaItem> mediaDatabase, int inventoryNumberOfMediaItemToRent){
        if(inventoryNumberOfMediaItemToRent >= 1 || inventoryNumberOfMediaItemToRent < mediaDatabase.size()){

            for(MediaItem mediaItem: mediaDatabase){
                if(mediaItem.getInventoryNumber() == inventoryNumberOfMediaItemToRent){
                    if(mediaItem.getAvalability() == true){
                        mediaItem.setAvalability(false);
                        rentedMediaItems.add(mediaItem);
                        return mediaItem.getTitle() + " ok";
                    }else{
                        return mediaItem.getTitle() + " NOTok";
                    }
                }
            }
            return "No mediaItem in database";
        }
        return "Bad inventory number";
    }
}
