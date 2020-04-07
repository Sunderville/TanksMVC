package com.sunderville.tanksmvc.models;

public class Tank {

    private DetailedInfo detailedInfo;

    public DetailedInfo getDetailedInfo() {
        return detailedInfo;
    }

    public void setDetailedInfo(DetailedInfo detailedInfo) {
        this.detailedInfo = detailedInfo;
    }

    public Tank(DetailedInfo detailedInfo) {
        this.detailedInfo = detailedInfo;
    }

    public Double calculate() {

        return 0.0;
    }


    public String defineType() {

        return "~РВС-1000";
    }
}
