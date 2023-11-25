package q6;

/* compiled from: SQLiteEventStore_Factory.java */
/* loaded from: classes.dex */
public final class n0 implements k6.b<m0> {

    /* renamed from: a  reason: collision with root package name */
    private final cc.a<s6.a> f21527a;

    /* renamed from: b  reason: collision with root package name */
    private final cc.a<s6.a> f21528b;

    /* renamed from: c  reason: collision with root package name */
    private final cc.a<e> f21529c;

    /* renamed from: d  reason: collision with root package name */
    private final cc.a<t0> f21530d;

    /* renamed from: e  reason: collision with root package name */
    private final cc.a<String> f21531e;

    public n0(cc.a<s6.a> aVar, cc.a<s6.a> aVar2, cc.a<e> aVar3, cc.a<t0> aVar4, cc.a<String> aVar5) {
        this.f21527a = aVar;
        this.f21528b = aVar2;
        this.f21529c = aVar3;
        this.f21530d = aVar4;
        this.f21531e = aVar5;
    }

    public static n0 a(cc.a<s6.a> aVar, cc.a<s6.a> aVar2, cc.a<e> aVar3, cc.a<t0> aVar4, cc.a<String> aVar5) {
        return new n0(aVar, aVar2, aVar3, aVar4, aVar5);
    }

    public static m0 c(s6.a aVar, s6.a aVar2, Object obj, Object obj2, cc.a<String> aVar3) {
        return new m0(aVar, aVar2, (e) obj, (t0) obj2, aVar3);
    }

    @Override // cc.a
    /* renamed from: b  reason: merged with bridge method [inline-methods] */
    public m0 get() {
        return c(this.f21527a.get(), this.f21528b.get(), this.f21529c.get(), this.f21530d.get(), this.f21531e);
    }
}
