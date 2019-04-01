package model;

import model.Enums.LenghtType;
import model.Enums.MediaType;

import java.time.LocalDate;

public abstract class MediaItem {

    public static int counter = 0;
    private int inventoryNumber;

    private Boolean avalability;
    private Boolean reserved;
    private MediaType mediaType;
    private LenghtType lenghtType;

    private String title;
    private String author;
    private LocalDate releaseDate;
    private int lenght;

    public MediaItem(MediaType mediaType, String title, String author, LocalDate releaseDate, int lenght) {
        this.inventoryNumber = ++counter;
        this.avalability = true;
        this.reserved = false;
        this.mediaType = mediaType;
        this.lenghtType = mediaType.getTypeOfLenght();
        this.title = title;
        this.author = author;
        this.releaseDate = releaseDate;
        this.lenght = lenght;
    }

    abstract String displayLength();

    public int getInventoryNumber() {
        return inventoryNumber;
    }

    public void setInventoryNumber(int inventoryNumber) {
        this.inventoryNumber = inventoryNumber;
    }

    public Boolean getAvalability() {
        return avalability;
    }

    public void setAvalability(Boolean avalability) {
        this.avalability = avalability;
    }

    public MediaType getMediaType() {
        return mediaType;
    }

    public void setMediaType(MediaType mediaType) {
        this.mediaType = mediaType;
    }

    public LenghtType getLenghtType() {
        return lenghtType;
    }

    public void setLenghtType(LenghtType lenghtType) {
        this.lenghtType = lenghtType;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public LocalDate getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(LocalDate releaseDate) {
        this.releaseDate = releaseDate;
    }

    public int getLenght() {
        return lenght;
    }

    public void setLenght(int lenght) {
        this.lenght = lenght;
    }

    public Boolean getReserved() {
        return reserved;
    }

    public void setReserved(Boolean reserved) {
        this.reserved = reserved;
    }

    private String isReserved(){
        return reserved ? "RESERVED" : "NOT RESERVED";
    }
    private String isAvailable(){
        return avalability ? "AVAILABLE" : "UN-AVAILABLE";
    }

    @Override
    public String toString() {
        return inventoryNumber + ". | "+ title +", "+ author +", "+ releaseDate.getYear() +"r. - " + isReserved() +" | "+ isAvailable();
    }
}

