package android.zj.com.zjmine.net;


import android.zj.com.zjmine.BuildConfig;


/**
 * 区分环境
 *
 * @author mafei
 * @date 2018/2/1
 */

public class ENV {

    /**
     * 测试环境
     */
    private final static String TestHost = "http://gank.io/api/";//php内网测试地址

    /**
     * 预上线环境
     */
    private final static String PreReleaseHost = "http://gank.io/api/";
    /**
     * 正式环境
     */
    private final static String ReleaseHost = "http://wgz.haolei100.com/";//线上


    //-----------------------ImgUrl-----------------------

    /**
     * 测试环境
     */
    private final static String TestImageHost = "http://gank.io/api/";

    /**
     * 预上线环境
     */
    private final static String PreReleaseImageHost = "http://gank.io/api/";

    /**
     * 正式环境
     */
    private final static String ReleaseImageHost = "http://gank.io/api/";

    /**
     * 主机
     * @return
     */
    public static String getHttpHost() {
        switch (BuildConfig.ENV_TYPE) {
            case 1:
                return TestHost;
            case 2:
                return PreReleaseHost;
            case 3:
                return ReleaseHost;
            default:
                return ReleaseHost;
        }
    }

    /**
     * 图片地址
     * @return
     */
    public static String getImageHost() {
        switch (BuildConfig.ENV_TYPE) {
            case 1:
                return TestImageHost;
            case 2:
                return PreReleaseImageHost;
            case 3:
                return ReleaseImageHost;
            default:
                return ReleaseImageHost;
        }
    }

}
