package d0;

import a2.l;
import c0.e0;
import d0.c;
import dc.w;
import ec.t;
import g2.u;
import j2.q;
import j2.r;
import java.util.List;
import v1.f0;
import v1.g0;
import v1.k0;
import v1.l0;
import v1.m;
import v1.p;

/* compiled from: ParagraphLayoutCache.kt */
/* loaded from: classes.dex */
public final class f {

    /* renamed from: a  reason: collision with root package name */
    private String f12998a;

    /* renamed from: b  reason: collision with root package name */
    private k0 f12999b;

    /* renamed from: c  reason: collision with root package name */
    private l.b f13000c;

    /* renamed from: d  reason: collision with root package name */
    private int f13001d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f13002e;

    /* renamed from: f  reason: collision with root package name */
    private int f13003f;

    /* renamed from: g  reason: collision with root package name */
    private int f13004g;

    /* renamed from: h  reason: collision with root package name */
    private long f13005h;

    /* renamed from: i  reason: collision with root package name */
    private j2.e f13006i;

    /* renamed from: j  reason: collision with root package name */
    private m f13007j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f13008k;

    /* renamed from: l  reason: collision with root package name */
    private long f13009l;

    /* renamed from: m  reason: collision with root package name */
    private c f13010m;

    /* renamed from: n  reason: collision with root package name */
    private p f13011n;

    /* renamed from: o  reason: collision with root package name */
    private r f13012o;

    /* renamed from: p  reason: collision with root package name */
    private long f13013p;

    /* renamed from: q  reason: collision with root package name */
    private int f13014q;

    /* renamed from: r  reason: collision with root package name */
    private int f13015r;

    public /* synthetic */ f(String str, k0 k0Var, l.b bVar, int i10, boolean z10, int i11, int i12, qc.h hVar) {
        this(str, k0Var, bVar, i10, z10, i11, i12);
    }

    private final m f(long j10, r rVar) {
        p m10 = m(rVar);
        return v1.r.c(m10, b.a(j10, this.f13002e, this.f13001d, m10.c()), b.b(this.f13002e, this.f13001d, this.f13003f), u.e(this.f13001d, u.f16099a.b()));
    }

    private final void h() {
        this.f13007j = null;
        this.f13011n = null;
        this.f13012o = null;
        this.f13014q = -1;
        this.f13015r = -1;
        this.f13013p = j2.b.f18972b.c(0, 0);
        this.f13009l = q.a(0, 0);
        this.f13008k = false;
    }

    private final boolean k(long j10, r rVar) {
        p pVar;
        m mVar = this.f13007j;
        if (mVar == null || (pVar = this.f13011n) == null || pVar.b() || rVar != this.f13012o) {
            return true;
        }
        if (j2.b.g(j10, this.f13013p)) {
            return false;
        }
        if (j2.b.n(j10) != j2.b.n(this.f13013p) || j2.b.m(j10) < mVar.getHeight() || mVar.t()) {
            return true;
        }
        return false;
    }

    private final p m(r rVar) {
        p pVar = this.f13011n;
        if (pVar == null || rVar != this.f13012o || pVar.b()) {
            this.f13012o = rVar;
            String str = this.f12998a;
            k0 d10 = l0.d(this.f12999b, rVar);
            j2.e eVar = this.f13006i;
            qc.q.f(eVar);
            pVar = v1.q.b(str, d10, null, null, eVar, this.f13000c, 12, null);
        }
        this.f13011n = pVar;
        return pVar;
    }

    public final boolean a() {
        return this.f13008k;
    }

    public final long b() {
        return this.f13009l;
    }

    public final w c() {
        p pVar = this.f13011n;
        if (pVar != null) {
            pVar.b();
        }
        return w.f13270a;
    }

    public final m d() {
        return this.f13007j;
    }

    public final int e(int i10, r rVar) {
        qc.q.i(rVar, "layoutDirection");
        int i11 = this.f13014q;
        int i12 = this.f13015r;
        if (i10 == i11 && i11 != -1) {
            return i12;
        }
        int a10 = e0.a(f(j2.c.a(0, i10, 0, Integer.MAX_VALUE), rVar).getHeight());
        this.f13014q = i10;
        this.f13015r = a10;
        return a10;
    }

