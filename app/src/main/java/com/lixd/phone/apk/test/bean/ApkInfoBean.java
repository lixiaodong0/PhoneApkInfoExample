package com.lixd.phone.apk.test.bean;

import android.graphics.drawable.Drawable;

public class ApkInfoBean {
    //应用图标
    public Drawable appIcon;
    //应用名称
    public String appName;
    //应用对外版本
    public String appVersionName;
    //应用内部版本
    public String appVersionCode;
    //应用大小
    public long size;
    //应用环境 RELEASE DEBUG
    public String isReleaseDev;
    //是否是系统应用
    public boolean isSystemApp;
    //应用安装时间
    public String appInstallTime;
    //apk存放路径
    public String apkPath;
    //包名
    public String packageName;
}
