package com.google.firebase.messaging;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.util.Log;
import com.google.android.gms.common.util.PlatformVersion;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Metadata.java */
/* loaded from: classes3.dex */
public class f0 {

    /* renamed from: a  reason: collision with root package name */
    private final Context f11634a;

    /* renamed from: b  reason: collision with root package name */
    private String f11635b;

    /* renamed from: c  reason: collision with root package name */
    private String f11636c;

    /* renamed from: d  reason: collision with root package name */
    private int f11637d;

    /* renamed from: e  reason: collision with root package name */
    private int f11638e = 0;

    /* JADX INFO: Access modifiers changed from: package-private */
    public f0(Context context) {
        this.f11634a = context;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String c(com.google.firebase.e eVar) {
        String d10 = eVar.m().d();
        if (d10 != null) {
            return d10;
        }
        String c10 = eVar.m().c();
        if (!c10.startsWith("1:")) {
            return c10;
        }
        String[] split = c10.split(":");
        if (split.length < 2) {
            return null;
        }
        String str = split[1];
        if (str.isEmpty()) {
            return null;
        }
        return str;
    }

    private PackageInfo f(String str) {
        try {
            return this.f11634a.getPackageManager().getPackageInfo(str, 0);
        } catch (PackageManager.NameNotFoundException e10) {
            Log.w("FirebaseMessaging", "Failed to find package " + e10);
            return null;
        }
    }

    private synchronized void h() {
        PackageInfo f10 = f(this.f11634a.getPackageName());
        if (f10 != null) {
            this.f11635b = Integer.toString(f10.versionCode);
            this.f11636c = f10.versionName;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized String a() {
        if (this.f11635b == null) {
            h();
        }
        return this.f11635b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized String b() {
        if (this.f11636c == null) {
            h();
        }
        return this.f11636c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized int d() {
        PackageInfo f10;
        if (this.f11637d == 0 && (f10 = f("com.google.android.gms")) != null) {
            this.f11637d = f10.versionCode;
        }
        return this.f11637d;
    }

    synchronized int e() {
        int i10 = this.f11638e;
        if (i10 != 0) {
            return i10;
        }
        PackageManager packageManager = this.f11634a.getPackageManager();
        if (packageManager.checkPermission("com.google.android.c2dm.permission.SEND", "com.google.android.gms") == -1) {
            Log.e("FirebaseMessaging", "Google Play services missing or without correct permission.");
            return 0;
        }
        if (!PlatformVersion.isAtLeastO()) {
            Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
            intent.setPackage("com.google.android.gms");
            List<ResolveInfo> queryIntentServices = packageManager.queryIntentServices(intent, 0);
            if (queryIntentServices != null && queryIntentServices.size() > 0) {
                this.f11638e = 1;
                return 1;
            }
        }
        Intent intent2 = new Intent("com.google.iid.TOKEN_REQUEST");
        intent2.setPackage("com.google.android.gms");
        List<ResolveInfo> queryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent2, 0);
        if (queryBroadcastReceivers != null && queryBroadcastReceivers.size() > 0) {
            this.f11638e = 2;
            return 2;
        }
        Log.w("FirebaseMessaging", "Failed to resolve IID implementation package, falling back");
        if (PlatformVersion.isAtLeastO()) {
            this.f11638e = 2;
        } else {
            this.f11638e = 1;
        }
        return this.f11638e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean g() {
        if (e() != 0) {
            return true;
        }
        return false;
    }
}
