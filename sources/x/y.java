package x;

import j0.g1;
import j0.o2;

/* compiled from: LazyListScrollPosition.kt */
/* loaded from: classes.dex */
public final class y {

    /* renamed from: a  reason: collision with root package name */
    private final g1 f25677a;

    /* renamed from: b  reason: collision with root package name */
    private final g1 f25678b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f25679c;

    /* renamed from: d  reason: collision with root package name */
    private Object f25680d;

    /* renamed from: e  reason: collision with root package name */
    private final y.v f25681e;

    public y(int i10, int i11) {
        this.f25677a = o2.a(i10);
        this.f25678b = o2.a(i11);
        this.f25681e = new y.v(i10, 30, 100);
    }

    private final void f(int i10) {
        this.f25678b.i(i10);
    }

    private final void g(int i10, int i11) {
        boolean z10;
        if (i10 >= 0.0f) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            e(i10);
            this.f25681e.j(i10);
            f(i11);
            return;
        }
        throw new IllegalArgumentException(("Index should be non-negative (" + i10 + ')').toString());
    }

    public final int a() {
        return this.f25677a.d();
    }

    public final y.v b() {
        return this.f25681e;
    }

    public final int c() {
        return this.f25678b.d();
    }

    public final void d(int i10, int i11) {
        g(i10, i11);
        this.f25680d = null;
    }

    public final void e(int i10) {
        this.f25677a.i(i10);
    }

    public final void h(t tVar) {
        Object obj;
        qc.q.i(tVar, "measureResult");
        u g10 = tVar.g();
        if (g10 != null) {
            obj = g10.b();
        } else {
            obj = null;
        }
        this.f25680d = obj;
        if (this.f25679c || tVar.a() > 0) {
            boolean z10 = true;
            this.f25679c = true;
            int h10 = tVar.h();
            int i10 = 0;
            if (h10 < 0.0f) {
                z10 = false;
            }
            if (z10) {
                u g11 = tVar.g();
                if (g11 != null) {
                    i10 = g11.getIndex();
                }
                g(i10, h10);
                return;
            }
            throw new IllegalStateException(("scrollOffset should be non-negative (" + h10 + ')').toString());
        }
    }

    public final int i(n nVar, int i10) {
        qc.q.i(nVar, "itemProvider");
        int a10 = y.p.a(nVar, this.f25680d, i10);
        if (i10 != a10) {
            e(a10);
            this.f25681e.j(i10);
        }
        return a10;
    }
}
