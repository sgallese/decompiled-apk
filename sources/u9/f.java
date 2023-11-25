package u9;

import com.google.firebase.perf.config.RemoteConfigManager;

/* compiled from: FirebasePerformanceModule_ProvidesRemoteConfigManagerFactory.java */
/* loaded from: classes3.dex */
public final class f implements cc.a {

    /* renamed from: a  reason: collision with root package name */
    private final a f24221a;

    public f(a aVar) {
        this.f24221a = aVar;
    }

    public static f a(a aVar) {
        return new f(aVar);
    }

    public static RemoteConfigManager c(a aVar) {
        return (RemoteConfigManager) bb.b.c(aVar.e(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // cc.a
    /* renamed from: b  reason: merged with bridge method [inline-methods] */
    public RemoteConfigManager get() {
        return c(this.f24221a);
    }
}
