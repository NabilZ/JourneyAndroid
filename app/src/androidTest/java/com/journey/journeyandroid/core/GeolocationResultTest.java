package com.journey.journeyandroid.core;

import junit.framework.TestCase;

import java.text.SimpleDateFormat;
import java.util.Date;

@SuppressWarnings("SpellCheckingInspection")
public class GeolocationResultTest extends TestCase {
    @Override
    protected void setUp() throws Exception {

    }

    public void testResultHasCorrectValues() throws Exception {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        Date date = sdf.parse("21/12/2014");
        double longitude = 1;
        double latitude = 2;
        double speed = 3;
        double accuracy = 4;
        double altitude = 5;

        GeolocationResult result = new GeolocationResult(
                date,longitude, latitude, speed, accuracy, altitude);

        assertTrue(result != null);
        assertTrue(result.getDateTime() == date);
        assertTrue(result.getLongitude() == longitude);
        assertTrue(result.getLatitude() == latitude);
        assertTrue(result.getSpeed() == speed);
        assertTrue(result.getAccuracy() == accuracy);
        assertTrue(result.getAltitude() == altitude);
    }
}
