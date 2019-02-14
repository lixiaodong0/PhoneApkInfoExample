package com.lixd.phone.apk.test.base;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

public abstract class BaseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getLayoutId());
        init(savedInstanceState);
    }

    protected abstract void init(Bundle savedInstanceState);

    protected abstract int getLayoutId();

    protected void gotoActivity(Class<?> clazz) {
        startActivity(new Intent(this, clazz));
    }
}
