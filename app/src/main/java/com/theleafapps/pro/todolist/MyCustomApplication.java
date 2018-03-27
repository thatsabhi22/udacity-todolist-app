package com.theleafapps.pro.todolist;

import android.app.Application;

import com.facebook.stetho.Stetho;

/**
 * Created by aviator on 04/03/18.
 */

public class MyCustomApplication extends Application {

    public void onCreate() {
        super.onCreate();
        Stetho.initializeWithDefaults(this);
    }
}
