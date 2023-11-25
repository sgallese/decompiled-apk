package androidx.compose.foundation.text.modifiers;

import a1.s1;
import a2.l;
import d0.g;
import dc.w;
import java.util.List;
import p1.u0;
import qc.q;
import t.k;
import v1.d;
import v1.g0;
import v1.k0;
import v1.u;
import z0.h;

/* compiled from: SelectableTextAnnotatedStringElement.kt */
/* loaded from: classes.dex */
public final class SelectableTextAnnotatedStringElement extends u0<g> {

    /* renamed from: c  reason: collision with root package name */
    private final d f2243c;

    /* renamed from: d  reason: collision with root package name */
    private final k0 f2244d;

    /* renamed from: e  reason: collision with root package name */
    private final l.b f2245e;

    /* renamed from: f  reason: collision with root package name */
    private final pc.l<g0, w> f2246f;

    /* renamed from: g  reason: collision with root package name */
    private final int f2247g;

    /* renamed from: h  reason: collision with root package name */
    private final boolean f2248h;

    /* renamed from: i  reason: collision with root package name */
    private final int f2249i;

    /* renamed from: j  reason: collision with root package name */
    private final int f2250j;

    /* renamed from: k  reason: collision with root package name */
    private final List<d.b<u>> f2251k;

    /* renamed from: l  reason: collision with root package name */
    private final pc.l<List<h>, w> f2252l;

    /* renamed from: m  reason: collision with root package name */
    private final d0.h f2253m;

    /* renamed from: n  reason: collision with root package name */
    private final s1 f2254n;

    public /* synthetic */ SelectableTextAnnotatedStringElement(d dVar, k0 k0Var, l.b bVar, pc.l lVar, int i10, boolean z10, int i11, int i12, List list, pc.l lVar2, d0.h hVar, s1 s1Var, qc.h hVar2) {
        this(dVar, k0Var, bVar, lVar, i10, z10, i11, i12, list, lVar2, hVar, s1Var);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SelectableTextAnnotatedStringElement)) {
            return false;
        }
        SelectableTextAnnotatedStringElement selectableTextAnnotatedStringElement = (SelectableTextAnnotatedStringElement) obj;
        if (q.d(this.f2254n, selectableTextAnnotatedStringElement.f2254n) && q.d(this.f2243c, selectableTextAnnotatedStringElement.f2243c) && q.d(this.f2244d, selectableTextAnnotatedStringElement.f2244d) && q.d(this.f2251k, selectableTextAnnotatedStringElement.f2251k) && q.d(this.f2245e, selectableTextAnnotatedStringElement.f2245e) && q.d(this.f2246f, selectableTextAnnotatedStringElement.f2246f) && g2.u.e(this.f2247g, selectableTextAnnotatedStringElement.f2247g) && this.f2248h == selectableTextAnnotatedStringElement.f2248h && this.f2249i == selectableTextAnnotatedStringElement.f2249i && this.f2250j == selectableTextAnnotatedStringElement.f2250j && q.d(this.f2252l, selectableTextAnnotatedStringElement.f2252l) && q.d(this.f2253m, selectableTextAnnotatedStringElement.f2253m)) {
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
        int hashCode = ((((this.f2243c.hashCode() * 31) + this.f2244d.hashCode()) * 31) + this.f2245e.hashCode()) * 31;
        pc.l<g0, w> lVar = this.f2246f;
        int i14 = 0;
        if (lVar != null) {
            i10 = lVar.hashCode();
        } else {
            i10 = 0;
        }
        int f10 = (((((((((hashCode + i10) * 31) + g2.u.f(this.f2247g)) * 31) + k.a(this.f2248h)) * 31) + this.f2249i) * 31) + this.f2250j) * 31;
        List<d.b<u>> list = this.f2251k;
        if (list != null) {
            i11 = list.hashCode();
        } else {
            i11 = 0;
        }
        int i15 = (f10 + i11) * 31;
        pc.l<List<h>, w> lVar2 = this.f2252l;
        if (lVar2 != null) {
            i12 = lVar2.hashCode();
        } else {
            i12 = 0;
        }
        int i16 = (i15 + i12) * 31;
        d0.h hVar = this.f2253m;
        if (hVar != null) {
            i13 = hVar.hashCode();
        } else {
            i13 = 0;
        }
        int i17 = (i16 + i13) * 31;
        s1 s1Var = this.f2254n;
        if (s1Var != null) {
            i14 = s1Var.hashCode();
        }
        return i17 + i14;
    }

    public String toString() {
        return "SelectableTextAnnotatedStringElement(text=" + ((Object) this.f2243c) + ", style=" + this.f2244d + ", fontFamilyResolver=" + this.f2245e + ", onTextLayout=" + this.f2246f + ", overflow=" + ((Object) g2.u.g(this.f2247g)) + ", softWrap=" + this.f2248h + ", maxLines=" + this.f2249i + ", minLines=" + this.f2250j + ", placeholders=" + this.f2251k + ", onPlaceholderLayout=" + this.f2252l + ", selectionController=" + this.f2253m + ", color=" + this.f2254n + ')';
    }

    @Override // p1.u0
    /* renamed from: v  reason: merged with bridge method [inline-methods] */
    public g e() {
        return new g(this.f2243c, this.f2244d, this.f2245e, this.f2246f, this.f2247g, this.f2248h, this.f2249i, this.f2250j, this.f2251k, this.f2252l, this.f2253m, this.f2254n, null);
    }

    @Override // p1.u0
    /* renamed from: x  reason: merged with bridge method [inline-methods] */
    public void m(g gVar) {
        q.i(gVar, "node");
        gVar.N1(this.f2243c, this.f2244d, this.f2251k, this.f2250j, this.f2249i, this.f2248h, this.f2245e, this.f2247g, this.f2246f, this.f2252l, this.f2253m, this.f2254n);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private SelectableTextAnnotatedStringElement(d dVar, k0 k0Var, l.b bVar, pc.l<? super g0, w> lVar, int i10, boolean z10, int i11, int i12, List<d.b<u>> list, pc.l<? super List<h>, w> lVar2, d0.h hVar, s1 s1Var) {
        q.i(dVar, "text");
        q.i(k0Var, "style");
        q.i(bVar, "fontFamilyResolver");
        this.f2243c = dVar;
        this.f2244d = k0Var;
        this.f2245e = bVar;
        this.f2246f = lVar;
        this.f2247g = i10;
        this.f2248h = z10;
        this.f2249i = i11;
        this.f2250j = i12;
        this.f2251k = list;
        this.f2252l = lVar2;
        this.f2253m = hVar;
        this.f2254n = s1Var;
    }
}
