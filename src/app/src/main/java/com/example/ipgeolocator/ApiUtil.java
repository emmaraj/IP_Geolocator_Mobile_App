/**
 * CREATED BY: Raj
 * ON: 01/07/2020 AT 1:23 PM
 **/
package com.example.ipgeolocator;

import android.net.Uri;
import android.util.Log;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;

public class ApiUtil {
    public static final String BASE_API_URL = "http://ip-api.com/json/";

    public static URL buildUrl(String address) {

        URL url = null;
        try {
            Uri uri = Uri.parse(BASE_API_URL + address).buildUpon()
                    .build();
            url = new URL(uri.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return url;
    }

    public static String getJSON(URL url) throws IOException {
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        try {
            InputStream stream = connection.getInputStream();
            Scanner scanner = new Scanner(stream);
            scanner.useDelimiter("\\A"); //means to read everything
            boolean hasData = scanner.hasNext();
            if (hasData) {
                return scanner.next();
            } else {
                return null;
            }
        } catch (Exception e) {
            Log.e("Error", e.toString());
            return null;
        } finally {
            connection.disconnect();
        }

    }

    public static IPGeoLocation getDetailsFromJSON(String json) {
        final String ipAddress = "query";
        final String country = "country";
        final String regionName = "regionName";
        final String city = "city";
        final String isp = "isp";
        final String latitude = "lat";
        final String longitude = "lon";

        IPGeoLocation ipGeoLocation = null;
        try {
            JSONObject geoLocationJSONObject = new JSONObject(json);
            ipGeoLocation = new IPGeoLocation(
                    geoLocationJSONObject.getString(ipAddress),
                    geoLocationJSONObject.getString(country),
                    geoLocationJSONObject.getString(regionName),
                    geoLocationJSONObject.getString(city),
                    geoLocationJSONObject.getString(isp),
                    geoLocationJSONObject.getString(latitude),
                    geoLocationJSONObject.getString(longitude)
            );
        } catch (JSONException e) {
            Log.e("IPGeolocationError", e.getMessage());
        }


        return ipGeoLocation;
    }
}//end class ApiUtil
