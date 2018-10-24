package android.zj.com.zjmine.view.activity;

import android.os.Bundle;
import android.view.MotionEvent;
import android.widget.Toast;
import android.zj.com.zjmine.R;
import android.zj.com.zjmine.base.BaseActivity;
import android.zj.com.zjmine.ui.activity.DaggerMainActivityComponent;

import javax.inject.Inject;

import dagger.Component;


public class MainActivity extends BaseActivity {


    @Inject
    A a;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        DaggerMainActivityComponent.builder().build().inject(this);
        Toast.makeText(MainActivity.this, a.toString(),Toast.LENGTH_LONG).show();
    }


    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        return super.onTouchEvent(event);
    }

}


/**
 *Component必须是一个接口类或者抽象
 */
@Component
interface MainActivityComponent {
    void inject(MainActivity mainActivity);
}