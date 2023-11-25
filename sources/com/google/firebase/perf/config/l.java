package com.google.firebase.perf.config;

/* compiled from: ConfigurationConstants.java */
/* loaded from: classes3.dex */
public final class l extends v<Boolean> {

    /* renamed from: a  reason: collision with root package name */
    private static l f11782a;

    protected l() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static synchronized l e() {
        l lVar;
        synchronized (l.class) {
            if (f11782a == null) {
                f11782a = new l();
            }
            lVar = f11782a;
        }
        return lVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.firebase.perf.config.v
    public String a() {
        return "com.google.firebase.perf.SdkEnabled";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.firebase.perf.config.v
    public String c() {
        return "fpr_enabled";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public Boolean d() {
        return Boolean.TRUE;
    }
}
