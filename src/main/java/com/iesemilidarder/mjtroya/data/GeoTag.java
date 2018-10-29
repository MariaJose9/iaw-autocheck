package com.iesemilidarder.mjtroya.data;

import java.util.List;

/*
public enum GeoTag {
    MALLORCA, MENORCA, IBIZA, CABRERA, FORMENTERA
}*/
public class GeoTag{
    private List<GeoTag> locality;
    private String name;

    public List<GeoTag> getLocality() {
        return locality;
    }

    public void setLocality(List<GeoTag> locality) {
        this.locality = locality;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
