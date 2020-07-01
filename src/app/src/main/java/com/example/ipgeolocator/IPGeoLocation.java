/**
 * CREATED BY: Raj
 * ON: 01/07/2020 AT 1:31 PM
 **/
package com.example.ipgeolocator;

class IPGeoLocation {
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
}//end class IPGeoLocation
