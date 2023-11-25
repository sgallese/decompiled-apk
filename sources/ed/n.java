package ed;

import kotlinx.coroutines.flow.internal.AbortFlowException;

/* compiled from: FlowExceptions.common.kt */
/* loaded from: classes4.dex */
public final class n {
    public static final void a(AbortFlowException abortFlowException, dd.h<?> hVar) {
        if (abortFlowException.f19465f == hVar) {
            return;
        }
        throw abortFlowException;
    }
}
