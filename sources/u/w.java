package u;

import kotlin.coroutines.Continuation;
import t.b0;

/* compiled from: ScrollableState.kt */
/* loaded from: classes.dex */
public final /* synthetic */ class w {
    public static boolean a(x xVar) {
        return true;
    }

    public static boolean b(x xVar) {
        return true;
    }

    public static /* synthetic */ Object c(x xVar, b0 b0Var, pc.p pVar, Continuation continuation, int i10, Object obj) {
        if (obj == null) {
            if ((i10 & 1) != 0) {
                b0Var = b0.Default;
            }
            return xVar.c(b0Var, pVar, continuation);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: scroll");
    }
}
