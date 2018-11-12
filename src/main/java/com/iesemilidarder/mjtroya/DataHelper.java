package com.iesemilidarder.mjtroya;

import com.iesemilidarder.mjtroya.data.*;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

public class DataHelper {
    public static List<Product> products = new ArrayList<>();

    public static List<Product> getData () {
        doInit();
        return products;
    }

    private static void doInit() {
        private static void doInit() {
            if (products.isEmpty()){
                for (int i =0;i<50;i++) {
                    Activity activity = new Activity();
                    activity.setName("name"+i);
                    products.add(activity);

                    ActivityType activityType = new ActivityType();
                    ActivityType.setName("name"+i);
                    products.add(ActivityType);

                    GeoTag geoTag = new (GeoTag);
                    GeoTag.("name"+i);
                    products.add(GeoTag);

                    Restaurant restaurant = new Restaurant();
                    restaurant.setName("name"+i);
                    products.add(restaurant);

                    doInit();

                }
            }
        }
    }
}
