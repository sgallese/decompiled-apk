package t;

import a1.p1;
import j0.g3;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Indication.kt */
/* loaded from: classes.dex */
public final class p implements v {

    /* renamed from: a  reason: collision with root package name */
    public static final p f23198a = new p();

    /* compiled from: Indication.kt */
    /* loaded from: classes.dex */
    private static final class a implements w {

        /* renamed from: f  reason: collision with root package name */
        private final g3<Boolean> f23199f;

        /* renamed from: m  reason: collision with root package name */
        private final g3<Boolean> f23200m;

        /* renamed from: p  reason: collision with root package name */
        private final g3<Boolean> f23201p;

        public a(g3<Boolean> g3Var, g3<Boolean> g3Var2, g3<Boolean> g3Var3) {
            qc.q.i(g3Var, "isPressed");
            qc.q.i(g3Var2, "isHovered");
            qc.q.i(g3Var3, "isFocused");
            this.f23199f = g3Var;
            this.f23200m = g3Var2;
            this.f23201p = g3Var3;
        }

        @Override // t.w
        public void a(c1.c cVar) {
            qc.q.i(cVar, "<this>");
            cVar.d1();
            if (this.f23199f.getValue().booleanValue()) {
                c1.e.m(cVar, p1.o(p1.f146b.a(), 0.3f, 0.0f, 0.0f, 0.0f, 14, null), 0L, cVar.b(), 0.0f, null, null, 0, 122, null);
            } else if (this.f23200m.getValue().booleanValue() || this.f23201p.getValue().booleanValue()) {
                c1.e.m(cVar, p1.o(p1.f146b.a(), 0.1f, 0.0f, 0.0f, 0.0f, 14, null), 0L, cVar.b(), 0.0f, null, null, 0, 122, null);
            }
        }
    }

    private p() {
    }

    @Override // t.v
    public w a(v.k kVar, j0.l lVar, int i10) {
        qc.q.i(kVar, "interactionSource");
        lVar.e(1683566979);
        if (j0.n.K()) {
            j0.n.V(1683566979, i10, -1, "androidx.compose.foundation.DefaultDebugIndication.rememberUpdatedInstance (Indication.kt:166)");
        }
        int i11 = i10 & 14;
        g3<Boolean> a10 = v.r.a(kVar, lVar, i11);
        g3<Boolean> a11 = v.i.a(kVar, lVar, i11);
        g3<Boolean> a12 = v.f.a(kVar, lVar, i11);
        lVar.e(1157296644);
        boolean Q = lVar.Q(kVar);
        Object f10 = lVar.f();
        if (Q || f10 == j0.l.f18688a.a()) {
            f10 = new a(a10, a11, a12);
            lVar.J(f10);
        }
        lVar.N();
        a aVar = (a) f10;
        if (j0.n.K()) {
            j0.n.U();
        }
        lVar.N();
        return aVar;
    }
}
