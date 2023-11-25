package androidx.core.os;

import android.os.OutcomeReceiver;
import kotlin.coroutines.Continuation;

/* compiled from: OutcomeReceiver.kt */
/* loaded from: classes.dex */
public final class s {
    public static final <R, E extends Throwable> OutcomeReceiver<R, E> a(Continuation<? super R> continuation) {
        return r.a(new h(continuation));
    }
}
