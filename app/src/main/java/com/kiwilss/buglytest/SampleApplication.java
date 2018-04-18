package com.kiwilss.buglytest;

import android.util.Log;

import com.tencent.tinker.loader.app.TinkerApplication;
import com.tencent.tinker.loader.shareutil.ShareConstants;

public class SampleApplication extends TinkerApplication {
    public SampleApplication() {

//        super(ShareConstants.TINKER_ENABLE_ALL,
//                "com.kiwilss.buglytest.SampleApplicationLike",
//                "com.tencent.tinker.loader.TinkerLoader",
//                false);

        super(ShareConstants.TINKER_ENABLE_ALL,
                SampleApplicationLike.class.getCanonicalName(),
                "com.tencent.tinker.loader.TinkerLoader",
                false);

        Log.e("MMM", "SampleApplication: "+SampleApplicationLike.class.getCanonicalName());
    }

    @Override
    public void onCreate() {
        super.onCreate();
        //Bugly.init(getApplicationContext(), "9551f3cc2c", false);
    }
}