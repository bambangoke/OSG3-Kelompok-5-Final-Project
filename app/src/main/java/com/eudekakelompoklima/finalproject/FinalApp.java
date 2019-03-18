package com.eudekakelompoklima.finalproject;

import android.app.Application;

import com.squareup.leakcanary.LeakCanary;
import com.squareup.leakcanary.RefWatcher;

public class FinalApp extends Application {

    static FinalApp sInstance;

    synchronized static FinalApp getInstance() {
        return sInstance;
    }
}
