package com.google.firebase.perf.config;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: ConfigurationConstants.java */
/* loaded from: classes3.dex */
public final class f extends v<String> {

    /* renamed from: a  reason: collision with root package name */
    private static f f11775a;

    /* renamed from: b  reason: collision with root package name */
    private static final Map<Long, String> f11776b = Collections.unmodifiableMap(new a());

    /* compiled from: ConfigurationConstants.java */
    /* loaded from: classes3.dex */
    class a extends HashMap<Long, String> {
        a() {
            put(461L, "FIREPERF_AUTOPUSH");
            put(462L, "FIREPERF");
            put(675L, "FIREPERF_INTERNAL_LOW");
            put(676L, "FIREPERF_INTERNAL_HIGH");
        }
    }

    private f() {
    }

    public static synchronized f e() {
        f fVar;
        synchronized (f.class) {
            if (f11775a == null) {
                f11775a = new f();
            }
            fVar = f11775a;
        }
        return fVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static String f(long j10) {
        return f11776b.get(Long.valueOf(j10));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static boolean g(long j10) {
        return f11776b.containsKey(Long.valueOf(j10));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.firebase.perf.config.v
    public String a() {
        return "com.google.firebase.perf.LogSourceName";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.firebase.perf.config.v
    public String c() {
        return "fpr_log_source";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public String d() {
        return s9.a.f23042c;
    }
}
