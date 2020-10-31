package com.example.tumen_drive;

class Companion {
    private String companionName,companionsAmount, rideDistance, location, time ;


    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Companion(String companionName, int  companionsRealAmount, int companionsMaxAmount, int rideDistance, String vicinity,
                     String places, String time){

        this.companionName = companionName;
        this.companionsAmount = (companionsRealAmount) +"/" + (companionsMaxAmount) + " companions";
        this.rideDistance = rideDistance + " km";
        this.location = vicinity + " " + places;
        this.time = time;
    }

    public String getCompanionName() {
        return companionName;
    }

    public void setCompanionName(String companionName) {
        this.companionName = companionName;
    }

    public String getCompanionsAmount() {
        return companionsAmount;
    }

    public void setCompanionsAmount(String companionsAmount) {
        this.companionsAmount = companionsAmount;
    }

    public String getRideDistance() {
        return rideDistance;
    }

    public void setRideDistance(String rideDistance) {
        this.rideDistance = rideDistance;
    }


    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}
