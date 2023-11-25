package androidx.compose.foundation.text.modifiers;

import a1.s1;
import a2.l;
import d0.l;
import g2.u;
import p1.u0;
import qc.h;
import qc.q;
import t.k;
import v1.k0;

/* compiled from: TextStringSimpleElement.kt */
/* loaded from: classes.dex */
public final class TextStringSimpleElement extends u0<l> {

    /* renamed from: c  reason: collision with root package name */
    private final String f2267c;

    /* renamed from: d  reason: collision with root package name */
    private final k0 f2268d;

    /* renamed from: e  reason: collision with root package name */
    private final l.b f2269e;

    /* renamed from: f  reason: collision with root package name */
    private final int f2270f;

    /* renamed from: g  reason: collision with root package name */
    private final boolean f2271g;

    /* renamed from: h  reason: collision with root package name */
    private final int f2272h;

    /* renamed from: i  reason: collision with root package name */
    private final int f2273i;

    /* renamed from: j  reason: collision with root package name */
    private final s1 f2274j;

    public /* synthetic */ TextStringSimpleElement(String str, k0 k0Var, l.b bVar, int i10, boolean z10, int i11, int i12, s1 s1Var, h hVar) {
        this(str, k0Var, bVar, i10, z10, i11, i12, s1Var);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextStringSimpleElement)) {
            return false;
        }
        TextStringSimpleElement textStringSimpleElement = (TextStringSimpleElement) obj;
        if (q.d(this.f2274j, textStringSimpleElement.f2274j) && q.d(this.f2267c, textStringSimpleElement.f2267c) && q.d(this.f2268d, textStringSimpleElement.f2268d) && q.d(this.f2269e, textStringSimpleElement.f2269e) && u.e(this.f2270f, textStringSimpleElement.f2270f) && this.f2271g == textStringSimpleElement.f2271g && this.f2272h == textStringSimpleElement.f2272h && this.f2273i == textStringSimpleElement.f2273i) {
            return true;
        }
        return false;
    }

    @Override // p1.u0
    public int hashCode() {
        int i10;
        int hashCode = ((((((((((((this.f2267c.hashCode() * 31) + this.f2268d.hashCode()) * 31) + this.f2269e.hashCode()) * 31) + u.f(this.f2270f)) * 31) + k.a(this.f2271g)) * 31) + this.f2272h) * 31) + this.f2273i) * 31;
        s1 s1Var = this.f2274j;
        if (s1Var != null) {
            i10 = s1Var.hashCode();
        } else {
            i10 = 0;
        }
        return hashCode + i10;
    }

    @Override // p1.u0
    /* renamed from: v  reason: merged with bridge method [inline-methods] */
    public d0.l e() {
        return new d0.l(this.f2267c, this.f2268d, this.f2269e, this.f2270f, this.f2271g, this.f2272h, this.f2273i, this.f2274j, null);
    }

    @Override // p1.u0
    /* renamed from: x  reason: merged with bridge method [inline-methods] */
    public void m(d0.l lVar) {
        q.i(lVar, "node");
        lVar.J1(lVar.M1(this.f2274j, this.f2268d), lVar.O1(this.f2267c), lVar.N1(this.f2268d, this.f2273i, this.f2272h, this.f2271g, this.f2269e, this.f2270f));
    }

    private TextStringSimpleElement(String str, k0 k0Var, l.b bVar, int i10, boolean z10, int i11, int i12, s1 s1Var) {
        q.i(str, "text");
        q.i(k0Var, "style");
        q.i(bVar, "fontFamilyResolver");
        this.f2267c = str;
        this.f2268d = k0Var;
        this.f2269e = bVar;
        this.f2270f = i10;
        this.f2271g = z10;
        this.f2272h = i11;
        this.f2273i = i12;
        this.f2274j = s1Var;
    }
}
