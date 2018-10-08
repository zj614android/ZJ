package android.zj.com.zjmine.base;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

import com.apkfuns.logutils.LogUtils;

import java.util.logging.Logger;

public class MyApplication extends Application {

    private String TAG = "MyApplication";

    @Override
    public void onCreate() {
        super.onCreate();

        this.registerActivityLifecycleCallbacks(new ActivityLifecycleCallbacks() {
            @Override
            public void onActivityStopped(Activity activity) {
                LogUtils.v(TAG + "___" + activity.getComponentName().getClassName() + "___onActivityStopped");
            }

            @Override
            public void onActivityStarted(Activity activity) {
                LogUtils.v(TAG + "___" + activity.getComponentName().getClassName() + "___onActivityStarted");
            }

            @Override
            public void onActivitySaveInstanceState(Activity activity, Bundle outState) {
                LogUtils.v(TAG + "___" + activity.getComponentName().getClassName() + "___onActivitySaveInstanceState");
            }

            @Override
            public void onActivityResumed(Activity activity) {
                LogUtils.v(TAG + "___" + activity.getComponentName().getClassName() + "___onActivityResumed");
            }

            @Override
            public void onActivityPaused(Activity activity) {
                LogUtils.v(TAG + "___" + activity.getComponentName().getClassName() + "___onActivityPaused");
            }

            @Override
            public void onActivityDestroyed(Activity activity) {
                LogUtils.v(TAG + "___" + activity.getComponentName().getClassName() + "___onActivityDestroyed");
            }

            @Override
            public void onActivityCreated(Activity activity, Bundle savedInstanceState) {
                LogUtils.v(TAG + "___" + activity.getComponentName().getClassName() + "___onActivityCreated");
            }
        });

    }
}
