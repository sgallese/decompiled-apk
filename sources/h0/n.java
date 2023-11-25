package h0;

import a1.p1;
import j0.g3;
import j0.y2;
import s.d0;
import s.h1;
import t.v;

/* compiled from: Ripple.kt */
/* loaded from: classes.dex */
public final class n {

    /* renamed from: a  reason: collision with root package name */
    private static final h1<Float> f16410a = new h1<>(15, 0, d0.c(), 2, null);

    /* JADX INFO: Access modifiers changed from: private */
    public static final s.j<Float> c(v.j jVar) {
        if (jVar instanceof v.g) {
            return f16410a;
        }
        if (jVar instanceof v.d) {
            return new h1(45, 0, d0.c(), 2, null);
        }
        if (jVar instanceof v.b) {
            return new h1(45, 0, d0.c(), 2, null);
        }
        return f16410a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final s.j<Float> d(v.j jVar) {
        if (jVar instanceof v.g) {
            return f16410a;
        }
        if (jVar instanceof v.d) {
            return f16410a;
        }
        if (jVar instanceof v.b) {
            return new h1(150, 0, d0.c(), 2, null);
        }
        return f16410a;
    }

    public static final v e(boolean z10, float f10, long j10, j0.l lVar, int i10, int i11) {
        lVar.e(1635163520);
        if ((i11 & 1) != 0) {
            z10 = true;
        }
        if ((i11 & 2) != 0) {
            f10 = j2.h.f18979m.b();
        }
        if ((i11 & 4) != 0) {
            j10 = p1.f146b.e();
        }
        if (j0.n.K()) {
            j0.n.V(1635163520, i10, -1, "androidx.compose.material.ripple.rememberRipple (Ripple.kt:76)");
        }
        g3 m10 = y2.m(p1.g(j10), lVar, (i10 >> 6) & 14);
        Boolean valueOf = Boolean.valueOf(z10);
        j2.h f11 = j2.h.f(f10);
        lVar.e(511388516);
        boolean Q = lVar.Q(valueOf) | lVar.Q(f11);
        Object f12 = lVar.f();
        if (Q || f12 == j0.l.f18688a.a()) {
            f12 = new d(z10, f10, m10, null);
            lVar.J(f12);
        }
        lVar.N();
        d dVar = (d) f12;
        if (j0.n.K()) {
            j0.n.U();
        }
        lVar.N();
        return dVar;
    }
}
