package com.zjandroid.nani.view.activity;

import android.content.Intent;
import android.os.Bundle;

import com.apkfuns.logutils.LogUtils;
import com.zjandroid.nani.R;
import com.zjandroid.nani.base.BaseActivity;
import com.zjandroid.nani.constant.UrlConstant;

import javax.inject.Inject;

public class SplashActivity extends BaseActivity {


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        LogUtils.d("mUrlConstant11 == "+ getUrlConstant().toString());
        startActivity(new Intent(SplashActivity.this, MainActivity.class));
    }

    @Override
    protected boolean notInitGlobalComponent() {
        return false;
    }
}
