package u9;

/* compiled from: FirebasePerformanceModule_ProvidesFirebaseInstallationsFactory.java */
/* loaded from: classes3.dex */
public final class d implements cc.a {

    /* renamed from: a  reason: collision with root package name */
    private final a f24219a;

    public d(a aVar) {
        this.f24219a = aVar;
    }

    public static d a(a aVar) {
        return new d(aVar);
    }

    public static j9.e c(a aVar) {
        return (j9.e) bb.b.c(aVar.c(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // cc.a
    /* renamed from: b  reason: merged with bridge method [inline-methods] */
    public j9.e get() {
        return c(this.f24219a);
    }
}
