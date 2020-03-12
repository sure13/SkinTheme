package com.android.skinthean.base;

import android.app.Application;

import com.android.skinthean.skin.SkinManager;
import com.blankj.utilcode.util.Utils;


public class MyApp extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        //进行初始化
        Utils.init(this);
        SkinManager.getInstance().init(this);
    }
}
