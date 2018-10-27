package com.zjandroid.nani.view.activity;

import android.os.Bundle;

import com.zjandroid.nani.R;
import com.zjandroid.nani.base.BaseActivity;

public class GuidActivity extends BaseActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guid);
    }

    @Override
    protected boolean notInitGlobalComponent() {
        return false;
    }
}
