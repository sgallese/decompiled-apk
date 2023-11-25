package com.google.firebase.perf.config;

/* compiled from: ConfigurationConstants.java */
/* loaded from: classes3.dex */
public final class o extends v<Long> {

    /* renamed from: a  reason: collision with root package name */
    private static o f11785a;

    private o() {
    }

    public static synchronized o e() {
        o oVar;
        synchronized (o.class) {
            if (f11785a == null) {
                f11785a = new o();
            }
            oVar = f11785a;
        }
        return oVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.firebase.perf.config.v
    public String a() {
        return "com.google.firebase.perf.SessionsMaxDurationMinutes";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.firebase.perf.config.v
    public String b() {
        return "sessions_max_length_minutes";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.firebase.perf.config.v
    public String c() {
        return "fpr_session_max_duration_min";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public Long d() {
        return 240L;
    }
}
