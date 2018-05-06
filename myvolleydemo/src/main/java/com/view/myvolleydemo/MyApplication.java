package com.view.myvolleydemo;

import android.app.Application;

import com.android.volley.RequestQueue;
import com.android.volley.toolbox.Volley;

/**
 * App全局设置
 * Created by mark on 2017/10/13.
 */

public class MyApplication extends Application{

    public static RequestQueue queues;
    @Override
    public void onCreate() {
        super.onCreate();

        initVolley();
    }

    /*初始化全局的网络请求队列*/
    private void initVolley() {
        queues = Volley.newRequestQueue(getApplicationContext());
    }

    public static RequestQueue getHttpQueues(){
        return queues;
    }
}
