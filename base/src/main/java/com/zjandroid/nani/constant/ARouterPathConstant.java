package com.zjandroid.nani.constant;

import com.zjandroid.nani.dagger.scope.ActivityScope;


import javax.inject.Inject;

import dagger.Module;
import dagger.Provides;

@Module
public class ARouterPathConstant {

    String CONCAT = "/";
    String GROUP_HOME = "home";
    String GROUP_BACKLOG = "backlog";
    String GROUP_EXTENSION = "extension";
    String GROUP_BASE = "base";

    @Inject
    public ARouterPathConstant() {
    }

    @ActivityScope
    @Provides
    public ARouterPathConstant instance(){
        return new ARouterPathConstant();
    }
}
