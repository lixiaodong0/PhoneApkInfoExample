package com.lixd.phone.apk.test.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.lixd.phone.apk.test.R;
import com.lixd.phone.apk.test.bean.ApkInfoBean;

import java.util.ArrayList;
import java.util.List;

public class ApkInfoAdapter extends RecyclerView.Adapter<ApkInfoAdapter.ApkInfoViewHolder> {
    private Context mContext;
    private List<ApkInfoBean> mDatas;
    private LayoutInflater mLayoutInflater;

    public ApkInfoAdapter(Context context, List<ApkInfoBean> data) {
        mContext = context;
        mDatas = data;
        mLayoutInflater = LayoutInflater.from(context);
    }

    @NonNull
    @Override
    public ApkInfoViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        final View itemView = mLayoutInflater.inflate(R.layout.item_apk_info_list, viewGroup, false);
        return new ApkInfoViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull ApkInfoViewHolder appInfoViewHolder, int i) {
        ApkInfoBean apkInfoBean = mDatas.get(i);
        appInfoViewHolder.imgApkIcon.setImageDrawable(apkInfoBean.appIcon);
        appInfoViewHolder.tvApkName.setText(apkInfoBean.appName);
        appInfoViewHolder.tvApkVersion.setText(apkInfoBean.appVersionName);
        appInfoViewHolder.tvApkSize.setText(apkInfoBean.size + "111");
        appInfoViewHolder.tvApkLevel.setText(apkInfoBean.isSystemApp ? "SYSTEM" : "USER");
        appInfoViewHolder.tvApkDev.setText("RELEASE");
        appInfoViewHolder.tvApkInstallTime.setText(apkInfoBean.appInstallTime);
    }

    @Override
    public int getItemCount() {
        return mDatas != null ? mDatas.size() : 0;
    }

    static class ApkInfoViewHolder extends RecyclerView.ViewHolder {

        private final ImageView imgApkIcon;
        private final TextView tvApkName;
        private final TextView tvApkVersion;
        private final TextView tvApkSize;
        private final TextView tvApkLevel;
        private final TextView tvApkDev;
        private final TextView tvApkInstallTime;

        public ApkInfoViewHolder(@NonNull View itemView) {
            super(itemView);
            imgApkIcon = itemView.findViewById(R.id.img_apk_icon);
            tvApkName = itemView.findViewById(R.id.tv_apk_name);
            tvApkVersion = itemView.findViewById(R.id.tv_apk_version);
            tvApkSize = itemView.findViewById(R.id.tv_apk_size);
            tvApkLevel = itemView.findViewById(R.id.tv_apk_level);
            tvApkDev = itemView.findViewById(R.id.tv_apk_dev);
            tvApkInstallTime = itemView.findViewById(R.id.tv_apk_install_time);
        }
    }

    public void setNewData(List<ApkInfoBean> newData) {
        if (newData != null && newData.size() > 0) {
            mDatas = newData;
            notifyDataSetChanged();
        }
    }

    public void addData(List<ApkInfoBean> newData) {
        if (newData != null && newData.size() > 0) {
            if (mDatas == null) {
                mDatas = new ArrayList<>();
            }
            mDatas.addAll(newData);
            notifyDataSetChanged();
        }
    }
}
