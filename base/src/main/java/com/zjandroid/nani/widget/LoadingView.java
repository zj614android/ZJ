package android.zj.com.nani.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;

import com.zjandroid.nani.R;

public class LoadingView extends RelativeLayout {

    public LoadingView(Context context) {
        this(context, null);
    }

    public LoadingView(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public LoadingView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(context, attrs, defStyleAttr);
    }

    private void init(Context context, AttributeSet attrs, int defStyleAttr) {
        View rootView = View.inflate(context, R.layout.view_anim_loading, LoadingView.this);
//        LottieAnimationView animationView = (LottieAnimationView) inflate.findViewById(R.id.animation_view);
//        animationView.setAnimation("servishero_loading.json");
//        animationView.loop(true);

    }

}
