package com.google.firebase.perf.config;

/* compiled from: ConfigurationConstants.java */
/* loaded from: classes3.dex */
public final class k extends v<String> {

    /* renamed from: a  reason: collision with root package name */
    private static k f11781a;

    protected k() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static synchronized k e() {
        k kVar;
        synchronized (k.class) {
            if (f11781a == null) {
                f11781a = new k();
            }
            kVar = f11781a;
        }
        return kVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.firebase.perf.config.v
    public String a() {
        return "com.google.firebase.perf.SdkDisabledVersions";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.firebase.perf.config.v
    public String c() {
        return "fpr_disabled_android_versions";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public String d() {
        return "";
    }
}
