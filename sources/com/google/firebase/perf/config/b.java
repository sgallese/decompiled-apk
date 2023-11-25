package com.google.firebase.perf.config;

/* compiled from: ConfigurationConstants.java */
/* loaded from: classes3.dex */
public final class b extends v<Boolean> {

    /* renamed from: a  reason: collision with root package name */
    private static b f11771a;

    private b() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static synchronized b e() {
        b bVar;
        synchronized (b.class) {
            if (f11771a == null) {
                f11771a = new b();
            }
            bVar = f11771a;
        }
        return bVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.firebase.perf.config.v
    public String b() {
        return "firebase_performance_collection_deactivated";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public Boolean d() {
        return Boolean.FALSE;
    }
}
