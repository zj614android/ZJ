package com.zjandroid.nani.dagger.component;

import com.zjandroid.nani.constant.UrlConstant;
import com.zjandroid.nani.view.activity.MainActivity;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component (modules={UrlConstant.class})
public interface MainComponent {
    void inject(MainActivity splashActivity);
}
