package com.zjandroid.nani.base;

import android.os.Bundle;
import android.support.annotation.Nullable;

import com.netstatus.assembly.NetObserverActivity;
import com.zjandroid.nani.constant.UrlConstant;

import javax.inject.Inject;

public abstract class BaseActivity extends NetObserverActivity {


    @Inject
    UrlConstant mUrlConstant;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if(!notInitGlobalComponent())
        ((NaNiApplication) getApplication()).getGlobalComponent().inject(this);

    }

    protected abstract boolean notInitGlobalComponent();

    public UrlConstant getUrlConstant() {
        return mUrlConstant;
    }
}
