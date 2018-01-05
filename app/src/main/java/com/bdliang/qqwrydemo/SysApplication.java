package com.bdliang.qqwrydemo;

import android.app.Application;

import com.bdliang.qqwrydemo.qqwry.QQWry;

import java.io.IOException;

/**
 * @author bd_liang
 * @Type SysApplication
 * @Desc
 * @date 2018/1/5 9:40
 */
public class SysApplication extends Application {
    /**
     *
     */
    public static final String TAG = "SysApplication";
    public static SysApplication instance;
    public static QQWry qqWry;

    public static SysApplication getInstance() {
        return instance;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        instance = this;
        try {
            qqWry = new QQWry(getApplicationContext());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void onTerminate() {
        super.onTerminate();
    }

    @Override
    public void onLowMemory() {
        super.onLowMemory();
    }
}
