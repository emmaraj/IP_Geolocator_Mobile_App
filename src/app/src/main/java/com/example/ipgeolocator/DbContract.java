/**
 * CREATED BY: Raj
 * ON: 14/07/2020 AT 11:36 PM
 **/
package com.example.ipgeolocator;

import android.provider.BaseColumns;

public class DbContract {
    public static class GeoLocationEntry implements BaseColumns {
        private static String COLUMN_IP_ADDRESS = "IP_ADDRESS";
        private static String COLUMN_COUNTRY = "COUNTRY";
        private static String COLUMN_REGION_NAME = "REGION";
        private static String COLUMN_CITY = "CITY";
        private static String COLUMN_ISP = "ISP";
        private static String COLUMN_LATITUDE = "LATITUDE";
        private static String COLUMN_LONGITUDE = "LONGITUDE";
        private static String COLUMN_ID = "_ID";

        private static String TABLE_NAME = "GeoLocations";


        public static String CREATE_TABLE = "CREATE TABLE " + TABLE_NAME + " ("
                + COLUMN_ID + " INTEGER PRIMARY KEY"
                + COLUMN_IP_ADDRESS + " TEXT "
                + COLUMN_REGION_NAME + " TEXT"
                + COLUMN_COUNTRY + " TEXT"
                + COLUMN_CITY + " TEXT"
                + COLUMN_ISP + " TEXT"
                + COLUMN_LATITUDE + " TEXT"
                + COLUMN_LONGITUDE + " TEXT"
                + ")";
    }
}//end class DbContract
