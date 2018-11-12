package com.iesemilidarder.mjtroya.controller;

import com.iesemilidarder.mjtroya.DataHelper;
import com.iesemilidarder.mjtroya.Launcher;
import com.iesemilidarder.mjtroya.data.*;
import org.apache.commons.lang3.StringUtils;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ProductController {

    @RequestMapping("/getAll")
    public List<Product> getAll() {
        return DataHelper.products;
    }

    @RequestMapping("/activity")
    public Activity getActivity(@RequestParam(value = "name", defaultValue = "Hola") String activityKind) {
        Activity activity = new Activity();
        activity.setName(activityKind);
        DataHelper.products.add(activity);

        return activity;
    }

    @RequestMapping("/enum")
    public ActivityType getActivityType
            (@RequestParam(value = "name", defaultValue = "") ActivityType name) {
        List<Product> aux = new ArrayList<>();
        for (Product item : DataHelper.products) {

        }
        return name;
    }

    @RequestMapping("/geotag")
    public List<Product> getGeoTag(@RequestParam(value = "name", defaultValue = "") String area) {
        /*
        GeoTag geoTag = new GeoTag();
        geoTag.setLocality(geoTag);
        Product aux = new Restaurant();
        DataHelper.products.add(aux);
        return geoTag;*/

        return null;
    }

    @RequestMapping("/restaurant")
    public Restaurant getRestaurant(@RequestParam(value = "name", defaultValue = "") String restaurante) {
        Restaurant restaurant = new Restaurant();
        restaurant.setName(restaurante);
        DataHelper.products.add(restaurant);

        return restaurant;
    }

    @RequestMapping("/getProductTypes")
    public List<String> getProductType() {
        List<String> data = new ArrayList<>();
        for (Product p: DataHelper.getData()) {
            if(CollectionUtils.contains(data.iterator(),p.getActivityKind())){
                data.add(p.getActivityKind());
            }
        }
        return data;
    }



}

