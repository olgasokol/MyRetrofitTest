package com.osokol.myretrofitapplication;

import java.util.List;

import retrofit.Call;
import retrofit.http.GET;

/**
 * Created by osokol on 09.11.2015.
 */
public interface FirnessClient {
    @GET("/api/data")//{owner}/{repo}/sports")
    Call<List<Sport>> sports();
          //  @Path("owner") String owner,
         //   @Path("repo") String repo
//    );
}