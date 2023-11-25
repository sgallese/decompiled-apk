package com.google.firebase.messaging;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.PowerManager;
import android.util.Log;
import java.io.IOException;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: TopicsSyncTask.java */
/* loaded from: classes3.dex */
public class z0 implements Runnable {

    /* renamed from: s  reason: collision with root package name */
    private static final Object f11732s = new Object();

    /* renamed from: t  reason: collision with root package name */
    private static Boolean f11733t;

    /* renamed from: u  reason: collision with root package name */
    private static Boolean f11734u;

    /* renamed from: f  reason: collision with root package name */
    private final Context f11735f;

    /* renamed from: m  reason: collision with root package name */
    private final f0 f11736m;

    /* renamed from: p  reason: collision with root package name */
    private final PowerManager.WakeLock f11737p;

    /* renamed from: q  reason: collision with root package name */
    private final y0 f11738q;

    /* renamed from: r  reason: collision with root package name */
    private final long f11739r;

    /* compiled from: TopicsSyncTask.java */
    /* loaded from: classes3.dex */
    class a extends BroadcastReceiver {

        /* renamed from: a  reason: collision with root package name */
        private z0 f11740a;

        public a(z0 z0Var) {
            this.f11740a = z0Var;
        }

        public void a() {
            if (z0.b()) {
                Log.d("FirebaseMessaging", "Connectivity change received registered");
            }
            z0.this.f11735f.registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        }

        @Override // android.content.BroadcastReceiver
        public synchronized void onReceive(Context context, Intent intent) {
            z0 z0Var = this.f11740a;
            if (z0Var == null) {
                return;
            }
            if (!z0Var.i()) {
                return;
            }
            if (z0.b()) {
                Log.d("FirebaseMessaging", "Connectivity changed. Starting background sync.");
            }
            this.f11740a.f11738q.l(this.f11740a, 0L);
            context.unregisterReceiver(this);
            this.f11740a = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public z0(y0 y0Var, Context context, f0 f0Var, long j10) {
        this.f11738q = y0Var;
        this.f11735f = context;
        this.f11739r = j10;
        this.f11736m = f0Var;
        this.f11737p = ((PowerManager) context.getSystemService("power")).newWakeLock(1, "wake:com.google.firebase.messaging");
    }

    static /* synthetic */ boolean b() {
        return j();
    }

    private static String e(String str) {
        return "Missing Permission: " + str + ". This permission should normally be included by the manifest merger, but may needed to be manually added to your manifest";
    }

    private static boolean f(Context context) {
        boolean booleanValue;
        boolean booleanValue2;
        synchronized (f11732s) {
            Boolean bool = f11734u;
            if (bool == null) {
                booleanValue = g(context, "android.permission.ACCESS_NETWORK_STATE", bool);
            } else {
                booleanValue = bool.booleanValue();
            }
            Boolean valueOf = Boolean.valueOf(booleanValue);
            f11734u = valueOf;
            booleanValue2 = valueOf.booleanValue();
        }
        return booleanValue2;
    }

    private static boolean g(Context context, String str, Boolean bool) {
        boolean z10;
        if (bool != null) {
            return bool.booleanValue();
        }
        if (context.checkCallingOrSelfPermission(str) == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10 && Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", e(str));
        }
        return z10;
    }

    private static boolean h(Context context) {
        boolean booleanValue;
        boolean booleanValue2;
        synchronized (f11732s) {
            Boolean bool = f11733t;
            if (bool == null) {
                booleanValue = g(context, "android.permission.WAKE_LOCK", bool);
            } else {
                booleanValue = bool.booleanValue();
            }
            Boolean valueOf = Boolean.valueOf(booleanValue);
            f11733t = valueOf;
            booleanValue2 = valueOf.booleanValue();
        }
        return booleanValue2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized boolean i() {
        NetworkInfo networkInfo;
        boolean z10;
        ConnectivityManager connectivityManager = (ConnectivityManager) this.f11735f.getSystemService("connectivity");
        if (connectivityManager != null) {
            networkInfo = connectivityManager.getActiveNetworkInfo();
        } else {
            networkInfo = null;
        }
        if (networkInfo != null) {
            if (networkInfo.isConnected()) {
                z10 = true;
            }
        }
        z10 = false;
        return z10;
    }

    private static boolean j() {
        if (!Log.isLoggable("FirebaseMessaging", 3) && (Build.VERSION.SDK_INT != 23 || !Log.isLoggable("FirebaseMessaging", 3))) {
            return false;
        }
        return true;
    }

    @Override // java.lang.Runnable
    @SuppressLint({"Wakelock"})
    public void run() {
        PowerManager.WakeLock wakeLock;
        if (h(this.f11735f)) {
            this.f11737p.acquire(e.f11629a);
        }
        try {
            try {
                try {
                    this.f11738q.m(true);
                } catch (Throwable th) {
                    if (h(this.f11735f)) {
                        try {
                            this.f11737p.release();
                        } catch (RuntimeException unused) {
                            Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
                        }
                    }
                    throw th;
                }
            } catch (IOException e10) {
                Log.e("FirebaseMessaging", "Failed to sync topics. Won't retry sync. " + e10.getMessage());
                this.f11738q.m(false);
                if (h(this.f11735f)) {
                    wakeLock = this.f11737p;
                } else {
                    return;
                }
            }
            if (!this.f11736m.g()) {
                this.f11738q.m(false);
                if (h(this.f11735f)) {
                    try {
                        this.f11737p.release();
                    } catch (RuntimeException unused2) {
                        Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
                    }
                }
            } else if (f(this.f11735f) && !i()) {
                new a(this).a();
                if (h(this.f11735f)) {
                    try {
                        this.f11737p.release();
                    } catch (RuntimeException unused3) {
                        Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
                    }
                }
            } else {
                if (this.f11738q.p()) {
                    this.f11738q.m(false);
                } else {
                    this.f11738q.q(this.f11739r);
                }
                if (h(this.f11735f)) {
                    wakeLock = this.f11737p;
                    wakeLock.release();
                }
            }
        } catch (RuntimeException unused4) {
            Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
        }
    }
}
