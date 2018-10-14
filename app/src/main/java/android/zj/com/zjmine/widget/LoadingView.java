package android.zj.com.zjmine.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.RelativeLayout;
import android.zj.com.zjmine.R;

import com.airbnb.lottie.LottieAnimationView;

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
