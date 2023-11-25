package com.google.firebase.perf.config;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* compiled from: DeviceCacheManager.java */
/* loaded from: classes3.dex */
public class x {

    /* renamed from: c  reason: collision with root package name */
    private static final v9.a f11794c = v9.a.e();

    /* renamed from: d  reason: collision with root package name */
    private static x f11795d;

    /* renamed from: a  reason: collision with root package name */
    private volatile SharedPreferences f11796a;

    /* renamed from: b  reason: collision with root package name */
    private final ExecutorService f11797b;

    public x(ExecutorService executorService) {
        this.f11797b = executorService;
    }

    private Context c() {
        try {
            com.google.firebase.e.k();
            return com.google.firebase.e.k().j();
        } catch (IllegalStateException unused) {
            return null;
        }
    }

    @SuppressLint({"ThreadPoolCreation"})
    public static synchronized x e() {
        x xVar;
        synchronized (x.class) {
            if (f11795d == null) {
                f11795d = new x(Executors.newSingleThreadExecutor());
            }
            xVar = f11795d;
        }
        return xVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void h(Context context) {
        if (this.f11796a == null && context != null) {
            this.f11796a = context.getSharedPreferences("FirebasePerfSharedPrefs", 0);
        }
    }

    public com.google.firebase.perf.util.g<Boolean> b(String str) {
        if (str == null) {
            f11794c.a("Key is null when getting boolean value on device cache.");
            return com.google.firebase.perf.util.g.a();
        }
        if (this.f11796a == null) {
            i(c());
            if (this.f11796a == null) {
                return com.google.firebase.perf.util.g.a();
            }
        }
        if (!this.f11796a.contains(str)) {
            return com.google.firebase.perf.util.g.a();
        }
        try {
            return com.google.firebase.perf.util.g.e(Boolean.valueOf(this.f11796a.getBoolean(str, false)));
        } catch (ClassCastException e10) {
            f11794c.b("Key %s from sharedPreferences has type other than long: %s", str, e10.getMessage());
            return com.google.firebase.perf.util.g.a();
        }
    }

    public com.google.firebase.perf.util.g<Float> d(String str) {
        if (str == null) {
            f11794c.a("Key is null when getting float value on device cache.");
            return com.google.firebase.perf.util.g.a();
        }
        if (this.f11796a == null) {
            i(c());
            if (this.f11796a == null) {
                return com.google.firebase.perf.util.g.a();
            }
        }
        if (!this.f11796a.contains(str)) {
            return com.google.firebase.perf.util.g.a();
        }
        try {
            return com.google.firebase.perf.util.g.e(Float.valueOf(this.f11796a.getFloat(str, 0.0f)));
        } catch (ClassCastException e10) {
            f11794c.b("Key %s from sharedPreferences has type other than float: %s", str, e10.getMessage());
            return com.google.firebase.perf.util.g.a();
        }
    }

    public com.google.firebase.perf.util.g<Long> f(String str) {
        if (str == null) {
            f11794c.a("Key is null when getting long value on device cache.");
            return com.google.firebase.perf.util.g.a();
        }
        if (this.f11796a == null) {
            i(c());
            if (this.f11796a == null) {
                return com.google.firebase.perf.util.g.a();
            }
        }
        if (!this.f11796a.contains(str)) {
            return com.google.firebase.perf.util.g.a();
        }
        try {
            return com.google.firebase.perf.util.g.e(Long.valueOf(this.f11796a.getLong(str, 0L)));
        } catch (ClassCastException e10) {
            f11794c.b("Key %s from sharedPreferences has type other than long: %s", str, e10.getMessage());
            return com.google.firebase.perf.util.g.a();
        }
    }

    public com.google.firebase.perf.util.g<String> g(String str) {
        if (str == null) {
            f11794c.a("Key is null when getting String value on device cache.");
            return com.google.firebase.perf.util.g.a();
        }
        if (this.f11796a == null) {
            i(c());
            if (this.f11796a == null) {
                return com.google.firebase.perf.util.g.a();
            }
        }
        if (!this.f11796a.contains(str)) {
            return com.google.firebase.perf.util.g.a();
        }
        try {
            return com.google.firebase.perf.util.g.e(this.f11796a.getString(str, ""));
        } catch (ClassCastException e10) {
            f11794c.b("Key %s from sharedPreferences has type other than String: %s", str, e10.getMessage());
            return com.google.firebase.perf.util.g.a();
        }
    }

    public synchronized void i(final Context context) {
        if (this.f11796a == null && context != null) {
            this.f11797b.execute(new Runnable() { // from class: com.google.firebase.perf.config.w
                @Override // java.lang.Runnable
                public final void run() {
                    x.this.h(context);
                }
            });
        }
    }

    public boolean j(String str, float f10) {
        if (str == null) {
            f11794c.a("Key is null when setting float value on device cache.");
            return false;
        }
        if (this.f11796a == null) {
            i(c());
            if (this.f11796a == null) {
                return false;
            }
        }
        this.f11796a.edit().putFloat(str, f10).apply();
        return true;
    }

    public boolean k(String str, long j10) {
        if (str == null) {
            f11794c.a("Key is null when setting long value on device cache.");
            return false;
        }
        if (this.f11796a == null) {
            i(c());
            if (this.f11796a == null) {
                return false;
            }
        }
        this.f11796a.edit().putLong(str, j10).apply();
        return true;
    }

    public boolean l(String str, String str2) {
        if (str == null) {
            f11794c.a("Key is null when setting String value on device cache.");
            return false;
        }
        if (this.f11796a == null) {
            i(c());
            if (this.f11796a == null) {
                return false;
            }
        }
        if (str2 == null) {
            this.f11796a.edit().remove(str).apply();
            return true;
        }
        this.f11796a.edit().putString(str, str2).apply();
        return true;
    }

    public boolean m(String str, boolean z10) {
        if (str == null) {
            f11794c.a("Key is null when setting boolean value on device cache.");
            return false;
        }
        if (this.f11796a == null) {
            i(c());
            if (this.f11796a == null) {
                return false;
            }
        }
        this.f11796a.edit().putBoolean(str, z10).apply();
        return true;
    }
}
