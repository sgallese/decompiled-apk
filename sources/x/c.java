package x;

import s.e0;
import s.z1;

/* compiled from: LazyItemScope.kt */
/* loaded from: classes.dex */
public final /* synthetic */ class c {
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ androidx.compose.ui.e a(d dVar, androidx.compose.ui.e eVar, e0 e0Var, int i10, Object obj) {
        if (obj == null) {
            if ((i10 & 1) != 0) {
                e0Var = s.k.g(0.0f, 400.0f, j2.l.b(z1.c(j2.l.f18992b)), 1, null);
            }
            return dVar.a(eVar, e0Var);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: animateItemPlacement");
    }

    public static /* synthetic */ androidx.compose.ui.e b(d dVar, androidx.compose.ui.e eVar, float f10, int i10, Object obj) {
        if (obj == null) {
            if ((i10 & 1) != 0) {
                f10 = 1.0f;
            }
            return dVar.b(eVar, f10);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fillParentMaxSize");
    }
}
