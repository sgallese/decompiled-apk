package s6;

/* compiled from: TimeModule_UptimeClockFactory.java */
/* loaded from: classes.dex */
public final class d implements k6.b<s6.a> {

    /* compiled from: TimeModule_UptimeClockFactory.java */
    /* loaded from: classes.dex */
    private static final class a {

        /* renamed from: a  reason: collision with root package name */
        private static final d f23036a = new d();
    }

    public static d a() {
        return a.f23036a;
    }

    public static s6.a c() {
        return (s6.a) k6.d.c(b.b(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // cc.a
    /* renamed from: b  reason: merged with bridge method [inline-methods] */
    public s6.a get() {
        return c();
    }
}
