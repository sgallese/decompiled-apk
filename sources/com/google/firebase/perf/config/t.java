package com.google.firebase.perf.config;

/* compiled from: ConfigurationConstants.java */
/* loaded from: classes3.dex */
public final class t extends v<Long> {

    /* renamed from: a  reason: collision with root package name */
    private static t f11790a;

    private t() {
    }

    public static synchronized t e() {
        t tVar;
        synchronized (t.class) {
            if (f11790a == null) {
                f11790a = new t();
            }
            tVar = f11790a;
        }
        return tVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.firebase.perf.config.v
    public String a() {
        return "com.google.firebase.perf.TraceEventCountForeground";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.firebase.perf.config.v
    public String c() {
        return "fpr_rl_trace_event_count_fg";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public Long d() {
        return 300L;
    }
}
