package com.example.windows.kshitij_final;

import com.google.android.gms.maps.model.LatLng;

import java.util.HashMap;

/**
 * Created by Rohit on 21-02-2018.
 */


final class Constants {

    private Constants() {
    }

    private static final String PACKAGE_NAME = "com.example.windows.kshitij_final";

    static final String GEOFENCES_ADDED_KEY = PACKAGE_NAME + ".GEOFENCES_ADDED_KEY";

    /**
     * Used to set an expiration time for a geofence. After this amount of time Location Services
     * stops tracking the geofence.
     */
    private static final long GEOFENCE_EXPIRATION_IN_HOURS = 12;

    /**
     * For this sample, geofences expire after twelve hours.
     */
    static final long GEOFENCE_EXPIRATION_IN_MILLISECONDS =
            GEOFENCE_EXPIRATION_IN_HOURS * 60 * 60 * 1000;
    static final float GEOFENCE_RADIUS_IN_METERS = 2500; // 1 mile, 1.6 km

    /**
     * Map for storing information about airports in the San Francisco bay area.
     */
    static final HashMap<String, LatLng> BAY_AREA_LANDMARKS = new HashMap<>();

    static {
        // San Francisco International Airport.
        BAY_AREA_LANDMARKS.put("SFO", new LatLng(37.621313, -122.378955));
        BAY_AREA_LANDMARKS.put("Gandhi redi", new LatLng(28.361805,75.588664)); //lat,long
        //BAY_AREA_LANDMARKS.put("Gandhi redi2", new LatLng(75.588664,28.361805));

        // Googleplex.
        BAY_AREA_LANDMARKS.put("GOOGLE", new LatLng(37.422611,-122.0840577));
    }
}
