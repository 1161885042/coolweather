package com.coolweather.android.gson;

/**
 * Created by z1161 on 2018/2/4.
 */

public class AQI {
    public AQICity city;
    public class AQICity {
        public String aqi;
        public String pm25;
    }
}
