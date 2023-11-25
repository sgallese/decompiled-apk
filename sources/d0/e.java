package d0;

import a2.l;
import c0.e0;
import d0.c;
import ec.t;
import j2.r;
import java.util.List;
import qc.q;
import v1.d;
import v1.f0;
import v1.g0;
import v1.k0;
import v1.l0;
import v1.u;

/* compiled from: MultiParagraphLayoutCache.kt */
/* loaded from: classes.dex */
public final class e {

    /* renamed from: a  reason: collision with root package name */
    private v1.d f12982a;

    /* renamed from: b  reason: collision with root package name */
    private k0 f12983b;

    /* renamed from: c  reason: collision with root package name */
    private l.b f12984c;

    /* renamed from: d  reason: collision with root package name */
    private int f12985d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f12986e;

    /* renamed from: f  reason: collision with root package name */
    private int f12987f;

    /* renamed from: g  reason: collision with root package name */
    private int f12988g;

    /* renamed from: h  reason: collision with root package name */
    private List<d.b<u>> f12989h;

    /* renamed from: i  reason: collision with root package name */
    private c f12990i;

    /* renamed from: j  reason: collision with root package name */
    private long f12991j;

    /* renamed from: k  reason: collision with root package name */
    private j2.e f12992k;

    /* renamed from: l  reason: collision with root package name */
    private v1.i f12993l;

    /* renamed from: m  reason: collision with root package name */
    private r f12994m;

    /* renamed from: n  reason: collision with root package name */
    private g0 f12995n;

    /* renamed from: o  reason: collision with root package name */
    private int f12996o;

    /* renamed from: p  reason: collision with root package name */
    private int f12997p;

    public /* synthetic */ e(v1.d dVar, k0 k0Var, l.b bVar, int i10, boolean z10, int i11, int i12, List list, qc.h hVar) {
        this(dVar, k0Var, bVar, i10, z10, i11, i12, list);
    }

    private final v1.h d(long j10, r rVar) {
        v1.i k10 = k(rVar);
        return new v1.h(k10, b.a(j10, this.f12986e, this.f12985d, k10.c()), b.b(this.f12986e, this.f12985d, this.f12987f), g2.u.e(this.f12985d, g2.u.f16099a.b()), null);
    }

    private final void f() {
        this.f12993l = null;
        this.f12995n = null;
    }

    private final boolean i(g0 g0Var, long j10, r rVar) {
        if (g0Var == null || g0Var.v().i().b() || rVar != g0Var.k().d()) {
            return true;
        }
        if (j2.b.g(j10, g0Var.k().a())) {
            return false;
        }
        if (j2.b.n(j10) != j2.b.n(g0Var.k().a()) || j2.b.m(j10) < g0Var.v().g() || g0Var.v().e()) {
            return true;
        }
        return false;
    }

    private final v1.i k(r rVar) {
        v1.i iVar = this.f12993l;
        if (iVar == null || rVar != this.f12994m || iVar.b()) {
            this.f12994m = rVar;
            v1.d dVar = this.f12982a;
            k0 d10 = l0.d(this.f12983b, rVar);
            j2.e eVar = this.f12992k;
            q.f(eVar);
            l.b bVar = this.f12984c;
            List<d.b<u>> list = this.f12989h;
            if (list == null) {
                list = t.i();
            }
            iVar = new v1.i(dVar, d10, list, eVar, bVar);
        }
        this.f12993l = iVar;
        return iVar;
    }

    private final g0 l(r rVar, long j10, v1.h hVar) {
        v1.d dVar = this.f12982a;
        k0 k0Var = this.f12983b;
        List<d.b<u>> list = this.f12989h;
        if (list == null) {
            list = t.i();
        }
        int i10 = this.f12987f;
        boolean z10 = this.f12986e;
        int i11 = this.f12985d;
        j2.e eVar = this.f12992k;
        q.f(eVar);
        return new g0(new f0(dVar, k0Var, list, i10, z10, i11, eVar, rVar, this.f12984c, j10, (qc.h) null), hVar, j2.c.d(j10, j2.q.a(e0.a(hVar.y()), e0.a(hVar.g()))), null);
    }

    public final g0 a() {
        return this.f12995n;
    }

    public final g0 b() {
        g0 g0Var = this.f12995n;
        if (g0Var != null) {
            return g0Var;
        }
        throw new IllegalStateException("You must call layoutWithConstraints first");
    }

    public final int c(int i10, r rVar) {
        q.i(rVar, "layoutDirection");
        int i11 = this.f12996o;
        int i12 = this.f12997p;
        if (i10 == i11 && i11 != -1) {
            return i12;
        }
        int a10 = e0.a(d(j2.c.a(0, i10, 0, Integer.MAX_VALUE), rVar).g());
        this.f12996o = i10;
        this.f12997p = a10;
        return a10;
    }

    public final boolean e(long j10, r rVar) {
        q.i(rVar, "layoutDirection");
        if (this.f12988g > 1) {
            c.a aVar = c.f12971h;
            c cVar = this.f12990i;
            k0 k0Var = this.f12983b;
            j2.e eVar = this.f12992k;
            q.f(eVar);
            c a10 = aVar.a(cVar, rVar, k0Var, eVar, this.f12984c);
            this.f12990i = a10;
            j10 = a10.c(j10, this.f12988g);
        }
        if (!i(this.f12995n, j10, rVar)) {
            g0 g0Var = this.f12995n;
            q.f(g0Var);
            if (j2.b.g(j10, g0Var.k().a())) {
                return false;
            }
            g0 g0Var2 = this.f12995n;
            q.f(g0Var2);
            this.f12995n = l(rVar, j10, g0Var2.v());
            return true;
        }
        this.f12995n = l(rVar, j10, d(j10, rVar));
        return true;
    }

    public final int g(r rVar) {
        q.i(rVar, "layoutDirection");
        return e0.a(k(rVar).c());
    }

    public final int h(r rVar) {
        q.i(rVar, "layoutDirection");
        return e0.a(k(rVar).a());
    }

    public final void j(j2.e eVar) {
        long a10;
        j2.e eVar2 = this.f12992k;
        if (eVar != null) {
            a10 = a.d(eVar);
        } else {
            a10 = a.f12969a.a();
        }
        if (eVar2 == null) {
            this.f12992k = eVar;
            this.f12991j = a10;
        } else if (eVar == null || !a.e(this.f12991j, a10)) {
            this.f12992k = eVar;
            this.f12991j = a10;
            f();
        }
    }

    public final void m(v1.d dVar, k0 k0Var, l.b bVar, int i10, boolean z10, int i11, int i12, List<d.b<u>> list) {
        q.i(dVar, "text");
        q.i(k0Var, "style");
        q.i(bVar, "fontFamilyResolver");
        this.f12982a = dVar;
        this.f12983b = k0Var;
        this.f12984c = bVar;
        this.f12985d = i10;
        this.f12986e = z10;
        this.f12987f = i11;
        this.f12988g = i12;
        this.f12989h = list;
        f();
    }

    private e(v1.d dVar, k0 k0Var, l.b bVar, int i10, boolean z10, int i11, int i12, List<d.b<u>> list) {
        q.i(dVar, "text");
        q.i(k0Var, "style");
        q.i(bVar, "fontFamilyResolver");
        this.f12982a = dVar;
        this.f12983b = k0Var;
        this.f12984c = bVar;
        this.f12985d = i10;
        this.f12986e = z10;
        this.f12987f = i11;
        this.f12988g = i12;
        this.f12989h = list;
        this.f12991j = a.f12969a.a();
        this.f12996o = -1;
        this.f12997p = -1;
    }
}