    public final boolean g(long j10, r rVar) {
        qc.q.i(rVar, "layoutDirection");
        boolean z10 = true;
        if (this.f13004g > 1) {
            c.a aVar = c.f12971h;
            c cVar = this.f13010m;
            k0 k0Var = this.f12999b;
            j2.e eVar = this.f13006i;
            qc.q.f(eVar);
            c a10 = aVar.a(cVar, rVar, k0Var, eVar, this.f13000c);
            this.f13010m = a10;
            j10 = a10.c(j10, this.f13004g);
        }
        boolean z11 = false;
        if (!k(j10, rVar)) {
            if (!j2.b.g(j10, this.f13013p)) {
                m mVar = this.f13007j;
                qc.q.f(mVar);
                this.f13009l = j2.c.d(j10, q.a(e0.a(mVar.getWidth()), e0.a(mVar.getHeight())));
                if (u.e(this.f13001d, u.f16099a.c()) || (j2.p.g(r9) >= mVar.getWidth() && j2.p.f(r9) >= mVar.getHeight())) {
                    z10 = false;
                }
                this.f13008k = z10;
            }
            return false;
        }
        m f10 = f(j10, rVar);
        this.f13013p = j10;
        this.f13009l = j2.c.d(j10, q.a(e0.a(f10.getWidth()), e0.a(f10.getHeight())));
        if (!u.e(this.f13001d, u.f16099a.c()) && (j2.p.g(r9) < f10.getWidth() || j2.p.f(r9) < f10.getHeight())) {
            z11 = true;
        }
        this.f13008k = z11;
        this.f13007j = f10;
        return true;
    }

    public final int i(r rVar) {
        qc.q.i(rVar, "layoutDirection");
        return e0.a(m(rVar).c());
    }

    public final int j(r rVar) {
        qc.q.i(rVar, "layoutDirection");
        return e0.a(m(rVar).a());
    }

    public final void l(j2.e eVar) {
        long a10;
        j2.e eVar2 = this.f13006i;
        if (eVar != null) {
            a10 = a.d(eVar);
        } else {
            a10 = a.f12969a.a();
        }
        if (eVar2 == null) {
            this.f13006i = eVar;
            this.f13005h = a10;
        } else if (eVar == null || !a.e(this.f13005h, a10)) {
            this.f13006i = eVar;
            this.f13005h = a10;
            h();
        }
    }

    public final g0 n() {
        j2.e eVar;
        List i10;
        List i11;
        r rVar = this.f13012o;
        if (rVar == null || (eVar = this.f13006i) == null) {
            return null;
        }
        v1.d dVar = new v1.d(this.f12998a, null, null, 6, null);
        if (this.f13007j == null || this.f13011n == null) {
            return null;
        }
        long e10 = j2.b.e(this.f13013p, 0, 0, 0, 0, 10, null);
        k0 k0Var = this.f12999b;
        i10 = t.i();
        f0 f0Var = new f0(dVar, k0Var, i10, this.f13003f, this.f13002e, this.f13001d, eVar, rVar, this.f13000c, e10, (qc.h) null);
        k0 k0Var2 = this.f12999b;
        i11 = t.i();
        return new g0(f0Var, new v1.h(new v1.i(dVar, k0Var2, i11, eVar, this.f13000c), e10, this.f13003f, u.e(this.f13001d, u.f16099a.b()), null), this.f13009l, null);
    }

    public final void o(String str, k0 k0Var, l.b bVar, int i10, boolean z10, int i11, int i12) {
        qc.q.i(str, "text");
        qc.q.i(k0Var, "style");
        qc.q.i(bVar, "fontFamilyResolver");
        this.f12998a = str;
        this.f12999b = k0Var;
        this.f13000c = bVar;
        this.f13001d = i10;
        this.f13002e = z10;
        this.f13003f = i11;
        this.f13004g = i12;
        h();
    }

    private f(String str, k0 k0Var, l.b bVar, int i10, boolean z10, int i11, int i12) {
        qc.q.i(str, "text");
        qc.q.i(k0Var, "style");
        qc.q.i(bVar, "fontFamilyResolver");
        this.f12998a = str;
        this.f12999b = k0Var;
        this.f13000c = bVar;
        this.f13001d = i10;
        this.f13002e = z10;
        this.f13003f = i11;
        this.f13004g = i12;
        this.f13005h = a.f12969a.a();
        this.f13009l = q.a(0, 0);
        this.f13013p = j2.b.f18972b.c(0, 0);
        this.f13014q = -1;
        this.f13015r = -1;
    }
}
