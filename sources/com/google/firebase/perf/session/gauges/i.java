package com.google.firebase.perf.session.gauges;

import android.app.ActivityManager;
import android.content.Context;
import com.google.firebase.perf.util.n;

/* compiled from: GaugeMetadataManager.java */
/* loaded from: classes3.dex */
class i {

    /* renamed from: e  reason: collision with root package name */
    private static final v9.a f11866e = v9.a.e();

    /* renamed from: a  reason: collision with root package name */
    private final Runtime f11867a;

    /* renamed from: b  reason: collision with root package name */
    private final ActivityManager f11868b;

    /* renamed from: c  reason: collision with root package name */
    private final ActivityManager.MemoryInfo f11869c;

    /* renamed from: d  reason: collision with root package name */
    private final Context f11870d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public i(Context context) {
        this(Runtime.getRuntime(), context);
    }

    public int a() {
        return n.c(com.google.firebase.perf.util.k.BYTES.toKilobytes(this.f11869c.totalMem));
    }

    public int b() {
        return n.c(com.google.firebase.perf.util.k.BYTES.toKilobytes(this.f11867a.maxMemory()));
    }

    public int c() {
        return n.c(com.google.firebase.perf.util.k.MEGABYTES.toKilobytes(this.f11868b.getMemoryClass()));
    }

    i(Runtime runtime, Context context) {
        this.f11867a = runtime;
        this.f11870d = context;
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        this.f11868b = activityManager;
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        this.f11869c = memoryInfo;
        activityManager.getMemoryInfo(memoryInfo);
    }
}
