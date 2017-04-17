package com.e.c.a.h.rest_client_application_20170417;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    public static final String LOG_TAG = "HACE:";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        PostController postController = new PostController();

        postController.doCall();
    }
}
