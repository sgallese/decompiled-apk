package p1;

import androidx.recyclerview.widget.RecyclerView;
import java.util.LinkedHashMap;
import java.util.Map;
import n1.y0;
import p1.o0;

/* compiled from: LookaheadDelegate.kt */
/* loaded from: classes.dex */
public abstract class s0 extends r0 implements n1.g0 {

    /* renamed from: u */
    private final x0 f20919u;

    /* renamed from: v */
    private long f20920v;

    /* renamed from: w */
    private Map<n1.a, Integer> f20921w;

    /* renamed from: x */
    private final n1.c0 f20922x;

    /* renamed from: y */
    private n1.j0 f20923y;

    /* renamed from: z */
    private final Map<n1.a, Integer> f20924z;

    public s0(x0 x0Var) {
        qc.q.i(x0Var, "coordinator");
        this.f20919u = x0Var;
        this.f20920v = j2.l.f18992b.a();
        this.f20922x = new n1.c0(this);
        this.f20924z = new LinkedHashMap();
    }

    public static final /* synthetic */ void p1(s0 s0Var, long j10) {
        s0Var.U0(j10);
    }

    public static final /* synthetic */ void q1(s0 s0Var, n1.j0 j0Var) {
        s0Var.z1(j0Var);
    }

    public final void z1(n1.j0 j0Var) {
        dc.w wVar;
        boolean z10;
        if (j0Var != null) {
            T0(j2.q.a(j0Var.getWidth(), j0Var.getHeight()));
            wVar = dc.w.f13270a;
        } else {
            wVar = null;
        }
        if (wVar == null) {
            T0(j2.p.f19001b.a());
        }
        if (!qc.q.d(this.f20923y, j0Var) && j0Var != null) {
            Map<n1.a, Integer> map = this.f20921w;
            if (map != null && !map.isEmpty()) {
                z10 = false;
            } else {
                z10 = true;
            }
            if ((!z10 || (!j0Var.d().isEmpty()) != false) && !qc.q.d(j0Var.d(), this.f20921w)) {
                r1().d().m();
                Map map2 = this.f20921w;
                if (map2 == null) {
                    map2 = new LinkedHashMap();
                    this.f20921w = map2;
                }
                map2.clear();
                map2.putAll(j0Var.d());
            }
        }
        this.f20923y = j0Var;
    }

    @Override // n1.y0, n1.m
    public Object A() {
        return this.f20919u.A();
    }

    @Override // n1.y0
    public final void Q0(long j10, float f10, pc.l<? super androidx.compose.ui.graphics.d, dc.w> lVar) {
        if (!j2.l.i(i1(), j10)) {
            y1(j10);
            o0.a C = f1().T().C();
            if (C != null) {
                C.o1();
            }
            j1(this.f20919u);
        }
        if (l1()) {
            return;
        }
        w1();
    }

    @Override // p1.r0
    public r0 Z0() {
        x0 U1 = this.f20919u.U1();
        if (U1 != null) {
            return U1.P1();
        }
        return null;
    }

    public abstract int a0(int i10);

    @Override // p1.r0
    public n1.s b1() {
        return this.f20922x;
    }

    @Override // p1.r0
    public boolean e1() {
        if (this.f20923y != null) {
            return true;
        }
        return false;
    }

    @Override // p1.r0
    public j0 f1() {
        return this.f20919u.f1();
    }

    public abstract int g(int i10);

    @Override // p1.r0
    public n1.j0 g1() {
        n1.j0 j0Var = this.f20923y;
        if (j0Var != null) {
            return j0Var;
        }
        throw new IllegalStateException("LookaheadDelegate has not been measured yet when measureResult is requested.".toString());
    }

    @Override // j2.e
    public float getDensity() {
        return this.f20919u.getDensity();
    }

    @Override // n1.n
    public j2.r getLayoutDirection() {
        return this.f20919u.getLayoutDirection();
    }

    @Override // p1.r0
    public r0 h1() {
        x0 V1 = this.f20919u.V1();
        if (V1 != null) {
            return V1.P1();
        }
        return null;
    }

    @Override // p1.r0
    public long i1() {
        return this.f20920v;
    }

    @Override // p1.r0
    public void m1() {
        Q0(i1(), 0.0f, null);
    }

    @Override // j2.e
    public float p0() {
        return this.f20919u.p0();
    }

    public b r1() {
        b z10 = this.f20919u.f1().T().z();
        qc.q.f(z10);
        return z10;
    }

    public abstract int s(int i10);

    public final int s1(n1.a aVar) {
        qc.q.i(aVar, "alignmentLine");
        Integer num = this.f20924z.get(aVar);
        if (num != null) {
            return num.intValue();
        }
        return RecyclerView.UNDEFINED_DURATION;
    }

    public abstract int t(int i10);

    public final Map<n1.a, Integer> t1() {
        return this.f20924z;
    }

    public final x0 u1() {
        return this.f20919u;
    }

    public final n1.c0 v1() {
        return this.f20922x;
    }

    protected void w1() {
        n1.s sVar;
        int l10;
        j2.r k10;
        o0 o0Var;
        boolean D;
        y0.a.C0453a c0453a = y0.a.f20041a;
        int width = g1().getWidth();
        j2.r layoutDirection = this.f20919u.getLayoutDirection();
        sVar = y0.a.f20044d;
        l10 = c0453a.l();
        k10 = c0453a.k();
        o0Var = y0.a.f20045e;
        y0.a.f20043c = width;
        y0.a.f20042b = layoutDirection;
        D = c0453a.D(this);
        g1().e();
        n1(D);
        y0.a.f20043c = l10;
        y0.a.f20042b = k10;
        y0.a.f20044d = sVar;
        y0.a.f20045e = o0Var;
    }

    public final long x1(s0 s0Var) {
        qc.q.i(s0Var, "ancestor");
        long a10 = j2.l.f18992b.a();
        s0 s0Var2 = this;
        while (!qc.q.d(s0Var2, s0Var)) {
            long i12 = s0Var2.i1();
            a10 = j2.m.a(j2.l.j(a10) + j2.l.j(i12), j2.l.k(a10) + j2.l.k(i12));
            x0 V1 = s0Var2.f20919u.V1();
            qc.q.f(V1);
            s0Var2 = V1.P1();
            qc.q.f(s0Var2);
        }
        return a10;
    }

    public void y1(long j10) {
        this.f20920v = j10;
    }
}
