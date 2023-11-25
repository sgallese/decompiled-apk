package u9;

/* compiled from: FirebasePerformanceModule_ProvidesRemoteConfigComponentFactory.java */
/* loaded from: classes3.dex */
public final class e implements cc.a {

    /* renamed from: a  reason: collision with root package name */
    private final a f24220a;

    public e(a aVar) {
        this.f24220a = aVar;
    }

    public static e a(a aVar) {
        return new e(aVar);
    }

    public static i9.b<com.google.firebase.remoteconfig.c> c(a aVar) {
        return (i9.b) bb.b.c(aVar.d(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // cc.a
    /* renamed from: b  reason: merged with bridge method [inline-methods] */
    public i9.b<com.google.firebase.remoteconfig.c> get() {
        return c(this.f24220a);
    }
}
