package androidx.lifecycle;

import kotlin.coroutines.Continuation;

/* compiled from: CoroutineLiveData.kt */
/* loaded from: classes.dex */
public final class g {
    public static final <T> LiveData<T> a(hc.f fVar, long j10, pc.p<? super b0<T>, ? super Continuation<? super dc.w>, ? extends Object> pVar) {
        qc.q.i(fVar, "context");
        qc.q.i(pVar, "block");
        return new f(fVar, j10, pVar);
    }
}
