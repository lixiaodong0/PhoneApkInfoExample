package com.lixd.phone.apk.test.util;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;

import com.lixd.phone.apk.test.bean.ApkInfoBean;

import java.util.ArrayList;
import java.util.List;

public class ApkUtil {


    public static final List<ApkInfoBean> getInstallApp(Context context) {
        PackageManager packageManager = context.getPackageManager();
        List<PackageInfo> installedPackages = packageManager.getInstalledPackages(0);
        List<ApkInfoBean> apkInfoBeans = new ArrayList<>();
        for (PackageInfo packageInfo : installedPackages) {
            ApkInfoBean bean = new ApkInfoBean();
            bean.isSystemApp = (packageInfo.applicationInfo.flags & ApplicationInfo.FLAG_SYSTEM) != 0;
            bean.appName = packageInfo.applicationInfo.loadLabel(packageManager).toString();
            bean.appVersionName = packageInfo.versionName;
            bean.appVersionCode = packageInfo.versionCode + "";
            bean.appIcon =  packageInfo.applicationInfo.loadIcon(packageManager);

            bean.appInstallTime = packageInfo.firstInstallTime + "";
            bean.apkPath = packageInfo.applicationInfo.sourceDir;
            bean.packageName = packageInfo.packageName;

            apkInfoBeans.add(bean);
        }
        return apkInfoBeans;
    }
}
