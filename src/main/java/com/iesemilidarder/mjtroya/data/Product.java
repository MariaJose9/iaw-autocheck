package com.iesemilidarder.mjtroya.data;

public abstract class Product {
    private String name;
    private String color;
    private Integer numWheels;
    private Double price;
    private String activitykind;
    private String company;
    private String geographically;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Integer getNumWheels() {
        return numWheels;
    }

    public void setNumWheels(Integer numWheels) {
        this.numWheels = numWheels;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getActivitykind() {
        return activitykind;
    }

    public void setActivitykind(String activitykind) {
        this.activitykind = activitykind;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getGeographically() {
        return geographically;
    }

    public void setGeographically(String geographically) {
        this.geographically = geographically;
    }

}

