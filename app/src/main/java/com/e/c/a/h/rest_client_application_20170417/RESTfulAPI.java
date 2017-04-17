package com.e.c.a.h.rest_client_application_20170417;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by hugoa on 4/17/2017.
 */

public interface RESTfulAPI {
    @GET("posts")
    Call<List<Post>> getAllPosts();

    @GET("posts")
    Call<List<Post>> getAllPostsByUserID(@Query("userID") int userID);

    @GET("post/{postID}")
    Call<Post> getPostByID();

//    @POST("post")
}
