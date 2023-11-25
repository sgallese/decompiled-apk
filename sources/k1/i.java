package k1;

import androidx.compose.ui.e;
import java.util.List;

/* compiled from: HitPathTracker.kt */
/* loaded from: classes.dex */
public final class i {

    /* renamed from: a  reason: collision with root package name */
    private final n1.s f19192a;

    /* renamed from: b  reason: collision with root package name */
    private final p f19193b;

    public i(n1.s sVar) {
        qc.q.i(sVar, "rootCoordinates");
        this.f19192a = sVar;
        this.f19193b = new p();
    }

    public final void a(long j10, List<? extends e.c> list) {
        o oVar;
        qc.q.i(list, "pointerInputNodes");
        p pVar = this.f19193b;
        int size = list.size();
        boolean z10 = true;
        for (int i10 = 0; i10 < size; i10++) {
            e.c cVar = list.get(i10);
            if (z10) {
                k0.f<o> g10 = pVar.g();
                int o10 = g10.o();
                if (o10 > 0) {
                    o[] n10 = g10.n();
                    int i11 = 0;
                    do {
                        oVar = n10[i11];
                        if (qc.q.d(oVar.j(), cVar)) {
                            break;
                        }
                        i11++;
                    } while (i11 < o10);
                }
                oVar = null;
                o oVar2 = oVar;
                if (oVar2 != null) {
                    oVar2.m();
                    if (!oVar2.k().j(b0.a(j10))) {
                        oVar2.k().d(b0.a(j10));
                    }
                    pVar = oVar2;
                } else {
                    z10 = false;
                }
            }
            o oVar3 = new o(cVar);
            oVar3.k().d(b0.a(j10));
            pVar.g().d(oVar3);
            pVar = oVar3;
        }
    }

    public final boolean b(j jVar, boolean z10) {
        qc.q.i(jVar, "internalPointerEvent");
        if (!this.f19193b.a(jVar.a(), this.f19192a, jVar, z10)) {
            return false;
        }
        boolean f10 = this.f19193b.f(jVar.a(), this.f19192a, jVar, z10);
        if (!this.f19193b.e(jVar) && !f10) {
            return false;
        }
        return true;
    }

    public final void c() {
        this.f19193b.d();
        this.f19193b.c();
    }

    public final void d() {
        this.f19193b.h();
    }
}
