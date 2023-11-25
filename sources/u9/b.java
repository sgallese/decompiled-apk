package u9;

/* compiled from: FirebasePerformanceModule_ProvidesConfigResolverFactory.java */
/* loaded from: classes3.dex */
public final class b implements cc.a {

    /* renamed from: a  reason: collision with root package name */
    private final a f24217a;

    public b(a aVar) {
        this.f24217a = aVar;
    }

    public static b a(a aVar) {
        return new b(aVar);
    }

    public static com.google.firebase.perf.config.a c(a aVar) {
        return (com.google.firebase.perf.config.a) bb.b.c(aVar.a(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // cc.a
    /* renamed from: b  reason: merged with bridge method [inline-methods] */
    public com.google.firebase.perf.config.a get() {
        return c(this.f24217a);
    }
}
