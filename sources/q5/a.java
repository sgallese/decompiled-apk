package q5;

import java.util.Map;
import qc.q;

/* compiled from: BaseEvent.kt */
/* loaded from: classes.dex */
public class a extends b {
    public String O;
    private Map<String, Object> P;
    private Map<String, Object> Q;
    private Map<String, Object> R;
    private Map<String, Object> S;

    public final Map<String, Object> C0() {
        return this.P;
    }

    public String D0() {
        String str = this.O;
        if (str != null) {
            return str;
        }
        q.z("eventType");
        return null;
    }

    public final Map<String, Object> E0() {
        return this.S;
    }

    public final Map<String, Object> F0() {
        return this.R;
    }

    public final Map<String, Object> G0() {
        return this.Q;
    }

    public boolean H0() {
        if (M() == null && k() == null) {
            return false;
        }
        return true;
    }

    public final void I0(b bVar) {
        q.i(bVar, "options");
        if (M() == null) {
            A0(bVar.M());
        }
        if (k() == null) {
            Y(bVar.k());
        }
        if (L() == null) {
            z0(bVar.L());
        }
        if (o() == null) {
            c0(bVar.o());
        }
        if (t() == null) {
            h0(bVar.t());
        }
        if (x() == null) {
            l0(bVar.x());
        }
        if (y() == null) {
            m0(bVar.y());
        }
        if (d() == null) {
            R(bVar.d());
        }
        if (N() == null) {
            B0(bVar.N());
        }
        if (D() == null) {
            r0(bVar.D());
        }
        if (z() == null) {
            n0(bVar.z());
        }
        if (A() == null) {
            o0(bVar.A());
        }
        if (j() == null) {
            X(bVar.j());
        }
        if (l() == null) {
            Z(bVar.l());
        }
        if (m() == null) {
            a0(bVar.m());
        }
        if (g() == null) {
            U(bVar.g());
        }
        if (i() == null) {
            W(bVar.i());
        }
        if (H() == null) {
            v0(bVar.H());
        }
        if (h() == null) {
            V(bVar.h());
        }
        if (n() == null) {
            b0(bVar.n());
        }
        if (q() == null) {
            e0(bVar.q());
        }
        if (r() == null) {
            f0(bVar.r());
        }
        if (a() == null) {
            O(bVar.a());
        }
        if (c() == null) {
            Q(bVar.c());
        }
        if (b() == null) {
            P(bVar.b());
        }
        if (v() == null) {
            j0(bVar.v());
        }
        if (w() == null) {
            k0(bVar.w());
        }
        if (u() == null) {
            i0(bVar.u());
        }
        if (C() == null) {
            q0(bVar.C());
        }
        if (s() == null) {
            g0(bVar.s());
        }
        if (I() == null) {
            w0(bVar.I());
        }
        if (E() == null) {
            s0(bVar.E());
        }
        if (G() == null) {
            u0(bVar.G());
        }
        if (F() == null) {
            t0(bVar.F());
        }
        if (J() == null) {
            x0(bVar.J());
        }
        if (p() == null) {
            d0(bVar.p());
        }
        if (f() == null) {
            T(bVar.f());
        }
        if (B() == null) {
            p0(bVar.B());
        }
        if (K() < 0) {
            y0(bVar.K());
        }
    }

    public final void J0(Map<String, Object> map) {
        this.P = map;
    }

    public void K0(String str) {
        q.i(str, "<set-?>");
        this.O = str;
    }

    public final void L0(Map<String, Object> map) {
        this.S = map;
    }

    public final void M0(Map<String, Object> map) {
        this.R = map;
    }

    public final void N0(Map<String, Object> map) {
        this.Q = map;
    }
}
