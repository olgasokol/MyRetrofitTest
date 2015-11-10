package com.osokol.myretrofitapplication;

import android.os.Bundle;
import android.os.StrictMode;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import java.io.IOException;
import java.util.List;

import retrofit.Call;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        main();
    }

    public void main() {
        // Create a very simple REST adapter which points the GitHub API endpoint.
        FirnessClient client = ServiceGenerator.createService(FirnessClient.class);
        StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();

        StrictMode.setThreadPolicy(policy);
        try {
            // Fetch and print a list of the sports to this library.
            Call<List<Sport>> call =
                    client.sports();

            List<Sport> sports = call.execute().body();

            if(sports!=null)
            for (Sport contributor : sports) {
                Log.d("taggga",
                        contributor.getSportId() + " (" + contributor.getSportText() + ")");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
