package com.osokol.myretrofitapplication;

import com.google.gson.annotations.SerializedName;

/**
 * Created by osokol on 12.11.2015.
 */
public class Food {

    @SerializedName("food_server_id")
    public Long mId;
    @SerializedName("food_name")
    private String mName;
    @SerializedName("food_img_url")
    private String mImgUrl;
    @SerializedName("food_calories")
    private double mCalories;
    @SerializedName("food_water")
    private double mWater;
    @SerializedName("food_proteins")
    private double mProteins;
    @SerializedName("food_fats")
    private double mFats;
    @SerializedName("food_carbs")
    private double mCarbs;

    public Food() {
    }

    public Long getSports_server_id() {
        return mId;
    }

    public String getFood_name() {
        return mName;
    }

    public String getFood_img_url() {
        return mImgUrl;
    }

    public double getFood_calories() {
        return mCalories;
    }

    public double getFood_water() {
        return mWater;
    }

    public double getFood_proteins() {
        return mProteins;
    }

    public double getFood_fats() {
        return mFats;
    }

    public double getFood_carbs() {
        return mCarbs;
    }
}
