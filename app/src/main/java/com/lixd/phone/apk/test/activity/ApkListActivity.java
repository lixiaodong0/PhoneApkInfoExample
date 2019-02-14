package com.lixd.phone.apk.test.activity;

import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.lixd.phone.apk.test.R;
import com.lixd.phone.apk.test.adapter.ApkInfoAdapter;
import com.lixd.phone.apk.test.base.BaseActivity;
import com.lixd.phone.apk.test.bean.ApkInfoBean;
import com.lixd.phone.apk.test.util.ApkUtil;

import java.util.List;

public class ApkListActivity extends BaseActivity {

    private RecyclerView mRecyclerView;
    private ApkInfoAdapter apkInfoAdapter;

    @Override
    protected void init(Bundle savedInstanceState) {
        initView();
        initData();
    }

    private void initData() {
        List<ApkInfoBean> installApp = ApkUtil.getInstallApp(this);
        apkInfoAdapter.setNewData(installApp);
    }

    private void initView() {
        mRecyclerView = findViewById(R.id.recyclerview);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        apkInfoAdapter = new ApkInfoAdapter(this, null);
        mRecyclerView.setAdapter(apkInfoAdapter);
    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_apk_list;
    }
}
