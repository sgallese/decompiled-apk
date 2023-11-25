package u9;

/* compiled from: FirebasePerformanceModule_ProvidesFirebaseAppFactory.java */
/* loaded from: classes3.dex */
public final class c implements cc.a {

    /* renamed from: a  reason: collision with root package name */
    private final a f24218a;

    public c(a aVar) {
        this.f24218a = aVar;
    }

    public static c a(a aVar) {
        return new c(aVar);
    }

    public static com.google.firebase.e c(a aVar) {
        return (com.google.firebase.e) bb.b.c(aVar.b(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // cc.a
    /* renamed from: b  reason: merged with bridge method [inline-methods] */
    public com.google.firebase.e get() {
        return c(this.f24218a);
    }
}
