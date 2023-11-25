package com.google.firebase.perf.config;

/* compiled from: ConfigurationConstants.java */
/* loaded from: classes3.dex */
public final class u extends v<Float> {

    /* renamed from: a  reason: collision with root package name */
    private static u f11791a;

    private u() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static synchronized u e() {
        u uVar;
        synchronized (u.class) {
            if (f11791a == null) {
                f11791a = new u();
            }
            uVar = f11791a;
        }
        return uVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.firebase.perf.config.v
    public String a() {
        return "com.google.firebase.perf.TraceSamplingRate";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.firebase.perf.config.v
    public String c() {
        return "fpr_vc_trace_sampling_rate";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public Float d() {
        return Float.valueOf(1.0f);
    }
}
