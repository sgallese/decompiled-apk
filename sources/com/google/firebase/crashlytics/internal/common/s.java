package com.google.firebase.crashlytics.internal.common;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.Executor;

/* compiled from: DataCollectionArbiter.java */
/* loaded from: classes3.dex */
public class s {

    /* renamed from: a  reason: collision with root package name */
    private final SharedPreferences f11468a;

    /* renamed from: b  reason: collision with root package name */
    private final com.google.firebase.e f11469b;

    /* renamed from: c  reason: collision with root package name */
    private final Object f11470c;

    /* renamed from: d  reason: collision with root package name */
    TaskCompletionSource<Void> f11471d;

    /* renamed from: e  reason: collision with root package name */
    boolean f11472e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f11473f;

    /* renamed from: g  reason: collision with root package name */
    private Boolean f11474g;

    /* renamed from: h  reason: collision with root package name */
    private final TaskCompletionSource<Void> f11475h;

    public s(com.google.firebase.e eVar) {
        Object obj = new Object();
        this.f11470c = obj;
        this.f11471d = new TaskCompletionSource<>();
        this.f11472e = false;
        this.f11473f = false;
        this.f11475h = new TaskCompletionSource<>();
        Context j10 = eVar.j();
        this.f11469b = eVar;
        this.f11468a = h.s(j10);
        Boolean b10 = b();
        this.f11474g = b10 == null ? a(j10) : b10;
        synchronized (obj) {
            if (d()) {
                this.f11471d.trySetResult(null);
                this.f11472e = true;
            }
        }
    }

    private Boolean a(Context context) {
        Boolean f10 = f(context);
        if (f10 == null) {
            this.f11473f = false;
            return null;
        }
        this.f11473f = true;
        return Boolean.valueOf(Boolean.TRUE.equals(f10));
    }

    private Boolean b() {
        if (this.f11468a.contains("firebase_crashlytics_collection_enabled")) {
            this.f11473f = false;
            return Boolean.valueOf(this.f11468a.getBoolean("firebase_crashlytics_collection_enabled", true));
        }
        return null;
    }

    private void e(boolean z10) {
        String str;
        String str2;
        if (z10) {
            str = "ENABLED";
        } else {
            str = "DISABLED";
        }
        if (this.f11474g == null) {
            str2 = "global Firebase setting";
        } else if (this.f11473f) {
            str2 = "firebase_crashlytics_collection_enabled manifest flag";
        } else {
            str2 = "API";
        }
        n8.f.f().b(String.format("Crashlytics automatic data collection %s by %s.", str, str2));
    }

    private static Boolean f(Context context) {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager != null && (applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), 128)) != null && (bundle = applicationInfo.metaData) != null && bundle.containsKey("firebase_crashlytics_collection_enabled")) {
                return Boolean.valueOf(applicationInfo.metaData.getBoolean("firebase_crashlytics_collection_enabled"));
            }
            return null;
        } catch (PackageManager.NameNotFoundException e10) {
            n8.f.f().e("Could not read data collection permission from manifest", e10);
            return null;
        }
    }

    public void c(boolean z10) {
        if (z10) {
            this.f11475h.trySetResult(null);
            return;
        }
        throw new IllegalStateException("An invalid data collection token was used.");
    }

    public synchronized boolean d() {
        boolean s10;
        Boolean bool = this.f11474g;
        if (bool != null) {
            s10 = bool.booleanValue();
        } else {
            s10 = this.f11469b.s();
        }
        e(s10);
        return s10;
    }

    public Task<Void> g() {
        Task<Void> task;
        synchronized (this.f11470c) {
            task = this.f11471d.getTask();
        }
        return task;
    }

    public Task<Void> h(Executor executor) {
        return t0.o(executor, this.f11475h.getTask(), g());
    }
}
