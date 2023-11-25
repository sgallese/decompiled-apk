package i6;

/* compiled from: TransportRuntime_Factory.java */
/* loaded from: classes.dex */
public final class w implements k6.b<u> {

    /* renamed from: a  reason: collision with root package name */
    private final cc.a<s6.a> f17097a;

    /* renamed from: b  reason: collision with root package name */
    private final cc.a<s6.a> f17098b;

    /* renamed from: c  reason: collision with root package name */
    private final cc.a<o6.e> f17099c;

    /* renamed from: d  reason: collision with root package name */
    private final cc.a<p6.r> f17100d;

    /* renamed from: e  reason: collision with root package name */
    private final cc.a<p6.v> f17101e;

    public w(cc.a<s6.a> aVar, cc.a<s6.a> aVar2, cc.a<o6.e> aVar3, cc.a<p6.r> aVar4, cc.a<p6.v> aVar5) {
        this.f17097a = aVar;
        this.f17098b = aVar2;
        this.f17099c = aVar3;
        this.f17100d = aVar4;
        this.f17101e = aVar5;
    }

    public static w a(cc.a<s6.a> aVar, cc.a<s6.a> aVar2, cc.a<o6.e> aVar3, cc.a<p6.r> aVar4, cc.a<p6.v> aVar5) {
        return new w(aVar, aVar2, aVar3, aVar4, aVar5);
    }

    public static u c(s6.a aVar, s6.a aVar2, o6.e eVar, p6.r rVar, p6.v vVar) {
        return new u(aVar, aVar2, eVar, rVar, vVar);
    }

    @Override // cc.a
    /* renamed from: b  reason: merged with bridge method [inline-methods] */
    public u get() {
        return c(this.f17097a.get(), this.f17098b.get(), this.f17099c.get(), this.f17100d.get(), this.f17101e.get());
    }
}
