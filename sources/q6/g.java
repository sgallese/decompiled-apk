package q6;

/* compiled from: EventStoreModule_DbNameFactory.java */
/* loaded from: classes.dex */
public final class g implements k6.b<String> {

    /* compiled from: EventStoreModule_DbNameFactory.java */
    /* loaded from: classes.dex */
    private static final class a {

        /* renamed from: a  reason: collision with root package name */
        private static final g f21502a = new g();
    }

    public static g a() {
        return a.f21502a;
    }

    public static String b() {
        return (String) k6.d.c(f.a(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // cc.a
    /* renamed from: c  reason: merged with bridge method [inline-methods] */
    public String get() {
        return b();
    }
}
