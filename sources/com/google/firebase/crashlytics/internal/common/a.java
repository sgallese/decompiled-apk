package com.google.firebase.crashlytics.internal.common;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import java.util.List;

/* compiled from: AppData.java */
/* loaded from: classes3.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    public final String f11337a;

    /* renamed from: b  reason: collision with root package name */
    public final String f11338b;

    /* renamed from: c  reason: collision with root package name */
    public final List<e> f11339c;

    /* renamed from: d  reason: collision with root package name */
    public final String f11340d;

    /* renamed from: e  reason: collision with root package name */
    public final String f11341e;

    /* renamed from: f  reason: collision with root package name */
    public final String f11342f;

    /* renamed from: g  reason: collision with root package name */
    public final String f11343g;

    /* renamed from: h  reason: collision with root package name */
    public final n8.e f11344h;

    public a(String str, String str2, List<e> list, String str3, String str4, String str5, String str6, n8.e eVar) {
        this.f11337a = str;
        this.f11338b = str2;
        this.f11339c = list;
        this.f11340d = str3;
        this.f11341e = str4;
        this.f11342f = str5;
        this.f11343g = str6;
        this.f11344h = eVar;
    }

    public static a a(Context context, w wVar, String str, String str2, List<e> list, n8.e eVar) throws PackageManager.NameNotFoundException {
        String packageName = context.getPackageName();
        String g10 = wVar.g();
        PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName, 0);
        String num = Integer.toString(packageInfo.versionCode);
        String str3 = packageInfo.versionName;
        if (str3 == null) {
            str3 = "0.0";
        }
        return new a(str, str2, list, g10, packageName, num, str3, eVar);
    }
}
