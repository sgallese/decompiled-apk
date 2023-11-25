package e0;

/* compiled from: SelectionManager.kt */
/* loaded from: classes.dex */
public final class p {
    public static final boolean a(z0.h hVar, long j10) {
        boolean z10;
        boolean z11;
        qc.q.i(hVar, "$this$containsInclusive");
        float i10 = hVar.i();
        float j11 = hVar.j();
        float o10 = z0.f.o(j10);
        if (i10 <= o10 && o10 <= j11) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            float l10 = hVar.l();
            float e10 = hVar.e();
            float p10 = z0.f.p(j10);
            if (l10 <= p10 && p10 <= e10) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11) {
                return true;
            }
        }
        return false;
    }

    public static final z0.h b(n1.s sVar) {
        qc.q.i(sVar, "<this>");
        z0.h c10 = n1.t.c(sVar);
        return z0.i.a(sVar.y(c10.m()), sVar.y(c10.f()));
    }
}
