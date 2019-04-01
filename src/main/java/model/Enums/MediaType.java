package model.Enums;

import static model.Enums.LenghtType.*;

public enum MediaType {
    BOOK(NUMBEROFPAGES),
    ALBUM(MINUTES),
    MOVIE(MINUTES);

    private LenghtType typeOfLenght;

    MediaType(LenghtType typeOfLenght) {
        this.typeOfLenght = typeOfLenght;
    }

    public LenghtType getTypeOfLenght() {
        return typeOfLenght;
    }
}
