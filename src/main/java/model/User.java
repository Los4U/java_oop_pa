package model;

import java.util.ArrayList;


public class User {
        private static int conunter = 1;

        private String name;
        private int userId;

        ArrayList<MediaItem> rentedMediaItems;

        public User(String name) {
            this.name = name;
            this.userId = conunter++;
            rentedMediaItems =  new ArrayList<>();
        }

}
