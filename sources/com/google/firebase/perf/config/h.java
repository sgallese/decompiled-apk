package com.google.firebase.perf.config;

/* compiled from: ConfigurationConstants.java */
/* loaded from: classes3.dex */
public final class h extends v<Long> {

    /* renamed from: a  reason: collision with root package name */
    private static h f11778a;

    private h() {
    }

    public static synchronized h e() {
        h hVar;
        synchronized (h.class) {
            if (f11778a == null) {
                f11778a = new h();
            }
            hVar = f11778a;
        }
        return hVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.firebase.perf.config.v
    public String a() {
        return "com.google.firebase.perf.NetworkEventCountForeground";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.firebase.perf.config.v
    public String c() {
        return "fpr_rl_network_event_count_fg";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public Long d() {
        return 700L;
    }
}
