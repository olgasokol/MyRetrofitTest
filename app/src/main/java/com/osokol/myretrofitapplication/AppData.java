package com.osokol.myretrofitapplication;

import com.google.gson.annotations.SerializedName;

/**
 * Created by osokol on 12.11.2015.
 */
public class AppData {

    @SerializedName("last_updated")
    private long mLastUpdateTimestamp;
    @SerializedName("app_data")
    private InitTables tables;
}
