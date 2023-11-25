package cb;

import cb.l;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import td.v;
import td.w;
import td.x;
import td.y;

/* compiled from: MarkwonVisitorImpl.java */
/* loaded from: classes4.dex */
class n implements l {

    /* renamed from: a  reason: collision with root package name */
    private final g f8930a;

    /* renamed from: b  reason: collision with root package name */
    private final r f8931b;

    /* renamed from: c  reason: collision with root package name */
    private final u f8932c;

    /* renamed from: d  reason: collision with root package name */
    private final Map<Class<? extends td.s>, l.c<? extends td.s>> f8933d;

    /* renamed from: e  reason: collision with root package name */
    private final l.a f8934e;

    /* compiled from: MarkwonVisitorImpl.java */
    /* loaded from: classes4.dex */
    static class a implements l.b {

        /* renamed from: a  reason: collision with root package name */
        private final Map<Class<? extends td.s>, l.c<? extends td.s>> f8935a = new HashMap();

        /* renamed from: b  reason: collision with root package name */
        private l.a f8936b;

        @Override // cb.l.b
        public <N extends td.s> l.b a(Class<N> cls, l.c<? super N> cVar) {
            if (cVar == null) {
                this.f8935a.remove(cls);
            } else {
                this.f8935a.put(cls, cVar);
            }
            return this;
        }

        @Override // cb.l.b
        public l b(g gVar, r rVar) {
            l.a aVar = this.f8936b;
            if (aVar == null) {
                aVar = new b();
            }
            return new n(gVar, rVar, new u(), Collections.unmodifiableMap(this.f8935a), aVar);
        }
    }

    n(g gVar, r rVar, u uVar, Map<Class<? extends td.s>, l.c<? extends td.s>> map, l.a aVar) {
        this.f8930a = gVar;
        this.f8931b = rVar;
        this.f8932c = uVar;
        this.f8933d = map;
        this.f8934e = aVar;
    }

    private void H(td.s sVar) {
        l.c<? extends td.s> cVar = this.f8933d.get(sVar.getClass());
        if (cVar != null) {
            cVar.a(this, sVar);
        } else {
            n(sVar);
        }
    }

    @Override // cb.l
    public void A(td.s sVar) {
        this.f8934e.a(this, sVar);
    }

    @Override // td.z
    public void B(td.j jVar) {
        H(jVar);
    }

    @Override // td.z
    public void C(td.d dVar) {
        H(dVar);
    }

    @Override // td.z
    public void D(td.o oVar) {
        H(oVar);
    }

    @Override // td.z
    public void E(td.h hVar) {
        H(hVar);
    }

    @Override // td.z
    public void F(td.r rVar) {
        H(rVar);
    }

    public <N extends td.s> void G(Class<N> cls, int i10) {
        t a10 = this.f8930a.e().a(cls);
        if (a10 != null) {
            d(i10, a10.a(this.f8930a, this.f8931b));
        }
    }

    @Override // cb.l
    public boolean a(td.s sVar) {
        if (sVar.e() != null) {
            return true;
        }
        return false;
    }

    @Override // td.z
    public void b(td.t tVar) {
        H(tVar);
    }

    @Override // cb.l
    public u builder() {
        return this.f8932c;
    }

    @Override // td.z
    public void c(td.e eVar) {
        H(eVar);
    }

    @Override // cb.l
    public void d(int i10, Object obj) {
        u uVar = this.f8932c;
        u.j(uVar, obj, i10, uVar.length());
    }

    @Override // td.z
    public void e(v vVar) {
        H(vVar);
    }

    @Override // td.z
    public void f(w wVar) {
        H(wVar);
    }

    @Override // td.z
    public void g(td.m mVar) {
        H(mVar);
    }

    @Override // td.z
    public void h(td.p pVar) {
        H(pVar);
    }

    @Override // cb.l
    public void i(td.s sVar) {
        this.f8934e.b(this, sVar);
    }

    @Override // td.z
    public void j(td.f fVar) {
        H(fVar);
    }

    @Override // td.z
    public void k(td.l lVar) {
        H(lVar);
    }

    @Override // td.z
    public void l(y yVar) {
        H(yVar);
    }

    @Override // cb.l
    public int length() {
        return this.f8932c.length();
    }

    @Override // td.z
    public void m(td.n nVar) {
        H(nVar);
    }

    @Override // cb.l
    public void n(td.s sVar) {
        td.s c10 = sVar.c();
        while (c10 != null) {
            td.s e10 = c10.e();
            c10.a(this);
            c10 = e10;
        }
    }

    @Override // cb.l
    public g o() {
        return this.f8930a;
    }

    @Override // cb.l
    public void p() {
        this.f8932c.append('\n');
    }

    @Override // td.z
    public void q(td.b bVar) {
        H(bVar);
    }

    @Override // td.z
    public void r(td.g gVar) {
        H(gVar);
    }

    @Override // cb.l
    public void s() {
        if (this.f8932c.length() > 0 && '\n' != this.f8932c.h()) {
            this.f8932c.append('\n');
        }
    }

    @Override // td.z
    public void t(td.u uVar) {
        H(uVar);
    }

    @Override // td.z
    public void u(td.k kVar) {
        H(kVar);
    }

    @Override // td.z
    public void v(td.c cVar) {
        H(cVar);
    }

    @Override // cb.l
    public <N extends td.s> void w(N n10, int i10) {
        G(n10.getClass(), i10);
    }

    @Override // td.z
    public void x(x xVar) {
        H(xVar);
    }

    @Override // td.z
    public void y(td.i iVar) {
        H(iVar);
    }

    @Override // cb.l
    public r z() {
        return this.f8931b;
    }
}
