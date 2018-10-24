package android.zj.com.zjmine.net;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.widget.Toast;


import java.io.IOException;

import okhttp3.Interceptor;
import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;

//请求拦截器
public class CommonHeaderInterceptor implements Interceptor {


//    public static final MediaType JSONMediaType = MediaType.parse("application/json; charset=utf-8");
//    Context context = null;
//    private CommonBean baseBean;
//    private int code = 0;
//    private String msg = "";

    public CommonHeaderInterceptor(Context context) {
//        this.context = context;
    }


    @Override
    public Response intercept(Chain chain) throws IOException {
//        Request request = chain.request();
//        Request.Builder builder = request.newBuilder();
//        String token = SharePrefUtil.getString(context, "token", "");
//        builder.addHeader("token", token);
////        builder.addHeader("User-Agent", "android");
//
//        Response response = chain.proceed(builder.build());
//        String bodyString = response.body().string();
//        if (200 == response.code()) {
//
//            if (!TextUtils.isEmpty(bodyString)) {
//                baseBean = JSON.parseObject(bodyString, CommonBean.class);
//                if (baseBean != null) {
//                    code = baseBean.getCode();
//                    msg = baseBean.getMessage();
//                }
//            } else {
//                return response.newBuilder().build();
//            }
//
//            /**
//             * 401为token过期，此时删除本地token，跳转到登陆页面重新登陆
//             */
//            if (401 == code) {
//
//                SharePrefUtil.saveString(context, "token", "");
//
//                if (ActivityManager.current() instanceof LoginActivity) {
//                    return response.newBuilder().body(ResponseBody.create(JSONMediaType, bodyString)).build();
//                }
//
//                Intent intent = new Intent(ClassfyInspectApplication.getGlobalContext(), LoginActivity.class);
//                intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
//                ClassfyInspectApplication.getGlobalContext().startActivity(intent);
//                return response.newBuilder().body(ResponseBody.create(JSONMediaType, bodyString)).build();
//            }
//
//        }
//
//        return response.newBuilder()
//                .body(ResponseBody.create(JSONMediaType, bodyString))
//                .build();
        return null;
    }

}