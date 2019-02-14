package com.lixd.phone.apk.test.activity;

import android.os.Bundle;

import com.lixd.phone.apk.test.R;
import com.lixd.phone.apk.test.base.BaseActivity;

public class SplashActivity extends BaseActivity {

    @Override
    protected void init(Bundle savedInstanceState) {
        gotoActivity(ApkListActivity.class);
        finish();
    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_splash;
    }
}
