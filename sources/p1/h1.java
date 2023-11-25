package p1;

import p1.i1;

/* compiled from: Owner.kt */
/* loaded from: classes.dex */
public final /* synthetic */ class h1 {
    static {
        i1.a aVar = i1.f20809n;
    }

    public static /* synthetic */ void a(i1 i1Var, j0 j0Var, boolean z10, int i10, Object obj) {
        if (obj == null) {
            if ((i10 & 2) != 0) {
                z10 = false;
            }
            i1Var.b(j0Var, z10);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: forceMeasureTheSubtree");
    }

    public static /* synthetic */ void b(i1 i1Var, boolean z10, int i10, Object obj) {
        if (obj == null) {
            if ((i10 & 1) != 0) {
                z10 = true;
            }
            i1Var.a(z10);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: measureAndLayout");
    }

    public static /* synthetic */ void c(i1 i1Var, j0 j0Var, boolean z10, boolean z11, boolean z12, int i10, Object obj) {
        if (obj == null) {
            if ((i10 & 2) != 0) {
                z10 = false;
            }
            if ((i10 & 4) != 0) {
                z11 = false;
            }
            if ((i10 & 8) != 0) {
                z12 = true;
            }
            i1Var.m(j0Var, z10, z11, z12);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onRequestMeasure");
    }

    public static /* synthetic */ void d(i1 i1Var, j0 j0Var, boolean z10, boolean z11, int i10, Object obj) {
        if (obj == null) {
            if ((i10 & 2) != 0) {
                z10 = false;
            }
            if ((i10 & 4) != 0) {
                z11 = false;
            }
            i1Var.g(j0Var, z10, z11);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onRequestRelayout");
    }
}
