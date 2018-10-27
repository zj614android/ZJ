package com.zjandroid.nani.base;

import android.os.Bundle;
import android.support.annotation.Nullable;

public class BaseBarActivity extends BaseActivity {

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    protected boolean notInitGlobalComponent() {
        return false;
    }
}
