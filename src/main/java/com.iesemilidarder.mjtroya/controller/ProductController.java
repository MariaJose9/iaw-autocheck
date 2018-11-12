package com.iesemilidarder.mjtroya.controller;

import com.iesemilidarder.mjtroya.DataHelper;
import com.iesemilidarder.mjtroya.data.Activity;
import com.iesemilidarder.mjtroya.data.ActivityType;
import com.iesemilidarder.mjtroya.data.GeoTag;
import com.iesemilidarder.mjtroya.data.Product;
import com.iesemilidarder.mjtroya.data.Restaurant;
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
    public Activity getActivity(@RequestParam(value = "name", defaultValue = "Hola Mundo") String activityKind) {
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
        GeoTag geoTag = new GeoTag();
        geoTag.setName(area);
        Product aux = new Restaurant();
        DataHelper.products.add(aux);
        return null;
    }

    @RequestMapping("/restaurant")
    public Restaurant getRestaurant(@RequestParam(value = "name", defaultValue = "") String restaurante) {
        Restaurant restaurant = new Restaurant();
        restaurant.setName(restaurante);
        DataHelper.products.add(restaurant);

        return restaurant;
    }

    @RequestMapping("/getProductType")
    public List<String> getProductType() {
        List<String> data = new ArrayList<>();
        for (Product p: DataHelper.getData()) {
            if(!CollectionUtils.contains(data.iterator(),p.getActivityKind())){
                data.add(p.getActivityKind());
            }
        }
        return data;
    }



}

