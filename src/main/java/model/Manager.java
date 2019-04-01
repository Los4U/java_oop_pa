package model;

import com.sun.tools.javac.comp.Todo;

import java.util.List;
import java.util.function.ToDoubleBiFunction;

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
        return "OK";
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


}
