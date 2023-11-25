package u9;

/* compiled from: FirebasePerformanceModule_ProvidesTransportFactoryProviderFactory.java */
/* loaded from: classes3.dex */
public final class h implements cc.a {

    /* renamed from: a  reason: collision with root package name */
    private final a f24223a;

    public h(a aVar) {
        this.f24223a = aVar;
    }

    public static h a(a aVar) {
        return new h(aVar);
    }

    public static i9.b<g6.g> c(a aVar) {
        return (i9.b) bb.b.c(aVar.g(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // cc.a
    /* renamed from: b  reason: merged with bridge method [inline-methods] */
    public i9.b<g6.g> get() {
        return c(this.f24223a);
    }
}
