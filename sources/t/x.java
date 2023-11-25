package t;

import androidx.compose.ui.platform.k1;
import androidx.compose.ui.platform.m1;
import j0.v1;

/* compiled from: Indication.kt */
/* loaded from: classes.dex */
public final class x {

    /* renamed from: a  reason: collision with root package name */
    private static final v1<v> f23218a = j0.u.d(a.f23219f);

    /* compiled from: Indication.kt */
    /* loaded from: classes.dex */
    static final class a extends qc.r implements pc.a<v> {

        /* renamed from: f  reason: collision with root package name */
        public static final a f23219f = new a();

        a() {
            super(0);
        }

        @Override // pc.a
        /* renamed from: a  reason: merged with bridge method [inline-methods] */
        public final v invoke() {
            return p.f23198a;
        }
    }

    /* compiled from: InspectableValue.kt */
    /* loaded from: classes.dex */
    public static final class b extends qc.r implements pc.l<m1, dc.w> {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ v f23220f;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ v.k f23221m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(v vVar, v.k kVar) {
            super(1);
            this.f23220f = vVar;
            this.f23221m = kVar;
        }

        public final void a(m1 m1Var) {
            qc.q.i(m1Var, "$this$null");
            m1Var.b("indication");
            m1Var.a().c("indication", this.f23220f);
            m1Var.a().c("interactionSource", this.f23221m);
        }

        @Override // pc.l
        public /* bridge */ /* synthetic */ dc.w invoke(m1 m1Var) {
            a(m1Var);
            return dc.w.f13270a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Indication.kt */
    /* loaded from: classes.dex */
    public static final class c extends qc.r implements pc.q<androidx.compose.ui.e, j0.l, Integer, androidx.compose.ui.e> {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ v f23222f;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ v.k f23223m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(v vVar, v.k kVar) {
            super(3);
            this.f23222f = vVar;
            this.f23223m = kVar;
        }

        public final androidx.compose.ui.e a(androidx.compose.ui.e eVar, j0.l lVar, int i10) {
            qc.q.i(eVar, "$this$composed");
            lVar.e(-353972293);
            if (j0.n.K()) {
                j0.n.V(-353972293, i10, -1, "androidx.compose.foundation.indication.<anonymous> (Indication.kt:107)");
            }
            v vVar = this.f23222f;
            if (vVar == null) {
                vVar = e0.f23154a;
            }
            w a10 = vVar.a(this.f23223m, lVar, 0);
            lVar.e(1157296644);
            boolean Q = lVar.Q(a10);
            Object f10 = lVar.f();
            if (Q || f10 == j0.l.f18688a.a()) {
                f10 = new y(a10);
                lVar.J(f10);
            }
            lVar.N();
            y yVar = (y) f10;
            if (j0.n.K()) {
                j0.n.U();
            }
            lVar.N();
            return yVar;
        }

        @Override // pc.q
        public /* bridge */ /* synthetic */ androidx.compose.ui.e invoke(androidx.compose.ui.e eVar, j0.l lVar, Integer num) {
            return a(eVar, lVar, num.intValue());
        }
    }

    public static final v1<v> a() {
        return f23218a;
    }

    public static final androidx.compose.ui.e b(androidx.compose.ui.e eVar, v.k kVar, v vVar) {
        pc.l a10;
        qc.q.i(eVar, "<this>");
        qc.q.i(kVar, "interactionSource");
        if (k1.c()) {
            a10 = new b(vVar, kVar);
        } else {
            a10 = k1.a();
        }
        return androidx.compose.ui.c.a(eVar, a10, new c(vVar, kVar));
    }
}
