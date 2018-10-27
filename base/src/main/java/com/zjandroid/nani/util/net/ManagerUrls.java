package com.zjandroid.nani.util.net;

import io.reactivex.Observable;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;


/**
 * 用户模块 接口
 */
public interface ManagerUrls {



    //测试
    @FormUrlEncoded
    @POST("patrol/login.php")
    Observable<Object> login(@Field("mobile") String mobile, @Field("password") String password);


}
