package n1;

import j0.i2;
import j0.l3;
import p1.g;

/* compiled from: Layout.kt */
/* loaded from: classes.dex */
public final class x {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Layout.kt */
    /* loaded from: classes.dex */
    public static final class a extends qc.r implements pc.q<i2<p1.g>, j0.l, Integer, dc.w> {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.e f20033f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(androidx.compose.ui.e eVar) {
            super(3);
            this.f20033f = eVar;
        }

        public final void a(j0.l lVar, j0.l lVar2, int i10) {
            qc.q.i(lVar, "$this$null");
            if (j0.n.K()) {
                j0.n.V(-1586257396, i10, -1, "androidx.compose.ui.layout.materializerOf.<anonymous> (Layout.kt:201)");
            }
            int a10 = j0.j.a(lVar2, 0);
            androidx.compose.ui.e d10 = androidx.compose.ui.c.d(lVar2, this.f20033f);
            lVar.e(509942095);
            j0.l a11 = l3.a(lVar);
            g.a aVar = p1.g.f20790l;
            l3.b(a11, d10, aVar.f());
            pc.p<p1.g, Integer, dc.w> b10 = aVar.b();
            if (a11.n() || !qc.q.d(a11.f(), Integer.valueOf(a10))) {
                a11.J(Integer.valueOf(a10));
                a11.I(Integer.valueOf(a10), b10);
            }
            lVar.N();
            if (j0.n.K()) {
                j0.n.U();
            }
        }

        @Override // pc.q
        public /* bridge */ /* synthetic */ dc.w invoke(i2<p1.g> i2Var, j0.l lVar, Integer num) {
            a(i2Var.f(), lVar, num.intValue());
            return dc.w.f13270a;
        }
    }

    public static final pc.q<i2<p1.g>, j0.l, Integer, dc.w> a(androidx.compose.ui.e eVar) {
        qc.q.i(eVar, "modifier");
        return q0.c.c(-1586257396, true, new a(eVar));
    }
}
