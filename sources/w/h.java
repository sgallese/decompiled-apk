package w;

import n1.i0;
import v0.b;
import w.a;

/* compiled from: Column.kt */
/* loaded from: classes.dex */
public final class h {

    /* renamed from: a  reason: collision with root package name */
    private static final i0 f25173a;

    /* compiled from: Column.kt */
    /* loaded from: classes.dex */
    static final class a extends qc.r implements pc.s<Integer, int[], j2.r, j2.e, int[], dc.w> {

        /* renamed from: f  reason: collision with root package name */
        public static final a f25174f = new a();

        a() {
            super(5);
        }

        @Override // pc.s
        public /* bridge */ /* synthetic */ dc.w D0(Integer num, int[] iArr, j2.r rVar, j2.e eVar, int[] iArr2) {
            a(num.intValue(), iArr, rVar, eVar, iArr2);
            return dc.w.f13270a;
        }

        public final void a(int i10, int[] iArr, j2.r rVar, j2.e eVar, int[] iArr2) {
            qc.q.i(iArr, "size");
            qc.q.i(rVar, "<anonymous parameter 2>");
            qc.q.i(eVar, "density");
            qc.q.i(iArr2, "outPosition");
            w.a.f25135a.f().c(eVar, i10, iArr, iArr2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Column.kt */
    /* loaded from: classes.dex */
    public static final class b extends qc.r implements pc.s<Integer, int[], j2.r, j2.e, int[], dc.w> {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ a.l f25175f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(a.l lVar) {
            super(5);
            this.f25175f = lVar;
        }

        @Override // pc.s
        public /* bridge */ /* synthetic */ dc.w D0(Integer num, int[] iArr, j2.r rVar, j2.e eVar, int[] iArr2) {
            a(num.intValue(), iArr, rVar, eVar, iArr2);
            return dc.w.f13270a;
        }

        public final void a(int i10, int[] iArr, j2.r rVar, j2.e eVar, int[] iArr2) {
            qc.q.i(iArr, "size");
            qc.q.i(rVar, "<anonymous parameter 2>");
            qc.q.i(eVar, "density");
            qc.q.i(iArr2, "outPosition");
            this.f25175f.c(eVar, i10, iArr, iArr2);
        }
    }

    static {
        p pVar = p.Vertical;
        float a10 = w.a.f25135a.f().a();
        l a11 = l.f25177a.a(v0.b.f24258a.j());
        f25173a = u.r(pVar, a.f25174f, a10, c0.Wrap, a11);
    }

    public static final i0 a(a.l lVar, b.InterfaceC0571b interfaceC0571b, j0.l lVar2, int i10) {
        i0 i0Var;
        qc.q.i(lVar, "verticalArrangement");
        qc.q.i(interfaceC0571b, "horizontalAlignment");
        lVar2.e(1089876336);
        if (j0.n.K()) {
            j0.n.V(1089876336, i10, -1, "androidx.compose.foundation.layout.columnMeasurePolicy (Column.kt:96)");
        }
        if (qc.q.d(lVar, w.a.f25135a.f()) && qc.q.d(interfaceC0571b, v0.b.f24258a.j())) {
            i0Var = f25173a;
        } else {
            lVar2.e(511388516);
            boolean Q = lVar2.Q(lVar) | lVar2.Q(interfaceC0571b);
            Object f10 = lVar2.f();
            if (Q || f10 == j0.l.f18688a.a()) {
                p pVar = p.Vertical;
                float a10 = lVar.a();
                l a11 = l.f25177a.a(interfaceC0571b);
                f10 = u.r(pVar, new b(lVar), a10, c0.Wrap, a11);
                lVar2.J(f10);
            }
            lVar2.N();
            i0Var = (i0) f10;
        }
        if (j0.n.K()) {
            j0.n.U();
        }
        lVar2.N();
        return i0Var;
    }
}
