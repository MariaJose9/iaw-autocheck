package com.iesemilidarder.mjtroya.data;

public class Restaurant extends Product {

    public Restaurant() {
        setActivityKind(ActivityType.RESTAURANTE.toString());
    }
}
/*
    @Override
    public ActivityType getActivityKind() {
        return ActivityType.RESTAURANTE;
    }

    @Override
    public void setActivityKind(ActivityType activityKind) {
        super.setActivityKind(ActivityType.RESTAURANTE);
    }
}
*/
