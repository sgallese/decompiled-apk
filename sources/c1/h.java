package c1;

import a1.e4;
import a1.o1;

/* compiled from: DrawTransform.kt */
/* loaded from: classes.dex */
public final /* synthetic */ class h {
    public static /* synthetic */ void a(i iVar, e4 e4Var, int i10, int i11, Object obj) {
        if (obj == null) {
            if ((i11 & 2) != 0) {
                i10 = o1.f133a.b();
            }
            iVar.c(e4Var, i10);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: clipPath-mtrdD-E");
    }

    public static /* synthetic */ void b(i iVar, float f10, float f11, int i10, Object obj) {
        if (obj == null) {
            if ((i10 & 1) != 0) {
                f10 = 0.0f;
            }
            if ((i10 & 2) != 0) {
                f11 = 0.0f;
            }
            iVar.b(f10, f11);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: translate");
    }
}
