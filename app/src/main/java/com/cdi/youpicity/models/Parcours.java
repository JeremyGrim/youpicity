package com.cdi.youpicity.models;

/**
 * Created by Administrateur on 31/08/2017.
 */

public class Parcours {

    private int img;
    private String title;
    private String time;
    private String parcourDetails;



    public Parcours(int img, String title, String time, String parcourDetails) {
        this.img = img;
        this.title = title;
        this.time = time;
        this.parcourDetails = parcourDetails;

    }

    public Parcours(int img, String title, String time) {
        this.img = img;
        this.title = title;
        this.time = time;

    }

    public String getParcourDetails() {
        return parcourDetails;
    }

    public void setParcourDetails(String parcourDetails) {
        this.parcourDetails = parcourDetails;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}
