package s4;

import a1.q1;
import androidx.compose.ui.platform.m1;
import androidx.compose.ui.platform.n1;
import dc.w;
import n1.e1;
import n1.g0;
import n1.j0;
import n1.k0;
import n1.l0;
import n1.n;
import n1.y0;
import n1.z;
import pc.l;
import pc.p;
import qc.q;
import qc.r;
import z0.m;

/* compiled from: ContentPainterModifier.kt */
/* loaded from: classes.dex */
public final class e extends n1 implements z, x0.h {

    /* renamed from: d  reason: collision with root package name */
    private final d1.c f23007d;

    /* renamed from: e  reason: collision with root package name */
    private final v0.b f23008e;

    /* renamed from: f  reason: collision with root package name */
    private final n1.f f23009f;

    /* renamed from: g  reason: collision with root package name */
    private final float f23010g;

    /* renamed from: h  reason: collision with root package name */
    private final q1 f23011h;

    /* compiled from: ContentPainterModifier.kt */
    /* loaded from: classes.dex */
    static final class a extends r implements l<y0.a, w> {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ y0 f23012f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(y0 y0Var) {
            super(1);
            this.f23012f = y0Var;
        }

        @Override // pc.l
        public /* bridge */ /* synthetic */ w invoke(y0.a aVar) {
            invoke2(aVar);
            return w.f13270a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(y0.a aVar) {
            y0.a.r(aVar, this.f23012f, 0, 0, 0.0f, 4, null);
        }
    }

    /* compiled from: InspectableValue.kt */
    /* loaded from: classes.dex */
    public static final class b extends r implements l<m1, w> {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ d1.c f23013f;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ v0.b f23014m;

        /* renamed from: p  reason: collision with root package name */
        final /* synthetic */ n1.f f23015p;

        /* renamed from: q  reason: collision with root package name */
        final /* synthetic */ float f23016q;

        /* renamed from: r  reason: collision with root package name */
        final /* synthetic */ q1 f23017r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(d1.c cVar, v0.b bVar, n1.f fVar, float f10, q1 q1Var) {
            super(1);
            this.f23013f = cVar;
            this.f23014m = bVar;
            this.f23015p = fVar;
            this.f23016q = f10;
            this.f23017r = q1Var;
        }

        public final void a(m1 m1Var) {
            q.i(m1Var, "$this$null");
            m1Var.b("content");
            m1Var.a().c("painter", this.f23013f);
            m1Var.a().c("alignment", this.f23014m);
            m1Var.a().c("contentScale", this.f23015p);
            m1Var.a().c("alpha", Float.valueOf(this.f23016q));
            m1Var.a().c("colorFilter", this.f23017r);
        }

