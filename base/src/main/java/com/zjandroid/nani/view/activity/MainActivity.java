package com.zjandroid.nani.view.activity;

import android.os.Bundle;

import com.apkfuns.logutils.LogUtils;
import com.zjandroid.nani.R;
import com.zjandroid.nani.base.BaseActivity;


public class MainActivity extends BaseActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LogUtils.d("mUrlConstant11 == "+ getUrlConstant().toString());

    }

    @Override
    protected boolean notInitGlobalComponent() {
        return false;
    }

}


