package t;

/* compiled from: ProgressSemantics.kt */
/* loaded from: classes.dex */
public final class o0 {

    /* compiled from: ProgressSemantics.kt */
    /* loaded from: classes.dex */
    public static final class a extends qc.r implements pc.l<t1.x, dc.w> {

        /* renamed from: f */
        final /* synthetic */ float f23194f;

        /* renamed from: m */
        final /* synthetic */ vc.b<Float> f23195m;

        /* renamed from: p */
        final /* synthetic */ int f23196p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(float f10, vc.b<Float> bVar, int i10) {
            super(1);
            this.f23194f = f10;
            this.f23195m = bVar;
            this.f23196p = i10;
        }

        public final void a(t1.x xVar) {
            Comparable o10;
            qc.q.i(xVar, "$this$semantics");
            o10 = vc.l.o(Float.valueOf(this.f23194f), this.f23195m);
            t1.v.Q(xVar, new t1.h(((Number) o10).floatValue(), this.f23195m, this.f23196p));
        }

        @Override // pc.l
        public /* bridge */ /* synthetic */ dc.w invoke(t1.x xVar) {
            a(xVar);
            return dc.w.f13270a;
        }
    }

    /* compiled from: ProgressSemantics.kt */
    /* loaded from: classes.dex */
    public static final class b extends qc.r implements pc.l<t1.x, dc.w> {

        /* renamed from: f */
        public static final b f23197f = new b();

        b() {
            super(1);
        }

        public final void a(t1.x xVar) {
            qc.q.i(xVar, "$this$semantics");
            t1.v.Q(xVar, t1.h.f23420d.a());
        }

        @Override // pc.l
        public /* bridge */ /* synthetic */ dc.w invoke(t1.x xVar) {
            a(xVar);
            return dc.w.f13270a;
        }
    }

    public static final androidx.compose.ui.e a(androidx.compose.ui.e eVar) {
        qc.q.i(eVar, "<this>");
        return t1.o.b(eVar, true, b.f23197f);
    }

    public static final androidx.compose.ui.e b(androidx.compose.ui.e eVar, float f10, vc.b<Float> bVar, int i10) {
        qc.q.i(eVar, "<this>");
        qc.q.i(bVar, "valueRange");
        return t1.o.b(eVar, true, new a(f10, bVar, i10));
    }

    public static /* synthetic */ androidx.compose.ui.e c(androidx.compose.ui.e eVar, float f10, vc.b bVar, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            bVar = vc.k.b(0.0f, 1.0f);
        }
        if ((i11 & 4) != 0) {
            i10 = 0;
        }
        return b(eVar, f10, bVar, i10);
    }
}
