package androidx.compose.ui.draw;

import a1.q1;
import n1.f;
import p1.h0;
import p1.s;
import p1.u0;
import qc.q;
import z0.l;

/* compiled from: PainterModifier.kt */
/* loaded from: classes.dex */
final class PainterElement extends u0<e> {

    /* renamed from: c  reason: collision with root package name */
    private final d1.c f2326c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f2327d;

    /* renamed from: e  reason: collision with root package name */
    private final v0.b f2328e;

    /* renamed from: f  reason: collision with root package name */
    private final f f2329f;

    /* renamed from: g  reason: collision with root package name */
    private final float f2330g;

    /* renamed from: h  reason: collision with root package name */
    private final q1 f2331h;

    public PainterElement(d1.c cVar, boolean z10, v0.b bVar, f fVar, float f10, q1 q1Var) {
        q.i(cVar, "painter");
        q.i(bVar, "alignment");
        q.i(fVar, "contentScale");
        this.f2326c = cVar;
        this.f2327d = z10;
        this.f2328e = bVar;
        this.f2329f = fVar;
        this.f2330g = f10;
        this.f2331h = q1Var;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PainterElement)) {
            return false;
        }
        PainterElement painterElement = (PainterElement) obj;
        if (q.d(this.f2326c, painterElement.f2326c) && this.f2327d == painterElement.f2327d && q.d(this.f2328e, painterElement.f2328e) && q.d(this.f2329f, painterElement.f2329f) && Float.compare(this.f2330g, painterElement.f2330g) == 0 && q.d(this.f2331h, painterElement.f2331h)) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p1.u0
    public int hashCode() {
        int hashCode;
        int hashCode2 = this.f2326c.hashCode() * 31;
        boolean z10 = this.f2327d;
        int i10 = z10;
        if (z10 != 0) {
            i10 = 1;
        }
        int hashCode3 = (((((((hashCode2 + i10) * 31) + this.f2328e.hashCode()) * 31) + this.f2329f.hashCode()) * 31) + Float.floatToIntBits(this.f2330g)) * 31;
        q1 q1Var = this.f2331h;
        if (q1Var == null) {
            hashCode = 0;
        } else {
            hashCode = q1Var.hashCode();
        }
        return hashCode3 + hashCode;
    }

    public String toString() {
        return "PainterElement(painter=" + this.f2326c + ", sizeToIntrinsics=" + this.f2327d + ", alignment=" + this.f2328e + ", contentScale=" + this.f2329f + ", alpha=" + this.f2330g + ", colorFilter=" + this.f2331h + ')';
    }

    @Override // p1.u0
    /* renamed from: v  reason: merged with bridge method [inline-methods] */
    public e e() {
        return new e(this.f2326c, this.f2327d, this.f2328e, this.f2329f, this.f2330g, this.f2331h);
    }

    @Override // p1.u0
    /* renamed from: x  reason: merged with bridge method [inline-methods] */
    public void m(e eVar) {
        boolean z10;
        q.i(eVar, "node");
        boolean K1 = eVar.K1();
        boolean z11 = this.f2327d;
        if (K1 == z11 && (!z11 || l.f(eVar.J1().k(), this.f2326c.k()))) {
            z10 = false;
        } else {
            z10 = true;
        }
        eVar.S1(this.f2326c);
        eVar.T1(this.f2327d);
        eVar.P1(this.f2328e);
        eVar.R1(this.f2329f);
        eVar.c(this.f2330g);
        eVar.Q1(this.f2331h);
        if (z10) {
            h0.b(eVar);
        }
        s.a(eVar);
    }
}
