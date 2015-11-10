package com.osokol.myretrofitapplication;

/**
 * Created by osokol on 09.11.2015.
 */
public class Sport {
    private int mSportId;
    private String mSportText;
    private String mSportDrawableUrl;
    private double mSportCalories;//per hour for 1 kg
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
