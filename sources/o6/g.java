package o6;

/* compiled from: SchedulingConfigModule_ConfigFactory.java */
/* loaded from: classes.dex */
public final class g implements k6.b<p6.f> {

    /* renamed from: a  reason: collision with root package name */
    private final cc.a<s6.a> f20560a;

    public g(cc.a<s6.a> aVar) {
        this.f20560a = aVar;
    }

    public static p6.f a(s6.a aVar) {
        return (p6.f) k6.d.c(f.a(aVar), "Cannot return null from a non-@Nullable @Provides method");
    }

    public static g b(cc.a<s6.a> aVar) {
        return new g(aVar);
    }

    @Override // cc.a
    /* renamed from: c  reason: merged with bridge method [inline-methods] */
    public p6.f get() {
        return a(this.f20560a.get());
    }
}
