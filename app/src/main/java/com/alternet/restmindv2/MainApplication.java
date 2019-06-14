package com.alternet.restmindv2;

import android.app.Application;

import com.alternet.restmindv2.manager.Contextor;

public class MainApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        Contextor.getInstance().init(getApplicationContext());
    }
}
