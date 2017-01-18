package com.school.schooldeal.application;

import android.app.Application;

import cn.bmob.v3.Bmob;
import cn.bmob.v3.BmobInstallation;

/**
 * Created by U-nookia on 2016/12/19.
 * 做全局初始化
 */

public class MyApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        //初始化bmob
        Bmob.initialize(this,"3f4d2c40f97655bcc35f76977f1a1158");
        // 使用推送服务时的初始化操作
        BmobInstallation.getCurrentInstallation().save();
    }
}
