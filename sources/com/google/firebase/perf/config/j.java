package com.google.firebase.perf.config;

/* compiled from: ConfigurationConstants.java */
/* loaded from: classes3.dex */
public final class j extends v<Long> {

    /* renamed from: a  reason: collision with root package name */
    private static j f11780a;

    private j() {
    }

    public static synchronized j e() {
        j jVar;
        synchronized (j.class) {
            if (f11780a == null) {
                f11780a = new j();
            }
            jVar = f11780a;
        }
        return jVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.firebase.perf.config.v
    public String a() {
        return "com.google.firebase.perf.TimeLimitSec";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.firebase.perf.config.v
    public String c() {
        return "fpr_rl_time_limit_sec";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public Long d() {
        return 600L;
    }
}
