package model;

import java.util.List;

public class Manager extends User {
    public Manager(String name) {
        super(name);
    }


    public String addMediaItemToDatabase(List<MediaItem> mediaDatabase, MediaItem mediaItemToAdd) {
        if(null == mediaItemToAdd){
            return "Please specify new mediaItem";
        }else if(!checkIfMediaToAddIsPropper(mediaItemToAdd)){
            return "Check the submitted date, lack of something.";
        }
        mediaDatabase.add(mediaItemToAdd);
        return mediaItemToAdd.getTitle() + " added SUCSSESFULLY";
    }

    //TODO needs to implements this function more, to check each fields that is not null
    private boolean checkIfMediaToAddIsPropper(MediaItem mediaItemToAdd) {
        if(null == mediaItemToAdd.getTitle()
                || null == mediaItemToAdd.getAuthor()
                || null == mediaItemToAdd.getReleaseDate()){
            return false;
        }
        return true;
    }


    public String removeMediaItemFromDatabase(List<MediaItem> mediaDatabase, int itemNumberThatWillBeRemoved) {
        if(itemNumberThatWillBeRemoved <= 0 || itemNumberThatWillBeRemoved > mediaDatabase.size()) {
            return "Bad ID, check data";
        }
        for(MediaItem mediaItem: mediaDatabase){
            if(mediaItem.getInventoryNumber() == itemNumberThatWillBeRemoved){
                mediaDatabase.remove(mediaItem);
                return mediaItem.getTitle() + " removed SUCSSESFULLY";
            }
        }
        return "No item in database";
    }
}
