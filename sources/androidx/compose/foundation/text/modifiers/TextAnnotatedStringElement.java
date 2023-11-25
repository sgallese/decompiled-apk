package androidx.compose.foundation.text.modifiers;

import a1.s1;
import a2.l;
import d0.k;
import dc.w;
import java.util.List;
import p1.u0;
import qc.q;
import v1.d;
import v1.g0;
import v1.k0;
import v1.u;
import z0.h;

/* compiled from: TextAnnotatedStringElement.kt */
/* loaded from: classes.dex */
public final class TextAnnotatedStringElement extends u0<k> {

    /* renamed from: c  reason: collision with root package name */
    private final d f2255c;

    /* renamed from: d  reason: collision with root package name */
    private final k0 f2256d;

    /* renamed from: e  reason: collision with root package name */
    private final l.b f2257e;

    /* renamed from: f  reason: collision with root package name */
    private final pc.l<g0, w> f2258f;

    /* renamed from: g  reason: collision with root package name */
    private final int f2259g;

    /* renamed from: h  reason: collision with root package name */
    private final boolean f2260h;

    /* renamed from: i  reason: collision with root package name */
    private final int f2261i;

    /* renamed from: j  reason: collision with root package name */
    private final int f2262j;

    /* renamed from: k  reason: collision with root package name */
    private final List<d.b<u>> f2263k;

    /* renamed from: l  reason: collision with root package name */
    private final pc.l<List<h>, w> f2264l;

    /* renamed from: m  reason: collision with root package name */
    private final d0.h f2265m;

    /* renamed from: n  reason: collision with root package name */
    private final s1 f2266n;

    public /* synthetic */ TextAnnotatedStringElement(d dVar, k0 k0Var, l.b bVar, pc.l lVar, int i10, boolean z10, int i11, int i12, List list, pc.l lVar2, d0.h hVar, s1 s1Var, qc.h hVar2) {
        this(dVar, k0Var, bVar, lVar, i10, z10, i11, i12, list, lVar2, hVar, s1Var);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextAnnotatedStringElement)) {
            return false;
        }
        TextAnnotatedStringElement textAnnotatedStringElement = (TextAnnotatedStringElement) obj;
        if (q.d(this.f2266n, textAnnotatedStringElement.f2266n) && q.d(this.f2255c, textAnnotatedStringElement.f2255c) && q.d(this.f2256d, textAnnotatedStringElement.f2256d) && q.d(this.f2263k, textAnnotatedStringElement.f2263k) && q.d(this.f2257e, textAnnotatedStringElement.f2257e) && q.d(this.f2258f, textAnnotatedStringElement.f2258f) && g2.u.e(this.f2259g, textAnnotatedStringElement.f2259g) && this.f2260h == textAnnotatedStringElement.f2260h && this.f2261i == textAnnotatedStringElement.f2261i && this.f2262j == textAnnotatedStringElement.f2262j && q.d(this.f2264l, textAnnotatedStringElement.f2264l) && q.d(this.f2265m, textAnnotatedStringElement.f2265m)) {
            return true;
        }
        return false;
    }

    @Override // p1.u0
    public int hashCode() {
        int i10;
        int i11;
        int i12;
        int i13;
        int hashCode = ((((this.f2255c.hashCode() * 31) + this.f2256d.hashCode()) * 31) + this.f2257e.hashCode()) * 31;
        pc.l<g0, w> lVar = this.f2258f;
        int i14 = 0;
        if (lVar != null) {
            i10 = lVar.hashCode();
        } else {
            i10 = 0;
        }
        int f10 = (((((((((hashCode + i10) * 31) + g2.u.f(this.f2259g)) * 31) + t.k.a(this.f2260h)) * 31) + this.f2261i) * 31) + this.f2262j) * 31;
        List<d.b<u>> list = this.f2263k;
        if (list != null) {
            i11 = list.hashCode();
        } else {
            i11 = 0;
        }
        int i15 = (f10 + i11) * 31;
        pc.l<List<h>, w> lVar2 = this.f2264l;
        if (lVar2 != null) {
            i12 = lVar2.hashCode();
        } else {
            i12 = 0;
        }
        int i16 = (i15 + i12) * 31;
        d0.h hVar = this.f2265m;
        if (hVar != null) {
            i13 = hVar.hashCode();
        } else {
            i13 = 0;
        }
        int i17 = (i16 + i13) * 31;
        s1 s1Var = this.f2266n;
        if (s1Var != null) {
            i14 = s1Var.hashCode();
        }
        return i17 + i14;
    }

    @Override // p1.u0
    /* renamed from: v  reason: merged with bridge method [inline-methods] */
    public k e() {
        return new k(this.f2255c, this.f2256d, this.f2257e, this.f2258f, this.f2259g, this.f2260h, this.f2261i, this.f2262j, this.f2263k, this.f2264l, this.f2265m, this.f2266n, null);
    }

    @Override // p1.u0
    /* renamed from: x  reason: merged with bridge method [inline-methods] */
    public void m(k kVar) {
        q.i(kVar, "node");
        kVar.J1(kVar.T1(this.f2266n, this.f2256d), kVar.V1(this.f2255c), kVar.U1(this.f2256d, this.f2263k, this.f2262j, this.f2261i, this.f2260h, this.f2257e, this.f2259g), kVar.S1(this.f2258f, this.f2264l, this.f2265m));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private TextAnnotatedStringElement(d dVar, k0 k0Var, l.b bVar, pc.l<? super g0, w> lVar, int i10, boolean z10, int i11, int i12, List<d.b<u>> list, pc.l<? super List<h>, w> lVar2, d0.h hVar, s1 s1Var) {
        q.i(dVar, "text");
        q.i(k0Var, "style");
        q.i(bVar, "fontFamilyResolver");
        this.f2255c = dVar;
        this.f2256d = k0Var;
        this.f2257e = bVar;
        this.f2258f = lVar;
        this.f2259g = i10;
        this.f2260h = z10;
        this.f2261i = i11;
        this.f2262j = i12;
        this.f2263k = list;
        this.f2264l = lVar2;
        this.f2265m = hVar;
        this.f2266n = s1Var;
    }
}
