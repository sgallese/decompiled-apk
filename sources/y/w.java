package y;

import j0.d3;
import j0.g1;
import j0.j1;
import j0.o2;
import n1.w0;
import y.y;

/* compiled from: LazyLayoutPinnableItem.kt */
/* loaded from: classes.dex */
final class w implements w0, w0.a, y.a {

    /* renamed from: a  reason: collision with root package name */
    private final Object f26150a;

    /* renamed from: b  reason: collision with root package name */
    private final y f26151b;

    /* renamed from: c  reason: collision with root package name */
    private final g1 f26152c;

    /* renamed from: d  reason: collision with root package name */
    private final g1 f26153d;

    /* renamed from: e  reason: collision with root package name */
    private final j1 f26154e;

    /* renamed from: f  reason: collision with root package name */
    private final j1 f26155f;

    public w(Object obj, y yVar) {
        j1 e10;
        j1 e11;
        qc.q.i(yVar, "pinnedItemList");
        this.f26150a = obj;
        this.f26151b = yVar;
        this.f26152c = o2.a(-1);
        this.f26153d = o2.a(0);
        e10 = d3.e(null, null, 2, null);
        this.f26154e = e10;
        e11 = d3.e(null, null, 2, null);
        this.f26155f = e11;
    }

    private final w0.a b() {
        return (w0.a) this.f26154e.getValue();
    }

    private final int d() {
        return this.f26153d.d();
    }

    private final w0 e() {
        return (w0) this.f26155f.getValue();
    }

    private final void h(w0.a aVar) {
        this.f26154e.setValue(aVar);
    }

    private final void j(int i10) {
        this.f26153d.i(i10);
    }

    private final void k(w0 w0Var) {
        this.f26155f.setValue(w0Var);
    }

    @Override // n1.w0
    public w0.a a() {
        w0.a aVar;
        if (d() == 0) {
            this.f26151b.j(this);
            w0 c10 = c();
            if (c10 != null) {
                aVar = c10.a();
            } else {
                aVar = null;
            }
            h(aVar);
        }
        j(d() + 1);
        return this;
    }

    public final w0 c() {
        return e();
    }

    public final void f() {
        int d10 = d();
        for (int i10 = 0; i10 < d10; i10++) {
            release();
        }
    }

    public void g(int i10) {
        this.f26152c.i(i10);
    }

    @Override // y.y.a
    public int getIndex() {
        return this.f26152c.d();
    }

    @Override // y.y.a
    public Object getKey() {
        return this.f26150a;
    }

    public final void i(w0 w0Var) {
        w0.a aVar;
        t0.g a10 = t0.g.f23297e.a();
        try {
            t0.g l10 = a10.l();
            try {
                if (w0Var != e()) {
                    k(w0Var);
                    if (d() > 0) {
                        w0.a b10 = b();
                        if (b10 != null) {
                            b10.release();
                        }
                        if (w0Var != null) {
                            aVar = w0Var.a();
                        } else {
                            aVar = null;
                        }
                        h(aVar);
                    }
                }
                dc.w wVar = dc.w.f13270a;
            } finally {
                a10.s(l10);
            }
        } finally {
            a10.d();
        }
    }

    @Override // n1.w0.a
    public void release() {
        boolean z10;
        if (d() > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            j(d() - 1);
            if (d() == 0) {
                this.f26151b.k(this);
                w0.a b10 = b();
                if (b10 != null) {
                    b10.release();
                }
                h(null);
                return;
            }
            return;
        }
        throw new IllegalStateException("Release should only be called once".toString());
    }
}
