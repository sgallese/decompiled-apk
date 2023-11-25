package d1;

import a1.b4;
import a1.h1;
import a1.o0;
import a1.q1;
import c1.f;
import dc.w;
import j2.r;
import pc.l;
import qc.q;
import z0.h;
import z0.i;
import z0.m;

/* compiled from: Painter.kt */
/* loaded from: classes.dex */
public abstract class c {

    /* renamed from: f  reason: collision with root package name */
    private b4 f13057f;

    /* renamed from: m  reason: collision with root package name */
    private boolean f13058m;

    /* renamed from: p  reason: collision with root package name */
    private q1 f13059p;

    /* renamed from: q  reason: collision with root package name */
    private float f13060q = 1.0f;

    /* renamed from: r  reason: collision with root package name */
    private r f13061r = r.Ltr;

    /* renamed from: s  reason: collision with root package name */
    private final l<f, w> f13062s = new a();

    /* compiled from: Painter.kt */
    /* loaded from: classes.dex */
    static final class a extends qc.r implements l<f, w> {
        a() {
            super(1);
        }

        @Override // pc.l
        public /* bridge */ /* synthetic */ w invoke(f fVar) {
            invoke2(fVar);
            return w.f13270a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(f fVar) {
            q.i(fVar, "$this$null");
            c.this.m(fVar);
        }
    }

    private final void g(float f10) {
        boolean z10;
        boolean z11;
        if (this.f13060q == f10) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            if (!a(f10)) {
                if (f10 == 1.0f) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (z11) {
                    b4 b4Var = this.f13057f;
                    if (b4Var != null) {
                        b4Var.c(f10);
                    }
                    this.f13058m = false;
                } else {
                    l().c(f10);
                    this.f13058m = true;
                }
            }
            this.f13060q = f10;
        }
    }

    private final void h(q1 q1Var) {
        if (!q.d(this.f13059p, q1Var)) {
            if (!e(q1Var)) {
                if (q1Var == null) {
                    b4 b4Var = this.f13057f;
                    if (b4Var != null) {
                        b4Var.q(null);
                    }
                    this.f13058m = false;
                } else {
                    l().q(q1Var);
                    this.f13058m = true;
                }
            }
            this.f13059p = q1Var;
        }
    }

    private final void i(r rVar) {
        if (this.f13061r != rVar) {
            f(rVar);
            this.f13061r = rVar;
        }
    }

    private final b4 l() {
        b4 b4Var = this.f13057f;
        if (b4Var == null) {
            b4 a10 = o0.a();
            this.f13057f = a10;
            return a10;
        }
        return b4Var;
    }

    protected boolean a(float f10) {
        return false;
    }

    protected boolean e(q1 q1Var) {
        return false;
    }

    protected boolean f(r rVar) {
        q.i(rVar, "layoutDirection");
        return false;
    }

    public final void j(f fVar, long j10, float f10, q1 q1Var) {
        q.i(fVar, "$this$draw");
        g(f10);
        h(q1Var);
        i(fVar.getLayoutDirection());
        float i10 = z0.l.i(fVar.b()) - z0.l.i(j10);
        float g10 = z0.l.g(fVar.b()) - z0.l.g(j10);
        fVar.y0().a().f(0.0f, 0.0f, i10, g10);
        if (f10 > 0.0f && z0.l.i(j10) > 0.0f && z0.l.g(j10) > 0.0f) {
            if (this.f13058m) {
                h b10 = i.b(z0.f.f26354b.c(), m.a(z0.l.i(j10), z0.l.g(j10)));
                h1 d10 = fVar.y0().d();
                try {
                    d10.q(b10, l());
                    m(fVar);
                } finally {
                    d10.p();
                }
            } else {
                m(fVar);
            }
        }
        fVar.y0().a().f(-0.0f, -0.0f, -i10, -g10);
    }

    public abstract long k();

    protected abstract void m(f fVar);
}
