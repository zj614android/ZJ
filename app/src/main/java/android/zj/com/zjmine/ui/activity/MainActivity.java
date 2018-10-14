package android.zj.com.zjmine.ui.activity;

import android.os.Bundle;
import android.view.MotionEvent;
import android.zj.com.zjmine.R;
import android.zj.com.zjmine.base.BaseActivity;


public class MainActivity extends BaseActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }


    @Override
    public boolean onTouchEvent(MotionEvent event) {
        return super.onTouchEvent(event);
    }

}
