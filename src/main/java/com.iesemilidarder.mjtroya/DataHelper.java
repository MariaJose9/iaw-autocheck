package com.iesemilidarder.mjtroya;

import com.iesemilidarder.mjtroya.data.Activity;
import com.iesemilidarder.mjtroya.data.GeoTag;
import com.iesemilidarder.mjtroya.data.Product;
import com.iesemilidarder.mjtroya.data.Restaurant;

import java.util.ArrayList;
import java.util.List;

public class DataHelper {
    public static List<Product> products = new ArrayList<>();

    public static List<Product> getData () {
        doInit();
        return products;
    }

    private static void doInit() {
        if (products.isEmpty()){
            for (int i =0;i<50;i++) {
                Activity activity = new Activity();
                activity.setName("name"+i);
                products.add(activity);

                GeoTag geoTag = new GeoTag();
                geoTag.setName("name"+i);
                products.add(geoTag);

                Restaurant restaurant = new Restaurant();
                restaurant.setName("name"+i);
                products.add(restaurant);

                doInit();

            }
        }
    }
}

