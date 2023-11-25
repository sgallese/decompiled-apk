package c0;

import a2.l;
import java.util.List;
import v1.d;

/* compiled from: TextDelegate.kt */
/* loaded from: classes.dex */
public final class d0 {

    /* renamed from: l  reason: collision with root package name */
    public static final a f8232l = new a(null);

    /* renamed from: a  reason: collision with root package name */
    private final v1.d f8233a;

    /* renamed from: b  reason: collision with root package name */
    private final v1.k0 f8234b;

    /* renamed from: c  reason: collision with root package name */
    private final int f8235c;

    /* renamed from: d  reason: collision with root package name */
    private final int f8236d;

    /* renamed from: e  reason: collision with root package name */
    private final boolean f8237e;

    /* renamed from: f  reason: collision with root package name */
    private final int f8238f;

    /* renamed from: g  reason: collision with root package name */
    private final j2.e f8239g;

    /* renamed from: h  reason: collision with root package name */
    private final l.b f8240h;

    /* renamed from: i  reason: collision with root package name */
    private final List<d.b<v1.u>> f8241i;

    /* renamed from: j  reason: collision with root package name */
    private v1.i f8242j;

    /* renamed from: k  reason: collision with root package name */
    private j2.r f8243k;

    /* compiled from: TextDelegate.kt */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(qc.h hVar) {
            this();
        }
    }

    public /* synthetic */ d0(v1.d dVar, v1.k0 k0Var, int i10, int i11, boolean z10, int i12, j2.e eVar, l.b bVar, List list, qc.h hVar) {
        this(dVar, k0Var, i10, i11, z10, i12, eVar, bVar, list);
    }

    private final v1.i f() {
        v1.i iVar = this.f8242j;
        if (iVar != null) {
            return iVar;
        }
        throw new IllegalStateException("layoutIntrinsics must be called first");
    }

    private final v1.h n(long j10, j2.r rVar) {
        boolean z10;
        int i10;
        int i11;
        m(rVar);
        int p10 = j2.b.p(j10);
        boolean z11 = false;
        if (!this.f8237e && !g2.u.e(this.f8238f, g2.u.f16099a.b())) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (z10 && j2.b.j(j10)) {
            i10 = j2.b.n(j10);
        } else {
            i10 = Integer.MAX_VALUE;
        }
        if (!this.f8237e && g2.u.e(this.f8238f, g2.u.f16099a.b())) {
            z11 = true;
        }
        if (z11) {
            i11 = 1;
        } else {
            i11 = this.f8235c;
        }
        if (p10 != i10) {
            i10 = vc.l.l(c(), p10, i10);
        }
        return new v1.h(f(), j2.c.b(0, i10, 0, j2.b.m(j10), 5, null), i11, g2.u.e(this.f8238f, g2.u.f16099a.b()), null);
    }

    public final j2.e a() {
        return this.f8239g;
    }

    public final l.b b() {
        return this.f8240h;
    }

    public final int c() {
        return e0.a(f().c());
    }

    public final int d() {
        return this.f8235c;
    }

    public final int e() {
        return this.f8236d;
    }

    public final int g() {
        return this.f8238f;
    }

    public final List<d.b<v1.u>> h() {
        return this.f8241i;
    }

    public final boolean i() {
        return this.f8237e;
    }

    public final v1.k0 j() {
        return this.f8234b;
    }

    public final v1.d k() {
        return this.f8233a;
    }

    public final v1.g0 l(long j10, j2.r rVar, v1.g0 g0Var) {
        qc.q.i(rVar, "layoutDirection");
        if (g0Var != null && u0.a(g0Var, this.f8233a, this.f8234b, this.f8241i, this.f8235c, this.f8237e, this.f8238f, this.f8239g, rVar, this.f8240h, j10)) {
            return g0Var.a(new v1.f0(g0Var.k().j(), this.f8234b, g0Var.k().g(), g0Var.k().e(), g0Var.k().h(), g0Var.k().f(), g0Var.k().b(), g0Var.k().d(), g0Var.k().c(), j10, (qc.h) null), j2.c.d(j10, j2.q.a(e0.a(g0Var.v().y()), e0.a(g0Var.v().g()))));
        }
        v1.h n10 = n(j10, rVar);
        return new v1.g0(new v1.f0(this.f8233a, this.f8234b, this.f8241i, this.f8235c, this.f8237e, this.f8238f, this.f8239g, rVar, this.f8240h, j10, (qc.h) null), n10, j2.c.d(j10, j2.q.a(e0.a(n10.y()), e0.a(n10.g()))), null);
    }

    public final void m(j2.r rVar) {
        qc.q.i(rVar, "layoutDirection");
        v1.i iVar = this.f8242j;
        if (iVar == null || rVar != this.f8243k || iVar.b()) {
            this.f8243k = rVar;
            iVar = new v1.i(this.f8233a, v1.l0.d(this.f8234b, rVar), this.f8241i, this.f8239g, this.f8240h);
        }
        this.f8242j = iVar;
    }

    private d0(v1.d dVar, v1.k0 k0Var, int i10, int i11, boolean z10, int i12, j2.e eVar, l.b bVar, List<d.b<v1.u>> list) {
        qc.q.i(dVar, "text");
        qc.q.i(k0Var, "style");
        qc.q.i(eVar, "density");
        qc.q.i(bVar, "fontFamilyResolver");
        qc.q.i(list, "placeholders");
        this.f8233a = dVar;
        this.f8234b = k0Var;
        this.f8235c = i10;
        this.f8236d = i11;
        this.f8237e = z10;
        this.f8238f = i12;
        this.f8239g = eVar;
        this.f8240h = bVar;
        this.f8241i = list;
        if (!(i10 > 0)) {
            throw new IllegalStateException("Check failed.".toString());
        }
        if (!(i11 > 0)) {
            throw new IllegalStateException("Check failed.".toString());
        }
        if (!(i11 <= i10)) {
            throw new IllegalStateException("Check failed.".toString());
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ d0(v1.d r14, v1.k0 r15, int r16, int r17, boolean r18, int r19, j2.e r20, a2.l.b r21, java.util.List r22, int r23, qc.h r24) {
        /*
            r13 = this;
            r0 = r23
            r1 = r0 & 4
            if (r1 == 0) goto Ld
            r1 = 2147483647(0x7fffffff, float:NaN)
            r5 = 2147483647(0x7fffffff, float:NaN)
            goto Lf
        Ld:
            r5 = r16
        Lf:
            r1 = r0 & 8
            r2 = 1
            if (r1 == 0) goto L16
            r6 = 1
            goto L18
        L16:
            r6 = r17
        L18:
            r1 = r0 & 16
            if (r1 == 0) goto L1e
            r7 = 1
            goto L20
        L1e:
            r7 = r18
        L20:
            r1 = r0 & 32
            if (r1 == 0) goto L2c
            g2.u$a r1 = g2.u.f16099a
            int r1 = r1.a()
            r8 = r1
            goto L2e
        L2c:
            r8 = r19
        L2e:
            r0 = r0 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L38
            java.util.List r0 = ec.r.i()
            r11 = r0
            goto L3a
        L38:
            r11 = r22
        L3a:
            r12 = 0
            r2 = r13
            r3 = r14
            r4 = r15
            r9 = r20
            r10 = r21
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: c0.d0.<init>(v1.d, v1.k0, int, int, boolean, int, j2.e, a2.l$b, java.util.List, int, qc.h):void");
    }
}
