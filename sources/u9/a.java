package u9;

import com.google.firebase.perf.config.RemoteConfigManager;
import com.google.firebase.perf.session.SessionManager;

/* compiled from: FirebasePerformanceModule.java */
/* loaded from: classes3.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    private final com.google.firebase.e f24213a;

    /* renamed from: b  reason: collision with root package name */
    private final j9.e f24214b;

    /* renamed from: c  reason: collision with root package name */
    private final i9.b<com.google.firebase.remoteconfig.c> f24215c;

    /* renamed from: d  reason: collision with root package name */
    private final i9.b<g6.g> f24216d;

    public a(com.google.firebase.e eVar, j9.e eVar2, i9.b<com.google.firebase.remoteconfig.c> bVar, i9.b<g6.g> bVar2) {
        this.f24213a = eVar;
        this.f24214b = eVar2;
        this.f24215c = bVar;
        this.f24216d = bVar2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public com.google.firebase.perf.config.a a() {
        return com.google.firebase.perf.config.a.g();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public com.google.firebase.e b() {
        return this.f24213a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public j9.e c() {
        return this.f24214b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public i9.b<com.google.firebase.remoteconfig.c> d() {
        return this.f24215c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public RemoteConfigManager e() {
        return RemoteConfigManager.getInstance();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public SessionManager f() {
        return SessionManager.getInstance();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public i9.b<g6.g> g() {
        return this.f24216d;
    }
}
