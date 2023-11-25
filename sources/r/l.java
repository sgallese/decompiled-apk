package r;

import androidx.compose.ui.platform.k1;
import androidx.compose.ui.platform.m1;
import j0.l;

/* compiled from: AnimationModifier.kt */
/* loaded from: classes.dex */
public final class l {

    /* compiled from: InspectableValue.kt */
    /* loaded from: classes.dex */
    public static final class a extends qc.r implements pc.l<m1, dc.w> {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ s.e0 f21959f;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ pc.p f21960m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(s.e0 e0Var, pc.p pVar) {
            super(1);
            this.f21959f = e0Var;
            this.f21960m = pVar;
        }

        public final void a(m1 m1Var) {
            qc.q.i(m1Var, "$this$null");
            m1Var.b("animateContentSize");
            m1Var.a().c("animationSpec", this.f21959f);
            m1Var.a().c("finishedListener", this.f21960m);
        }

        @Override // pc.l
        public /* bridge */ /* synthetic */ dc.w invoke(m1 m1Var) {
            a(m1Var);
            return dc.w.f13270a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AnimationModifier.kt */
    /* loaded from: classes.dex */
    public static final class b extends qc.r implements pc.q<androidx.compose.ui.e, j0.l, Integer, androidx.compose.ui.e> {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ pc.p<j2.p, j2.p, dc.w> f21961f;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ s.e0<j2.p> f21962m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(pc.p<? super j2.p, ? super j2.p, dc.w> pVar, s.e0<j2.p> e0Var) {
            super(3);
            this.f21961f = pVar;
            this.f21962m = e0Var;
        }

        public final androidx.compose.ui.e a(androidx.compose.ui.e eVar, j0.l lVar, int i10) {
            qc.q.i(eVar, "$this$composed");
            lVar.e(-843180607);
            if (j0.n.K()) {
                j0.n.V(-843180607, i10, -1, "androidx.compose.animation.animateContentSize.<anonymous> (AnimationModifier.kt:76)");
            }
            lVar.e(773894976);
            lVar.e(-492369756);
            Object f10 = lVar.f();
            l.a aVar = j0.l.f18688a;
            if (f10 == aVar.a()) {
                Object xVar = new j0.x(j0.h0.h(hc.g.f16601f, lVar));
                lVar.J(xVar);
                f10 = xVar;
            }
            lVar.N();
            ad.k0 a10 = ((j0.x) f10).a();
            lVar.N();
            s.e0<j2.p> e0Var = this.f21962m;
            lVar.e(1157296644);
            boolean Q = lVar.Q(a10);
            Object f11 = lVar.f();
            if (Q || f11 == aVar.a()) {
                f11 = new d0(e0Var, a10);
                lVar.J(f11);
            }
            lVar.N();
            d0 d0Var = (d0) f11;
            d0Var.A(this.f21961f);
            androidx.compose.ui.e a11 = x0.e.b(eVar).a(d0Var);
            if (j0.n.K()) {
                j0.n.U();
            }
            lVar.N();
            return a11;
        }

        @Override // pc.q
        public /* bridge */ /* synthetic */ androidx.compose.ui.e invoke(androidx.compose.ui.e eVar, j0.l lVar, Integer num) {
            return a(eVar, lVar, num.intValue());
        }
    }

    public static final androidx.compose.ui.e a(androidx.compose.ui.e eVar, s.e0<j2.p> e0Var, pc.p<? super j2.p, ? super j2.p, dc.w> pVar) {
        pc.l a10;
        qc.q.i(eVar, "<this>");
        qc.q.i(e0Var, "animationSpec");
        if (k1.c()) {
            a10 = new a(e0Var, pVar);
        } else {
            a10 = k1.a();
        }
        return androidx.compose.ui.c.a(eVar, a10, new b(pVar, e0Var));
    }

    public static /* synthetic */ androidx.compose.ui.e b(androidx.compose.ui.e eVar, s.e0 e0Var, pc.p pVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            e0Var = s.k.g(0.0f, 0.0f, null, 7, null);
        }
        if ((i10 & 2) != 0) {
            pVar = null;
        }
        return a(eVar, e0Var, pVar);
    }
}
