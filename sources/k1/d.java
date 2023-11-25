package k1;

import kotlin.coroutines.Continuation;

/* compiled from: SuspendingPointerInputFilter.kt */
/* loaded from: classes.dex */
public final /* synthetic */ class d {
    public static /* synthetic */ Object a(e eVar, t tVar, Continuation continuation, int i10, Object obj) {
        if (obj == null) {
            if ((i10 & 1) != 0) {
                tVar = t.Main;
            }
            return eVar.X(tVar, continuation);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: awaitPointerEvent");
    }
}
