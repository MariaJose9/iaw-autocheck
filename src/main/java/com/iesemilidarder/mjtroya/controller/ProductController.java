package com.iesemilidarder.mjtroya.controller;

import com.iesemilidarder.mjtroya.Launcher;
import com.iesemilidarder.mjtroya.data.Activity;
import com.iesemilidarder.mjtroya.data.ActivityType;
import com.iesemilidarder.mjtroya.data.GeoTag;
import com.iesemilidarder.mjtroya.data.Product;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ProductController {

    @RequestMapping("/getAll")
    public List<Product> getAll() { return Launcher.products;}

    @RequestMapping("/activity")
    public Activity getActivity(@RequestParam(value = "name", defaultValue = "Hola") String activityKind) {
        Activity activity = new Activity();
        activity.setActivityKind(activityKind);
        Launcher.products.add(activity);
        return activity;
    }

    @RequestMapping("/enum")
    public ActivityType getActivity
            (@RequestParam(value = "name", defaultValue = "Hola") ActivityType name) {
        {
            List<Product> aux = new ArrayList<>();
            for (Product: Launcher.products()
        }
        return name;
    }

    @RequestMapping("/geotag")
    public GeoTag getGeoTag(@RequestParam(value = "name", defaultValue = "Hola") String locality) {
        GeoTag geoTag = new GeoTag();
        geoTag.setLocality(locality);
        Launcher.products.add(locality);
        return geoTag;
    }


}
