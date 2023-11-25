package q6;

import android.content.Context;

/* compiled from: EventStoreModule_PackageNameFactory.java */
/* loaded from: classes.dex */
public final class h implements k6.b<String> {

    /* renamed from: a  reason: collision with root package name */
    private final cc.a<Context> f21504a;

    public h(cc.a<Context> aVar) {
        this.f21504a = aVar;
    }

    public static h a(cc.a<Context> aVar) {
        return new h(aVar);
    }

    public static String c(Context context) {
        return (String) k6.d.c(f.b(context), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // cc.a
    /* renamed from: b  reason: merged with bridge method [inline-methods] */
    public String get() {
        return c(this.f21504a.get());
    }
}
