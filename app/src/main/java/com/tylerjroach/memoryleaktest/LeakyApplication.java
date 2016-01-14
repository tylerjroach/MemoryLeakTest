package com.tylerjroach.memoryleaktest;

import android.app.Application;
import com.squareup.leakcanary.LeakCanary;

/**
 * Created by tylerjroach on 1/14/16.
 */
public class LeakyApplication extends Application {

  @Override public void onCreate() {
    super.onCreate();
    LeakCanary.install(this);
  }

}
