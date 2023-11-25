package n1;

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: LayoutModifier.kt */
/* loaded from: classes.dex */
final class o0 {

    /* renamed from: a  reason: collision with root package name */
    public static final o0 f20023a = new o0();

    /* compiled from: LayoutModifier.kt */
    /* loaded from: classes.dex */
    private static final class a implements g0 {

        /* renamed from: f  reason: collision with root package name */
        private final m f20024f;

        /* renamed from: m  reason: collision with root package name */
        private final c f20025m;

        /* renamed from: p  reason: collision with root package name */
        private final d f20026p;

        public a(m mVar, c cVar, d dVar) {
            qc.q.i(mVar, "measurable");
            qc.q.i(cVar, "minMax");
            qc.q.i(dVar, "widthHeight");
            this.f20024f = mVar;
            this.f20025m = cVar;
            this.f20026p = dVar;
        }

        @Override // n1.m
        public Object A() {
            return this.f20024f.A();
        }

        @Override // n1.m
        public int a0(int i10) {
            return this.f20024f.a0(i10);
        }

        @Override // n1.m
        public int g(int i10) {
            return this.f20024f.g(i10);
        }

        @Override // n1.m
        public int s(int i10) {
            return this.f20024f.s(i10);
        }

        @Override // n1.m
        public int t(int i10) {
            return this.f20024f.t(i10);
        }

        @Override // n1.g0
        public y0 w(long j10) {
            int a02;
            int s10;
            if (this.f20026p == d.Width) {
                if (this.f20025m == c.Max) {
                    s10 = this.f20024f.t(j2.b.m(j10));
                } else {
                    s10 = this.f20024f.s(j2.b.m(j10));
                }
                return new b(s10, j2.b.m(j10));
            }
            if (this.f20025m == c.Max) {
                a02 = this.f20024f.g(j2.b.n(j10));
            } else {
                a02 = this.f20024f.a0(j2.b.n(j10));
            }
            return new b(j2.b.n(j10), a02);
        }
    }

    /* compiled from: LayoutModifier.kt */
    /* loaded from: classes.dex */
    private enum c {
        Min,
        Max
    }

    /* compiled from: LayoutModifier.kt */
    /* loaded from: classes.dex */
    private enum d {
        Width,
        Height
    }

    private o0() {
    }

    public final int a(z zVar, n nVar, m mVar, int i10) {
        qc.q.i(zVar, "modifier");
        qc.q.i(nVar, "intrinsicMeasureScope");
        qc.q.i(mVar, "intrinsicMeasurable");
        return zVar.d(new q(nVar, nVar.getLayoutDirection()), new a(mVar, c.Max, d.Height), j2.c.b(0, i10, 0, 0, 13, null)).getHeight();
    }

    public final int b(z zVar, n nVar, m mVar, int i10) {
        qc.q.i(zVar, "modifier");
        qc.q.i(nVar, "intrinsicMeasureScope");
        qc.q.i(mVar, "intrinsicMeasurable");
        return zVar.d(new q(nVar, nVar.getLayoutDirection()), new a(mVar, c.Max, d.Width), j2.c.b(0, 0, 0, i10, 7, null)).getWidth();
    }

    public final int c(z zVar, n nVar, m mVar, int i10) {
        qc.q.i(zVar, "modifier");
        qc.q.i(nVar, "intrinsicMeasureScope");
        qc.q.i(mVar, "intrinsicMeasurable");
        return zVar.d(new q(nVar, nVar.getLayoutDirection()), new a(mVar, c.Min, d.Height), j2.c.b(0, i10, 0, 0, 13, null)).getHeight();
    }

    public final int d(z zVar, n nVar, m mVar, int i10) {
        qc.q.i(zVar, "modifier");
        qc.q.i(nVar, "intrinsicMeasureScope");
        qc.q.i(mVar, "intrinsicMeasurable");
        return zVar.d(new q(nVar, nVar.getLayoutDirection()), new a(mVar, c.Min, d.Width), j2.c.b(0, 0, 0, i10, 7, null)).getWidth();
    }

    /* compiled from: LayoutModifier.kt */
    /* loaded from: classes.dex */
    private static final class b extends y0 {
        public b(int i10, int i11) {
            T0(j2.q.a(i10, i11));
        }

        @Override // n1.n0
        public int G(n1.a aVar) {
            qc.q.i(aVar, "alignmentLine");
            return RecyclerView.UNDEFINED_DURATION;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // n1.y0
        public void Q0(long j10, float f10, pc.l<? super androidx.compose.ui.graphics.d, dc.w> lVar) {
        }
    }
}
