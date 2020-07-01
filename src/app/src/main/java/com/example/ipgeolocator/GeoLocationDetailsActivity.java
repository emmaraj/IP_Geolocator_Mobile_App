package com.example.ipgeolocator;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import android.os.Bundle;

import com.example.ipgeolocator.databinding.ActivityGeoLocationDetailsBinding;

public class GeoLocationDetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_geo_location_details);

        IPGeoLocation geoLocation = getIntent().getParcelableExtra("GeoLocation");
        ActivityGeoLocationDetailsBinding details = DataBindingUtil.setContentView(this, R.layout.activity_geo_location_details);
    }
}