package android.zj.com.zjmine.base;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

import com.netstatus.assembly.NetObserverActivity;

import me.jessyan.autosize.AutoSize;

public class BaseActivity extends NetObserverActivity {


    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


    }


//    @Nullable
//    @Override
//    public View onCreateView(String name, Context context, AttributeSet attrs) {
//        AutoSize.autoConvertDensityOfGlobal(BaseActivity.this);
//        return super.onCreateView(name, context, attrs);
//    }
}
