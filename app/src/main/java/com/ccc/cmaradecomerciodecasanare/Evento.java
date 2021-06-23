package com.ccc.cmaradecomerciodecasanare;

import java.io.Serializable;

public class Evento implements Serializable {


    private int imageId;

    public Evento(){}

    public Evento( int imageId) {

        this.imageId = imageId;
    }


    public int getImageId() {
        return imageId;
    }

    public void setImageId(int imageId) {
        this.imageId = imageId;
    }
}
