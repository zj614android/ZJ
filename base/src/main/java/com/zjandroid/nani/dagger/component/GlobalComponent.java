package com.zjandroid.nani.dagger.component;

import com.zjandroid.nani.base.BaseActivity;
import com.zjandroid.nani.constant.UrlConstant;
import com.zjandroid.nani.view.activity.MainActivity;
import com.zjandroid.nani.view.activity.SplashActivity;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules={UrlConstant.class})
public interface GlobalComponent {
//    void inject(SplashActivity splashActivity);
    void inject(BaseActivity baseActivity);
}
