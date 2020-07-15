/**
 * CREATED BY: Raj
 * ON: 14/07/2020 AT 11:51 PM
 **/
package com.example.ipgeolocator;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.example.ipgeolocator.DbContract.GeoLocationEntry;

import androidx.annotation.Nullable;

public class GeoLocationDbHelper extends SQLiteOpenHelper {
    private static final String DB_NAME = "GeoDb.db";
    private static final int DB_VERSION = 1;

    public GeoLocationDbHelper(@Nullable Context context) {
        super(context, DB_NAME, null, DB_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(GeoLocationEntry.CREATE_TABLE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}//end class GeoLocationDbHelper
