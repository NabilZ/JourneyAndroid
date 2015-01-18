package com.journey.journeyandroid.core;

import java.util.Date;

public class GeolocationResult {
    private Date dateTime;
    private double longitude;
    private double latitude;
    private double speed;
    private double accuracy;
    private double altitude;

    public GeolocationResult(
            Date dateTime, double longitude, double latitude,
            double speed, double accuracy, double altitude) {

        this.dateTime = dateTime;
        this.longitude = longitude;
        this.latitude = latitude;
        this.speed = speed;
        this.accuracy = accuracy;
        this.altitude = altitude;
    }

    public Date getDateTime() { return dateTime; }

    public double getLongitude() { return this.longitude; }

    public double getLatitude() { return this.latitude; }

    public double getSpeed() { return this.speed; }

    public double getAccuracy() { return this.accuracy; }

    public double getAltitude() { return this.altitude; }
}
