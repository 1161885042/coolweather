package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by z1161 on 2018/2/4.
 */

public class Suggestion {
    @SerializedName("comf")
    public Comfort comfort;
    public class Comfort {
        @SerializedName("txt")
        public String info;
    }

    @SerializedName("cw")
    public CarWash carWash;
    public class CarWash {
        @SerializedName("txt")
        public String info;
    }

    public Sport sport;
    public class Sport {
        @SerializedName("txt")
        public String info;
    }

}
