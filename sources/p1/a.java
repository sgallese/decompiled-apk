package p1;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* compiled from: LayoutNodeAlignmentLines.kt */
/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a  reason: collision with root package name */
    private final b f20744a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f20745b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f20746c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f20747d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f20748e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f20749f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f20750g;

    /* renamed from: h  reason: collision with root package name */
    private b f20751h;

    /* renamed from: i  reason: collision with root package name */
    private final Map<n1.a, Integer> f20752i;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: LayoutNodeAlignmentLines.kt */
    /* renamed from: p1.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0464a extends qc.r implements pc.l<b, dc.w> {
        C0464a() {
            super(1);
        }

        public final void a(b bVar) {
            qc.q.i(bVar, "childOwner");
            if (!bVar.f()) {
                return;
            }
            if (bVar.d().g()) {
                bVar.R();
            }
            Map map = bVar.d().f20752i;
            a aVar = a.this;
            for (Map.Entry entry : map.entrySet()) {
                aVar.c((n1.a) entry.getKey(), ((Number) entry.getValue()).intValue(), bVar.o());
            }
            x0 V1 = bVar.o().V1();
            qc.q.f(V1);
            while (!qc.q.d(V1, a.this.f().o())) {
                Set<n1.a> keySet = a.this.e(V1).keySet();
                a aVar2 = a.this;
                for (n1.a aVar3 : keySet) {
                    aVar2.c(aVar3, aVar2.i(V1, aVar3), V1);
                }
                V1 = V1.V1();
                qc.q.f(V1);
            }
        }

        @Override // pc.l
        public /* bridge */ /* synthetic */ dc.w invoke(b bVar) {
            a(bVar);
            return dc.w.f13270a;
        }
    }

    public /* synthetic */ a(b bVar, qc.h hVar) {
        this(bVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void c(n1.a aVar, int i10, x0 x0Var) {
        Object i11;
        float f10 = i10;
        long a10 = z0.g.a(f10, f10);
        while (true) {
            a10 = d(x0Var, a10);
            x0Var = x0Var.V1();
            qc.q.f(x0Var);
            if (qc.q.d(x0Var, this.f20744a.o())) {
                break;
            } else if (e(x0Var).containsKey(aVar)) {
                float i12 = i(x0Var, aVar);
                a10 = z0.g.a(i12, i12);
            }
        }
        int d10 = aVar instanceof n1.k ? sc.c.d(z0.f.p(a10)) : sc.c.d(z0.f.o(a10));
        Map<n1.a, Integer> map = this.f20752i;
        if (map.containsKey(aVar)) {
            i11 = ec.n0.i(this.f20752i, aVar);
            d10 = n1.b.c(aVar, ((Number) i11).intValue(), d10);
        }
        map.put(aVar, Integer.valueOf(d10));
    }

    protected abstract long d(x0 x0Var, long j10);

    protected abstract Map<n1.a, Integer> e(x0 x0Var);

    public final b f() {
        return this.f20744a;
    }

    public final boolean g() {
        return this.f20745b;
    }

    public final Map<n1.a, Integer> h() {
        return this.f20752i;
    }

    protected abstract int i(x0 x0Var, n1.a aVar);

    public final boolean j() {
        if (!this.f20746c && !this.f20748e && !this.f20749f && !this.f20750g) {
            return false;
        }
        return true;
    }

    public final boolean k() {
        o();
        if (this.f20751h != null) {
            return true;
        }
        return false;
    }

    public final boolean l() {
        return this.f20747d;
    }

    public final void m() {
        this.f20745b = true;
        b p10 = this.f20744a.p();
        if (p10 == null) {
            return;
        }
        if (this.f20746c) {
            p10.Y();
        } else if (this.f20748e || this.f20747d) {
            p10.requestLayout();
        }
        if (this.f20749f) {
            this.f20744a.Y();
        }
        if (this.f20750g) {
            this.f20744a.requestLayout();
        }
        p10.d().m();
    }

    public final void n() {
        this.f20752i.clear();
        this.f20744a.I(new C0464a());
        this.f20752i.putAll(e(this.f20744a.o()));
        this.f20745b = false;
    }

    public final void o() {
        b bVar;
        a d10;
        a d11;
        if (j()) {
            bVar = this.f20744a;
        } else {
            b p10 = this.f20744a.p();
            if (p10 == null) {
                return;
            }
            bVar = p10.d().f20751h;
            if (bVar == null || !bVar.d().j()) {
                b bVar2 = this.f20751h;
                if (bVar2 != null && !bVar2.d().j()) {
                    b p11 = bVar2.p();
                    if (p11 != null && (d11 = p11.d()) != null) {
                        d11.o();
                    }
                    b p12 = bVar2.p();
                    if (p12 != null && (d10 = p12.d()) != null) {
                        bVar = d10.f20751h;
                    } else {
                        bVar = null;
                    }
                } else {
                    return;
                }
            }
        }
        this.f20751h = bVar;
    }

    public final void p() {
        this.f20745b = true;
        this.f20746c = false;
        this.f20748e = false;
        this.f20747d = false;
        this.f20749f = false;
        this.f20750g = false;
        this.f20751h = null;
    }

    public final void q(boolean z10) {
        this.f20748e = z10;
    }

    public final void r(boolean z10) {
        this.f20750g = z10;
    }

    public final void s(boolean z10) {
        this.f20749f = z10;
    }

    public final void t(boolean z10) {
        this.f20747d = z10;
    }

    public final void u(boolean z10) {
        this.f20746c = z10;
    }

    private a(b bVar) {
        this.f20744a = bVar;
        this.f20745b = true;
        this.f20752i = new HashMap();
    }
}
