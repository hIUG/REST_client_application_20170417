package com.e.c.a.h.rest_client_application_20170417;

import android.util.Log;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by hugoa on 4/17/2017.
 */

public class PostController implements Callback {
    private static final String BASE_URL = "http://jsonplaceholder.typicode.com";

    public void doCall() {
        Gson gson = new GsonBuilder().setLenient().create();
        Retrofit retrofit = new Retrofit.Builder().baseUrl(BASE_URL).addConverterFactory(GsonConverterFactory.create(gson)).build();

        RESTfulAPI restAPI = retrofit.create(RESTfulAPI.class);

        Call getAllPosts = restAPI.getAllPosts();
        getAllPosts.enqueue(this);
    }

    @Override
    public void onResponse(Call call, Response response) {
        if(response.isSuccessful()) {
            List<Post> posts = (List<Post>) response.body();

            for (Post p : posts) {
                Log.d(MainActivity.LOG_TAG, "Post name: " + p.getTitle());
            }
        }
    }

    @Override
    public void onFailure(Call call, Throwable t) {
        String error = "Call failed... " + t.getMessage();
        Log.d(MainActivity.LOG_TAG, error);
    }
}