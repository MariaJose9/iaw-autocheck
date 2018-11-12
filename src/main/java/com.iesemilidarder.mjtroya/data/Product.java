package com.iesemilidarder.mjtroya.data;

public abstract class Product {
    private String name;
    private Double price;
    private String activityKind;
    private String company;
    private GeoTag geoTag;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getActivityKind() {
        return activityKind;
    }

    public void setActivityKind(String activityKind) {
        this.activityKind = activityKind;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public GeoTag getGeoTag() { return geoTag; }

    public void setGeoTag(GeoTag geoTag) { this.geoTag = geoTag; }
}

