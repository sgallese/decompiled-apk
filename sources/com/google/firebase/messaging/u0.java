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
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.common.util.concurrent.NamedThreadFactory;
import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SyncTask.java */
/* loaded from: classes3.dex */
public class u0 implements Runnable {

    /* renamed from: f  reason: collision with root package name */
    private final long f11698f;

    /* renamed from: m  reason: collision with root package name */
    private final PowerManager.WakeLock f11699m;

    /* renamed from: p  reason: collision with root package name */
    private final FirebaseMessaging f11700p;
    @VisibleForTesting
    @SuppressLint({"ThreadPoolCreation"})

    /* renamed from: q  reason: collision with root package name */
    ExecutorService f11701q = new ThreadPoolExecutor(0, 1, 30, TimeUnit.SECONDS, new LinkedBlockingQueue(), new NamedThreadFactory("firebase-iid-executor"));

    /* compiled from: SyncTask.java */
    @VisibleForTesting
    /* loaded from: classes3.dex */
    static class a extends BroadcastReceiver {

        /* renamed from: a  reason: collision with root package name */
        private u0 f11702a;

        public a(u0 u0Var) {
            this.f11702a = u0Var;
        }

        public void a() {
            if (u0.c()) {
                Log.d("FirebaseMessaging", "Connectivity change received registered");
            }
            this.f11702a.b().registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            u0 u0Var = this.f11702a;
            if (u0Var == null || !u0Var.d()) {
                return;
            }
            if (u0.c()) {
                Log.d("FirebaseMessaging", "Connectivity changed. Starting background sync.");
            }
            this.f11702a.f11700p.j(this.f11702a, 0L);
            this.f11702a.b().unregisterReceiver(this);
            this.f11702a = null;
        }
    }

    @VisibleForTesting
    @SuppressLint({"InvalidWakeLockTag"})
    public u0(FirebaseMessaging firebaseMessaging, long j10) {
        this.f11700p = firebaseMessaging;
        this.f11698f = j10;
        PowerManager.WakeLock newWakeLock = ((PowerManager) b().getSystemService("power")).newWakeLock(1, "fiid-sync");
        this.f11699m = newWakeLock;
        newWakeLock.setReferenceCounted(false);
    }

    static boolean c() {
        if (!Log.isLoggable("FirebaseMessaging", 3) && (Build.VERSION.SDK_INT != 23 || !Log.isLoggable("FirebaseMessaging", 3))) {
            return false;
        }
        return true;
    }

    Context b() {
        return this.f11700p.k();
    }

    boolean d() {
        NetworkInfo networkInfo;
        ConnectivityManager connectivityManager = (ConnectivityManager) b().getSystemService("connectivity");
        if (connectivityManager != null) {
            networkInfo = connectivityManager.getActiveNetworkInfo();
        } else {
            networkInfo = null;
        }
        if (networkInfo != null && networkInfo.isConnected()) {
            return true;
        }
        return false;
    }

    @VisibleForTesting
    boolean e() throws IOException {
        try {
            if (this.f11700p.i() == null) {
                Log.e("FirebaseMessaging", "Token retrieval failed: null");
                return false;
            } else if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Token successfully retrieved");
                return true;
            } else {
                return true;
            }
        } catch (IOException e10) {
            if (a0.g(e10.getMessage())) {
                Log.w("FirebaseMessaging", "Token retrieval failed: " + e10.getMessage() + ". Will retry token retrieval");
                return false;
            } else if (e10.getMessage() == null) {
                Log.w("FirebaseMessaging", "Token retrieval failed without exception message. Will retry token retrieval");
                return false;
            } else {
                throw e10;
            }
        } catch (SecurityException unused) {
            Log.w("FirebaseMessaging", "Token retrieval failed with SecurityException. Will retry token retrieval");
            return false;
        }
    }

    @Override // java.lang.Runnable
    @SuppressLint({"WakelockTimeout"})
    public void run() {
        if (q0.b().e(b())) {
            this.f11699m.acquire();
        }
        try {
            try {
                this.f11700p.A(true);
            } catch (IOException e10) {
                Log.e("FirebaseMessaging", "Topic sync or token retrieval failed on hard failure exceptions: " + e10.getMessage() + ". Won't retry the operation.");
                this.f11700p.A(false);
                if (!q0.b().e(b())) {
                    return;
                }
            }
            if (!this.f11700p.t()) {
                this.f11700p.A(false);
                if (q0.b().e(b())) {
                    this.f11699m.release();
                }
            } else if (q0.b().d(b()) && !d()) {
                new a(this).a();
                if (q0.b().e(b())) {
                    this.f11699m.release();
                }
            } else {
                if (e()) {
                    this.f11700p.A(false);
                } else {
                    this.f11700p.D(this.f11698f);
                }
                if (!q0.b().e(b())) {
                    return;
                }
                this.f11699m.release();
            }
        } catch (Throwable th) {
            if (q0.b().e(b())) {
                this.f11699m.release();
            }
            throw th;
        }
    }
}
