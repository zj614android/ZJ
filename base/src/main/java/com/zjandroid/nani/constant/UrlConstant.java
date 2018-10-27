package com.zjandroid.nani.constant;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class UrlConstant {

    @Singleton
    @Provides
    public UrlConstant instance(){
        return new UrlConstant();
    }

}