        @Override // pc.l
        public /* bridge */ /* synthetic */ w invoke(m1 m1Var) {
            a(m1Var);
            return w.f13270a;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public e(d1.c r8, v0.b r9, n1.f r10, float r11, a1.q1 r12) {
        /*
            r7 = this;
            boolean r0 = androidx.compose.ui.platform.k1.c()
            if (r0 == 0) goto L12
            s4.e$b r0 = new s4.e$b
            r1 = r0
            r2 = r8
            r3 = r9
            r4 = r10
            r5 = r11
            r6 = r12
            r1.<init>(r2, r3, r4, r5, r6)
            goto L16
        L12:
            pc.l r0 = androidx.compose.ui.platform.k1.a()
        L16:
            r7.<init>(r0)
            r7.f23007d = r8
            r7.f23008e = r9
            r7.f23009f = r10
            r7.f23010g = r11
            r7.f23011h = r12
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: s4.e.<init>(d1.c, v0.b, n1.f, float, a1.q1):void");
    }

    private final long e(long j10) {
        boolean z10;
        boolean z11;
        if (z0.l.k(j10)) {
            return z0.l.f26375b.b();
        }
        long k10 = this.f23007d.k();
        boolean z12 = true;
        if (k10 == z0.l.f26375b.a()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            return j10;
        }
        float i10 = z0.l.i(k10);
        if (!Float.isInfinite(i10) && !Float.isNaN(i10)) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (!z11) {
            i10 = z0.l.i(j10);
        }
        float g10 = z0.l.g(k10);
        if (Float.isInfinite(g10) || Float.isNaN(g10)) {
            z12 = false;
        }
        if (!z12) {
            g10 = z0.l.g(j10);
        }
        long a10 = m.a(i10, g10);
        return e1.b(a10, this.f23009f.a(a10, j10));
    }

    private final long m(long j10) {
        boolean z10;
        boolean z11;
        boolean z12;
        float p10;
        int o10;
        float a10;
        int d10;
        int d11;
        boolean l10 = j2.b.l(j10);
        boolean k10 = j2.b.k(j10);
        if (l10 && k10) {
            return j10;
        }
        boolean z13 = true;
        if (j2.b.j(j10) && j2.b.i(j10)) {
            z10 = true;
        } else {
            z10 = false;
        }
        long k11 = this.f23007d.k();
        if (k11 == z0.l.f26375b.a()) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11) {
            if (z10) {
                return j2.b.e(j10, j2.b.n(j10), 0, j2.b.m(j10), 0, 10, null);
            }
            return j10;
        }
        if (z10 && (l10 || k10)) {
            p10 = j2.b.n(j10);
            o10 = j2.b.m(j10);
        } else {
            float i10 = z0.l.i(k11);
            float g10 = z0.l.g(k11);
            if (!Float.isInfinite(i10) && !Float.isNaN(i10)) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (z12) {
                p10 = j.b(j10, i10);
            } else {
                p10 = j2.b.p(j10);
            }
            if (Float.isInfinite(g10) || Float.isNaN(g10)) {
                z13 = false;
            }
            if (z13) {
                a10 = j.a(j10, g10);
                long e10 = e(m.a(p10, a10));
                float i11 = z0.l.i(e10);
                float g11 = z0.l.g(e10);
                d10 = sc.c.d(i11);
                int g12 = j2.c.g(j10, d10);
                d11 = sc.c.d(g11);
                return j2.b.e(j10, g12, 0, j2.c.f(j10, d11), 0, 10, null);
            }
            o10 = j2.b.o(j10);
        }
        a10 = o10;
        long e102 = e(m.a(p10, a10));
        float i112 = z0.l.i(e102);
        float g112 = z0.l.g(e102);
        d10 = sc.c.d(i112);
        int g122 = j2.c.g(j10, d10);
        d11 = sc.c.d(g112);
        return j2.b.e(j10, g122, 0, j2.c.f(j10, d11), 0, 10, null);
    }

    @Override // androidx.compose.ui.e
    public /* synthetic */ androidx.compose.ui.e a(androidx.compose.ui.e eVar) {
        return v0.d.a(this, eVar);
    }

    @Override // androidx.compose.ui.e
    public /* synthetic */ Object b(Object obj, p pVar) {
        return v0.e.b(this, obj, pVar);
    }

    @Override // n1.z
    public j0 d(l0 l0Var, g0 g0Var, long j10) {
        y0 w10 = g0Var.w(m(j10));
        return k0.b(l0Var, w10.A0(), w10.l0(), null, new a(w10), 4, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        if (q.d(this.f23007d, eVar.f23007d) && q.d(this.f23008e, eVar.f23008e) && q.d(this.f23009f, eVar.f23009f) && Float.compare(this.f23010g, eVar.f23010g) == 0 && q.d(this.f23011h, eVar.f23011h)) {
            return true;
        }
        return false;
    }

    @Override // n1.z
    public int f(n nVar, n1.m mVar, int i10) {
        boolean z10;
        int d10;
        if (this.f23007d.k() != z0.l.f26375b.a()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            int t10 = mVar.t(j2.b.m(m(j2.c.b(0, 0, 0, i10, 7, null))));
            d10 = sc.c.d(z0.l.i(e(m.a(t10, i10))));
            return Math.max(d10, t10);
        }
        return mVar.t(i10);
    }

    @Override // androidx.compose.ui.e
    public /* synthetic */ boolean h(l lVar) {
        return v0.e.a(this, lVar);
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = ((((((this.f23007d.hashCode() * 31) + this.f23008e.hashCode()) * 31) + this.f23009f.hashCode()) * 31) + Float.floatToIntBits(this.f23010g)) * 31;
        q1 q1Var = this.f23011h;
        if (q1Var == null) {
            hashCode = 0;
        } else {
            hashCode = q1Var.hashCode();
        }
        return hashCode2 + hashCode;
    }

    @Override // n1.z
    public int n(n nVar, n1.m mVar, int i10) {
        boolean z10;
        int d10;
        if (this.f23007d.k() != z0.l.f26375b.a()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            int a02 = mVar.a0(j2.b.n(m(j2.c.b(0, i10, 0, 0, 13, null))));
            d10 = sc.c.d(z0.l.g(e(m.a(i10, a02))));
            return Math.max(d10, a02);
        }
        return mVar.a0(i10);
    }

    @Override // n1.z
    public int r(n nVar, n1.m mVar, int i10) {
        boolean z10;
        int d10;
        if (this.f23007d.k() != z0.l.f26375b.a()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            int g10 = mVar.g(j2.b.n(m(j2.c.b(0, i10, 0, 0, 13, null))));
            d10 = sc.c.d(z0.l.g(e(m.a(i10, g10))));
            return Math.max(d10, g10);
        }
        return mVar.g(i10);
    }

    @Override // x0.h
    public void s(c1.c cVar) {
        long e10 = e(cVar.b());
        long a10 = this.f23008e.a(j.e(e10), j.e(cVar.b()), cVar.getLayoutDirection());
        float c10 = j2.l.c(a10);
        float d10 = j2.l.d(a10);
        cVar.y0().a().b(c10, d10);
        this.f23007d.j(cVar, e10, this.f23010g, this.f23011h);
        cVar.y0().a().b(-c10, -d10);
        cVar.d1();
    }

    @Override // n1.z
    public int t(n nVar, n1.m mVar, int i10) {
        boolean z10;
        int d10;
        if (this.f23007d.k() != z0.l.f26375b.a()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            int s10 = mVar.s(j2.b.m(m(j2.c.b(0, 0, 0, i10, 7, null))));
            d10 = sc.c.d(z0.l.i(e(m.a(s10, i10))));
            return Math.max(d10, s10);
        }
        return mVar.s(i10);
    }

    public String toString() {
        return "ContentPainterModifier(painter=" + this.f23007d + ", alignment=" + this.f23008e + ", contentScale=" + this.f23009f + ", alpha=" + this.f23010g + ", colorFilter=" + this.f23011h + ')';
    }
}
