package j6;

import android.content.Context;

/* compiled from: MetadataBackendRegistry_Factory.java */
/* loaded from: classes.dex */
public final class l implements k6.b<k> {

    /* renamed from: a  reason: collision with root package name */
    private final cc.a<Context> f19052a;

    /* renamed from: b  reason: collision with root package name */
    private final cc.a<i> f19053b;

    public l(cc.a<Context> aVar, cc.a<i> aVar2) {
        this.f19052a = aVar;
        this.f19053b = aVar2;
    }

    public static l a(cc.a<Context> aVar, cc.a<i> aVar2) {
        return new l(aVar, aVar2);
    }

    public static k c(Context context, Object obj) {
        return new k(context, (i) obj);
    }

    @Override // cc.a
    /* renamed from: b  reason: merged with bridge method [inline-methods] */
    public k get() {
        return c(this.f19052a.get(), this.f19053b.get());
    }
}
