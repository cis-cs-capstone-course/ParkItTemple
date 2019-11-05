package com.example.parkittemple.database;

import java.io.Serializable;

public class Calculation implements Serializable {

    private String availableSpots;
    private String probability;

    public String getAvailableSpots() {
        return availableSpots;
    }

    public void setAvailableSpots(String spotsAvailable) {
        this.availableSpots = spotsAvailable;
    }

    public String getProbability() {
        return probability;
    }

    public void setProbability(String probability) {
        this.probability = probability;
    }
}
