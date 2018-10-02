package com.example.marcelo.tkl_game_lister_app;

import java.util.ArrayList;

public class Games {

    private String id;
    private String name;
    private String image;
    private String release_date;
    private String trailer;
  //  private String[] platforms;

    public Games(String id, String name, String image, String release_date, String trailer, String[] platforms) {
        this.id = id;
        this.name = name;
        this.image = image;
        this.release_date = release_date;
        this.trailer = trailer;
    //    this.platforms = platforms;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getRelease_date() {
        return release_date;
    }

    public void setRelease_date(String release_date) {
        this.release_date = release_date;
    }

    public String getTrailer() {
        return trailer;
    }

    public void setTrailer(String trailer) {
        this.trailer = trailer;
    }

    //public String[] getPlatforms() {
      //  return platforms;
    //}

    //public void setPlatforms(String[] platforms) {
      //  this.platforms = platforms;
    //}
}
