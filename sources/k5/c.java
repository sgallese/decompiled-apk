package k5;

import android.location.Location;
import ec.u0;
import i5.e;
import java.util.Set;
import java.util.UUID;
import q5.g;
import qc.h;
import qc.q;
import r5.f;
import yc.v;

/* compiled from: AndroidContextPlugin.kt */
/* loaded from: classes.dex */
public final class c implements f {

    /* renamed from: q  reason: collision with root package name */
    public static final a f19349q = new a(null);

    /* renamed from: r  reason: collision with root package name */
    private static final Set<String> f19350r;

    /* renamed from: f  reason: collision with root package name */
    private final f.b f19351f = f.b.Before;

    /* renamed from: m  reason: collision with root package name */
    public p5.a f19352m;

    /* renamed from: p  reason: collision with root package name */
    private n5.a f19353p;

    /* compiled from: AndroidContextPlugin.kt */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(h hVar) {
            this();
        }

        public final boolean a(String str) {
            boolean z10;
            q.i(str, "deviceId");
            if (str.length() == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10 && !c.f19350r.contains(str)) {
                return true;
            }
            return false;
        }
    }

    static {
        Set<String> d10;
        d10 = u0.d("", "9774d56d682e549c", "unknown", "000000000000000", "Android", "DEFACE", "00000000-0000-0000-0000-000000000000");
        f19350r = d10;
    }

    private final void i(q5.a aVar) {
        g e10;
        q5.h k10;
        String j10;
        i5.b bVar = (i5.b) j().h();
        if (aVar.L() == null) {
            aVar.z0(Long.valueOf(System.currentTimeMillis()));
        }
        if (aVar.t() == null) {
            aVar.h0(UUID.randomUUID().toString());
        }
        if (aVar.w() == null) {
            aVar.k0("amplitude-analytics-android/1.6.1");
        }
        if (aVar.M() == null) {
            aVar.A0(j().o().d());
        }
        if (aVar.k() == null) {
            aVar.Y(j().o().b());
        }
        e x10 = bVar.x();
        if (bVar.s()) {
            x10.d(e.f17009b.a());
        }
        n5.a aVar2 = null;
        if (x10.s()) {
            n5.a aVar3 = this.f19353p;
            if (aVar3 == null) {
                q.z("contextProvider");
                aVar3 = null;
            }
            aVar.B0(aVar3.o());
        }
        if (x10.p()) {
            n5.a aVar4 = this.f19353p;
            if (aVar4 == null) {
                q.z("contextProvider");
                aVar4 = null;
            }
            aVar.n0(aVar4.m());
        }
        if (x10.q()) {
            n5.a aVar5 = this.f19353p;
            if (aVar5 == null) {
                q.z("contextProvider");
                aVar5 = null;
            }
            aVar.o0(aVar5.n());
        }
        if (x10.i()) {
            n5.a aVar6 = this.f19353p;
            if (aVar6 == null) {
                q.z("contextProvider");
                aVar6 = null;
            }
            aVar.X(aVar6.d());
        }
        if (x10.j()) {
            n5.a aVar7 = this.f19353p;
            if (aVar7 == null) {
                q.z("contextProvider");
                aVar7 = null;
            }
            aVar.Z(aVar7.j());
        }
        if (x10.k()) {
            n5.a aVar8 = this.f19353p;
            if (aVar8 == null) {
                q.z("contextProvider");
                aVar8 = null;
            }
            aVar.a0(aVar8.k());
        }
        if (x10.g()) {
            n5.a aVar9 = this.f19353p;
            if (aVar9 == null) {
                q.z("contextProvider");
                aVar9 = null;
            }
            aVar.U(aVar9.f());
        }
        if (x10.m() && aVar.u() == null) {
            aVar.i0("$remote");
        }
        if (x10.h() && aVar.u() != "$remote") {
            n5.a aVar10 = this.f19353p;
            if (aVar10 == null) {
                q.z("contextProvider");
                aVar10 = null;
            }
            aVar.W(aVar10.g());
        }
        if (x10.n()) {
            n5.a aVar11 = this.f19353p;
            if (aVar11 == null) {
                q.z("contextProvider");
                aVar11 = null;
            }
            aVar.j0(aVar11.i());
        }
        if (x10.r()) {
            aVar.r0("Android");
        }
        if (x10.o()) {
            n5.a aVar12 = this.f19353p;
            if (aVar12 == null) {
                q.z("contextProvider");
                aVar12 = null;
            }
            Location l10 = aVar12.l();
            if (l10 != null) {
                aVar.l0(Double.valueOf(l10.getLatitude()));
                aVar.m0(Double.valueOf(l10.getLongitude()));
            }
        }
        if (x10.e()) {
            n5.a aVar13 = this.f19353p;
            if (aVar13 == null) {
                q.z("contextProvider");
                aVar13 = null;
            }
            String b10 = aVar13.b();
            if (b10 != null) {
                aVar.O(b10);
            }
        }
        if (x10.f()) {
            n5.a aVar14 = this.f19353p;
            if (aVar14 == null) {
                q.z("contextProvider");
            } else {
                aVar2 = aVar14;
            }
            String c10 = aVar2.c();
            if (c10 != null) {
                aVar.Q(c10);
            }
        }
        if (aVar.B() == null && (j10 = j().h().j()) != null) {
            aVar.p0(j10);
        }
        if (aVar.C() == null && (k10 = j().h().k()) != null) {
            aVar.q0(k10.a());
        }
        if (aVar.s() == null && (e10 = j().h().e()) != null) {
            aVar.g0(e10.a());
        }
    }

    @Override // r5.f
    public q5.a a(q5.a aVar) {
        q.i(aVar, "event");
        i(aVar);
        return aVar;
    }

    @Override // r5.f
    public void b(p5.a aVar) {
        q.i(aVar, "amplitude");
        f.a.b(this, aVar);
        i5.b bVar = (i5.b) aVar.h();
        this.f19353p = new n5.a(bVar.r(), bVar.u());
        k(bVar);
    }

    @Override // r5.f
    public void c(p5.a aVar) {
        q.i(aVar, "<set-?>");
        this.f19352m = aVar;
    }

    @Override // r5.f
    public f.b getType() {
        return this.f19351f;
    }

    public p5.a j() {
        p5.a aVar = this.f19352m;
        if (aVar != null) {
            return aVar;
        }
        q.z("amplitude");
        return null;
    }

    public final void k(i5.b bVar) {
        boolean q10;
        q.i(bVar, "configuration");
        String b10 = j().o().b();
        n5.a aVar = null;
        if (b10 != null && f19349q.a(b10)) {
            q10 = v.q(b10, "S", false, 2, null);
            if (!q10) {
                return;
            }
        }
        if (!bVar.w() && bVar.z()) {
            n5.a aVar2 = this.f19353p;
            if (aVar2 == null) {
                q.z("contextProvider");
                aVar2 = null;
            }
            if (!aVar2.p()) {
                n5.a aVar3 = this.f19353p;
                if (aVar3 == null) {
                    q.z("contextProvider");
                    aVar3 = null;
                }
                String b11 = aVar3.b();
                if (b11 != null && f19349q.a(b11)) {
                    j().w(b11);
                    return;
                }
            }
        }
        if (bVar.A()) {
            n5.a aVar4 = this.f19353p;
            if (aVar4 == null) {
                q.z("contextProvider");
            } else {
                aVar = aVar4;
            }
            String c10 = aVar.c();
            if (c10 != null && f19349q.a(c10)) {
                j().w(q.q(c10, "S"));
                return;
            }
        }
        j().w(q.q(n5.a.f20246d.a(), "R"));
    }
}
