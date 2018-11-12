package com.iesemilidarder.mjtroya;

import com.iesemilidarder.mjtroya.data.Activity;
import com.iesemilidarder.mjtroya.data.ActivityType;

public class Launcher {

    public static void main(String... args) {
        for (int i=0; i<50;i++){
            Activity a = new Activity();
            ActivityType item = ActivityType.values()[i%ActivityType.values().length];
            a.setActivityKind("");
            a.setName("Actividad "+i);
            a.setPrice(new Double(i*2));
            DataHelper.products.add(a);
        }
        System.out.println("Creados " + DataHelper.products.size() + " elementos");
    }



}
