package com.e.c.a.h.rest_client_application_20170417;

/**
 * Created by hugoa on 4/17/2017.
 */
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

//      compile 'com.google.code.gson:gson:2.8.0'

//      compile 'com.squareup.retrofit2:retrofit:2.1.0'
//      compile 'com.squareup.retrofit2:converter-gson:2.1.0'

public class Post {

    @SerializedName("userId")
    @Expose
    private Integer userId;
    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("body")
    @Expose
    private String body;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

}