package androidx.compose.foundation;

import ad.k0;
import dc.w;
import kotlin.coroutines.Continuation;
import p1.b0;
import p1.c0;
import p1.r1;
import p1.s1;
import p1.t1;
import p1.u;
import t1.x;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Focusable.kt */
/* loaded from: classes.dex */
public final class k extends p1.l implements y0.c, c0, s1, u {
    private y0.o C;
    private final j E;
    private final z.d H;
    private final androidx.compose.foundation.relocation.d I;
    private final m D = (m) I1(new m());
    private final l F = (l) I1(new l());
    private final t.s G = (t.s) I1(new t.s());

    /* compiled from: Focusable.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.FocusableNode$onFocusEvent$1", f = "Focusable.kt", l = {237}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    static final class a extends kotlin.coroutines.jvm.internal.l implements pc.p<k0, Continuation<? super w>, Object> {

        /* renamed from: f  reason: collision with root package name */
        int f2001f;

        a(Continuation<? super a> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation<w> create(Object obj, Continuation<?> continuation) {
            return new a(continuation);
        }

        @Override // pc.p
        public final Object invoke(k0 k0Var, Continuation<? super w> continuation) {
            return ((a) create(k0Var, continuation)).invokeSuspend(w.f13270a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object d10;
            d10 = ic.d.d();
            int i10 = this.f2001f;
            if (i10 != 0) {
                if (i10 == 1) {
                    dc.n.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                dc.n.b(obj);
                z.d dVar = k.this.H;
                this.f2001f = 1;
                if (z.c.a(dVar, null, this, 1, null) == d10) {
                    return d10;
                }
            }
            return w.f13270a;
        }
    }

    public k(v.m mVar) {
        this.E = (j) I1(new j(mVar));
        z.d a10 = androidx.compose.foundation.relocation.c.a();
        this.H = a10;
        this.I = (androidx.compose.foundation.relocation.d) I1(new androidx.compose.foundation.relocation.d(a10));
    }

    public final void O1(v.m mVar) {
        this.E.L1(mVar);
    }

    @Override // p1.s1
    public void Z0(x xVar) {
        qc.q.i(xVar, "<this>");
        this.D.Z0(xVar);
    }

    @Override // p1.s1
    public /* synthetic */ boolean b0() {
        return r1.a(this);
    }

    @Override // p1.s1
    public /* synthetic */ boolean b1() {
        return r1.b(this);
    }

    @Override // p1.c0
    public /* synthetic */ void g(long j10) {
        b0.a(this, j10);
    }

    @Override // y0.c
    public void j(y0.o oVar) {
        qc.q.i(oVar, "focusState");
        if (!qc.q.d(this.C, oVar)) {
            boolean isFocused = oVar.isFocused();
            if (isFocused) {
                ad.i.d(i1(), null, null, new a(null), 3, null);
            }
            if (p1()) {
                t1.b(this);
            }
            this.E.K1(isFocused);
            this.G.K1(isFocused);
            this.F.J1(isFocused);
            this.D.I1(isFocused);
            this.C = oVar;
        }
    }

    @Override // p1.c0
    public void p(n1.s sVar) {
        qc.q.i(sVar, "coordinates");
        this.I.p(sVar);
    }

    @Override // p1.u
    public void w(n1.s sVar) {
        qc.q.i(sVar, "coordinates");
        this.G.w(sVar);
    }
}
