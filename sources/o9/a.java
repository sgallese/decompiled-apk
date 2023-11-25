package o9;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import f9.c;

/* compiled from: DataCollectionConfigStorage.java */
/* loaded from: classes3.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    private final Context f20585a;

    /* renamed from: b  reason: collision with root package name */
    private final SharedPreferences f20586b;

    /* renamed from: c  reason: collision with root package name */
    private final c f20587c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f20588d;

    public a(Context context, String str, c cVar) {
        Context a10 = a(context);
        this.f20585a = a10;
        this.f20586b = a10.getSharedPreferences("com.google.firebase.common.prefs:" + str, 0);
        this.f20587c = cVar;
        this.f20588d = c();
    }

    private static Context a(Context context) {
        if (Build.VERSION.SDK_INT < 24) {
            return context;
        }
        return androidx.core.content.a.b(context);
    }

    private boolean c() {
        if (this.f20586b.contains("firebase_data_collection_default_enabled")) {
            return this.f20586b.getBoolean("firebase_data_collection_default_enabled", true);
        }
        return d();
    }

    private boolean d() {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        try {
            PackageManager packageManager = this.f20585a.getPackageManager();
            if (packageManager != null && (applicationInfo = packageManager.getApplicationInfo(this.f20585a.getPackageName(), 128)) != null && (bundle = applicationInfo.metaData) != null && bundle.containsKey("firebase_data_collection_default_enabled")) {
                return applicationInfo.metaData.getBoolean("firebase_data_collection_default_enabled");
            }
            return true;
        } catch (PackageManager.NameNotFoundException unused) {
            return true;
        }
    }

    public synchronized boolean b() {
        return this.f20588d;
    }
}
