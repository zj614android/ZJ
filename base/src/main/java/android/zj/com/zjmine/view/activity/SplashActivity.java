package android.zj.com.zjmine.view.activity;

import android.content.Intent;
import android.os.Bundle;
import android.zj.com.zjmine.R;
import android.zj.com.zjmine.base.BaseActivity;

public class SplashActivity extends BaseActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        startActivity(new Intent(SplashActivity.this,MainActivity.class));
    }
}
