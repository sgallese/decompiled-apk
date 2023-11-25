package c0;

import b2.o;

/* compiled from: KeyboardActionRunner.kt */
/* loaded from: classes.dex */
public final class v {

    /* renamed from: a  reason: collision with root package name */
    public w f8596a;

    /* renamed from: b  reason: collision with root package name */
    public y0.g f8597b;

    /* renamed from: c  reason: collision with root package name */
    private b2.r0 f8598c;

    public void a(int i10) {
        boolean l10;
        boolean l11;
        o.a aVar = b2.o.f7817b;
        if (b2.o.l(i10, aVar.d())) {
            b().j(androidx.compose.ui.focus.d.f2368b.e());
        } else if (b2.o.l(i10, aVar.f())) {
            b().j(androidx.compose.ui.focus.d.f2368b.f());
        } else if (b2.o.l(i10, aVar.b())) {
            b2.r0 r0Var = this.f8598c;
            if (r0Var != null) {
                r0Var.b();
            }
        } else {
            boolean z10 = true;
            if (b2.o.l(i10, aVar.c())) {
                l10 = true;
            } else {
                l10 = b2.o.l(i10, aVar.g());
            }
            if (l10) {
                l11 = true;
            } else {
                l11 = b2.o.l(i10, aVar.h());
            }
            if (!l11) {
                z10 = b2.o.l(i10, aVar.a());
            }
            if (!z10) {
                b2.o.l(i10, aVar.e());
            }
        }
    }

    public final y0.g b() {
        y0.g gVar = this.f8597b;
        if (gVar != null) {
            return gVar;
        }
        qc.q.z("focusManager");
        return null;
    }

    public final w c() {
        w wVar = this.f8596a;
        if (wVar != null) {
            return wVar;
        }
        qc.q.z("keyboardActions");
        return null;
    }

    public final void d(int i10) {
        boolean l10;
        pc.l<Object, dc.w> lVar;
        o.a aVar = b2.o.f7817b;
        dc.w wVar = null;
        if (b2.o.l(i10, aVar.b())) {
            lVar = c().b();
        } else if (b2.o.l(i10, aVar.c())) {
            lVar = c().c();
        } else if (b2.o.l(i10, aVar.d())) {
            lVar = c().d();
        } else if (b2.o.l(i10, aVar.f())) {
            lVar = c().e();
        } else if (b2.o.l(i10, aVar.g())) {
            lVar = c().f();
        } else if (b2.o.l(i10, aVar.h())) {
            lVar = c().g();
        } else {
            if (b2.o.l(i10, aVar.a())) {
                l10 = true;
            } else {
                l10 = b2.o.l(i10, aVar.e());
            }
            if (l10) {
                lVar = null;
            } else {
                throw new IllegalStateException("invalid ImeAction".toString());
            }
        }
        if (lVar != null) {
            lVar.invoke(this);
            wVar = dc.w.f13270a;
        }
        if (wVar == null) {
            a(i10);
        }
    }

    public final void e(y0.g gVar) {
        qc.q.i(gVar, "<set-?>");
        this.f8597b = gVar;
    }

    public final void f(b2.r0 r0Var) {
        this.f8598c = r0Var;
    }

    public final void g(w wVar) {
        qc.q.i(wVar, "<set-?>");
        this.f8596a = wVar;
    }
}
