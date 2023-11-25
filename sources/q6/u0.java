package q6;

import android.content.Context;

/* compiled from: SchemaManager_Factory.java */
/* loaded from: classes.dex */
public final class u0 implements k6.b<t0> {

    /* renamed from: a  reason: collision with root package name */
    private final cc.a<Context> f21554a;

    /* renamed from: b  reason: collision with root package name */
    private final cc.a<String> f21555b;

    /* renamed from: c  reason: collision with root package name */
    private final cc.a<Integer> f21556c;

    public u0(cc.a<Context> aVar, cc.a<String> aVar2, cc.a<Integer> aVar3) {
        this.f21554a = aVar;
        this.f21555b = aVar2;
        this.f21556c = aVar3;
    }

    public static u0 a(cc.a<Context> aVar, cc.a<String> aVar2, cc.a<Integer> aVar3) {
        return new u0(aVar, aVar2, aVar3);
    }

    public static t0 c(Context context, String str, int i10) {
        return new t0(context, str, i10);
    }

    @Override // cc.a
    /* renamed from: b  reason: merged with bridge method [inline-methods] */
    public t0 get() {
        return c(this.f21554a.get(), this.f21555b.get(), this.f21556c.get().intValue());
    }
}
