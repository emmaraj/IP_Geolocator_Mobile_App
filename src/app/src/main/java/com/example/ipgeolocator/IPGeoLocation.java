/**
 * CREATED BY: Raj
 * ON: 01/07/2020 AT 1:31 PM
 **/
package com.example.ipgeolocator;

import android.os.Parcel;
import android.os.Parcelable;

public class IPGeoLocation implements Parcelable {
    private String ipAddress, country, regionName, city, isp, latitude, longitude;

    public IPGeoLocation(String ipAddress, String country, String regionName, String city, String isp, String latitude, String longitude) {
        this.ipAddress = ipAddress;
        this.country = country;
        this.regionName = regionName;
        this.city = city;
        this.isp = isp;
        this.latitude = latitude;
        this.longitude = longitude;
    }


    public IPGeoLocation(Parcel in) {
        this.ipAddress = in.readString();
        this.country = in.readString();;
        this.regionName = in.readString();;
        this.city = in.readString();;
        this.isp = in.readString();;
        this.latitude = in.readString();;
        this.longitude = in.readString();;
    }

    public String getIpAddress() {
        return ipAddress;
    }

    public String getCountry() {
        return country;
    }

    public String getRegionName() {
        return regionName;
    }

    public String getCity() {
        return city;
    }

    public String getIsp() {
        return isp;
    }

    public String getLatitude() {
        return latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(ipAddress);
        dest.writeString(country);
        dest.writeString(latitude);
        dest.writeString(longitude);
        dest.writeString(isp);
        dest.writeString(city);
        dest.writeString(regionName);
    }
}//end class IPGeoLocation
