package s9;

import com.google.firebase.perf.config.RemoteConfigManager;
import com.google.firebase.perf.session.SessionManager;

/* compiled from: FirebasePerformance_Factory.java */
/* loaded from: classes3.dex */
public final class g implements cc.a {

    /* renamed from: a  reason: collision with root package name */
    private final cc.a<com.google.firebase.e> f23053a;

    /* renamed from: b  reason: collision with root package name */
    private final cc.a<i9.b<com.google.firebase.remoteconfig.c>> f23054b;

    /* renamed from: c  reason: collision with root package name */
    private final cc.a<j9.e> f23055c;

    /* renamed from: d  reason: collision with root package name */
    private final cc.a<i9.b<g6.g>> f23056d;

    /* renamed from: e  reason: collision with root package name */
    private final cc.a<RemoteConfigManager> f23057e;

    /* renamed from: f  reason: collision with root package name */
    private final cc.a<com.google.firebase.perf.config.a> f23058f;

    /* renamed from: g  reason: collision with root package name */
    private final cc.a<SessionManager> f23059g;

    public g(cc.a<com.google.firebase.e> aVar, cc.a<i9.b<com.google.firebase.remoteconfig.c>> aVar2, cc.a<j9.e> aVar3, cc.a<i9.b<g6.g>> aVar4, cc.a<RemoteConfigManager> aVar5, cc.a<com.google.firebase.perf.config.a> aVar6, cc.a<SessionManager> aVar7) {
        this.f23053a = aVar;
        this.f23054b = aVar2;
        this.f23055c = aVar3;
        this.f23056d = aVar4;
        this.f23057e = aVar5;
        this.f23058f = aVar6;
        this.f23059g = aVar7;
    }

    public static g a(cc.a<com.google.firebase.e> aVar, cc.a<i9.b<com.google.firebase.remoteconfig.c>> aVar2, cc.a<j9.e> aVar3, cc.a<i9.b<g6.g>> aVar4, cc.a<RemoteConfigManager> aVar5, cc.a<com.google.firebase.perf.config.a> aVar6, cc.a<SessionManager> aVar7) {
        return new g(aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7);
    }

    public static e c(com.google.firebase.e eVar, i9.b<com.google.firebase.remoteconfig.c> bVar, j9.e eVar2, i9.b<g6.g> bVar2, RemoteConfigManager remoteConfigManager, com.google.firebase.perf.config.a aVar, SessionManager sessionManager) {
        return new e(eVar, bVar, eVar2, bVar2, remoteConfigManager, aVar, sessionManager);
    }

    @Override // cc.a
    /* renamed from: b  reason: merged with bridge method [inline-methods] */
    public e get() {
        return c(this.f23053a.get(), this.f23054b.get(), this.f23055c.get(), this.f23056d.get(), this.f23057e.get(), this.f23058f.get(), this.f23059g.get());
    }
}
