package androidx.compose.foundation;

import dc.w;
import p1.u0;

/* compiled from: Clickable.kt */
/* loaded from: classes.dex */
final class ClickableElement extends u0<f> {

    /* renamed from: c  reason: collision with root package name */
    private final v.m f1830c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f1831d;

    /* renamed from: e  reason: collision with root package name */
    private final String f1832e;

    /* renamed from: f  reason: collision with root package name */
    private final t1.i f1833f;

    /* renamed from: g  reason: collision with root package name */
    private final pc.a<w> f1834g;

    public /* synthetic */ ClickableElement(v.m mVar, boolean z10, String str, t1.i iVar, pc.a aVar, qc.h hVar) {
        this(mVar, z10, str, iVar, aVar);
    }

    public boolean equals(Object obj) {
        Class<?> cls;
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            cls = obj.getClass();
        } else {
            cls = null;
        }
        if (!qc.q.d(ClickableElement.class, cls)) {
            return false;
        }
        qc.q.g(obj, "null cannot be cast to non-null type androidx.compose.foundation.ClickableElement");
        ClickableElement clickableElement = (ClickableElement) obj;
        if (qc.q.d(this.f1830c, clickableElement.f1830c) && this.f1831d == clickableElement.f1831d && qc.q.d(this.f1832e, clickableElement.f1832e) && qc.q.d(this.f1833f, clickableElement.f1833f) && qc.q.d(this.f1834g, clickableElement.f1834g)) {
            return true;
        }
        return false;
    }

    @Override // p1.u0
    public int hashCode() {
        int i10;
        int hashCode = ((this.f1830c.hashCode() * 31) + t.k.a(this.f1831d)) * 31;
        String str = this.f1832e;
        int i11 = 0;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        int i12 = (hashCode + i10) * 31;
        t1.i iVar = this.f1833f;
        if (iVar != null) {
            i11 = t1.i.l(iVar.n());
        }
        return ((i12 + i11) * 31) + this.f1834g.hashCode();
    }

    @Override // p1.u0
    /* renamed from: v  reason: merged with bridge method [inline-methods] */
    public f e() {
        return new f(this.f1830c, this.f1831d, this.f1832e, this.f1833f, this.f1834g, null);
    }

    @Override // p1.u0
    /* renamed from: x  reason: merged with bridge method [inline-methods] */
    public void m(f fVar) {
        qc.q.i(fVar, "node");
        fVar.U1(this.f1830c, this.f1831d, this.f1832e, this.f1833f, this.f1834g);
    }

    private ClickableElement(v.m mVar, boolean z10, String str, t1.i iVar, pc.a<w> aVar) {
        qc.q.i(mVar, "interactionSource");
        qc.q.i(aVar, "onClick");
        this.f1830c = mVar;
        this.f1831d = z10;
        this.f1832e = str;
        this.f1833f = iVar;
        this.f1834g = aVar;
    }
}
