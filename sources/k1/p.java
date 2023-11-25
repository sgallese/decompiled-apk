package k1;

import java.util.Map;

/* compiled from: HitPathTracker.kt */
/* loaded from: classes.dex */
public class p {

    /* renamed from: a  reason: collision with root package name */
    private final k0.f<o> f19224a = new k0.f<>(new o[16], 0);

    public boolean a(Map<b0, c0> map, n1.s sVar, j jVar, boolean z10) {
        qc.q.i(map, "changes");
        qc.q.i(sVar, "parentCoordinates");
        qc.q.i(jVar, "internalPointerEvent");
        k0.f<o> fVar = this.f19224a;
        int o10 = fVar.o();
        if (o10 <= 0) {
            return false;
        }
        o[] n10 = fVar.n();
        int i10 = 0;
        boolean z11 = false;
        do {
            if (!n10[i10].a(map, sVar, jVar, z10) && !z11) {
                z11 = false;
            } else {
                z11 = true;
            }
            i10++;
        } while (i10 < o10);
        return z11;
    }

    public void b(j jVar) {
        qc.q.i(jVar, "internalPointerEvent");
        int o10 = this.f19224a.o();
        while (true) {
            o10--;
            if (-1 < o10) {
                if (this.f19224a.n()[o10].k().r()) {
                    this.f19224a.x(o10);
                }
            } else {
                return;
            }
        }
    }

    public final void c() {
        this.f19224a.i();
    }

    public void d() {
        k0.f<o> fVar = this.f19224a;
        int o10 = fVar.o();
        if (o10 > 0) {
            o[] n10 = fVar.n();
            int i10 = 0;
            do {
                n10[i10].d();
                i10++;
            } while (i10 < o10);
        }
    }

    public boolean e(j jVar) {
        qc.q.i(jVar, "internalPointerEvent");
        k0.f<o> fVar = this.f19224a;
        int o10 = fVar.o();
        boolean z10 = false;
        if (o10 > 0) {
            o[] n10 = fVar.n();
            int i10 = 0;
            boolean z11 = false;
            do {
                if (!n10[i10].e(jVar) && !z11) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                i10++;
            } while (i10 < o10);
            z10 = z11;
        }
        b(jVar);
        return z10;
    }

    public boolean f(Map<b0, c0> map, n1.s sVar, j jVar, boolean z10) {
        qc.q.i(map, "changes");
        qc.q.i(sVar, "parentCoordinates");
        qc.q.i(jVar, "internalPointerEvent");
        k0.f<o> fVar = this.f19224a;
        int o10 = fVar.o();
        if (o10 <= 0) {
            return false;
        }
        o[] n10 = fVar.n();
        int i10 = 0;
        boolean z11 = false;
        do {
            if (!n10[i10].f(map, sVar, jVar, z10) && !z11) {
                z11 = false;
            } else {
                z11 = true;
            }
            i10++;
        } while (i10 < o10);
        return z11;
    }

    public final k0.f<o> g() {
        return this.f19224a;
    }

    public final void h() {
        int i10 = 0;
        while (i10 < this.f19224a.o()) {
            o oVar = this.f19224a.n()[i10];
            if (!oVar.j().p1()) {
                this.f19224a.x(i10);
                oVar.d();
            } else {
                i10++;
                oVar.h();
            }
        }
    }
}
