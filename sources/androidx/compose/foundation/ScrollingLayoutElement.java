package androidx.compose.foundation;

import p1.u0;

/* compiled from: Scroll.kt */
/* loaded from: classes.dex */
final class ScrollingLayoutElement extends u0<t> {

    /* renamed from: c  reason: collision with root package name */
    private final s f1843c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f1844d;

    /* renamed from: e  reason: collision with root package name */
    private final boolean f1845e;

    public ScrollingLayoutElement(s sVar, boolean z10, boolean z11) {
        qc.q.i(sVar, "scrollState");
        this.f1843c = sVar;
        this.f1844d = z10;
        this.f1845e = z11;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof ScrollingLayoutElement)) {
            return false;
        }
        ScrollingLayoutElement scrollingLayoutElement = (ScrollingLayoutElement) obj;
        if (!qc.q.d(this.f1843c, scrollingLayoutElement.f1843c) || this.f1844d != scrollingLayoutElement.f1844d || this.f1845e != scrollingLayoutElement.f1845e) {
            return false;
        }
        return true;
    }

    @Override // p1.u0
    public int hashCode() {
        return (((this.f1843c.hashCode() * 31) + t.k.a(this.f1844d)) * 31) + t.k.a(this.f1845e);
    }

    @Override // p1.u0
    /* renamed from: v  reason: merged with bridge method [inline-methods] */
    public t e() {
        return new t(this.f1843c, this.f1844d, this.f1845e);
    }

    @Override // p1.u0
    /* renamed from: x  reason: merged with bridge method [inline-methods] */
    public void m(t tVar) {
        qc.q.i(tVar, "node");
        tVar.M1(this.f1843c);
        tVar.L1(this.f1844d);
        tVar.N1(this.f1845e);
    }
}
