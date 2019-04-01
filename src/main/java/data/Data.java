package data;

import model.MediaItem;

import java.util.ArrayList;
import java.util.List;

public class Data {

    public Data() {
    }

    private List<MediaItem> mediaDatabase =  new ArrayList<>();
    public List<MediaItem> getMediaDatabase() {
        return mediaDatabase;
    }

}



