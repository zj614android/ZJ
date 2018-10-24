package android.zj.com.zjmine.net;

import android.content.Context;
import android.os.Handler;

//import com.qmuiteam.qmui.widget.dialog.QMUITipDialog;

import rx.Subscriber;


public class BaseRxObserver<T> extends Subscriber<T> {

    private Context context = null;
//    private QMUITipDialog qmDialog = null;
    private BaseObserverListener mlistener = null;


    public BaseRxObserver() {
    }

    public BaseRxObserver(Context context, BaseObserverListener<T> mlistener) {
        this.context = context;
        this.mlistener = mlistener;
    }

    /**
     * 显示加载框
     */
    private void loadingShow() {
        try {

            if (null != context) {
                // android.view.WindowLeaked: Activity com.sound.wisdomcloud.ui.activity.SplashActivity has leaked window DecorView@5300feb[] that was originally added here
//                if (null == qmDialog) {
//                    qmDialog = new QMUITipDialog.Builder(context)
//                            .setIconType(QMUITipDialog.Builder.ICON_TYPE_LOADING)
//                            .setTipWord("正在加载")
//                            .create();
//
//                }
//                qmDialog.show();

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }



    @Override
    public void onStart() {
        loadingShow();
        if(null != mlistener){
            mlistener.onStart();
        }

    }

    @Override
    public void onNext(T t) {
        if(null != mlistener){
            mlistener.onNext(t);
        }

    }

    @Override
    public void onCompleted() {

//        if (null != qmDialog) {
//            qmDialog.dismiss();
//        }

        if(null != mlistener){
            mlistener.onCompleted();
        }


    }

    @Override
    public void onError(Throwable t) {
//        if (null != qmDialog) {
//            qmDialog.dismiss();
//        }

        showErrorDialog(t);

    }

    /**
     * 显示错误对话框
     */
    private void showErrorDialog(final Throwable t) {
//        Context tempContext;
//        if (ActivityManager.current().getClass().equals(ScanActivity.class)){
//            if (null != ActivityManager.getSpecifiedActivity(HomePageActivity.class)){
//                tempContext = ActivityManager.getSpecifiedActivity(HomePageActivity.class);
//            }else{
//                tempContext = context;
//            }
//        }else{
//            tempContext = context;
//        }
//        final QMUITipDialog errorDialog = new QMUITipDialog.Builder(tempContext)
//                .setIconType(QMUITipDialog.Builder.ICON_TYPE_FAIL)
//                .setTipWord("加载失败")
//                .create();
//
//        errorDialog.show();
//
//        new Handler().postDelayed(new Runnable() {
//            @Override
//            public void run() {
//                errorDialog.dismiss();
//                if(null != mlistener){
//                    mlistener.onError(t);
//                }
//            }
//        },1500);
    }


    @SuppressWarnings("unchecked")
    public interface BaseObserverListener<T> {

        void onStart();

        void onCompleted();

        void onError(Throwable e);

        @SuppressWarnings("unchecked")
        void onNext(T o);
    }
}
