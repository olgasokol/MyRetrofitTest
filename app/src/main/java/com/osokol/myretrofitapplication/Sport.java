package com.osokol.myretrofitapplication;

import com.google.gson.annotations.SerializedName;

/**
 * Created by osokol on 09.11.2015.
 */
public class Sport {

    @SerializedName("sports_server_id")
    private int mSportId;
    @SerializedName("sports_name")
    private String mSportText;
    @SerializedName("sports_img_url")
    private String mSportDrawableUrl;
    @SerializedName("sports_calories")
    private double mSportCalories;//per hour for 1 kg
    @SerializedName("sports_color")
    private String mSportColor;

    public int getSportId() {
        return mSportId;
    }

    public String getSportText() {
        return mSportText;
    }

    public String getSportDrawableUrl() {
        return mSportDrawableUrl;
    }

    public double getSportCalories() {
        return mSportCalories;
    }

    public String getSportColor() {
        return mSportColor;
    }
}
