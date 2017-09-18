package com.example.android.greengourmet;

/**
 * Created by Polymath on 12/09/2017.
 */

public class DirectionParameter {
    private String bikeCoord;
    private String walkingCoord;
    private String drivingCoord;

    public DirectionParameter(String bItem, String wItem, String dItem) {

        bikeCoord = bItem;
        walkingCoord = wItem;
        drivingCoord = dItem;

    }

    public String getBikeCoordinates() {
        return bikeCoord;
    }

    public String getWalkingCoordinates() {
        return walkingCoord;
    }


    public String getDrivingCoordinates() {
        return drivingCoord;

    }
}
