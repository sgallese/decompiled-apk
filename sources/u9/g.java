package u9;

import com.google.firebase.perf.session.SessionManager;

/* compiled from: FirebasePerformanceModule_ProvidesSessionManagerFactory.java */
/* loaded from: classes3.dex */
public final class g implements cc.a {

    /* renamed from: a  reason: collision with root package name */
    private final a f24222a;

    public g(a aVar) {
        this.f24222a = aVar;
    }

    public static g a(a aVar) {
        return new g(aVar);
    }

    public static SessionManager c(a aVar) {
        return (SessionManager) bb.b.c(aVar.f(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // cc.a
    /* renamed from: b  reason: merged with bridge method [inline-methods] */
    public SessionManager get() {
        return c(this.f24222a);
    }
}
