package com.example.youngwu.nuwademo;

import android.app.Application;
import android.content.Context;
import android.os.Environment;

import cn.jiajixin.nuwa.Nuwa;

/**
 * Desc:
 * Created by yyw on 2018/4/22 0022.
 */
public class MyApplication extends Application {

    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(base);
        Nuwa.init(this);
        Nuwa.loadPatch(this, Environment.getExternalStorageDirectory().getAbsolutePath().concat("/patch.jar"));
    }
}
