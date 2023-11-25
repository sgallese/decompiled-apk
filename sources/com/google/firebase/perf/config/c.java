package com.google.firebase.perf.config;

/* compiled from: ConfigurationConstants.java */
/* loaded from: classes3.dex */
public final class c extends v<Boolean> {

    /* renamed from: a  reason: collision with root package name */
    private static c f11772a;

    private c() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static synchronized c d() {
        c cVar;
        synchronized (c.class) {
            if (f11772a == null) {
                f11772a = new c();
            }
            cVar = f11772a;
        }
        return cVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.firebase.perf.config.v
    public String a() {
        return "isEnabled";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.firebase.perf.config.v
    public String b() {
        return "firebase_performance_collection_enabled";
    }
}
