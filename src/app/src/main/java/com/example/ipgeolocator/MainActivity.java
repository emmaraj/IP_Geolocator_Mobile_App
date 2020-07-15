package com.example.ipgeolocator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.AsyncTask;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import java.net.URL;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        try {
            URL url = ApiUtil.buildUrl("24.48.0.1");
            new GeoLocationQueryTask().execute(url);
        } catch (Exception e){
            Log.e("IPGeolocationError", e.getMessage());
        }
    }
    public class GeoLocationQueryTask extends AsyncTask<URL, Void, String> {

        @Override
        protected String doInBackground(URL... urls) {
            String JSONResult = null;
            try {
                JSONResult = ApiUtil.getJSON(urls[0]);
            } catch (Exception e){
                Log.e("IPGeolocationError", e.getMessage());
            }
            return JSONResult;
        }//end doInBackground

        @Override
        protected void onPostExecute(String result) {
            if (result != null) {
                IPGeoLocation ipGeoLocation = ApiUtil.getDetailsFromJSON(result);

                Toast.makeText(MainActivity.this, "" + ipGeoLocation.getCountry(), Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(MainActivity.this, "Something wrong", Toast.LENGTH_SHORT).show();
            }
        }

        @Override
        protected void onPreExecute() {
            super.onPreExecute();
        }
    }
}