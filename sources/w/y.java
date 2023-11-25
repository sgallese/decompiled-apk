package w;

import n1.i0;
import v0.b;
import w.a;

/* compiled from: Row.kt */
/* loaded from: classes.dex */
public final class y {

    /* renamed from: a  reason: collision with root package name */
    private static final i0 f25248a;

    /* compiled from: Row.kt */
    /* loaded from: classes.dex */
    static final class a extends qc.r implements pc.s<Integer, int[], j2.r, j2.e, int[], dc.w> {

        /* renamed from: f  reason: collision with root package name */
        public static final a f25249f = new a();

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
            qc.q.i(rVar, "layoutDirection");
            qc.q.i(eVar, "density");
            qc.q.i(iArr2, "outPosition");
            w.a.f25135a.e().b(eVar, i10, iArr, rVar, iArr2);
        }
    }

    /* compiled from: Row.kt */
    /* loaded from: classes.dex */
    static final class b extends qc.r implements pc.s<Integer, int[], j2.r, j2.e, int[], dc.w> {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ a.d f25250f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(a.d dVar) {
            super(5);
            this.f25250f = dVar;
        }

        @Override // pc.s
        public /* bridge */ /* synthetic */ dc.w D0(Integer num, int[] iArr, j2.r rVar, j2.e eVar, int[] iArr2) {
            a(num.intValue(), iArr, rVar, eVar, iArr2);
            return dc.w.f13270a;
        }

        public final void a(int i10, int[] iArr, j2.r rVar, j2.e eVar, int[] iArr2) {
            qc.q.i(iArr, "size");
            qc.q.i(rVar, "layoutDirection");
            qc.q.i(eVar, "density");
            qc.q.i(iArr2, "outPosition");
            this.f25250f.b(eVar, i10, iArr, rVar, iArr2);
        }
    }

    static {
        p pVar = p.Horizontal;
        float a10 = w.a.f25135a.e().a();
        l b10 = l.f25177a.b(v0.b.f24258a.k());
        f25248a = u.r(pVar, a.f25249f, a10, c0.Wrap, b10);
    }

    public static final i0 a(a.d dVar, b.c cVar, j0.l lVar, int i10) {
        i0 i0Var;
        qc.q.i(dVar, "horizontalArrangement");
        qc.q.i(cVar, "verticalAlignment");
        lVar.e(-837807694);
        if (j0.n.K()) {
            j0.n.V(-837807694, i10, -1, "androidx.compose.foundation.layout.rowMeasurePolicy (Row.kt:100)");
        }
        if (qc.q.d(dVar, w.a.f25135a.e()) && qc.q.d(cVar, v0.b.f24258a.k())) {
            i0Var = f25248a;
        } else {
            lVar.e(511388516);
            boolean Q = lVar.Q(dVar) | lVar.Q(cVar);
            Object f10 = lVar.f();
            if (Q || f10 == j0.l.f18688a.a()) {
                p pVar = p.Horizontal;
                float a10 = dVar.a();
                l b10 = l.f25177a.b(cVar);
                f10 = u.r(pVar, new b(dVar), a10, c0.Wrap, b10);
                lVar.J(f10);
            }
            lVar.N();
            i0Var = (i0) f10;
        }
        if (j0.n.K()) {
            j0.n.U();
        }
        lVar.N();
        return i0Var;
    }
}
