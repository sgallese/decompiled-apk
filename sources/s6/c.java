package s6;

/* compiled from: TimeModule_EventClockFactory.java */
/* loaded from: classes.dex */
public final class c implements k6.b<s6.a> {

    /* compiled from: TimeModule_EventClockFactory.java */
    /* loaded from: classes.dex */
    private static final class a {

        /* renamed from: a  reason: collision with root package name */
        private static final c f23035a = new c();
    }

    public static c a() {
        return a.f23035a;
    }

    public static s6.a b() {
        return (s6.a) k6.d.c(b.a(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // cc.a
    /* renamed from: c  reason: merged with bridge method [inline-methods] */
    public s6.a get() {
        return b();
    }
}
