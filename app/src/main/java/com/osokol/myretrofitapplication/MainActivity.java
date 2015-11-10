package com.osokol.myretrofitapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import retrofit.Call;
import retrofit.Response;
import retrofit.Retrofit;
import timber.log.Timber;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        main();
    }

    public void main() {
        // Create a very simple REST adapter which points the  endpoint.
        FirnessClient client = ServiceGenerator.createService(FirnessClient.class);
        Timber.plant(new Timber.DebugTree());
        Call<AppData> call = client.getAppData();

        call.enqueue(new retrofit.Callback<AppData>() {
            @Override
            public void onResponse(Response<AppData> response, Retrofit retrofit) {
                Timber.d("success:\n");
                Timber.d(response.body().toString());
            }

            @Override
            public void onFailure(Throwable t) {
                Timber.e(t.getMessage());
            }
        });
    }
}
