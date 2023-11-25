package com.google.firebase.crashlytics.internal.common;

import android.content.Context;

/* compiled from: InstallerPackageNameProvider.java */
/* loaded from: classes3.dex */
class y {

    /* renamed from: a  reason: collision with root package name */
    private String f11498a;

    private static String b(Context context) {
        String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
        if (installerPackageName == null) {
            return "";
        }
        return installerPackageName;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized String a(Context context) {
        String str;
        if (this.f11498a == null) {
            this.f11498a = b(context);
        }
        if ("".equals(this.f11498a)) {
            str = null;
        } else {
            str = this.f11498a;
        }
        return str;
    }
}
