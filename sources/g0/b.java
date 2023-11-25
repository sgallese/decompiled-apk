package g0;

import a1.o1;
import androidx.compose.ui.platform.k1;
import androidx.compose.ui.platform.m1;
import dc.w;
import pc.l;
import qc.q;
import qc.r;
import s.d0;

/* compiled from: PullRefreshIndicatorTransform.kt */
/* loaded from: classes.dex */
public final class b {

    /* compiled from: InspectableValue.kt */
    /* loaded from: classes.dex */
    public static final class a extends r implements l<m1, w> {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ e f15967f;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ boolean f15968m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(e eVar, boolean z10) {
            super(1);
            this.f15967f = eVar;
            this.f15968m = z10;
        }

        public final void a(m1 m1Var) {
            q.i(m1Var, "$this$null");
            m1Var.b("pullRefreshIndicatorTransform");
            m1Var.a().c("state", this.f15967f);
            m1Var.a().c("scale", Boolean.valueOf(this.f15968m));
        }

        @Override // pc.l
        public /* bridge */ /* synthetic */ w invoke(m1 m1Var) {
            a(m1Var);
            return w.f13270a;
        }
    }

    /* compiled from: PullRefreshIndicatorTransform.kt */
    /* renamed from: g0.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    static final class C0376b extends r implements l<c1.c, w> {

        /* renamed from: f  reason: collision with root package name */
        public static final C0376b f15969f = new C0376b();

        C0376b() {
            super(1);
        }

        public final void a(c1.c cVar) {
            q.i(cVar, "$this$drawWithContent");
            int b10 = o1.f133a.b();
            c1.d y02 = cVar.y0();
            long b11 = y02.b();
            y02.d().k();
            y02.a().a(-3.4028235E38f, 0.0f, Float.MAX_VALUE, Float.MAX_VALUE, b10);
            cVar.d1();
            y02.d().p();
            y02.c(b11);
        }

        @Override // pc.l
        public /* bridge */ /* synthetic */ w invoke(c1.c cVar) {
            a(cVar);
            return w.f13270a;
        }
    }

    /* compiled from: PullRefreshIndicatorTransform.kt */
    /* loaded from: classes.dex */
    static final class c extends r implements l<androidx.compose.ui.graphics.d, w> {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ e f15970f;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ boolean f15971m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(e eVar, boolean z10) {
            super(1);
            this.f15970f = eVar;
            this.f15971m = z10;
        }

        public final void a(androidx.compose.ui.graphics.d dVar) {
            float k10;
            q.i(dVar, "$this$graphicsLayer");
            dVar.i(this.f15970f.i() - z0.l.g(dVar.b()));
            if (this.f15971m && !this.f15970f.k()) {
                k10 = vc.l.k(d0.d().a(this.f15970f.i() / this.f15970f.l()), 0.0f, 1.0f);
                dVar.q(k10);
                dVar.k(k10);
            }
        }

        @Override // pc.l
        public /* bridge */ /* synthetic */ w invoke(androidx.compose.ui.graphics.d dVar) {
            a(dVar);
            return w.f13270a;
        }
    }

    public static final androidx.compose.ui.e a(androidx.compose.ui.e eVar, e eVar2, boolean z10) {
        l a10;
        q.i(eVar, "<this>");
        q.i(eVar2, "state");
        if (k1.c()) {
            a10 = new a(eVar2, z10);
        } else {
            a10 = k1.a();
        }
        return k1.b(eVar, a10, androidx.compose.ui.graphics.c.a(androidx.compose.ui.draw.b.d(androidx.compose.ui.e.f2335a, C0376b.f15969f), new c(eVar2, z10)));
    }
}
