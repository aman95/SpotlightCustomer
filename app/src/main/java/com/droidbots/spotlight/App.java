package com.droidbots.spotlight;

import android.app.Application;
import android.content.Context;

/**
 * Created by aman on 04/06/16.
 */
public class App extends Application {

    private static App mInstance;

    @Override
    public void onCreate() {
        super.onCreate();
        mInstance = this;
    }

    public static Context getAppContext() {
        return mInstance.getApplicationContext();
    }
}
