package com.osokol.myretrofitapplication;

import retrofit.Call;
import retrofit.http.GET;

/**
 * Created by osokol on 09.11.2015.
 */
public interface FitnessClient {
    @GET("/api/data")//{owner}/{repo}/sports")
    Call<AppData> getAppData();
          //  @Path("owner") String owner,
         //   @Path("repo") String repo
//    );
}