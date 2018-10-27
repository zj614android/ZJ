package com.zjandroid.nani.util.net;


import android.support.annotation.NonNull;
import android.util.Log;


import com.zjandroid.nani.base.NaNiApplication;

import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
//import retrofit2.converter.fastjson.FastJsonConverterFactory;
import retrofit2.converter.gson.GsonConverterFactory;


/**
 * 网络层
 *
 * @author mafei
 */

public class HttpUtil {

    public static String TAG = "HttpUtil";
    public static Retrofit mRetrofitClient = null;


    /**
     * 创建retrofit并绑定服务
     *
     * @return
     */
    @NonNull
    public static <T> T getRetrofit(final Class<T> service) {

        if (null == service) {
            return null;
        }

        if (null != mRetrofitClient) {
            return mRetrofitClient.create(service);
        }

        // OkHttpClient.Builder初始化
        OkHttpClient.Builder builder = new OkHttpClient().newBuilder();
        builder.readTimeout(10, TimeUnit.SECONDS);
        builder.connectTimeout(9, TimeUnit.SECONDS);

        // 添加http请求json数据打印
        HttpLoggingInterceptor.Logger logger = new HttpLoggingInterceptor.Logger() {
            @Override
            public void log(String message) {
                Log.i(TAG, "" + message);
            }
        };
        HttpLoggingInterceptor httpLoggingInterceptor = new HttpLoggingInterceptor(logger);
        httpLoggingInterceptor.setLevel(HttpLoggingInterceptor.Level.BODY);
        builder.addInterceptor(httpLoggingInterceptor);


        CommonHeaderInterceptor commonHeaderInterceptor = new CommonHeaderInterceptor(NaNiApplication.getGlobalContext());
        builder.addInterceptor(commonHeaderInterceptor);

        // OkHttpClient初始化
        mRetrofitClient = new Retrofit.Builder()
                .client(builder.build())
                .baseUrl(ENV.getHttpHost())//baseurl设置
                .addConverterFactory(GsonConverterFactory.create())
//                .addConverterFactory(FastJsonConverterFactory.create())
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                .build();

        //返回cls的实例
        return mRetrofitClient.create(service);

    }

}
