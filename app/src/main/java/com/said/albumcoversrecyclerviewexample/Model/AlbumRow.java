package com.said.albumcoversrecyclerviewexample.Model;

public class AlbumRow {  //This our model which we want to show main page

    String bandName, albumName, albumDate;
    int albumImage;

    public AlbumRow(String bandName, String albumName, String albumDate, int albumImage) {
        this.bandName = bandName;
        this.albumName = albumName;
        this.albumDate = albumDate;
        this.albumImage = albumImage;
    }

    public String getBandName() {
        return bandName;
    }

    public void setBandName(String bandName) {
        this.bandName = bandName;
    }

    public String getAlbumName() {
        return albumName;
    }

    public void setAlbumName(String albumName) {
        this.albumName = albumName;
    }

    public String getAlbumDate() {
        return albumDate;
    }

    public void setAlbumDate(String albumDate) {
        this.albumDate = albumDate;
    }

    public int getAlbumImage() {
        return albumImage;
    }

    public void setAlbumImage(int albumImage) {
        this.albumImage = albumImage;
    }
}
