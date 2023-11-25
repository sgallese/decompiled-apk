package j6;

import android.content.Context;

/* compiled from: CreationContextFactory_Factory.java */
/* loaded from: classes.dex */
public final class j implements k6.b<i> {

    /* renamed from: a  reason: collision with root package name */
    private final cc.a<Context> f19044a;

    /* renamed from: b  reason: collision with root package name */
    private final cc.a<s6.a> f19045b;

    /* renamed from: c  reason: collision with root package name */
    private final cc.a<s6.a> f19046c;

    public j(cc.a<Context> aVar, cc.a<s6.a> aVar2, cc.a<s6.a> aVar3) {
        this.f19044a = aVar;
        this.f19045b = aVar2;
        this.f19046c = aVar3;
    }

    public static j a(cc.a<Context> aVar, cc.a<s6.a> aVar2, cc.a<s6.a> aVar3) {
        return new j(aVar, aVar2, aVar3);
    }

    public static i c(Context context, s6.a aVar, s6.a aVar2) {
        return new i(context, aVar, aVar2);
    }

    @Override // cc.a
    /* renamed from: b  reason: merged with bridge method [inline-methods] */
    public i get() {
        return c(this.f19044a.get(), this.f19045b.get(), this.f19046c.get());
    }
}
