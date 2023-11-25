package n1;

import java.util.Map;
import n1.y0;

/* compiled from: MeasureScope.kt */
/* loaded from: classes.dex */
public final /* synthetic */ class k0 {

    /* compiled from: MeasureScope.kt */
    /* loaded from: classes.dex */
    public static final class a implements j0 {

        /* renamed from: a */
        private final int f20010a;

        /* renamed from: b */
        private final int f20011b;

        /* renamed from: c */
        private final Map<n1.a, Integer> f20012c;

        /* renamed from: d */
        final /* synthetic */ int f20013d;

        /* renamed from: e */
        final /* synthetic */ l0 f20014e;

        /* renamed from: f */
        final /* synthetic */ pc.l<y0.a, dc.w> f20015f;

        /* JADX WARN: Multi-variable type inference failed */
        a(int i10, int i11, Map<n1.a, Integer> map, l0 l0Var, pc.l<? super y0.a, dc.w> lVar) {
            this.f20013d = i10;
            this.f20014e = l0Var;
            this.f20015f = lVar;
            this.f20010a = i10;
            this.f20011b = i11;
            this.f20012c = map;
        }

        @Override // n1.j0
        public Map<n1.a, Integer> d() {
            return this.f20012c;
        }

        @Override // n1.j0
        public void e() {
            p1.r0 r0Var;
            s sVar;
            int l10;
            j2.r k10;
            p1.o0 o0Var;
            boolean D;
            y0.a.C0453a c0453a = y0.a.f20041a;
            int i10 = this.f20013d;
            j2.r layoutDirection = this.f20014e.getLayoutDirection();
            l0 l0Var = this.f20014e;
            if (l0Var instanceof p1.r0) {
                r0Var = (p1.r0) l0Var;
            } else {
                r0Var = null;
            }
            pc.l<y0.a, dc.w> lVar = this.f20015f;
            sVar = y0.a.f20044d;
            l10 = c0453a.l();
            k10 = c0453a.k();
            o0Var = y0.a.f20045e;
            y0.a.f20043c = i10;
            y0.a.f20042b = layoutDirection;
            D = c0453a.D(r0Var);
            lVar.invoke(c0453a);
            if (r0Var != null) {
                r0Var.n1(D);
            }
            y0.a.f20043c = l10;
            y0.a.f20042b = k10;
            y0.a.f20044d = sVar;
            y0.a.f20045e = o0Var;
        }

        @Override // n1.j0
        public int getHeight() {
            return this.f20011b;
        }

        @Override // n1.j0
        public int getWidth() {
            return this.f20010a;
        }
    }

    public static j0 a(l0 l0Var, int i10, int i11, Map map, pc.l lVar) {
        qc.q.i(map, "alignmentLines");
        qc.q.i(lVar, "placementBlock");
        return new a(i10, i11, map, l0Var, lVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ j0 b(l0 l0Var, int i10, int i11, Map map, pc.l lVar, int i12, Object obj) {
        if (obj == null) {
            if ((i12 & 4) != 0) {
                map = ec.n0.h();
            }
            return l0Var.e0(i10, i11, map, lVar);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: layout");
    }
}
