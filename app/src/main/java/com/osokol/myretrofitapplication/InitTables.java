package com.osokol.myretrofitapplication;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by osokol on 12.11.2015.
 */
public class InitTables {

    @SerializedName("sports")
    private List<Sport> sports;
    @SerializedName("food")
    private List<Food> foods;
}
