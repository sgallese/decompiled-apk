package f0;

/* compiled from: Shapes.kt */
/* loaded from: classes.dex */
public final class h1 {

    /* renamed from: a  reason: collision with root package name */
    private final b0.a f14768a;

    /* renamed from: b  reason: collision with root package name */
    private final b0.a f14769b;

    /* renamed from: c  reason: collision with root package name */
    private final b0.a f14770c;

    public h1() {
        this(null, null, null, 7, null);
    }

    public final b0.a a() {
        return this.f14770c;
    }

    public final b0.a b() {
        return this.f14769b;
    }

    public final b0.a c() {
        return this.f14768a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h1)) {
            return false;
        }
        h1 h1Var = (h1) obj;
        if (qc.q.d(this.f14768a, h1Var.f14768a) && qc.q.d(this.f14769b, h1Var.f14769b) && qc.q.d(this.f14770c, h1Var.f14770c)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((this.f14768a.hashCode() * 31) + this.f14769b.hashCode()) * 31) + this.f14770c.hashCode();
    }

    public String toString() {
        return "Shapes(small=" + this.f14768a + ", medium=" + this.f14769b + ", large=" + this.f14770c + ')';
    }

    public h1(b0.a aVar, b0.a aVar2, b0.a aVar3) {
        qc.q.i(aVar, "small");
        qc.q.i(aVar2, "medium");
        qc.q.i(aVar3, "large");
        this.f14768a = aVar;
        this.f14769b = aVar2;
        this.f14770c = aVar3;
    }

    public /* synthetic */ h1(b0.a aVar, b0.a aVar2, b0.a aVar3, int i10, qc.h hVar) {
        this((i10 & 1) != 0 ? b0.i.d(j2.h.j(4)) : aVar, (i10 & 2) != 0 ? b0.i.d(j2.h.j(4)) : aVar2, (i10 & 4) != 0 ? b0.i.d(j2.h.j(0)) : aVar3);
    }
}
