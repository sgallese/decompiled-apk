package f0;

/* compiled from: MaterialTextSelectionColors.kt */
/* loaded from: classes.dex */
public final class r0 {
    private static final float a(long j10, long j11, long j12) {
        boolean z10;
        float f10 = 0.2f;
        float f11 = 0.4f;
        float f12 = 0.4f;
        for (int i10 = 0; i10 < 7; i10++) {
            float c10 = (c(j10, f11, j11, j12) / 4.5f) - 1.0f;
            if (0.0f <= c10 && c10 <= 0.01f) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                break;
            }
            if (c10 < 0.0f) {
                f12 = f11;
            } else {
                f10 = f11;
            }
            f11 = (f12 + f10) / 2.0f;
        }
        return f11;
    }

    public static final float b(long j10, long j11) {
        float i10 = a1.r1.i(j10) + 0.05f;
        float i11 = a1.r1.i(j11) + 0.05f;
        return Math.max(i10, i11) / Math.min(i10, i11);
    }

    private static final float c(long j10, float f10, long j11, long j12) {
        long g10 = a1.r1.g(a1.p1.o(j10, f10, 0.0f, 0.0f, 0.0f, 14, null), j12);
        return b(a1.r1.g(j11, g10), g10);
    }

    public static final long d(long j10, long j11, long j12) {
        float a10;
        float c10 = c(j10, 0.4f, j11, j12);
        float c11 = c(j10, 0.2f, j11, j12);
        if (c10 >= 4.5f) {
            a10 = 0.4f;
        } else if (c11 < 4.5f) {
            a10 = 0.2f;
        } else {
            a10 = a(j10, j11, j12);
        }
        return a1.p1.o(j10, a10, 0.0f, 0.0f, 0.0f, 14, null);
    }

    public static final e0.z e(j jVar, j0.l lVar, int i10) {
        boolean z10;
        qc.q.i(jVar, "colors");
        lVar.e(-721696685);
        if (j0.n.K()) {
            j0.n.V(-721696685, i10, -1, "androidx.compose.material.rememberTextSelectionColors (MaterialTextSelectionColors.kt:35)");
        }
        long j10 = jVar.j();
        long c10 = jVar.c();
        lVar.e(35572910);
        long a10 = k.a(jVar, c10);
        if (a10 != a1.p1.f146b.e()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            a10 = ((a1.p1) lVar.C(p.a())).y();
        }
        lVar.N();
        long o10 = a1.p1.o(a10, n.f14905a.d(lVar, 6), 0.0f, 0.0f, 0.0f, 14, null);
        a1.p1 g10 = a1.p1.g(j10);
        a1.p1 g11 = a1.p1.g(c10);
        a1.p1 g12 = a1.p1.g(o10);
        lVar.e(1618982084);
        boolean Q = lVar.Q(g10) | lVar.Q(g11) | lVar.Q(g12);
        Object f10 = lVar.f();
        if (Q || f10 == j0.l.f18688a.a()) {
            f10 = new e0.z(jVar.j(), d(j10, o10, c10), null);
            lVar.J(f10);
        }
        lVar.N();
        e0.z zVar = (e0.z) f10;
        if (j0.n.K()) {
            j0.n.U();
        }
        lVar.N();
        return zVar;
    }
}
