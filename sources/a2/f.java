package a2;

import a2.c0;

/* compiled from: AndroidFontUtils.android.kt */
/* loaded from: classes.dex */
public final class f {
    public static final c0 a(c0.a aVar) {
        qc.q.i(aVar, "<this>");
        return aVar.m();
    }

    public static final int b(boolean z10, boolean z11) {
        if (z11 && z10) {
            return 3;
        }
        if (z10) {
            return 1;
        }
        if (z11) {
            return 2;
        }
        return 0;
    }

    public static final int c(c0 c0Var, int i10) {
        boolean z10;
        qc.q.i(c0Var, "fontWeight");
        if (c0Var.compareTo(a(c0.f239m)) >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        return b(z10, x.f(i10, x.f339b.a()));
    }
}
